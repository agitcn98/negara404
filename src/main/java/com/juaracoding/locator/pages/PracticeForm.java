package com.juaracoding.locator.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.locator.driver.DriverSingleton;

public class PracticeForm {

private WebDriver driver;
	
	public PracticeForm() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "subjectsInput")
	private WebElement subjects;	
	
	@FindBy(id = "dateOfBirthInput")
	private WebElement DoB;
	
	@FindBy(id = "currentAddress")
	private WebElement address;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "fixedban")
	private WebElement ads;
	
	public void studentRegistration() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(subjects));
		((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", ads);
		DoB.clear();
		DoB.sendKeys(Keys.chord(Keys.CONTROL+"a","01 Aug 1999"));
		DoB.sendKeys("01 Aug 1999");
		DoB.sendKeys(Keys.RETURN);
		scroll(driver);
		subjects.sendKeys("a");
		subjects.sendKeys(Keys.ENTER);
		address.sendKeys("Test Address");
		scroll(driver);
		state.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < 1; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		
		city.click();		
		List<Keys> lstSequenceCity = new ArrayList<Keys>();
		for (int i = 0; i < 1; i++) {
			lstSequenceCity.add(Keys.DOWN);
		}
		lstSequenceCity.add(Keys.ENTER);
		CharSequence[] csCity = lstSequenceCity.toArray(new CharSequence[lstSequenceCity.size()]);
		Actions keyDownCity = new Actions(driver); keyDownCity.sendKeys(Keys.chord(csCity)).perform();
		
	}
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 1000)");
	}
	
}
