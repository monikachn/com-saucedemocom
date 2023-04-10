package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
static String browser = "FireFox";
static WebDriver driver;
static String baseUrl= "https://www.saucedemo.com/";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("Edge")){
            driver= new EdgeDriver();
        }else{
            System.out.println("Wrong browser name");
        }
        // open Url
        driver.get(baseUrl);

        // get the title of the page
        String title =driver.getTitle();
        System.out.println(title);

        // print the current url
        System.out.println("Current Url :" +driver.getCurrentUrl());

        // get page source
        System.out.println("Page source :"+ driver.getPageSource());

        // enter the email to email field
        WebElement emailField = driver.findElement(By.name("user-name"));
        emailField.sendKeys("Abc@gmail.com");

        // Enter the password to password field
        WebElement passField = driver.findElement(By.name("password"));
        passField.sendKeys("123prime");

        // Close the browser
        driver.close();
    }



}
