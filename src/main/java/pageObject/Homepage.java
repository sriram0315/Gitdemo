package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class Homepage extends base {

	public WebDriver driver;
	
	
	@FindBy(css="a[title='Login']")	
	private WebElement Login;
	
	@FindBy(css="input[class='form-control or-src-city parsley-success']")	
	private WebElement SourceBlock;
	
	@FindBy(xpath="//div[@class='ig-input-group field-float']//div[@class='autocomplete-result station-result clearfix airport-item pop-dest-stn selected']//div[@class='airport-city'][contains(text(),'Bengaluru, India')]")	
	private WebElement Source;
	
	@FindBy(name="or-dest")	
	private WebElement DstnBlock; 
	
	@FindBy(xpath="//div[@class='ig-input-group']//div[contains(@class,'autocomplete-main station-results')]//div[contains(@class,'pop-dest-stn')]//div[@class='airport-code'][contains(text(),'DEL')]")	
	private WebElement Dstn;
	
	

	

	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement Login()
	{
			return Login;
	}
	


	public WebElement SourceBlock()
	{
		return SourceBlock;
	}
	public WebElement Source()
	{
		return Source;
	}
	public WebElement DstnBlock()
	{
		return DstnBlock;
	}
	
	public WebElement Dstn()
	{
		return Dstn;
	}

	



	
}
