package com.stardewvalley.ui;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Shell;

public class MainMenuDialog extends Dialog
{
	private final Shell shell;
	private Button cropButton;
	
	public MainMenuDialog(Shell shell)
	{
		super(shell);
		this.shell = shell;
	}
}
