package DataProvider;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestScript {

	
	Select sel;
	public void m1() throws InterruptedException {	
		
		WebDriverManager.chromedriver().setup();
////System.setProperty("webdriver.chrome.driver","C:\\Users\\San\\Documents\\Scanned Documents\\chromedriver.exe");

		//open chrome browser
		WebDriver driver=new ChromeDriver();
		
	//navigate to url
		driver.get("https://www.evergreen-marine.com/");
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click on register link
		driver.findElement(By.xpath("(//*[text()='Register'])[1]")).click();
		
		
		Set<String> set=driver.getWindowHandles();
		System.out.println(set);
		ArrayList<String> list=new ArrayList<String>(set);
		
		String wi=list.get(1);
		//switch to next window
		driver.switchTo().window(wi);
		
		//click on accept button
		WebElement ele=	driver.findElement(By.xpath("//*[@src=\"/tuf1/images/btn_Accept.gif\"]"));


		ele.click();
		
		driver.findElement(By.xpath("//*[@name=\"comName\"]")).sendKeys("INdX.tech");
		driver.findElement(By.xpath("//*[@name=\"comAddress\"]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@name=\"comCity\"]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@name=\"comZip\"]")).sendKeys("123456");
		WebElement country=driver.findElement(By.xpath("//*[@name=\"comCtry\"]"));
		//select the value from dropdown using select class
		sel=new Select(country);
		sel.selectByVisibleText("INDIA");
	Thread.sleep(2000);
		WebElement  state=driver.findElement(By.xpath("//*[@name=\"comState\"]"));
		  sel=new Select(state);
			sel.selectByVisibleText("MAHARASHTRA");
		
		
		driver.findElement(By.xpath("//*[@name=\"webSite\"]")).sendKeys("https://www.shipmentlink.com/");
		driver.findElement(By.xpath("//*[text()='Shipper Association']")).click();
		driver.findElement(By.xpath("//*[@src=\"/tuf1/images/btn_Right.gif\"]")).click();
		
		
		WebElement majorBussinessTraffic=driver.findElement(By.xpath("//*[@name=\"comTrafficFrom\"]"));
		
		 sel=new Select(majorBussinessTraffic);

		sel.selectByIndex(1);
		WebElement majorBussinessTrafficTo=driver.findElement(By.xpath("//*[@name=\"comTrafficTo\"]"));
		 sel=new Select(majorBussinessTrafficTo);

		sel.selectByIndex(1);
		WebElement carrOffice=driver.findElement(By.xpath("//*[@name=\"carrOffice\"]"));
		 sel=new Select(carrOffice);
		
		sel.selectByIndex(5);
		driver.findElement(By.xpath("//*[@name=\"carrFirst\"]")).sendKeys("vijay");
		driver.findElement(By.xpath("//*[@name=\"carrLast\"]")).sendKeys("solanke");
		driver.findElement(By.id("usrId")).sendKeys("vijay@indx.com");
		driver.findElement(By.xpath("//*[@name=\"usrFirst\"]")).sendKeys("vijay");
		driver.findElement(By.xpath("//*[@name=\"usrLast\"]")).sendKeys("Solanke");

		driver.findElement(By.xpath("(//*[@name=\"usrTel\"])[1]")).sendKeys("(212)");
		driver.findElement(By.xpath("(//*[@name=\"usrTel\"])[2]")).sendKeys("123");
		driver.findElement(By.xpath("(//*[@name=\"usrTel\"])[3]")).sendKeys("45678");
		driver.findElement(By.xpath("(//*[@name=\"usrFax\"])[1]")).sendKeys("456");
		driver.findElement(By.xpath("(//*[@name=\"usrFax\"])[2]")).sendKeys("4567");
		driver.findElement(By.xpath("(//*[@name=\"usrFax\"])[3]")).sendKeys("45678");
		driver.findElement(By.xpath("//*[@name=\"usrAddress\"]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@name=\"usrCity\"]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@name=\"usrZip\"]")).sendKeys("123456");
		WebElement area=driver.findElement(By.xpath("//*[@name=\"usrCtry\"]"));
		sel=new Select(area);
		sel.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		WebElement userstate=driver.findElement(By.xpath("//*[@name=\"usrState\"]"));
		
		 sel=new Select(userstate);
		sel.selectByVisibleText("MAHARASHTRA");
		
		driver.findElement(By.id("blANWeb")).click();
		driver.findElement(By.id("blPFWeb")).click();
		driver.findElement(By.id("blET")).click();
		driver.findElement(By.id("blEP")).click();
		driver.findElement(By.id("blNonWeb")).click();
		driver.findElement(By.id("blISWeb")).click();
		driver.findElement(By.name("blNo")).sendKeys("11111111");
		
		driver.findElement(By.xpath("//*[@src=\"/tuf1/images/btn_Cancel.gif\"]")).click();
		Thread.sleep(9000);
		driver.quit();


	}

	public static void main(String[] args) throws InterruptedException {
		
	TestScript sc=new TestScript();
	sc.m1();
}}