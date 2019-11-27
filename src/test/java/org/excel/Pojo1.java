package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1 extends Baseclass{
public Pojo1() {
	PageFactory.initElements(driver, this);
}
	public WebElement getTxt() {
		return txt;
	}

	@FindBy(id="inputValEnter")
	private WebElement txt;
	
	@FindBy(xpath="//button[@class='searchformButton col-xs-4 rippleGrey']")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}
}
