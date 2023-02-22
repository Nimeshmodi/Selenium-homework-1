package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\Softwaretesting\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.co.uk/");

    }
}
