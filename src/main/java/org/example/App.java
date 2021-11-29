package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class App
{
    public static void main( String[] args )
    {

        //CHROME
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yazab\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeObjDriver = new ChromeDriver();
        chromeObjDriver.get("https://www.google.com/");
        WebElement searchChrome = chromeObjDriver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
        searchChrome.sendKeys("arabyads");
        searchChrome.sendKeys(Keys.ENTER);

        //EDGE

        System.setProperty("webdriver.edge.driver", "C:\\Users\\yazab\\Desktop\\edgedriver_win64\\msedgedriver.exe");
        WebDriver edgeObjDriver = new EdgeDriver();
        edgeObjDriver.get("https://www.google.com/");
        WebElement searchEdge = edgeObjDriver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
        searchEdge.sendKeys("arabyads");
        searchEdge.sendKeys(Keys.ENTER);

        //FIREFOX
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\yazab\\Desktop\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver firefoxObjDriver = new FirefoxDriver();
        firefoxObjDriver.get("https://www.google.com/");
        WebElement searchFirefox = firefoxObjDriver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"));
        searchFirefox.sendKeys("arabyads");
        searchFirefox.sendKeys(Keys.ENTER);
    }
}
