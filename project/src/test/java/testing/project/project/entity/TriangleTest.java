package testing.project.project.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TriangleTest {
    WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://127.0.0.1:5500/src/main/resources/templates/example.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);
    }

    // public static void main(String[] args) {
    //     System.setProperty("webdriver.chrome.driver",
    //             "http://127.0.0.1:5500/src/main/resources/templates/example.html");

    //     WebDriver driver = new ChromeDriver();

    //     driver.get(
    //             "\\CSE 453 - Software Testing\\Project\\CSE453TestingProject\\project\\src\\main\\resources\\templates\\example.html");

    //     String title = driver.getTitle();
    //     System.out.println("Title of the HTML file: " + title);

    //     driver.quit();
    // }

}
