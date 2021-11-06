package final_project_testcontext;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Test_project {

	@SuppressWarnings("unused")
	@Test
	public void site_header_is_on_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		browser.get("http://localhost/project/index.php/Photographer_Controller/login_ptg");
		Thread.sleep(1000);
		browser.get("http://localhost/project/index.php/Customer_Controller/login");
		browser.findElement(By.id("exampleFormControlInput1")).click();
		browser.findElement(By.id("exampleFormControlInput1")).sendKeys("wuttipong@gmail.com");
		Thread.sleep(1000);
		browser.findElement(By.xpath("(//input[@id='exampleFormControlInput1'])[2]")).sendKeys("123456789");
		Thread.sleep(1000);
		browser.findElement(By.name("login")).click();
		browser.findElement(By.xpath("[@href='http://localhost/project/index.php/Photographer_Controller/photographer_cus']")).click();
		browser.findElement(By.cssSelector("tr:nth-child(2) .btn-light")).click();
		browser.findElement(By.cssSelector(".btn:nth-child(2)")).click();
		browser.findElement(By.name("type_of_work")).click();
		
		{
		      WebElement dropdown = browser.findElement(By.name("type_of_work"));
		      dropdown.findElement(By.xpath("//option[. = 'รับปริญญา']")).click();
		    }
		browser.findElement(By.name("form_of_employment")).click();
		    {
		      WebElement dropdown = browser.findElement(By.name("form_of_employment"));
		      dropdown.findElement(By.xpath("//option[. = '1 วัน']")).click();
		    }
		    browser.findElement(By.name("service_rates")).click();
		    browser.findElement(By.name("service_rates")).sendKeys("5000");
		    browser.findElement(By.name("at")).click();
		    browser.findElement(By.name("at")).sendKeys("บ้านหนองเสือ");
		    browser.findElement(By.name("house_number")).click();
		    browser.findElement(By.name("house_number")).sendKeys("69");
		    browser.findElement(By.name("canton")).click();
		    browser.findElement(By.name("canton")).sendKeys("หนองดินแดง");
		    browser.findElement(By.name("district")).click();
		    browser.findElement(By.name("district")).sendKeys("เมือง");
		    browser.findElement(By.name("province")).click();
		    browser.findElement(By.name("province")).sendKeys("นครปฐม");
		    browser.findElement(By.name("day_month_year")).click();
		    browser.findElement(By.name("day_month_year")).click();
		    browser.findElement(By.name("day_month_year")).sendKeys("2021-10-30");
		    browser.findElement(By.name("time")).click();
		    browser.findElement(By.name("time")).sendKeys("09.00");
		    browser.findElement(By.name("time")).sendKeys("09.00 น.");
		    browser.findElement(By.cssSelector(".btn-secondary")).click();
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.cssSelector(".btn-info")).click();
		    browser.findElement(By.linkText("ย้อนกลับ")).click();
		    browser.findElement(By.linkText("Log Out")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(สมาชิก)")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(ช่างภาพ)")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("614259011@webmail.npru.ac.th");
		    browser.findElement(By.name("ptg_password")).sendKeys("123456");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("614259011@webmail.npru.ac.th");
		    browser.findElement(By.name("ptg_password")).sendKeys("123456");
		    browser.findElement(By.name("ptg_password")).click();
		    browser.findElement(By.name("ptg_password")).click();
		    browser.findElement(By.name("ptg_password")).click();
		    {
		      WebElement element = browser.findElement(By.name("ptg_password"));
		      Actions builder = new Actions(browser);
		      builder.doubleClick(element).perform();
		    }
		    browser.findElement(By.name("ptg_password")).sendKeys("123456789");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.linkText("รอดำเนินการ")).click();
		    browser.findElement(By.cssSelector("form > .btn")).click();
		    browser.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.linkText("ออกจากระบบ")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(สมาชิก)")).click();
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.linkText("ประวัติการทำสัญญา")).click();
		    browser.findElement(By.linkText("รอการชำระเงิน งวดที่ 1")).click();
		    browser.findElement(By.cssSelector(".btn-info")).click();
		    browser.findElement(By.id("img")).click();
		    browser.findElement(By.id("img")).sendKeys("C:\\fakepath\\8ee33772e7422099b4516ed0349817ca.jpg");
		    browser.findElement(By.cssSelector("center > .btn-success")).click();
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.linkText("Log Out")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(แอดมิน)")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(แอดมิน)")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("admin@gmail.com");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.linkText("รอดำเนินการ")).click();
		    browser.findElement(By.cssSelector(".btn-info")).click();
		    browser.findElement(By.cssSelector(".btn:nth-child(4)")).click();
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.linkText("ออกจากระบบ")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(สมาชิก)")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("wuttipong@gmail.com");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.linkText("ประวัติการทำสัญญา")).click();
		    browser.findElement(By.linkText("รอช่างภาพทำงาน")).click();
		    browser.findElement(By.cssSelector(".btn-info")).click();
		    {
		      WebElement element = browser.findElement(By.cssSelector(".btn:nth-child(3)"));
		      Actions builder = new Actions(browser);
		      builder.moveToElement(element).perform();
		    }
		    browser.findElement(By.cssSelector(".btn:nth-child(3)")).click();
		    {
		      WebElement element = browser.findElement(By.tagName("body"));
		      Actions builder = new Actions(browser);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.cssSelector(".btn-info")).click();
		    browser.findElement(By.id("img2")).click();
		    browser.findElement(By.id("img2")).sendKeys("C:\\fakepath\\6c560341c49932945d9ebb3bda39e25d.png");
		    {
		      WebElement element = browser.findElement(By.cssSelector("center > .btn-success"));
		      Actions builder = new Actions(browser);
		      builder.moveToElement(element).perform();
		    }
		    browser.findElement(By.cssSelector("center > .btn-success")).click();
		    {
		      WebElement element = browser.findElement(By.tagName("body"));
		      Actions builder = new Actions(browser);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.linkText("Log Out")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(แอดมิน)")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("admin@gmail.com");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.linkText("รอดำเนินการ")).click();
		    browser.findElement(By.linkText("รอตรวจสอบการชำระเงิน งวดที่2")).click();
		    browser.findElement(By.cssSelector(".btn-info")).click();
		    {
		      WebElement element = browser.findElement(By.cssSelector(".btn:nth-child(4)"));
		      Actions builder = new Actions(browser);
		      builder.moveToElement(element).perform();
		    }
		    browser.findElement(By.cssSelector(".btn:nth-child(4)")).click();
		    {
		      WebElement element = browser.findElement(By.tagName("body"));
		      Actions builder = new Actions(browser);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.linkText("ออกจากระบบ")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(สมาชิก)")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("wuttipong@gmail.com");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.linkText("ประวัติการทำสัญญา")).click();
		    browser.findElement(By.linkText("รอตรวจสอบหลักฐาน")).click();
		    browser.findElement(By.linkText("Log Out")).click();
		    browser.findElement(By.id("navcol-1")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(ช่างภาพ)")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("614259011@webmail.npru.ac.th");
		    browser.findElement(By.name("ptg_password")).sendKeys("123456");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("614259011@webmail.npru.ac.th");
		    browser.findElement(By.name("ptg_password")).sendKeys("123456");
		    browser.findElement(By.name("ptg_password")).click();
		    browser.findElement(By.name("ptg_password")).sendKeys("123456789");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.linkText("รายการทั้งหมด")).click();
		    browser.findElement(By.linkText("รอดำเนินการ")).click();
		    browser.findElement(By.linkText("รอการอนุมัติ")).click();
		    browser.findElement(By.linkText("รอการอนุมัติ")).click();
		    browser.findElement(By.linkText("รอส่งงาน")).click();
		    browser.findElement(By.cssSelector("form > .btn")).click();
		    browser.findElement(By.id("text-lastname")).click();
		    browser.findElement(By.id("text-lastname")).sendKeys("C:\\fakepath\\0fc54beacb5358179f2d8f95e96c727d.PNG");
		    browser.findElement(By.cssSelector("center > .btn-success")).click();
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.linkText("ออกจากระบบ")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(สมาชิก)")).click();
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.cssSelector(".mb-3:nth-child(2)")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("wuttipong@gmail.com");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.linkText("ประวัติการทำสัญญา")).click();
		    browser.findElement(By.linkText("รอตรวจสอบหลักฐาน")).click();
		    browser.findElement(By.cssSelector(".btn-info")).click();
		    browser.findElement(By.cssSelector("center > .btn-success")).click();
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.cssSelector(".btn-info")).click();
		    browser.findElement(By.id("img4")).click();
		    browser.findElement(By.id("img4")).sendKeys("C:\\fakepath\\7a8034017b8540a4a9587bc172b06dad.jpg");
		    browser.findElement(By.cssSelector("center > .btn-success")).click();
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.linkText("Log Out")).click();
		    browser.findElement(By.linkText("Log In")).click();
		    browser.findElement(By.linkText("เข้าสู่ระบบ(แอดมิน)")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).click();
		    browser.findElement(By.id("exampleFormControlInput1")).sendKeys("admin@gmail.com");
		    browser.findElement(By.name("login")).click();
		    browser.findElement(By.linkText("รอดำเนินการ")).click();
		    browser.findElement(By.linkText("รอตรวจสอบการชำระเงิน งวดที่3")).click();
		    browser.findElement(By.cssSelector(".btn-info")).click();
		    browser.findElement(By.cssSelector(".btn:nth-child(4)")).click();
		    browser.findElement(By.name("submit")).click();
		    browser.findElement(By.linkText("รอการชำระเงินให้ช่างภาพ")).click();
		    Thread.sleep(1000);
		    String actualString = browser.findElement(By.xpath("//input[@value='ส่งหลักฐาน']")).getText();
		    Thread.sleep(1000);
		    browser.findElement(By.xpath("//input[@id='img5']")).sendKeys("C:\\AppServ\\www\\project\\img\\2f5b4225bea018561a1f5d725a08c60a.jpg");
		    Thread.sleep(1000);
		    browser.findElement(By.cssSelector("center > .btn-success")).click();
		    Thread.sleep(1000);
		    String expextedString = "Would you like to upload a receipt?";
		    Thread.sleep(1000);
		    try {
		    	assertEquals(actualString,expextedString);
		    	System.out.print("Result : upload success");
		    	takeSnapShot(browser,"C:\\AppServ\\www\\project\\img\\sceenshort\\upload_img.jpg");
		    }catch(Throwable e) {
		    	System.out.print("upload Fail");
		    }
		    finally {
		    	System.out.print("upload testing end");
		    }
		    Thread.sleep(1000);
		    browser.close();
		
		    
		

		
		
		
		}

	private void takeSnapShot(WebDriver browser, String string) {
		// TODO Auto-generated method stub
		
	}

	}