package com.plugindev.addressbook.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;

import com.plugindev.addressbook.wizards.NewAddressItemWizard;

public class AddAddressAction extends Action {
//	private AddressView view;
	public AddAddressAction(String text,
			ImageDescriptor imageDescriptor){
		super(text, imageDescriptor);
	}
	
	//在第十七章增加。CheetSheet只支持无参数构造函数Action的调用，
	//因而为AddressAction构造该方法。
	public AddAddressAction(){
		super();
	}
	public void run()
	{
		//临时实现，将在后续章节中最终实现
/*		AddressItem[] addresses = new AddressItem[8];
		AddressItem item1 = new AddressItem("Nemo", AddressCategory.FAMILY);
		AddressItem item2 = new AddressItem("Dingding", AddressCategory.VIP);
		AddressItem item3 = new AddressItem("Flysky", AddressCategory.FRIENDS);
		AddressItem item4 = new AddressItem("Rainny", AddressCategory.UNKNOWN);
		AddressItem item5 = new AddressItem("Brighter", AddressCategory.ORDINARY);
		AddressItem item6 = new AddressItem("Snow", AddressCategory.LOVER);
		AddressItem item7 = new AddressItem("Denny", AddressCategory.BUSINESS);
		AddressItem item8 = new AddressItem("Lily", AddressCategory.TEACHER);
		addresses[0] = item1;
		addresses[1] = item2;
		addresses[2] = item3;
		addresses[3] = item4;
		addresses[4] = item5;
		addresses[5] = item6;
		addresses[6] = item7;
		addresses[7] = item8;
		AddressManager.getManager().addAddresses(addresses);*/
		/*
		 * 在第十五章中更改实现，弹出创建新元素的对话框
		 */
		NewAddressItemWizard wizard = new NewAddressItemWizard();
		wizard.init(PlatformUI.getWorkbench(), null);
		WizardDialog dialog = 
			new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
		dialog.open();
	}
}
