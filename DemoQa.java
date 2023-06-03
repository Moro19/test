import java.io.File;

public class DemoQa {
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;
import static java.lang.Thread.sleep;


    public class DemoQA {
        @BeforeAll
        static void beforeAll() {
            Configuration.baseUrl = "https://demoqa.com";
            //Configuration.browserSize = "1366x768";
            Configuration.browser = "Firefox";
            Configuration.holdBrowserOpen = true;
        }


        @Test
        void fillFormTest()  {
            open("/automation-practice-form");
            executeJavaScript("$('#fixedban').remove()");
            executeJavaScript("$('footer').remove()");
            $("#firstName").setValue("Andrew");
            $("#lastName").setValue("Milkin");
            $("#userEmail").setValue("ya@ya.ru");
            $("#genterWrapper").$(byText("Male")).click();
            $("#userNumber").setValue("4955642478");
            $("#dateOfBirthInput").click();
            $(".react-datepicker__month-select").click();
            $(byText("January")).click();
            $(".react-datepicker__year-select").click();
            $(byText("1989")).click();
            $(".react-datepicker__day.react-datepicker__day--019").click();
            $("#subjectsInput").setValue("Maths").pressEnter();
            $("#subjectsInput").setValue("Computer Science").pressEnter();
            $("#hobbiesWrapper").$(byText("Sports")).click();


            $("#uploadPicture").uploadFile(new File("src/test/java/resource/panda.jpg"));
            $("#currentAddress").setValue("Nizhny Novgorod, Sovetcky street, 5-110");
            $(byText("Select State")).click();
            $(byText("Rajasthan")).click();
            $("#city").click();
            $(byText("Jaiselmer")).click();
            $("button#submit").click();

        }


    }

}
