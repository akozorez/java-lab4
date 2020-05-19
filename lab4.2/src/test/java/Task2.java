import org.openqa.selenium.WebDriver;

public class Task2 {

    public static void main(String[] args) {

        String apiUrl = "https://www.e-katalog.ru/ek-list.php?katalog_=298&pr_[]=2777";

        Environment chromeEnv = new Environment();
        WebDriver driver = chromeEnv.getWebDriver();

        driver.get(apiUrl);

        String xPath = "//*[@id=\"list_form1\"]//div[1]//*[contains(concat(\" \",normalize-space(@class),\" \"),\" conf-div-short \")]//table//tbody//tr[15]//td[11]//a//span//span[2]";

        String result = Utility.getElementFromPageBy(driver, "xpath", xPath);
        System.out.println(result);

        chromeEnv.destroy();
    }
}