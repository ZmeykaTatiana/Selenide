package org.example;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.*;

public class SelenideGoogle {

    @Test
    public void openGoogle(){
        open("https://google.com");
        $x("//textarea[@class='gLFyf']").setValue("Minsk").pressEnter();
       // $x("//div[@id='result-stats']").shouldBe(Condition.visible);

    }

}
