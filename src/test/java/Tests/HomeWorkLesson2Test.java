package Tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkLesson2Test {

    @Test
    void StudentRegistrationForm(){

            open("https://demoqa.com/automation-practice-form");
            $x("//div[@class='main-header']").shouldHave(text("Practice Form"));

            $x("//input[@id='firstName']").setValue("Viktor");
            $x("//input[@id='lastName']").setValue("Kuchuk");
            $x("//input[@id='userEmail']").setValue("vik@vik.ru");

            $x("//input[@id='gender-radio-1']").click(); //нажать radioButton Male

            $x("//input[@id='userNumber']").setValue("0123456789");
            $x("//input[@id='dateOfBirthInput']").setValue("10 Apr 1990");
            $x("//input[@id='subjectsInput']").setValue("Automating QA");

            $x("//input[@id='hobbies-checkbox-1']").click();
            $x("//input[@id='hobbies-checkbox-2']").click();
            $x("//input[@id='hobbies-checkbox-3']").click();

            //загрузка изображения
            //$x("//input[@type='file']").sendKeys("C:\Users\User\Desktop\FileUpload.jpg");

            $x("//textarea[@id='currentAddress']").setValue("Current adress here");

            //выпадающий список State and city ???

            $x("//button[@id='submit']").click();

            // ПРОВЕРКА РЕЗУЛЬАТА

            $x("//div[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));



    }

}
