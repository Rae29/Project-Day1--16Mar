package org.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Rae\\Day1 Project\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 WebElement txtuser = driver.findElement(By.id("email"));
	 txtuser.sendKeys("rekha");
	 WebElement txtpass =driver.findElement(By.id("pass"));
	 txtpass.sendKeys("raeu2o2");
	}

}
