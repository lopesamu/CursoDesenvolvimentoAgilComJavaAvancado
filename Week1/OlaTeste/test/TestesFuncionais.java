import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestesFuncionais { 
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    driver.get("http://localhost:8080/CelsiusToFahrenheitConversion/");
    driver.manage().window().setSize(new Dimension(810, 824));
    driver.findElement(By.id("cf")).click();
    driver.findElement(By.id("num")).click();
    driver.findElement(By.id("num")).sendKeys("100");
    driver.findElement(By.id("num")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("The result is 212F"));
  }
  
  @Test
  public void test2() {
    driver.get("http://localhost:8080/CelsiusToFahrenheitConversion/");
    driver.manage().window().setSize(new Dimension(810, 824));
    driver.findElement(By.id("fc")).click();
    driver.findElement(By.id("num")).click();
    driver.findElement(By.id("num")).sendKeys("212");
    driver.findElement(By.id("num")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("h1")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("The result is 100C"));
  }
}