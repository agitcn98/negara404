package com.juaracoding.locator.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.locator.driver.DriverSingleton;

public class RegisForm {
	
	private WebDriver driver;
	
		public RegisForm(){
			this.driver = DriverSingleton.getDriver();
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(id = "email_create")
		private WebElement email;
		
		@FindBy(id = "SubmitCreate")
		private WebElement btnCreate;
		
		@FindBy(id = "uniform-id_gender1")
		private WebElement btnGender;
		
		@FindBy(id = "customer_firstname")
		private WebElement firstName;
		
		@FindBy(id = "customer_lastname")
		private WebElement lastName;
		
		@FindBy(id = "passwd")
		private WebElement passwd;
		
		@FindBy(id = "days")
		private WebElement day;
		
		@FindBy(id = "months")
		private WebElement month;
		
		@FindBy(id = "years")
		private WebElement year;
		
		@FindBy(id = "uniform-newsletter")
		private WebElement un;
		
		@FindBy(id = "uniform-optin")
		private WebElement up;
		
		@FindBy(id = "company")
		private WebElement company;
		
		@FindBy(id = "address1")
		private WebElement address1;
		
		@FindBy(id = "address2")
		private WebElement address2;
		
		@FindBy(id = "city")
		private WebElement city;
		
		@FindBy(id = "id_state")
		private WebElement state;
		
		@FindBy(id = "postcode")
		private WebElement code;
		
		@FindBy(id = "other")
		private WebElement other;
		
		@FindBy(id = "phone")
		private WebElement phone;
		
		@FindBy(id = "phone_mobile")
		private WebElement phone_mobile;
		
		@FindBy(id = "submitAccount")
		private WebElement submit;
		
		@FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(2)")
		private WebElement btnout;
		
		@FindBy(id = "email")
		private WebElement LogMail;
		
		@FindBy(id = "passwd")
		private WebElement LogPass;
		
		@FindBy(id = "SubmitLogin")
		private WebElement btin;
		
		
		
		
		
		
		
		public void registrationForm(String e, String fn, String ln, String pw, String d, String m, String y, String com, String add1, String add2, String cit, String statee, String co, String ot, String po, String pm, String lm, String lp) {
			email.sendKeys(e);
			btnCreate.click();
			btnGender.click();
			firstName.sendKeys(fn);
			lastName.sendKeys(ln);
			passwd.sendKeys(pw);
			day.click();
			day.sendKeys(d);
			month.click();
			month.sendKeys(m);
			year.click();
			year.sendKeys(y);
			un.click();
			up.click();
			company.sendKeys(com);
			address1.sendKeys(add1);
			address2.sendKeys(add2);
			city.sendKeys(cit);
			state.click();
			state.sendKeys(statee);
			code.sendKeys(co);
			other.sendKeys(ot);
			phone.sendKeys(po);
			phone_mobile.sendKeys(pm);
			submit.click();
			btnout.click();
			LogMail.sendKeys(lm);
			LogPass.sendKeys(lp);
			btin.click();
			
			
		}
		
		public void registrationForm() {
			email.sendKeys("agit3@email.com");
			btnCreate.click();
			btnGender.click();
			firstName.sendKeys("Agit Cahya");
			lastName.sendKeys("Negara");
			passwd.sendKeys("12345");
			scroll(driver);
			day.click();
			day.sendKeys("11");
			day.sendKeys(Keys.RETURN);
			month.click();
			month.sendKeys("a");
			month.sendKeys(Keys.RETURN);
			year.click();
			year.sendKeys("1998");
			year.sendKeys(Keys.RETURN);
			un.click();
			up.click();
			company.sendKeys("Juara Coding");
			address1.sendKeys("Jalan Mawar 2");
			address2.sendKeys("Apartemen Mawar");
			scroll(driver);
			city.sendKeys("Jakarta");
			state.click();
			state.sendKeys("ut");
			state.sendKeys(Keys.RETURN);
			code.sendKeys("12345");
			other.sendKeys("Juara Coding Aye aye");
			phone.sendKeys("0813232323");
			phone_mobile.sendKeys("0812321");
			scroll(driver);
			submit.click();
			btnout.click();
			LogMail.sendKeys("agit3@email.com");
			LogPass.sendKeys("12345");
			btin.click();
			
			
			
			
			
			
		}
		
		public static void scroll(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor)driver;  
			js.executeScript("scrollBy(0, 500)");
		}
		
		public static void scroll1(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor)driver;  
			js.executeScript("scrollBy(0, 500)");
		}
			

}
