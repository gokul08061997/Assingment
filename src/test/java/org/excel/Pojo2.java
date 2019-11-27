package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2 extends Baseclass{
	
	public Pojo2() {
		PageFactory.initElements(driver, this);	}
	
public WebElement getClick() {
		return click;
	}

@FindBy(id="660208682913")
private WebElement click;

@FindBy(xpath="//input[@class='sd-input']")
private WebElement txt;

@FindBy(xpath="//button[@class='pincode-check']")
private WebElement btn;

public WebElement getTxt() {
	return txt;
}

public WebElement getBtn() {
	return btn;
}
}
