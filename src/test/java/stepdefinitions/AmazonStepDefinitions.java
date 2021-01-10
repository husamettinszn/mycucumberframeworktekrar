package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfaya gider")
    public void kullanici_amazon_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }

    @Given("iphone icin arama yapar")
    public void iphone_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("iphone"+ Keys.ENTER);

    }
    @Then("sonucun iphone icerdigini test eder")
    public void sonucunIphoneIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains("iphone"));
    }
    @Given("teapot icin arama yapar")
    public void teapot_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("teapot"+Keys.ENTER);

    }
    @Then("sonucun teapot icerdigini test eder")
    public void sonucun_teapot_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains("teapot"));

    }
    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPage.searchBox.sendKeys("flower"+Keys.ENTER);

    }
    @Then("sonucun flower icerdigini test eder")
    public void sonucun_flower_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains("flower"));

    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }


    @And("{string} icin arama yapar")
    public void icinAramaYapar(String kelime) {
        amazonPage.searchBox.sendKeys(kelime+Keys.ENTER);
    }

    @Then("sonucun {string} icerdigini test eder")
    public void sonucunIcerdiginiTestEder(String kelime) {
        Assert.assertTrue(amazonPage.sonucYaziElementi.getText().contains(kelime));
    }
}


