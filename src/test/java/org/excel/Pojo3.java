package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo3 extends Baseclass{
	
	public Pojo3() {
PageFactory.initElements(driver, this);
	}
	
@FindBy(id="buy-button-id")
private WebElement buy;

public WebElement getBuy() {
	return buy;
}
}
