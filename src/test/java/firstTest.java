import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class firstTest {
    private static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void checkIfPracujplTitleIsCorrect(){

        String baseurl = "http://www.pracuj.pl";
        String actualTitle = "";
        String expectedTitle = "Oferty pracy - Pracuj.pl";

        driver.get(baseurl);

        assertThat(driver.getTitle().contentEquals(expectedTitle));
    }
}
