package SeleniumTraining;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest {
    private static WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "c:/Program Files (x86)/Driver/chromedriver.exe" );
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void myFirstTest() {
        driver.get("http://ms-v-19.qulix.com/BM");
        driver.findElement(By.id("cphMainContent_LoginContent_LoginForm_UserName")).sendKeys("su@user.com");
        driver.findElement(By.id("cphMainContent_LoginContent_LoginForm_Password")).sendKeys("su");
        driver.findElement(By.id("cphMainContent_LoginContent_LoginForm_LoginButton")).click();
        wait.until(titleIs("Budget Manager"));
    }

    @After
    public void stop() {
        driver.quit();
    }

}
