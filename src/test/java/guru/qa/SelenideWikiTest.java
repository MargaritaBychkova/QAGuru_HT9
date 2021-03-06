package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiTest {

    @Test
    @DisplayName("Проверка поиска в Wiki проекта Selenide")

    void selenideWikiSearchTest(){

        Selenide.open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box ul li button").click();
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $$(".markdown-body").find(Condition.text("Using JUnit5 extend test class")).shouldBe(Condition.visible);


    }
}
