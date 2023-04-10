package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {
        if( browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")){
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new ChromeDriver();

        }else{
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        //Find the login link element
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //Click on login link element
        loginLink.click();
        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        //Type the Email address to email field element
        emailField.sendKeys("Prime123@gmail.com");

        driver.findElement(By.name("Password")).sendKeys("Prime123");
        driver.close();
        driver.quit();
    }
}
