package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class YRCat {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public YRCat(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goFrigePage(){
        WebElement button = driver.findElement(By.xpath("//*[@id=\"js-modal-page\"]/div[12]/div[2]/div/div/div[2]/article/div"));
        button.click();
    }
    public void FrigeButton(){
        WebElement button = driver.findElement(By.xpath("//*[@id=\"ajax-wrapper\"]/div/main/section/div[2]/div[8]/article/div"));
        button.click();
    }
    public String getTitle(){
        return driver.getTitle();
    }

    public void goLGPage(){
        WebElement LG = driver.findElement(By.xpath("//*[@id=\"js-modal-page\"]/div[6]/nav/ul/li[9]/a"));
        LG.click();
    }

    public List<String> products(){
        List<WebElement> product = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"ajax-wrapper\"]/div/div/div/div[1]/div/h1")));
        return product.stream().map(WebElement::getText).collect(Collectors.toList());
    }


}
