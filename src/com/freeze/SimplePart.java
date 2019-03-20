package com.freeze;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;

public class SimplePart {
	private Text text;
	private Text text_1;
	private Table table;
	
    @PostConstruct
    void init(MPart part, Composite parent) {

    	parent.setLayout(new GridLayout(4, false));
		
		Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setText("name");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		text = new Text(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblAge = new Label(parent, SWT.NONE);
		lblAge.setText("age");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		text_1 = new Text(parent, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblBirth = new Label(parent, SWT.NONE);
		lblBirth.setText("birth");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		DateTime dateTime = new DateTime(parent, SWT.BORDER);
		
		Label lblChecked = new Label(parent, SWT.NONE);
		lblChecked.setText("checked ?");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		Button btnCheckButton = new Button(parent, SWT.CHECK);
		btnCheckButton.setText("Y/N");
		
		Button btnRadioButton_1 = new Button(parent, SWT.RADIO);
		btnRadioButton_1.setText("boy");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		Button btnRadioButton = new Button(parent, SWT.RADIO);
		btnRadioButton.setText("girl");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

    }

}
