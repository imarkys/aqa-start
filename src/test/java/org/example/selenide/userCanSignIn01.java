package org.example.selenide;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class userCanSignIn01 {
    @Test
    public void userCanSignUp() {
        String email = "qqq12345@mailinator.com";

        open("http://automationpractice.com/index.php");
        $(By.className("login")).click();

        $(By.name("email_create")).setValue(email);
        $(By.name("SubmitCreate")).click();

        $(By.name("id_gender")).waitUntil(visible, 60000).click();
        $(By.name("customer_firstname")).setValue("James");
        $(By.name("customer_lastname")).setValue("Holden");
        $(By.name("email")).shouldHave(value(email));
        $(By.name("passwd")).setValue("12345");

        $(By.name("firstname")).shouldHave(value("James"));
        $(By.name("lastname")).shouldHave(value("Holden"));
        $(By.name("address1")).setValue("Rocinante");
        $(By.name("city")).setValue("Missoula");
        $(By.name("id_state")).selectOption("Montana");
        $(By.name("postcode")).setValue("59801");
        $(By.name("phone_mobile")).setValue("(555) 555-1234");
        $(By.name("alias")).shouldHave(value("My address")).pressEnter();

        $(By.className("page-heading")).shouldHave(text("MY ACCOUNT"));
        $(By.className("account")).shouldHave(text("James Holden"));
    }
}
