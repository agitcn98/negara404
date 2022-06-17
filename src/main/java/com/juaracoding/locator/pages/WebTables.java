package com.juaracoding.locator.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.locator.driver.DriverSingleton;

public class WebTables {

	private WebDriver driver;
	
	public WebTables() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Locator
	@FindBy(id = "addNewRecordButton")
	private WebElement btnAdd;
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "userEmail")
	private WebElement email;
	
	@FindBy(id = "age")
	private WebElement age;
	
	@FindBy(id = "salary")
	private WebElement salary;
	
	@FindBy(id = "department")
	private WebElement department;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	@FindBy(css = "#app > div > div > div.row > div:nth-child(1) > div > div > div:nth-child(2) > span > div")
	private WebElement btnMenuForms;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li")
	private WebElement btnSubMenu;
	
	public void registrationForm(String fn, String ln, String e, String a, String s, String d) {
		btnAdd.click();
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		email.sendKeys(e);
		age.sendKeys(a);
		salary.sendKeys(s);
		department.sendKeys(d);
		btnSubmit.click();
//		tunggu();
	}
	
	public void goToMenuForms() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnMenuForms));
		scroll(driver);
		btnMenuForms.click();
//		tunggu();
		btnSubMenu.click();
	}
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 2000)");
	}
	
	public static void tunggu() {	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void registrationForm() {
//		btnAdd.click();
//		firstName.sendKeys("Test 1");
//		lastName.sendKeys("Test 1");
//		email.sendKeys("test1@email.com");
//		age.sendKeys("abc");
//		salary.sendKeys("3000");
//		department.sendKeys("QA Engineer");
//		btnSubmit.click();
//	}
}
