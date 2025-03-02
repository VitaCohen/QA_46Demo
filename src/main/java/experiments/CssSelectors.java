package experiments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsHomePage() {
        // driver.navigate().to("https://demoqa.com/");
        //driver.navigate().back();

        driver.get("https://demoqa.com/"); // will be uae a lot
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    //driver.close();
       // driver.quit(); - will be use a lot

        driver.manage().window().maximize(); // will be uae a lot

    }


}
