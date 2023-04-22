package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import screens.Anroid.AnaScreen;
import screens.Anroid.ApiDemoScreen;
import screens.Anroid.PreferenceDependicies;
import screens.Anroid.PreferenceSreen;
import utils.Driver;

import java.net.MalformedURLException;

public class ApiDemosStepDefinitions {
    AnaScreen anaScreen = new AnaScreen();
    ApiDemoScreen apiDemoScreen = new ApiDemoScreen();
    PreferenceSreen preferenceSreen = new PreferenceSreen();
    PreferenceDependicies preferenceDependicies = new PreferenceDependicies();

    public ApiDemosStepDefinitions() throws MalformedURLException {
    }

    @Given("App yuklensin")
    public void appYuklensin() throws MalformedURLException {
        Driver.getAppiumDriver();
    }

    @And("kullanici ana sayfada")
    public void kullaniciAnaSayfada() {
        Assert.assertTrue(anaScreen.anaEkranIsDisplayed());
    }

    @And("kullanici Api Demos butonuna tiklar")
    public void kullaniciApiDemosButonunaTiklar() {
        anaScreen.apiDemosBasligi.click();
    }

    @Then("kullanici Api demos ekraninda oldugunu dogrular")
    public void kullaniciApiDemosEkranindaOldugunuDogrular() {
        Assert.assertTrue(apiDemoScreen.IsApiDemoDisplayed());
    }

    @And("kullanici preferance butonuna tiklar")
    public void kullaniciPreferanceButonunaTiklar() {
        apiDemoScreen.preferenceButon.click();
    }

    @Then("kullanici preference ekraninda oldugunu dogrular")
    public void kullaniciPreferenceEkranindaOldugunuDogrular() {
        Assert.assertTrue(preferenceSreen.preferenceScreenIsDisplayed());
    }


    @And("kullanici preference dependicies tiklar")
    public void kullaniciPreferenceDependiciesTiklar() {
        preferenceSreen.preferenceDependicies.click();
    }

    @And("Kullanici wifi checkbox kutusunu tiklar")
    public void kullaniciWifiCheckboxKutusunuTiklar() {
        if(preferenceDependicies.checkBox.getAttribute("checked").equals("false")){
            preferenceDependicies.checkBox.click();
        }
    }

    @And("Kullanici wifi settings e tiklar")
    public void kullaniciWifiSettingsETiklar() {
        preferenceDependicies.wifiSettings.click();
    }

    @Then("Wifi settings pop up inin acildigini dogrular")
    public void wifiSettingsPopUpIninAcildiginiDogrular() {
        Assert.assertTrue(preferenceDependicies.cancelButton.isDisplayed());
    }

    @And("Kullanici bir text yazar")
    public void kullaniciBirTextYazar(String text) {
        preferenceDependicies.textBox.sendKeys(text);
    }

    @And("ok butonuna tiklar")
    public void okButonunaTiklar() {
        preferenceDependicies.okButton.click();
    }

    public static class MyStepdefs {
        @And("ekrani kapatir")
        public void ekraniKapatir() {
        }
    }
}
