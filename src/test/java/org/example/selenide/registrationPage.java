package org.example.selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class registrationPage {
        private SelenideElement emailCreate = $(By.name("email_create"));

        private SelenideElement genderRB = $(By.name("id_gender"));
        private SelenideElement firstName = $(By.name("customer_firstname"));
        private SelenideElement lastName = $(By.name("customer_lastname"));
        private SelenideElement password = $(By.name("passwd"));

        private SelenideElement address1 = $(By.name("address1"));
        private SelenideElement city = $(By.name("city"));
        private SelenideElement state = $(By.name("id_state"));
        private SelenideElement postcode = $(By.name("postcode"));
        private SelenideElement mobileNumber = $(By.name("phone_mobile"));

        public void fillFirstRegistrationPage(String email) {
            emailCreate.val(email).pressEnter();
        }

        public void fillSecondRegistrationPage(String fName, String lName, String pass, String address, String town, String code, String number) {
            genderRB.click();
            firstName.val(fName);
            lastName.val(lName);
            password.val(pass);
            address1.val(address);
            city.val(town);
            state.selectOption("Montana");
            postcode.val(code);
            mobileNumber.val(number).pressEnter();
        }

}
