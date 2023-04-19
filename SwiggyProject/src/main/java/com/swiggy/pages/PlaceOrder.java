package com.swiggy.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder {
	

	private Actions actions;
	private WebDriverWait wait;
	private WebDriver driver;
	

	@FindBy(xpath ="(//div[contains(@class,'_1RPOp')])[2]")
	private WebElement addBtn;
	
	@FindBy(xpath ="//span[contains(@class,'_1W_TH')]")
	private WebElement continueBtn;
	
	@FindBy(xpath ="//span[contains(@class,'_38xdN')]")
	private WebElement addItemBtn;
	
	@FindBy(xpath="//span[contains(@class,'_3yZyp _18ZFk')]")
	private WebElement checkOutBtn;
	
	@FindBy(xpath ="//input[contains(@class,'_1WnJw')]")
	private WebElement checkbox; 
	
	
	
	public PlaceOrder (WebDriver driver){
		PageFactory.initElements (driver, this);
		actions = new Actions (driver);
		wait = new WebDriverWait(driver, 10);
		
		}
	
	public void addItem() {
		wait.until(ExpectedConditions.visibilityOf(addBtn));
		
		/*
		 * wait.until(ExpectedConditions.visibilityOf(checkbox)); checkbox.click();
		 */
		//addBtn.click();
		wait.until(ExpectedConditions.visibilityOf(addItemBtn));		
		addItemBtn.click();
		
	//	addBtn.click();
		//wait.until(ExpectedConditions.visibilityOf(continueBtn));
	//	continueBtn.click();
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView();", checkbox);
		 */
	
		//addBtn.click();
	}
	
	
	public void continueorder() {
		
			
			wait.until(ExpectedConditions.visibilityOf(continueBtn));
		
				actions.moveToElement(continueBtn).doubleClick().perform();
				actions.moveToElement(continueBtn).doubleClick().perform();
				actions.moveToElement(continueBtn).doubleClick().perform();
			
				
	
				
	}
	
	public void moveToCart() {
		wait.until(ExpectedConditions.visibilityOf(addItemBtn));
		addItemBtn.click();
	}
	
	public void checkoutAction() {
		wait.until(ExpectedConditions.visibilityOf(checkOutBtn));
		checkOutBtn.click();
	}
	
}


