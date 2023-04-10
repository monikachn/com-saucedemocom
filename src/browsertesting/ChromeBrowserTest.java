package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * BaseUrl-https://www.saucedemo.com/
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://www.saucedemo.com/";
        // launch the chrome browser
        WebDriver driver = new ChromeDriver();

        // open the url in browser
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
