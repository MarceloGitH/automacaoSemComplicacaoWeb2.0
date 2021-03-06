package br.com.chronosacademy.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Clock;

public class Driver {
    public static WebDriver driver;
    private  static WebDriverWait wait;

        public Driver(String navegador){

            switch (navegador){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

            }
            wait = new WebDriverWait(driver, 10);
            driver.manage().window().maximize();

        }

        public static WebDriver getDriver(){ return driver; }

        public static void visibilityOf(WebElement element){
            wait.until(ExpectedConditions.visibilityOf(element));
        }

        public static void invisibilityOf(WebElement element){
            wait.until(ExpectedConditions.invisibilityOf(element));
        }
}
