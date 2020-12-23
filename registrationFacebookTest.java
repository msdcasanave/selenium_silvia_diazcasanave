package clase10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class registrationFacebookTest {
    private static final String FACEBOOK_URL = "https://www.facebook.com";

    @Test
    public void fullRegistrationTest() throws InterruptedException
    {
        WebDriver driver = getDriver(FACEBOOK_URL);
        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(2000);

        //Nombre
        driver.findElement(By.name("firstname")).sendKeys("John");
        //Apellido
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        //Celular
        driver.findElement(By.id("password_step_input")).sendKeys("5555555");
        //Password
        driver.findElement(By.id("u_1_g")).sendKeys("123456789");
        //Cupleaños
        setBirthday(driver, "26", "jun", "1980");
        //Sexo masculino
        driver.findElement(By.id("u_1_5")).click();


    }

        public WebDriver getDriver (String sitioWeb) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(sitioWeb);
        return driver;
    }
    private void setBirthday (WebDriver unDriver, String unDia, String unMes, String unAnio) throws InterruptedException  {
        WebElement dia = unDriver.findElement(By.name("birthday_day"));
        Select comboDias = new Select(dia);
        //Asumo que se envía el número de días que aparece la lista
        comboDias.selectByVisibleText(unDia);

        WebElement mes = unDriver.findElement(By.name("birthday_month"));
        Select comboMeses = new Select(mes);
        comboMeses.selectByVisibleText(unMes);

        WebElement anio = unDriver.findElement(By.name("birthday_year"));
        Select comboAnio = new Select(anio);
        comboAnio.selectByVisibleText(unAnio);
    }



}
