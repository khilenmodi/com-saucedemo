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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {

        static String browser = "FireFox";
        static String baseUrl = "https://www.saucedemo.com/";

        static WebDriver driver;

    public static void main(String[] args) {

        // set up multi Browser
        if (browser.equalsIgnoreCase("Chrome")){
                     driver = new ChromeDriver();
                } else if (browser.equalsIgnoreCase("Edge")) {
                    driver = new EdgeDriver();
                } else if (browser.equalsIgnoreCase("FireFox")) {
                    driver = new FirefoxDriver();

                }else {
                    System.out.println("Invalid Web browser entered ");
                }

                // open url
                driver.get(baseUrl);

                // maximize the screen of Browser
                driver.manage().window().maximize();

                // Manage implicitly time for window browser
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

                // Print the title of the page
        System.out.println("The title of the page is : " + driver.getTitle());

                // print the current Url
        System.out.println("The current Url is : " + driver.getCurrentUrl());

                // print the page source
        System.out.println("The current Page source is :" + driver.getPageSource());

                //Enter the username in UserNameField
        WebElement userNameField = driver.findElement(By.name("user-name"));
        userNameField.sendKeys("standard_user");
                // Enter the password in PasswordField
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
                // closing the browser.
        driver.close();

    }
}
