package org.example.selenide;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class userCanSignIn01 {
    @Test
    public void userCanSignUp() {
        open("http://automationpractice.com/index.php");
        $(By.className("login")).click();

        $(By.name("email_create")).setValue("qqqq789010@qqq.com");
        $(By.name("SubmitCreate")).click();

        $(By.name("id_gender")).click();
        $(By.name("customer_firstname")).setValue("James");
        $(By.name("customer_lastname")).setValue("Holden");
        $(By.name("email")).shouldHave(value("qqqq789010@qqq.com"));
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
    }
}
