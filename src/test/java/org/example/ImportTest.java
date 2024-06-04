package org.example;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ImportTest {


    @Test
    public void uploadTest() {
        open("https://the-internet.herokuapp.com/upload");

        $("#file-upload").uploadFromClasspath("text.txt");
        $("#file-submit").click();


        $("h3").shouldHave(text("File Uploaded"));
        $("#uploaded-files").shouldHave(text("text.txt"));


    }
}
