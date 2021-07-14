package br.com.chronosacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage {
    private WebDriver driver;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo() {
        //String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        return txtTitulo.getText();
    }

    public void clickBotao() {
        //String xpathBotao = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a";
        String xpathBotao = "//section[2]/div[3]//a";
        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));
        btnTitulo.click();
    }
}
