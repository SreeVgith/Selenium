package info.hrms.testscripts;

import info.hrms.lis.General;

public class TC004 {
public static void main(String args[]) {
	//Test steps
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.enterFrame();
	obj.dropDown();
	obj.deleteEmp();
	obj.exitFrame();
	obj.logout();
	obj.closeApplication();
}
}
