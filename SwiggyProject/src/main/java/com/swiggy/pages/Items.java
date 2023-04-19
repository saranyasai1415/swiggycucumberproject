package com.swiggy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Items {
	
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(linkText = "Search")   
	private WebElement serchIcon;
	
	@FindBy(xpath = "//input[contains(@placeholder ,'Search for restaurants and food')]")
	private WebElement placeHolder;
	
	@FindBy(xpath = "//div[contains(@class,'_2NSqs')]")
	private WebElement suggestItems;
	
	//RNzoC
	//'_1HEuF _3pTZL'
	@FindBy(xpath ="(//div[contains(@class,'_1RPOp')])")
	private WebElement firstItem;
	
	//_1W_TH
	@FindBy(xpath ="(//div[contains(@class,'_3coNr')])")
	private WebElement addItem;

	public Items (WebDriver driver){
	PageFactory.initElements (driver, this);
	actions = new Actions (driver);
	wait = new WebDriverWait(driver, 10);
	}
	
	public void hoverOverSerch () {
		wait.until(ExpectedConditions.visibilityOf(serchIcon));
		serchIcon.click();
	}
	
	public void enterItem(String item) {
		wait.until(ExpectedConditions.visibilityOf(placeHolder));
		placeHolder.sendKeys(item);
		
	}
	public void searchItem() {
		wait.until(ExpectedConditions.visibilityOf(suggestItems));
		actions. sendKeys(Keys.ENTER).build().perform();
	}
	public void selectFirstItem() {
		wait.until(ExpectedConditions.visibilityOf(firstItem));
		firstItem.click();
		//addItem.click();
	}

}
