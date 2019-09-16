package com.model;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo 
{
public static void main(String args[]) throws IOException
{
	System.setProperty("webdriver.chrome.driver","C:\\29062019\\chromedriver_win32\\chromedriver.exe ");
    WebDriver driver=new ChromeDriver();
driver.get("file:///E:/autoitfile1.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@type='file']")).click();
Runtime.getRuntime().exec("E:\\Autoitfileselenium.exe");
System.out.println("system has open");
}}


