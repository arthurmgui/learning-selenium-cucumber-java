package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private String url = "https://www.amazon.com.br";
    private By campoDePesquisa = By.id("twotabsearchtextbox");
    private By btnDePesquisa = By.id("nav-search-submit-button");

    public HomePage(WebDriver _browser) {
        super(_browser);
    }

    public void abrirAmazon(){
        browser.get(url);
    }

    public void preencherPesquisa(String _produto) {
        browser.findElement(campoDePesquisa).click();
        browser.findElement(campoDePesquisa).sendKeys(_produto);
    }

    public void clickBtnPesquisar() {
        browser.findElement(btnDePesquisa).click();
    }
}
