package com.freeze.window;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Table;

public class Window4Part {

	protected Shell shlMainInformation;
	private Text text;
	private Text text_1;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Window4Part window = new Window4Part();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		while (!shlMainInformation.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMainInformation = new Shell();
		shlMainInformation.setLayout(new GridLayout(4, false));
		
		Label lblNewLabel = new Label(shlMainInformation, SWT.NONE);
		lblNewLabel.setText("name");
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		
		text = new Text(shlMainInformation, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblAge = new Label(shlMainInformation, SWT.NONE);
		lblAge.setText("age");
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		
		text_1 = new Text(shlMainInformation, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblBirth = new Label(shlMainInformation, SWT.NONE);
		lblBirth.setText("birth");
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		
		DateTime dateTime = new DateTime(shlMainInformation, SWT.BORDER);
		
		Label lblChecked = new Label(shlMainInformation, SWT.NONE);
		lblChecked.setText("checked ?");
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		
		Button btnCheckButton = new Button(shlMainInformation, SWT.CHECK);
		btnCheckButton.setText("Y/N");
		
		Button btnRadioButton_1 = new Button(shlMainInformation, SWT.RADIO);
		btnRadioButton_1.setText("boy");
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		
		Button btnRadioButton = new Button(shlMainInformation, SWT.RADIO);
		btnRadioButton.setText("girl");
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		new Label(shlMainInformation, SWT.NONE);
		
		table = new Table(shlMainInformation, SWT.BORDER | SWT.FULL_SELECTION);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

	}
}
