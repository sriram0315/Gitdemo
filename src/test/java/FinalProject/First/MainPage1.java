package FinalProject.First;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.Login;
import resources.base;

public class MainPage1 extends base {
	public WebDriver driver;
	Homepage hp ;
	Login lp;
	@BeforeTest
	public void intialize() throws IOException
	{
		
		driver = initializedriver();
		driver.get(prop.getProperty("url"));
	}

	

	@Test(dataProvider = "getData")

	public void PageNavigation(String Mobilenumber, String Password) throws IOException, InterruptedException {
		
		hp = new Homepage(driver);
		lp = new Login(driver);
		hp.Login().click();

		Thread.sleep(3000);

		lp.Mobilenumber().sendKeys(Mobilenumber);
		lp.password().sendKeys(Password);
		lp.LoginButton().click();
	}

		@Test
		public void PassengerDetails() throws InterruptedException
		{
			hp = new Homepage(driver);
			Thread.sleep(3000);
		hp.SourceBlock().click();
		
		hp.Source().click();
		//hp.DstnBlock().click();
	
		hp.Dstn().click();

		// Calendar date selection
		while (!driver.findElement(By.cssSelector("div[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']")).getText().contains("November")) {
			driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all")).click();
		}
		List<WebElement> dates = (List<WebElement>) driver.findElements(By.cssSelector("td[data-handler='selectDay']"));

		int count = driver.findElements(By.cssSelector("td[data-handler='selectDay']")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			if (text.equalsIgnoreCase("20")) {
				driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
				break;
			}
		}

	}

	@DataProvider
	private Object[][] getData() {
		// TODO Auto-generated method stub
		Object[][] data = new Object[1][2];
		// Row stands for how many data set which have to run test
		// coloumn ids required for the values for each test
		data[0][0] = "9500787584";
		data[0][1] = "950078@Sri";

		//data[1][0] = "964587123";
		//data[1][1] = "Loosu";

		return data;

	}

}
