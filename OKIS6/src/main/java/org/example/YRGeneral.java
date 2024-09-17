package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class YRGeneral {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public YRGeneral(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goTOHomePage(){
        driver.get("https://www.yves-rocher.ru/");
    }

    public String getYRTitle(){
        return driver.getTitle();
    }

    public String getAboutShop(){
        WebElement about = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"js-modal-page\"]/div[13]/div/div/p[1]")));
        return about.getText();
    }

    public String getSearchresult(){
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ajax-wrapper\"]/div/div[1]/div/div[1]/div/div/h1")));
        String text = result.getText();
        return text;

    }
    public void searchFunc(String request){
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainHeaderSearchInput\"]")));
        search.sendKeys(request);
        search.sendKeys(Keys.ENTER);

    }

    public void clickHelpMenu(){
        WebElement helpmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"js-modal-page\"]/div[6]/nav/ul/li[1]/a")));
        helpmenu.click();
    }

    public List<String> getHelpMenuLinks(){
        List<WebElement> helpmenulist = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"accordionsToTabsHeader1\"]")));
        return helpmenulist.stream().map(WebElement::getText).collect(Collectors.toList());

    }

    public String ShopsLink(){
        WebElement shops = driver.findElement(By.xpath("//*[@id=\"ajax-wrapper\"]/div/main/section/div[1]/div/div/div[1]"));
        String text = shops.getText();
        return text;
    }

    public void clickHelpActions(){
        WebElement actions = driver.findElement(By.xpath("//*[@id=\"js-modal-page\"]/footer/div[2]/div[1]/div[1]/div/ul[3]/li[2]/a"));
        actions.click();
    }

    public String actions(){
        WebElement action = driver.findElement(By.xpath("//*[@id=\"reactFaq\"]/section/div[1]/div[2]/ul[1]/p"));
        String text = action.getText();
        return text;
    }

    public void clickLoginPage(){
        WebElement actions = driver.findElement(By.xpath("//*[@id=\"js-modal-page\"]/div[5]/header/div[3]/ul/li[3]/a"));
        actions.click();
    }






}
