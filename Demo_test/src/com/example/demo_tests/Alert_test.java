package com.example.demo_tests;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.Alert;  
import org.openqa.selenium.chrome.ChromeDriver;  


public class Alert_test {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KANAK\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("Sam");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();
		
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Thread.sleep(5000);
		
		alert.accept();
		//alert.dismiss();
		
	}
}
