package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultadosProdutosPage extends BasePage {

    private By txtResultadosPesquisa = By.cssSelector("span[cel_widget_id=\"UPPER-RESULT_INFO_BAR-0\"] > h1");
    private By txtResultPesquisaInvalida = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/span/div/div/div[1]/span[1]");

    public ResultadosProdutosPage(WebDriver _browser) {
        super(_browser);
    }

    public String resultadosPesquisa(){
        return browser.findElement(txtResultadosPesquisa).getText().substring(23,38);

    }

    public String resultadosPesquisaInvalida(){
        return browser.findElement(txtResultPesquisaInvalida).getText();

    }
}
