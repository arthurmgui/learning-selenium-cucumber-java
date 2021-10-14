package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultadosProdutosPage extends BasePage {

    private By txtResultadosPesquisa = By.cssSelector("span[cel_widget_id=\"UPPER-RESULT_INFO_BAR-0\"] > h1");

    public ResultadosProdutosPage(WebDriver _browser) {
        super(_browser);
    }

    public String resultadosPesquisa(){
        return browser.findElement(txtResultadosPesquisa).getText().substring(23,38);

    }
}
