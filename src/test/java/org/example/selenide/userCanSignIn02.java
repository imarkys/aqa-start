package org.example.selenide;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class userCanSignIn02 {
    @Test
    public void userCanSignUp() {
        open("http://automationpractice.com/index.php");
        $(By.className("login")).click();

        new registrationPage().fillFirstRegistrationPage("qqq23456@mailinator.com");
        new registrationPage().fillSecondRegistrationPage();

        $(By.className("page-heading")).shouldHave(text("MY ACCOUNT"));
        $(By.className("account")).shouldHave(text("James Holden"));
    }
}
