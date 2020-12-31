package clase11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ejercicio7 {

    private static final String SPOTIFY_URL = "https://www.spotify.com/uy/signup/";

    public WebDriver getDriver (String sitioWeb) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(sitioWeb);
        return driver;
    }

    //Ejercicio 7
    @Test
    public void spotifyByPlaceHolderCSS()throws InterruptedException {
        WebDriver driver = getDriver(SPOTIFY_URL);
        driver.findElement(By.cssSelector("input[placeholder=\"Introduce tu correo electrónico.\"]")).sendKeys("JMeyer@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder=\"Vuelve a introducir tu correo electrónico.\"]")).sendKeys("JMeyer@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder=\"Crea una contraseña.\"]")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[placeholder=\"Introduce un nombre de perfil.\"]")).sendKeys("John");
        driver.findElement(By.cssSelector("input[placeholder=\"DD\"]")).sendKeys("30");
        Select mes = new Select(driver.findElement(By.cssSelector("*[name=\"month\"]")));
        mes.selectByValue("12");
        driver.findElement(By.cssSelector("input[placeholder=\"AAAA\"]")).sendKeys("2020");

    }

}
