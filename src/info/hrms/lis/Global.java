package info.hrms.lis;

import org.openqa.selenium.WebDriver;

public class Global {
//stdrule1:To provide Test Data & objects related to whole Application
	public WebDriver driver;
	//*******************Test Data
	    //DT Var VV
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	public String efn = "Selenium";
	public String eln = "Suresh";
	public String fn  = "Keerthi";
	public String ln  = "Reddy"; 
	public String id  = "1219";
	public String id1 = "1186";
	
	//****************Object/Element
	public String txt_loginname           = "txtUserName";
	public String txt_password            = "txtPassword";
	public String btn_login               = "Submit";
	public String lik_logout              = "Logout";
	public String frame_empinfo           = "rightMenu";
	public String btn_Add                 = "//input[@value='Add']";
	public String txt_efn                 = "txtEmpFirstName";
	public String txt_eln                 = "txtEmpLastName";
	public String txt_Efn                 ="//input[@value='murali']";
	public String txt_Eln                 = "//input[@value='krishna']";
	public String btn_Save                = "btnEdit";
	public String empname_shitalhema      = "//*[@id=\"standardView\"]/table/tbody/tr[1]/td[3]/a";
	public String empname_muralikrishna   = "//*[@id=\"standardView\"]/table/tbody/tr[13]/td[3]/a";
	public String btn_edit                = "EditMain";
	public String btn_save                = "btnEditPers";
	public String box_select              = "loc_code";
	public String txt_searchfor           = "loc_name";
	public String btn_search              = "//input[@value='Search']";
	public String ckb_checkbox            = "chkLocID[]";
	public String btn_delete              = "//input[@value='Delete']";
}
