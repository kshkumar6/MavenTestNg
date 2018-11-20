package com.qa.elements;

import org.openqa.selenium.By;

public class Elements {
	  private static By datePicker = By.xpath("/html/body/div[1]/div/section[2]/div[1]/div/section[2]/form/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/table/tbody/tr[3]/td[2]");
	  private static By timepicker = By.xpath("/html/body/div[1]/div/section[2]/div[1]/div/section[2]/form/div/div[1]/div/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/button");
	  private static By btn_cont = By.xpath("/html/body/div[1]/div/section[2]/div[2]/div/div/div[2]/div/button[2]");
	  private static By cust_name = By.id("customerName");
	  private static By cust_email = By.id("customerEmail");
	  private static By phone  = By.id("phone");
	  private static By cardnumber = By.id("cc-number");
	  static By ccnum = By.name("cvv");
	  private static By add_person = By.cssSelector("button[class='btn btn-default spin-up']");
	  private static By next_mon = By.cssSelector("a[class='ui-datepicker-next ui-corner-all']");
	  private static By modify_link = By.linkText("Modify");
	  static By expiry_month = By.name("expiryMonth");
	  static By expiry_year = By.name("expiryYear");
	  static By pay = By.cssSelector("button[class='btn btn-success action-pay']");
	  static By close = By.xpath("/html/body/div[1]/div/section[2]/div[2]/div/div/div[2]/div/button");
	  static By success= By.cssSelector("div[class='alert alert-success']");
	  static By cust_exp = By.className("experience-name");
	  static By cust_name_label = By.className("customer-name");
	  static By cust_email_label = By.className("customer-email");
	  static By cust_phone_label = By.className("customer-phone");
	  static By cust_name_err = By.xpath("/html/body/div[1]/div/section[2]/div[1]/div/section[2]/form/div/div[1]/div/div/div[3]/div/div[2]/div/div[1]/div/div/span");
	  static By cust_email_err = By.xpath("/html/body/div[1]/div/section[2]/div[1]/div/section[2]/form/div/div[1]/div/div/div[3]/div/div[2]/div/div[2]/div/div/span");
	  static By arr_date_err = By.cssSelector("div[class='arrival-error-msg']");
	  static By new_date = By.xpath("/html/body/div[1]/div/section[2]/div[1]/div/section[2]/form/div/div[1]/div/div/div[2]/div[1]/div/div[1]/div/table/tbody/tr[5]/td[6]");
	  static By arr_time_err = By.cssSelector("div[class='arrival-time-error-msg']");	  
	  static By btn_spin_down = By.cssSelector("button[class='btn btn-default spin-down']");
	  static By quan_err = By.cssSelector("span[class='quantity-error-msg']");
	  static By card_num_err = By.xpath("/html/body/div[1]/div/section[2]/div[1]/div/div/section[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div/span");
	  static By card_cvv_err= By.xpath("/html/body/div[1]/div/section[2]/div[1]/div/div/section[2]/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/span");
	  static By expires_err = By.xpath("/html/body/div[1]/div/section[2]/div[1]/div/div/section[2]/div/div[2]/div/div/div/div/div/div/div/div[3]/div[1]/div/span");
	  static By back_btn = By.linkText("Back");
	  
	  private static String page_title = "Xola - Checkout";
	  private static String str_url ="https://sandbox-checkout.xola.com/index.html#seller/58e235b107876cdd1f8b45e2/experiences/58e2371107876cdd1f8b45e5";
	  static String cust_exp_name = "BANGALORE CITY TOUR";
	  private static String fname = "Abozal";
	  private static String cemail = "test@gmail.com";
	  private static String cphone = "9999999999";
	  static String cvvnum = "123";
	  static String success_msg = "YOUR BOOKING HAS BEEN PLACED";
	  static String cl_label = "CLOSE";
	  private static String cardnum1 = "4242";
	  private static String cardnum2 = "4242";
	  private static String cardnum3 = "4242";
	  static String cardnum4 = "4242";
	  
	  static String fname_up = "Rabozal";
	  static String cemail_up = "Retest@gmail.com";
	  static String cphone_up = "2999999999";
	  
	  static String err_msg_req = "Required";
	  static String err_msg_adate="Select a valid date";
	  static String err_msg_atime="Select a valid time";
	  static String err_msg_quant = "Quantity must be at least 1";
	 
