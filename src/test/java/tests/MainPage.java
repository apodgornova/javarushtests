package tests;

import helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPage extends TestBase {

    @Test
    @Description("Check page title test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://javarush.ru/'", () ->
                open("https://javarush.ru/"));

        step("Page title should have text 'Javarush - онлайн-курс обучения программированию на Java'", () -> {
            String expectedTitle = "Javarush - онлайн-курс обучения программированию на Java";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }


}