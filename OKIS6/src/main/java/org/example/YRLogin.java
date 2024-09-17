package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YRLogin {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public YRLogin(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goTOLogPage(){
        driver.get("https://auth.yves-rocher.ru/login?spring_redirect=true");
    }

    public String getLogRBTTitle(){
        return driver.getTitle();
    }

    public void clickRegestration(){
        WebElement clickreg = driver.findElement(By.xpath("/html/body/div[3]/div/nav/div/div[1]/div/div[2]"));
        clickreg.click();
    }

    public void enterAlreadyusePhone(String phone){
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));
        passwordField.sendKeys( phone);
        passwordField.sendKeys(Keys.ENTER);

    }

    public String errorMassageREG(){
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"js-modal-page\"]/div[3]/div/nav/div/div[1]/ul/li/a/span[2]")));
        String text = error.getText();
        return text;
    }

    public void enterEmail(String email){
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));
        passwordField.sendKeys(email);
    }
    public void enterPass(String pass){
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
        passwordField.sendKeys(pass);

    }

    public boolean goButton(){
        WebElement button = driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[3]/div[1]/button"));
        button.click();

        return false;
    }

    public String Vhod(){
        WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ajax-wrapper\"]/div/div/nav/div/div/h3")));
        String text = error.getText();
        return text;
    }









}
