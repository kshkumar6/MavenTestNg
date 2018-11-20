package com.qa.methods;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.elements.Elements;


public class Methods extends Elements{
	//static WebDriver wd= new FirefoxDriver();
	//static WebDriverWait wait = new WebDriverWait(wd,20);
	
	public static void launchBrowser(WebDriver wd) {
		//wd = new FirefoxDriver();
		wd.get(getStr_url());
		wd.manage().window().maximize();
		Assert.assertEquals(wd.getTitle(),getPage_title());
		takeScreenshot("Launched_Url",wd);
	}

	public static void EnterTravelDetails(WebDriver wd,WebDriverWait wait) throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOf(wd.findElement(getCust_name())));				  
	  List<WebElement> ls = wd.findElements(getAdd_person());
	  ls.get(ls.size()-2).click();
	  ls.get(ls.size()-1).click();
	  wd.findElement(getCust_name()).sendKeys(getFname());
	  wd.findElement(getCust_email()).sendKeys(getCemail());
	  wd.findElement(getPhone()).sendKeys(getCphone());
	  wd.findElement(getNext_mon()).click();
	  Thread.sleep(3000);
	  wd.findElement(getDatePicker()).click();
	  wd.findElement(getTimepicker()).click();
	  takeScreenshot("Entered_Details",wd);
	  wd.findElement(getBtn_cont()).click();	  
	}

  public static void enterPaymentDetails(WebDriver wd,WebDriverWait wait) {
	  wait.until(ExpectedConditions.visibilityOf(wd.findElement(getModify_link())));
	  takeScreenshot("Launched_Payment",wd);
	  wd.findElement(getCardnumber()).sendKeys(getCardnum1());
	  wd.findElement(getCardnumber()).sendKeys(getCardnum2());
	  wd.findElement(getCardnumber()).sendKeys(getCardnum3());
	  wd.findElement(getCardnumber()).sendKeys(getCardnum4());
	  wd.findElement(getCcnum()).sendKeys(getCvvnum());
	  Select drp = new Select(wd.findElement(getExpiry_month()));
	  drp.selectByIndex(4);
	  Select drp2 = new Select(wd.findElement(getExpiry_year()));
	  drp2.selectByIndex(5);
	  takeScreenshot("Entered_Payment_Details",wd);
	  wd.findElement(getPay()).click();
  }
  
  public static void validateSuccessfulbooking(WebDriver wd,WebDriverWait wait) {
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText("Modify")));
	  wait.until(ExpectedConditions.visibilityOf(wd.findElement(getClose())));
	  String str = wd.findElement((getClose())).getText();
	  String str2 = wd.findElement(getSuccess()).getText();
	  Assert.assertEquals(str, getCl_label());
	  Assert.assertEquals(str2, getSuccess_msg());
	  takeScreenshot("end_of_script",wd);
  }
  
  public static void custDetails(WebDriver wd,WebDriverWait wait) {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(getModify_link()));
	  String c_name = wd.findElement(getCust_name_label()).getText();
	  String c_exp  = wd.findElement(getCust_exp()).getText();
	  String c_email = wd.findElement(getCust_email_label()).getText();
	  String c_phone = wd.findElement(getCust_phone_label()).getText();
	  
	  Assert.assertEquals(c_name, getFname().toUpperCase());
	  Assert.assertEquals(c_exp, getCust_exp_name());
	  Assert.assertEquals(c_email, "mail "+getCemail());
	  Assert.assertEquals(c_phone, "phone "+getCphone());
	  takeScreenshot("Entered_user_Details",wd);
  }
  
  public static void ModifyDetails(WebDriver wd,WebDriverWait wait) {
	  wd.findElement(getModify_link()).click();
	  wait.until(ExpectedConditions.visibilityOf(wd.findElement(getCust_name())));
  }
  
  public static void updateDetails(WebDriver wd) {
	  wd.findElement(getCust_name()).clear();
	  wd.findElement(getCust_name()).sendKeys(getFname_up());
	  wd.findElement(getCust_email()).clear();
	  wd.findElement(getCust_email()).sendKeys(getCemail_up());
	  wd.findElement(getPhone()).clear();
	  wd.findElement(getPhone()).sendKeys(getCphone_up());
	  takeScreenshot("Updated_Cust_Details",wd);
	  wd.findElement(getBtn_cont()).click();	 
  }
  
  public static void validateUpdatedDetails(WebDriver wd,WebDriverWait wait) {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(getModify_link()));
	  String c_name = wd.findElement(getCust_name_label()).getText();
	  String c_exp  = wd.findElement(getCust_exp()).getText();
	  String c_email = wd.findElement(getCust_email_label()).getText();
	  String c_phone = wd.findElement(getCust_phone_label()).getText();
	  
	  Assert.assertEquals(c_name, getFname_up().toUpperCase());
	  Assert.assertEquals(c_exp, getCust_exp_name());
	  Assert.assertEquals(c_email, "mail "+getCemail_up());
	  Assert.assertEquals(c_phone, "phone "+getCphone_up());
	  takeScreenshot("Entered_user_Details",wd);
  }
  
  public static void bookingErrorMessage(WebDriver wd) {
	  wd.findElement(getBtn_cont()).click(); 
	  
	  String err_msg_cname = wd.findElement(getCust_name_err()).getText();
	  String err_msg_cemail = wd.findElement(getCust_email_err()).getText();
	  String err_msg_arr_date = wd.findElement(getArr_date_err()).getText();	  
	  Assert.assertEquals(err_msg_cname,getErr_msg_req());
	  Assert.assertEquals(err_msg_cemail, getErr_msg_req());
	  Assert.assertEquals(err_msg_arr_date, err_msg_arr_date);
	  takeScreenshot("Booking_Screen_Error_Msg",wd);
  }
  public static void validateEmail(WebDriver wd) {
	  wd.findElement(getCust_email()).sendKeys("test@");
	  wd.findElement(getBtn_cont()).click();
	  String err_msg_cemail = wd.findElement(getCust_email_err()).getText();
	  Assert.assertEquals(err_msg_cemail, "Customer email must be a valid email");
	  takeScreenshot("Invalid_email_Details",wd);
	  wd.findElement(getCust_email()).clear();
  }
  
  public static void validateArrivalTime(WebDriver wd) {
	  wd.findElement(getNew_date()).click();
	  wd.findElement(getBtn_cont()).click();
	  
	  String err_msg_arr_time = wd.findElement(getArr_time_err()).getText();
	  Assert.assertEquals(err_msg_arr_time, err_msg_arr_time);
	  takeScreenshot("Arrival_Time_Error",wd);
  }
  
  public static void validatePassengerNum(WebDriver wd) throws InterruptedException{
	  wd.findElement(getBtn_spin_down()).click();
	  wd.findElement(getBtn_cont()).click();
	  Thread.sleep(1000);
	  String err_msg_quan = wd.findElement(getQuan_err()).getText();
	  Assert.assertEquals(err_msg_quan,getErr_msg_quant());
	  takeScreenshot("Validate_passenger_Quantity",wd);
  }
  
  public static void validatePaymentError(WebDriver wd,WebDriverWait wait) {
	  wait.until(ExpectedConditions.visibilityOfElementLocated(getModify_link()));
	  wd.findElement(getPay()).click();
	  
	 
	  String card_num_msg = wd.findElement(getCard_num_err()).getText();
	  String card_cvv_msg = wd.findElement(getCard_cvv_err()).getText();
	  String card_expire_msg = wd.findElement(getExpires_err()).getText();
	  
	  Assert.assertEquals(card_num_msg, getErr_msg_req());
	  Assert.assertEquals(card_cvv_msg, getErr_msg_req());
	  Assert.assertEquals(card_expire_msg, getErr_msg_req());
	  
  }
  
  public static void valCardnum(WebDriver wd){
	  wd.findElement(getCardnumber()).sendKeys("abcd");
	  wd.findElement(getPay()).click();
	  String card_num_msg = wd.findElement(getCard_num_err()).getText();	  
	  Assert.assertEquals(card_num_msg, getErr_msg_req());
	  
	  wd.findElement(getCardnumber()).clear();
	  wd.findElement(getCardnumber()).sendKeys(getCardnum1());
	  wd.findElement(getPay()).click();
	  String card_num_msg2 = wd.findElement(getCard_num_err()).getText();
	  Assert.assertEquals(card_num_msg2,getErr_msg_cardnum());
  }
  
  public static void valCvvNum(WebDriver wd) {
	  wd.findElement(getCcnum()).sendKeys(getCardnum1());
	  wd.findElement(getPay()).click();
	  String cvv_err_msg = wd.findElement(getCard_cvv_err()).getText();
	  Assert.assertEquals(cvv_err_msg, getErr_msg_cvv());
	  
	  wd.findElement(getCcnum()).sendKeys(getCvv1());
	  wd.findElement(getPay()).click();
	  String cvv_err_msg2 = wd.findElement(getCard_cvv_err()).getText();
	  Assert.assertEquals(cvv_err_msg2, getErr_msg_sec());
	  
	  wd.findElement(getCcnum()).sendKeys(getCvv2());
	  wd.findElement(getPay()).click();
	  String cvv_err_msg3 = wd.findElement(getCard_cvv_err()).getText();
	  Assert.assertEquals(cvv_err_msg3, getErr_msg_sec());
	  
	  wd.findElement(getCcnum()).sendKeys(getCvv3());
	  wd.findElement(getPay()).click();
	  String cvv_err_msg4 = wd.findElement(getCard_cvv_err()).getText();
	  Assert.assertEquals(cvv_err_msg4, getErr_msg_sec());	  
  }
  
  public static void validateBackFeature(WebDriver wd) {
	  wd.findElement(getBack_btn()).click();
	  String enteredCust = wd.findElement(getCust_name()).getAttribute("value");
	  String enteredPhn = wd.findElement(getPhone()).getAttribute("value");
	  String enteredEmail = wd.findElement(getCust_email()).getAttribute("value");
	 
	  Assert.assertEquals(enteredCust, getFname());
	  Assert.assertEquals(enteredPhn, getCphone());
	  Assert.assertEquals(enteredEmail, getCemail());
  }
  
  public static void validate_Promo(WebDriver wd,WebDriverWait wait) throws InterruptedException {
	  wait.until(ExpectedConditions.visibilityOf(wd.findElement(getModify_link())));
	  wd.findElement(By.partialLinkText("code")).click();
	  Thread.sleep(2000);
      wd.findElement(By.name("code")).sendKeys("Promo");
	  wd.findElement(By.cssSelector("button[class='btn btn-success action-apply-code']")).click();
	  Thread.sleep(1000);
	  String str = wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/span")).getText();
	  Assert.assertEquals(str, "Invalid Code");
	  wd.findElement(By.cssSelector("button[class='btn btn-default cancel']"));
  }
  
 
  public static void takeScreenshot(String stp_name,WebDriver wd) {
	  long ms = System.currentTimeMillis();
	  
	   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");  
	   LocalDateTime now = LocalDateTime.now();    
	  String filePath = "./ScreenShots/Xola/"+dtf.format(now)+"/";
	  try {
		    TakesScreenshot ts = (TakesScreenshot) wd;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source, new File(filePath+stp_name+ms+".png"));
		} 
		catch (Exception e) 
		{
		    System.out.println("Exception while taking ScreenShot "+e.getMessage());
		}
  }  
  
  
  public static void tearDown(WebDriver wd) {
	  wd.close();
  }
}
