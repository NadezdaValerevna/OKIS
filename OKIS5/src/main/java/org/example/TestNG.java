package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class TestNG {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testng.org/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title = driver.getTitle();
        System.out.println(title);

        List<WebElement> TableOfContents;
        TableOfContents = driver.findElements(By.xpath("//li/a"));
        for (int i = 0; i < TableOfContents.size(); i++) {
            System.out.println(TableOfContents.get(i).getAttribute("text"));
        }
//        WebElement xElem1, xElem2;
//        xElem1 = driver.findElement(By.xpath("//*[@id=\"tocbot\"]/ul/li[9]/a"));
//        xElem1.click();
//
//        xElem2 = driver.findElement(By.xpath("//*[@id=\"_asserts\"]"));
//        xElem2.click();



          //WebElement cssElem1, cssElem2;
          //cssElem1 = driver.findElement(By.cssSelector("#_github_repository"));
          //cssElem1.click();

          //cssElem2 = driver.findElement(By.cssSelector("#_testng_core"));
          //cssElem2.click();


        //driver.quit();


    }
}