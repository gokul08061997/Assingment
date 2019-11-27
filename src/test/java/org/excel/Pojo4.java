package org.excel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo4 extends Baseclass{
	
	public Pojo4() {
PageFactory.initElements(driver,this);
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getBt() {
		return bt;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getPay() {
		return pay;
	}

	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="login-continue")
private WebElement bt;

@FindBy(id="w_password")
private WebElement pass;

@FindBy(id="login-done")
private WebElement cont;

@FindBy(id="make-payment")
private WebElement pay;

}
