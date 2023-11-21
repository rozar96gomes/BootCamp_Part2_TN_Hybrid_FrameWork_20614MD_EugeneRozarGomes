package com.qa.tutorialsninja.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	public WebDriver driver;
	
	
	// we have define all the objects//email
	@FindBy(name = "payment_address")
	private WebElement billingDetailts;
	
	//clicking on 
	@FindBy(id = "button-payment-address")
	private WebElement continueOnBillingDetailts;
	 
	@FindBy(name= "shipping_address")
	private WebElement delivaryDetailts;
	
	@FindBy(xpath = "//input[@id='button-shipping-address']")
	private WebElement continueOnDelevaryDetailts;
	
	@FindBy(xpath = "//input[@id='button-shipping-method']")
	private WebElement delivaryMethodContinueButton;
	
	
	@FindBy(name="agree")
	private WebElement privacyPolicyRadioButton;
	
	@FindBy(xpath ="//input[@id='button-payment-method']")
	private WebElement paymentMethodContinueButton;
	
	@FindBy(id="button-confirm")
	private WebElement confirmOderButton;
	
	
	//we initialize the objects by creating constractor 
	
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 
	
	//we have take action on those objects by creating methods
	public void clickOnIWantToUseAnExistingAddress() {
		billingDetailts.click();
	}
	public void clickOnContinueButton() {
		continueOnBillingDetailts.click();
	}
	
	public void clickOnIWantToUseAnExistingAddressOnDelevaryDetailts() {
		delivaryDetailts.click();
	}
	
	public void clickOnContinueOnDelevaryButton() {
		continueOnDelevaryDetailts.click();
	}
	public void clickOnDelivaryMethodContinueButton() {
		delivaryMethodContinueButton.click();
	}
	public void clickOnPrivacyPolicyRadioButton() {
		privacyPolicyRadioButton.click();
	}
	public void clickOnPaymentMethodContinueButton() {
		paymentMethodContinueButton.click();
	}
	public void clickOnConfirmOderButton() {
		confirmOderButton.click();
	}
	public void completeCheckoutProcess() {
		billingDetailts.click();
		continueOnBillingDetailts.click();
		delivaryDetailts.click();	
		continueOnDelevaryDetailts.click();
		delivaryMethodContinueButton.click();
		privacyPolicyRadioButton.click();
		paymentMethodContinueButton.click();
		confirmOderButton.click();
	}
	

} 
