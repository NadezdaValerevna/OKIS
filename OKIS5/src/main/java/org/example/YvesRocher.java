package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;

public class YvesRocher {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yves-rocher.ru/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title = driver.getTitle();
        System.out.println(title);

        List<WebElement> TableOfContents;
        TableOfContents = driver.findElements(By.xpath("//li/a"));
        for (int i = 0; i < TableOfContents.size(); i++) {
            System.out.println(TableOfContents.get(i).getAttribute("text"));
        }

        //WebElement xElem1, xElem2;
        //xElem1 = driver.findElement(By.xpath("//*[@id=\"js-modal-page\"]/div[12]/div[2]/div/div/div[2]/article/div/p"));
        //xElem1.click();

        //xElem2 = driver.findElement(By.xpath("//*[@id=\"product_82290\"]/div/a/div[1]"));
        //xElem2.click();

        WebElement cssElem1, cssElem2;
        cssElem1 = driver.findElement(By.cssSelector("body"));
        cssElem1.click();

        cssElem2 = driver.findElement(By.cssSelector("#product_32972 > div > a > div.product-name.h3.h3.m_default.m-b_0.text_left.m-t_0"));
        cssElem2.click();







    }
}
