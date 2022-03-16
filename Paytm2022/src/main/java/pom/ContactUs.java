package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs {
	
	@FindBy (xpath = "((//div[@class='_2bLgD'])[1]//span)[3]")
	private WebElement customerCareNo;
	
	public ContactUs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getCustomerNo()
	{
		String text = customerCareNo.getText();
		System.out.println(text);
	}

}
