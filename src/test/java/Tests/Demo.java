package Tests;

import Environment.EnvironmentManager;
import Environment.RunEnvironment;
import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.Visitor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.extension.ExtendWith;

import io.github.bonigarcia.seljup.SeleniumExtension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ExtendWith(SeleniumExtension.class)

public class Demo extends HomePage {
    public Demo(WebDriver driver) {


    }

    @Test
    public void testWithOneChrome(ChromeDriver chromeDriver) {
        // Use Chrome in this test
    }

    @Before
    public void startBrowser() {
        EnvironmentManager.initWebDriver();
        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("https://web2.0calc.com/");
    }


    @Test
    public void result1() throws InterruptedException {

        startBrowser();
        wait();
        Accept.click();
        Btn2.click();
        BtnPlus.click();
        Btn5.click();
        BtnCalc.click();
        BtnClear.click();
        History.click();
        System.out.println(strng);
        Assert.assertEquals("2+5", strng);
        System.out.println("Assert passed");


    }

    @Test
    public void result2() {

        Accept.click();
        Btn10.click();
        BtnMinus.click();
        Btn2.click();
        BtnCalc.click();
        BtnClear.click();
        History.click();
        System.out.println(strng2);
        Assert.assertEquals("10-2", strng2);
        System.out.println("Assert passed");
    }

    @Test
    public void result3() {
        Accept.click();
        BtnColon.click();
        Btn1.click();
        Btn0.click();
        BtnMinus.click();
        Btn2.click();
        BtnParanR.click();
        BtnMult.click();
        Btn2.click();
        BtnCalc.click();
        BtnClear.click();
        History.click();
        System.out.println(strng3);
        Assert.assertEquals("(10-2)*2", strng3);
        System.out.println("Assert passed");

    }

    @Test
    public void result4() {
        Accept.click();
        BtnColon.click();
        BtnSin.click();
        Btn3.click();
        Btn0.click();
        BtnParanR.click();
        BtnCalc.click();
        BtnClear.click();
        History.click();
        System.out.println(strng4);
        Assert.assertEquals("sin(30)", strng4);
        System.out.println("Assert passed");


//validate correct number of all 4 formulas above
        History.click();


    }
}

