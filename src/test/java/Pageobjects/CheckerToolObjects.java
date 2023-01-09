package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import StepDefs.BaseClass;

public class CheckerToolObjects {
	WebDriver driver=BaseClass.driver;
	
	@FindBy(id="next-button")
	WebElement startbtn;
	
	@FindBy(id = "radio-england")
	WebElement countryradiobtn;
	
	@FindBy(id = "next-button")
	WebElement nxtbtn;
	
	@FindBy(id = "radio-yes")
	WebElement Gppract;
	
	@FindBy(id = "next-button")
	WebElement nxtbtn1;
	
	@FindBy(id="radio-england")
	WebElement engradiobtn;
	
	@FindBy(id="next-button")
	WebElement nxtbtn2;
	
	@FindBy(id="dob-day")
	WebElement dobday;
	
	@FindBy(id = "dob-month")
	WebElement dobmonth;
	
	@FindBy(id="dob-year")
	WebElement dobyear;
	
	@FindBy(id="next-button")
	WebElement nxtbtn3;
	
	@FindBy(id="radio-yes")
	WebElement partner;
	
	@FindBy (id ="next-button")
	WebElement nextbtn4;
	
	@FindBy(id ="radio-no")
	WebElement benefitsOrTaxCredits;
	
	@FindBy(id = "next-button")
	WebElement nextbtn5;
	
	@FindBy(id="radio-no")
	WebElement pregnantorGivingBirth;
	
	@FindBy(id="next-button")
	WebElement nextbtn6;
	
	@FindBy(id="radio-no")
	WebElement warPension;
	
	@FindBy(id="next-button")
	WebElement nextbtn7;
	
	@FindBy(id="radio-no")
	WebElement diabetes;
	
	@FindBy(id = "next-button")
	WebElement nextbtn8;
	
	@FindBy(id= "radio-no")
	WebElement medicalConditionConfirmed_legend;
	
	@FindBy(id = "next-button")
	WebElement nextbtn9;
	
	@FindBy(id ="radio-no")
	WebElement glaucoma;
		
	@FindBy(id = "next-button")
	WebElement nextbtn10;
	
	@FindBy(id="radio-no")
	WebElement inCareHome;
	
	@FindBy(id = "next-button")
	WebElement nextbtn11;
	
	@FindBy(id="radio-yes")
	WebElement haveSavings;
	
	@FindBy(id = "next-button")
	WebElement nextbtn12;
	
	
	public CheckerToolObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public String selectPrefs() throws Exception {
		Thread.sleep(5000);
		startbtn.click();
		Thread.sleep(5000);
		countryradiobtn.click();
		Thread.sleep(5000);
		nxtbtn.click();
		Thread.sleep(5000);
		Gppract.click();
		nxtbtn.click();
		Thread.sleep(5000);
		engradiobtn.click();
		nxtbtn.click();
		Thread.sleep(5000);
		dobday.sendKeys("16");
		dobmonth.sendKeys("07");
		dobyear.sendKeys("1960");
		
		Thread.sleep(5000);
		nxtbtn.click();
		Thread.sleep(5000);
		partner.click();
	
		nxtbtn.click();
		Thread.sleep(5000);
		benefitsOrTaxCredits.click();
		
		nxtbtn.click();
		Thread.sleep(5000);
		pregnantorGivingBirth.click();
		Thread.sleep(5000);
		nxtbtn.click();
		Thread.sleep(3000);
		warPension.click();
		Thread.sleep(5000);
		nxtbtn.click();
		Thread.sleep(5000);
		diabetes.click();
		
		nxtbtn.click();
		Thread.sleep(5000);
		
		String url=driver.getCurrentUrl();
		Thread.sleep(3000);
		
		return url;
//		medicalConditionConfirmed_legend.click();
//		Thread.sleep(3000);
//		nxtbtn.click();
//		Thread.sleep(3000);
//		glaucoma.click();
//		Thread.sleep(3000);
//		nxtbtn.click();
//		Thread.sleep(3000);
//		inCareHome.click();
//		Thread.sleep(3000);
//		nxtbtn.click();
//		Thread.sleep(3000);
//		haveSavings.click();
//		Thread.sleep(3000);
//		nxtbtn.click();
		}
	

}