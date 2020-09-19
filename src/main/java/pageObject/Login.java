package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class Login extends base {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='memberId']")	
	private WebElement Mobilenumber;
	
	@FindBy(xpath="//input[@id='mobilePass']")	
	private WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-primary block bold mem-login-button']")	
	private WebElement LoginButton;
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement Mobilenumber()
	{
		return Mobilenumber;
	}
	public WebElement password()
	{
		return password;
	}
	
	public WebElement LoginButton()
	{
		return LoginButton;
	}
	

}
