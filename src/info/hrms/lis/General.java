package info.hrms.lis;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import info.hrms.utility.Log;

import org.openqa.selenium.By;

public class General extends Global {

	// Stdrule:To provide all reusable fun: related to whole Application
	public void openApplication() {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");//console
		Reporter.log("Application Opened");//html Report
		Log.info("Application Opened");//logfile
		
	}

	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		Log.info("Application Closed");
	}

	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Log.info("Login Completed");
	}

	public void logout() {
		driver.findElement(By.linkText(lik_logout)).click();
		System.out.println("Logout Completed");
		Log.info("Logout Completed");
	}
	public void enterFrame() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into frame");
		Log.info("Entered into Frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from Frame");
	}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("New Emp Added");
		Log.info("New Emp Added");
	}
	public void dropDown() {
		Select st = new Select(driver.findElement(By.name(box_select)));
		//st.selectByVisibleText("Emp. ID");
		//st.selectByIndex(1);
		st.selectByValue("0");
		driver.findElement(By.name(txt_searchfor)).sendKeys(id);
		driver.findElement(By.xpath(btn_search)).click();
		System.out.println("Dropdown completed");
	} 
	public void searchEmp() {
		driver.findElement(By.name(txt_searchfor)).sendKeys(id);
		driver.findElement(By.xpath(btn_search)).click();
		System.out.println("Searched for Emp");
		}
	public void deleteEmp() {
		driver.findElement(By.name(txt_searchfor)).sendKeys(id);
		driver.findElement(By.name(ckb_checkbox)).click();
		driver.findElement(By.xpath(btn_delete)).click();
		System.out.println("Deleted Emp");
		
	}
	public void editEmp() { 
		driver.findElement(By.xpath(empname_muralikrishna)).click();
		driver.findElement(By.name(btn_edit)).click();
		driver.findElement(By.name(txt_efn)).clear();
		driver.findElement(By.name(txt_eln)).clear();
		System.out.println("Cleared Emp Name");
	}
	public void changeEmp() {
		driver.findElement(By.name(txt_efn)).sendKeys(fn);
		driver.findElement(By.name(txt_eln)).sendKeys(ln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("Changed Emp Name");
	}
}
