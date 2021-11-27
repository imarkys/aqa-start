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

        new registrationPage().fillFirstRegistrationPage("qqqq01234522@qqq.com");
        new registrationPage().fillSecondRegistrationPage("James", "Holden", "12345", "Ceres", "Missoula", "59801", "(555) 555-1234");

        $(By.className("page-heading")).shouldHave(text("MY ACCOUNT"));
    }
}
