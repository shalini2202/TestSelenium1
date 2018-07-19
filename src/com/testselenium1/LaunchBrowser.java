package com.testselenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Firefox
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\a631020\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	      System.setProperty("webdriver.firefox.marionette","C:\\Users\\a631020\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.google.co.in/");;

	}

}
