package com.plugindev.rcp.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.update.ui.UpdateJob;
import org.eclipse.update.ui.UpdateManagerUI;

public class UpdateAction implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	public void run(IAction action) {
		UpdateJob job = new UpdateJob("Search for update", false, false);//$NON-NLS-1$
		UpdateManagerUI.openInstaller(window.getShell(), job);
		PlatformUI.getWorkbench().getProgressService().showInDialog(
				window.getShell(), job);
	}

	public void dispose() {
		// TODO 自动生成方法存根

	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public void selectionChanged(IAction action, ISelection selection) {

	}
}
