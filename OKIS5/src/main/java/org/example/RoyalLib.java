package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import java.util.List;

public class RoyalLib {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://royallib.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title = driver.getTitle();
        System.out.println(title);

        List<WebElement> TableOfContents;
        TableOfContents = driver.findElements(By.xpath("//li/a"));
        for (int i = 0; i < TableOfContents.size(); i++) {
            System.out.println(TableOfContents.get(i).getAttribute("text"));
        }

        //WebElement xElem1, xElem2;
        //xElem1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/ul/li[1]/a"));
        //xElem1.click();

        //xElem2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/ul/li[1]/a/b"));
        //xElem2.click();

        WebElement cssElem1, cssElem2;
        cssElem1 = driver.findElement(By.cssSelector("body > div.container > div > div.center.nuclear > div.left-bar > ul > li:nth-child(11) > a"));
        cssElem1.click();

        cssElem2 = driver.findElement(By.cssSelector("body > div.container > div > div.center.nuclear > div.wrapper > div > a:nth-child(75)"));
        cssElem2.click();







    }
}
