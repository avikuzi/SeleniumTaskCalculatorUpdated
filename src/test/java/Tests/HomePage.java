package Tests;

import Environment.EnvironmentManager;
import Environment.RunEnvironment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
        public WebDriver driver;

        //Page URL
        private static String PAGE_URL = "https://web2.0calc.com/";

    public HomePage() {
    }


    public void startBrowser() {
            EnvironmentManager.initWebDriver();
            WebDriver driver = RunEnvironment.getWebDriver();
            driver.get(PAGE_URL);
        }
        //Locators
        WebElement Accept = driver.findElement(By.id("cookieconsentallowall"));
        WebElement Btn2 = driver.findElement(By.id("Btn2"));
        WebElement BtnPlus = driver.findElement(By.id("BtnPlus"));
        WebElement Btn5 = driver.findElement(By.id("Btn5"));
        WebElement BtnCalc = driver.findElement(By.id("BtnCalc"));
        WebElement History = driver.findElement(By.id("hist"));

        WebElement Btn10 = driver.findElement(By.id("Btn10"));
        WebElement BtnMinus = driver.findElement(By.id("BtnMinus"));

        WebElement BtnColon = driver.findElement(By.id("BtnColon"));
        WebElement Btn1 = driver.findElement(By.id("Btn1"));
        WebElement BtnParanR = driver.findElement(By.id("BtnParanR"));
        WebElement Btn0 = driver.findElement(By.id("Btn0"));
        WebElement BtnMult = driver.findElement(By.id("BtnMult"));
        WebElement BtnSin = driver.findElement(By.id("BtnSin"));
        WebElement Btn3 = driver.findElement(By.id("Btn3"));
        WebElement BtnClear = driver.findElement(By.id("BtnClear"));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"histframe\"]/ul/li"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"histframe\"]/ul/li[1]"));
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"histframe\"]/ul/li[2]"));
        WebElement element4 = driver.findElement(By.xpath("//*[@id=\"histframe\"]/ul/li[3]"));
    WebDriverWait wait = new WebDriverWait(driver, 10);

        String strng = element.getText();
        String strng2 = element2.getText();
        String strng3 = element3.getText();
        String strng4 = element4.getText();

        //Constructor
        public HomePage(WebDriver driver) {
            this.driver = driver;
            driver.get(PAGE_URL);

            //Initialise Elements
            PageFactory.initElements(driver, this);

        }


        }
