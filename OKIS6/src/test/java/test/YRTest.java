package test;
import org.example.YRCat;
import org.example.YRGeneral;
import org.example.YRLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class YRTest {
    private WebDriver driver;
    private YRGeneral yrGeneral;

    private YRLogin yrLogin;
    private YRCat yrCat;

    @BeforeTest(groups = "All")
    public void prepare(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        yrGeneral = new YRGeneral(driver);
        yrLogin = new YRLogin(driver);
        yrCat = new YRCat(driver);
    }

    //1
    @Test(groups = "General")
    public void testYRGeneral(){
        yrGeneral.goTOHomePage();
        String title = yrGeneral.getYRTitle();
        System.out.println("Page title: "+ title);
        assert title.equals("Интернет-магазин растительной косметики и парфюмерии из Франции с доставкой — Yves Rocher");
    }

    //2
    @Test(groups = "General")
    public void testAbout(){
        yrGeneral.goTOHomePage();
        String about = yrGeneral.getAboutShop();
        System.out.println("About: " + about);
        assert about.contains("Ив Роше — компания-новатор в создании натуральной Растительной Косметики. Мы сами изучаем и выращиваем растения, производим и продаем косметику с натуральным составом с 1959 года, когда марка Ив Роше была основана во французском регионе Бретань.");
    }

    //3
    @Test(groups = "General")
    public void testSearchFunc(){
        yrGeneral.goTOHomePage();
        yrGeneral.searchFunc("духи");
        String result = yrGeneral.getSearchresult();
        System.out.println("Search result: " + result);
        assert result.contains("Парфюмерия");
    }

    //4
    @Test(groups = "General")
    public void testHelpMenu(){
        yrGeneral.goTOHomePage();
        yrGeneral.clickHelpMenu();
        List<String> helpmenuLinks = yrGeneral.getHelpMenuLinks();
        System.out.println("Help menu links: " + helpmenuLinks);
        assert helpmenuLinks.contains("Тип кожи");
    }

    //5
    @Test(groups = "General")
    public void testHelpMlinkText(){
        yrGeneral.goTOHomePage();
        yrGeneral.clickHelpMenu();
        String shops = yrGeneral.ShopsLink();
        System.out.println(shops);
        assert shops.equals("СОРТИРОВКА");
    }

    //6
    @Test(groups = "General")
    public void testHelpMlinkTap(){
        yrGeneral.goTOHomePage();
        yrGeneral.clickHelpActions();
        String action = yrGeneral.actions();
        System.out.println("Search result: " + action);
        assert action.equals("Часто задаваемые вопросы");

    }

    //7
    @Test(groups = "Login")
    public void testLoginPage(){
        yrGeneral.goTOHomePage();
        yrGeneral.clickLoginPage();
        String title = yrLogin.getLogRBTTitle();
        System.out.println("Page title: "+ title);
        assert title.equals("Авторизация");
    }

    //8
    @Test(groups = "Login")
    public void testRegistration(){
        yrLogin.goTOLogPage();
        yrLogin.clickRegestration();
        yrLogin.enterAlreadyusePhone("rockpanda460@gmail.com");
        String errormas = yrLogin.errorMassageREG();
        System.out.println("Error massage: "+ errormas);
        assert errormas.equals("Создать личный кабинет");
    }

    //10
    @Test(groups = "Login")
    public void testVhod(){
        yrLogin.goTOLogPage();
        yrLogin.enterEmail("dudcko.nadezh@yandex.ru");
        yrLogin.enterPass("Polovik12@");
        boolean button = yrLogin.goButton();
        String Privetstvie = yrLogin.Vhod();
        System.out.println("massage: "+ Privetstvie);
        assert Privetstvie.equals("Здравствуйте, Надежда");
    }

    //11
    @Test(groups = "Cat")
    public void testFrige(){
        yrGeneral.goTOHomePage();
        yrCat.goFrigePage();
        yrCat.FrigeButton();
        String massage = yrCat.getTitle();
        System.out.println(massage);
        assert massage.equals("Подарки");
    }
    //12
    @Test(groups = "Cat")
    public void testLGproducts(){
        yrGeneral.goTOHomePage();
        yrCat.goLGPage();
        List<String> lg = yrCat.products();
        System.out.println("Products: " + lg);
        assert lg.contains("Суперпредложения");

    }


    @AfterTest(groups = "All")
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

