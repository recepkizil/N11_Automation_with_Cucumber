package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.N11page;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class N11step {
    N11page n11page = new N11page();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanıcı anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("urlN11"));
    }


    @When("Ana sayfanın yüklendiğini doğrular")
    public void anaSayfaninYuklendiginiDogrular() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi";
        assertEquals(actualTitle, expectedTitle);
    }

    @And("Kullanıcı ana sayfada {string} butonunu bulur ve tıklar")
    public void kullaniciAnaSayfadaButonunuBulurVeTiklar(String arg0) {
        n11page.btnGirisYap.click();
    }

    @And("Giriş sayfasının yüklendiğini doğrular")
    public void girisSayfasininYuklendiginiDogrular() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://www.n11.com/giris-yap";
        Assert.assertEquals(actualURL, expectedURL);
        assertEquals(actualURL, expectedURL);
    }

    @And("Kullanıcı giriş sayfasında kullanıcı adı alanına geçerli bir kullanıcı adı girer")
    public void kullaniciGirisSayfasindaKullaniciAdiAlaninaGecerliBirKullaniciAdiGirer() {
        n11page.btnEmail.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Kullanıcı giriş sayfasında şifre alanına geçerli bir şifre girer")
    public void kullaniciGirisSayfasindaSifreAlaninaGecerliBirSifreGirer() {
        n11page.btnPassword.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Kullanıcı {string} butonuna tıklar")
    public void kullaniciButonunaTiklar(String arg0) {
        n11page.btnLogin.click();
    }

    @And("Kullanıcının hesabına başarıyla giriş yapıldığı doğrulanır")
    public void kullanicininHesabinaBasariylaGirisYapildigiDogrulanir() {
        actions.moveToElement(n11page.btnHesabim).perform();
        assertTrue(n11page.btnCikisYap.isEnabled());
    }
}
