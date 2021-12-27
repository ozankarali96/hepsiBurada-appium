package Pages;

import Base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import static Constants.Constants.*;

public class hepsiburadaScenario1 extends BasePage {

    public hepsiburadaScenario1(AndroidDriver appiumDriver) {
        super(appiumDriver);
    }

    public hepsiburadaScenario1 konumGir() {
        waitSeconds(10);
        click(KONUM);
        waitSeconds(5);
        click(KONUM_IL);
        click(KONUM_SECILI_IL);
        click(KONUM_ILCE);
        click(KONUM_SECILI_ILCE);
        click(KONUM_MAHALLE);
        click(KONUM_SECILI_MAHALLE);
        click(KONUM_KAYDET);
        return this;
    }

    public hepsiburadaScenario1 adresKontrolu() {
        Assert.assertEquals(findElement(KONUM_KAYDET_POPUP_TEXT).getText(), "Konumunuz kaydedildi.");
        click(KONUM_KAYDET_POPUP_KAPAT);
        waitSeconds(5);
        return this;
    }

    public hepsiburadaScenario1 rastgeleKategori() {
        click(TAB_BAR_KATEGORILER);
        waitSeconds(5);
        randomClick(RANDOM_KATEGORI_SECIMI);
        waitSeconds(5);
        return this;
    }

    public hepsiburadaScenario1 lokasyonCheck() {
        Assert.assertEquals(findElement(YARIN_KAPINDA_IL_BILGISI).getText(), "Adana");
        waitSeconds(5);
        return this;
    }


}






/*    public GelAlPages randomBurgerSelect() {
        swipeRandom();
        randomClick(BURGER_REST);
        Assert.assertTrue(appiumWait.until(ExpectedConditions.textToBe(MENU_ASSERT, "Popüler Ürünler")));
        return this;
    }

    public GelAlPages assertRestaurant() {
        Assert.assertTrue(appiumWait.until(ExpectedConditions.textToBe(RESTAURANT, "Sipariş vermek için restoran seç")));
        return this;
    }

    public GelAlPages randomRest() {
        swipeRandom();
        randomClick(RESTAURANT_LIST);
        return this;
    }

    public GelAlPages randomMenu() {
        swipeRandom();
        randomClick(MENU_LIST);
        return this;
    }

    public GelAlPages checkPrice() {
        Assert.assertEquals(findElement(PRODUCT_PRICE).getText(), findElement(BASKET_PRICE).getText());
        return this;
    }

    public GelAlPages goToBasket() {
        click(ADD_BASKET);
        waitSeconds(5);
        click(GO_TO_BASKET);
        waitSeconds(2);
        return this;
    }

    public GelAlPages goToPayment() {
        click(PAYMENT_PAGE);
        click(CANCEL_MASTERPASS);
        click(BACK_TO_BASKET);
        return this;
    }

    public GelAlPages cleanBasket() {
        click(CLEAN_BASKET);
        click(CLEAN_ACCEPT);
        return this;
    } */