	  static String cvv1 = "12345";
	  static String cvv2 = "abc";
	  static String cvv3="@31";
	  static String err_msg_cardnum = "Card number is invalid";
	  static String err_msg_cvv = "Cvv must be 3 characters";
	  static String err_msg_sec = "Security code is invalid";
	  
	  
	public static String getPage_title() {
		return page_title;
	}
	public static void setPage_title(String page_title) {
		Elements.page_title = page_title;
	}
	public static String getStr_url() {
		return str_url;
	}
	public static void setStr_url(String str_url) {
		Elements.str_url = str_url;
	}
	public static By getCust_name() {
		return cust_name;
	}
	public static void setCust_name(By cust_name) {
		Elements.cust_name = cust_name;
	}
	public static By getAdd_person() {
		return add_person;
	}
	public static void setAdd_person(By add_person) {
		Elements.add_person = add_person;
	}
	public static String getFname() {
		return fname;
	}
	public static void setFname(String fname) {
		Elements.fname = fname;
	}
	public static By getCust_email() {
		return cust_email;
	}
	public static void setCust_email(By cust_email) {
		Elements.cust_email = cust_email;
	}
	public static String getCemail() {
		return cemail;
	}
	public static void setCemail(String cemail) {
		Elements.cemail = cemail;
	}
	public static By getPhone() {
		return phone;
	}
	public static void setPhone(By phone) {
		Elements.phone = phone;
	}
	public static String getCphone() {
		return cphone;
	}
	public static void setCphone(String cphone) {
		Elements.cphone = cphone;
	}
	public static By getNext_mon() {
		return next_mon;
	}
	public static void setNext_mon(By next_mon) {
		Elements.next_mon = next_mon;
	}
	public static By getDatePicker() {
		return datePicker;
	}
	public static void setDatePicker(By datePicker) {
		Elements.datePicker = datePicker;
	}
	public static By getCcnum() {
		return ccnum;
	}
	public static void setCcnum(By ccnum) {
		Elements.ccnum = ccnum;
	}
	public static By getExpiry_month() {
		return expiry_month;
	}
	public static void setExpiry_month(By expiry_month) {
		Elements.expiry_month = expiry_month;
	}
	public static By getExpiry_year() {
		return expiry_year;
	}
	public static void setExpiry_year(By expiry_year) {
		Elements.expiry_year = expiry_year;
	}
	public static By getPay() {
		return pay;
	}
	public static void setPay(By pay) {
		Elements.pay = pay;
	}
	public static By getClose() {
		return close;
	}
	public static void setClose(By close) {
		Elements.close = close;
	}
	public static By getSuccess() {
		return success;
	}
	public static void setSuccess(By success) {
		Elements.success = success;
	}
	public static By getCust_exp() {
		return cust_exp;
	}
	public static void setCust_exp(By cust_exp) {
		Elements.cust_exp = cust_exp;
	}
	public static By getCust_name_label() {
		return cust_name_label;
	}
	public static void setCust_name_label(By cust_name_label) {
		Elements.cust_name_label = cust_name_label;
	}
	public static By getCust_email_label() {
		return cust_email_label;
	}
	public static void setCust_email_label(By cust_email_label) {
		Elements.cust_email_label = cust_email_label;
	}
	public static By getCust_phone_label() {
		return cust_phone_label;
	}
	public static void setCust_phone_label(By cust_phone_label) {
		Elements.cust_phone_label = cust_phone_label;
	}
	public static By getCust_name_err() {
		return cust_name_err;
	}
	public static void setCust_name_err(By cust_name_err) {
		Elements.cust_name_err = cust_name_err;
	}
	public static By getCust_email_err() {
		return cust_email_err;
	}
	public static void setCust_email_err(By cust_email_err) {
		Elements.cust_email_err = cust_email_err;
	}
	public static By getArr_date_err() {
		return arr_date_err;
	}
	public static void setArr_date_err(By arr_date_err) {
		Elements.arr_date_err = arr_date_err;
	}
	public static By getNew_date() {
		return new_date;
	}
	public static void setNew_date(By new_date) {
		Elements.new_date = new_date;
	}
	public static By getArr_time_err() {
		return arr_time_err;
	}
	public static void setArr_time_err(By arr_time_err) {
		Elements.arr_time_err = arr_time_err;
	}
	public static By getBtn_spin_down() {
		return btn_spin_down;
	}
	public static void setBtn_spin_down(By btn_spin_down) {
		Elements.btn_spin_down = btn_spin_down;
	}
	public static By getQuan_err() {
		return quan_err;
	}
	public static void setQuan_err(By quan_err) {
		Elements.quan_err = quan_err;
	}
	public static By getCard_num_err() {
		return card_num_err;
	}
	public static void setCard_num_err(By card_num_err) {
		Elements.card_num_err = card_num_err;
	}
	public static By getCard_cvv_err() {
		return card_cvv_err;
	}
	public static void setCard_cvv_err(By card_cvv_err) {
		Elements.card_cvv_err = card_cvv_err;
	}
	public static By getExpires_err() {
		return expires_err;
	}
	public static void setExpires_err(By expires_err) {
		Elements.expires_err = expires_err;
	}
	public static By getBack_btn() {
		return back_btn;
	}
	public static void setBack_btn(By back_btn) {
		Elements.back_btn = back_btn;
	}
	public static String getCust_exp_name() {
		return cust_exp_name;
	}
	public static void setCust_exp_name(String cust_exp_name) {
		Elements.cust_exp_name = cust_exp_name;
	}
	public static String getCvvnum() {
		return cvvnum;
	}
	public static void setCvvnum(String cvvnum) {
		Elements.cvvnum = cvvnum;
	}
	public static String getSuccess_msg() {
		return success_msg;
	}
	public static void setSuccess_msg(String success_msg) {
		Elements.success_msg = success_msg;
	}
	public static String getCl_label() {
		return cl_label;
	}
	public static void setCl_label(String cl_label) {
		Elements.cl_label = cl_label;
	}
	public static String getCardnum4() {
		return cardnum4;
	}
	public static void setCardnum4(String cardnum4) {
		Elements.cardnum4 = cardnum4;
	}
	public static String getFname_up() {
		return fname_up;
	}
	public static void setFname_up(String fname_up) {
		Elements.fname_up = fname_up;
	}
	public static String getCemail_up() {
		return cemail_up;
	}
	public static void setCemail_up(String cemail_up) {
		Elements.cemail_up = cemail_up;
	}
	public static String getCphone_up() {
		return cphone_up;
	}
	public static void setCphone_up(String cphone_up) {
		Elements.cphone_up = cphone_up;
	}
	public static String getErr_msg_req() {
		return err_msg_req;
	}
	public static void setErr_msg_req(String err_msg_req) {
		Elements.err_msg_req = err_msg_req;
	}
	public static String getErr_msg_adate() {
		return err_msg_adate;
	}
	public static void setErr_msg_adate(String err_msg_adate) {
		Elements.err_msg_adate = err_msg_adate;
	}
	public static String getErr_msg_atime() {
		return err_msg_atime;
	}
	public static void setErr_msg_atime(String err_msg_atime) {
		Elements.err_msg_atime = err_msg_atime;
	}
	public static String getErr_msg_quant() {
		return err_msg_quant;
	}
	public static void setErr_msg_quant(String err_msg_quant) {
		Elements.err_msg_quant = err_msg_quant;
	}
	public static String getCvv1() {
		return cvv1;
	}
	public static void setCvv1(String cvv1) {
		Elements.cvv1 = cvv1;
	}
	public static String getCvv2() {
		return cvv2;
	}
	public static void setCvv2(String cvv2) {
		Elements.cvv2 = cvv2;
	}
	public static String getCvv3() {
		return cvv3;
	}
	public static void setCvv3(String cvv3) {
		Elements.cvv3 = cvv3;
	}
	public static String getErr_msg_cardnum() {
		return err_msg_cardnum;
	}
	public static void setErr_msg_cardnum(String err_msg_cardnum) {
		Elements.err_msg_cardnum = err_msg_cardnum;
	}
	public static String getErr_msg_cvv() {
		return err_msg_cvv;
	}
	public static void setErr_msg_cvv(String err_msg_cvv) {
		Elements.err_msg_cvv = err_msg_cvv;
	}
	public static String getErr_msg_sec() {
		return err_msg_sec;
	}
	public static void setErr_msg_sec(String err_msg_sec) {
		Elements.err_msg_sec = err_msg_sec;
	}
	public static By getTimepicker() {
		return timepicker;
	}
	public static void setTimepicker(By timepicker) {
		Elements.timepicker = timepicker;
	}
	public static By getBtn_cont() {
		return btn_cont;
	}
	public static void setBtn_cont(By btn_cont) {
		Elements.btn_cont = btn_cont;
	}
	public static By getCardnumber() {
		return cardnumber;
	}
	public static void setCardnumber(By cardnumber) {
		Elements.cardnumber = cardnumber;
	}
	public static String getCardnum1() {
		return cardnum1;
	}
	public static void setCardnum1(String cardnum1) {
		Elements.cardnum1 = cardnum1;
	}
	public static String getCardnum2() {
		return cardnum2;
	}
	public static void setCardnum2(String cardnum2) {
		Elements.cardnum2 = cardnum2;
	}
	public static By getModify_link() {
		return modify_link;
	}
	public static void setModify_link(By modify_link) {
		Elements.modify_link = modify_link;
	}
	public static String getCardnum3() {
		return cardnum3;
	}
	public static void setCardnum3(String cardnum3) {
		Elements.cardnum3 = cardnum3;
	}
}
