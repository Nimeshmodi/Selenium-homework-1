package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator_Edge {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.edge.driver", "C:\\Softwaretesting\\Driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.className("email")).sendKeys("modinimesh.btech@gmail.com");
        driver.findElement(By.className("password")).sendKeys("95837348w");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
}
