package org.earthling.utility.eclipseplugin.dbschema;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class ConfigureDBSCommand extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        // Get the active workbench window
        Display display = PlatformUI.getWorkbench().getDisplay();

        // Show a message dialog with the command name
        MessageDialog.openInformation(display.getActiveShell(), "Command Executed", 
        		"The command 'org.earthling.utility.eclipseplugin.dbschema.ConfigureDBSCommand' has been executed.");

        return null;
    }

}
