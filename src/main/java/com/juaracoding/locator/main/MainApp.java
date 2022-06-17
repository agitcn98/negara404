package com.juaracoding.locator.main;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.locator.driver.DriverSingleton;
import com.juaracoding.locator.pages.PracticeForm;
import com.juaracoding.locator.pages.RegisForm;
import com.juaracoding.locator.pages.WebTables;

public class MainApp {

	public static void main(String[] args) {
		
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
//		WebTables webTables = new WebTables();
//		webTables.registrationForm("Test 1","Test 1","test1@email.com","20","3000","QA Room");
//		webTables.registrationForm("Test 1","Test 1","test1@email.com","ab","3000","QA Room");
//		webTables.goToMenuForms();
		
//		PracticeForm practiceForm = new PracticeForm();
//		practiceForm.studentRegistration();
		
		RegisForm regisForm = new RegisForm();
		regisForm.registrationForm();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();

	}

}
