package com.mamoru;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class TC1 {
    WebDriver driver;


    @BeforeClass
    public void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mamoru.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void TC_01() throws Exception {

        List<WebElement> listOfLinks = getListOfLinks();
        getNumberOfLinks(listOfLinks);
        printURLsOfAllTheLinks(listOfLinks);
    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    int getNumberOfLinks(List<WebElement> allLinks) {
        return allLinks.size();
    }

    List<WebElement> getListOfLinks() {

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        return allLinks;
    }

    void printURLsOfAllTheLinks(List<WebElement> allLinks) {
        for (WebElement link : allLinks) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }
    }


}