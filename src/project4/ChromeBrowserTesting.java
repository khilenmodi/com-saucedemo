package project4;
/**
 * Project-4 - Project Name: com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {

    public static void main(String[] args) {

                String baseUrl = "https://www.saucedemo.com/";

            // setup Chrome browser
        WebDriver driver = new ChromeDriver();
            // open url
        driver.get(baseUrl);

            // maximize the size of browser
        driver.manage().window().maximize();
            // manage the  implicitly time of browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            // print the title of the page
        System.out.println("Title of the page is :" + driver.getTitle());

            // print the current url
        System.out.println("The current Url is : " + driver.getCurrentUrl());

            // print the page source
        System.out.println("Current source of page is :" + driver.getPageSource());

            // Enter the userName in userNameField
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");
            // Enter the password in passwordField
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        // close the browser
        driver.close();
    }
}
