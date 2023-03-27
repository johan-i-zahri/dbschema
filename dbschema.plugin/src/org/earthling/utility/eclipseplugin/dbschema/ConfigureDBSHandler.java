package org.earthling.utility.eclipseplugin.dbschema;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

public class ConfigureDBSHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"DB Schema Plugin",
				"Hello, Eclipse world");
		
        Display display = PlatformUI.getWorkbench().getDisplay();

        // Show a message dialog with the command name
        MessageDialog.openInformation(display.getActiveShell(), "Command Executed", 
        		"The command 'org.earthling.utility.eclipseplugin.dbschema.ConfigureDBSCommand' has been executed.");
		return null;
	}
}
