package info.hrms.testscripts;

import info.hrms.lis.General;

public class TC003 {
public static void main (String args[]) throws Exception {
	//Test steps
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.editEmp();
	Thread.sleep(2000);
	obj.changeEmp();
	Thread.sleep(2000);
	obj.exitFrame();
	Thread.sleep(2000);
	obj.logout();
	Thread.sleep(2000);
	obj.closeApplication();
}
}
