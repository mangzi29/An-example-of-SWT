package rcpdev.rcpdemo.views;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Label;

public class SampleView extends ViewPart {

	public static final String ID = "rcpdev.rcpdemo.views.SampleView"; // TODO Needs to be whatever is mentioned in plugin.xml

	private Composite top = null;

	private Label label = null;

	@Override
	public void createPartControl(Composite parent) {
		// TODO 自动生成方法存根
		top = new Composite(parent, SWT.NONE);
		top.setLayout(new GridLayout());
		label = new Label(top, SWT.NONE);
		label.setText("This is a sample view");
	}

	@Override
	public void setFocus() {
		// TODO 自动生成方法存根

	}

}
