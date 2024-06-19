import Actions.SimpleActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class SimpleTest extends BaseTest {

    @Test
    public void firstTest(){

        initTest("Sample test");
        driver.get("http://apptest.go.ro:9999/login");

        String expectedText = "LOGINq";
        SimpleActions simpleActions = new SimpleActions(driver);
        String loginText = simpleActions.getLoginText();

        Assert.assertEquals(loginText, expectedText);

        //Assert.assertEquals(driver.getTitle(), "FeTraining", "error");

    }

}
