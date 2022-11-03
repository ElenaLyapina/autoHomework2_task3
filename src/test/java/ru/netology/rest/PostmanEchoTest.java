package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

class PostmanEchoTest {
    @Test
    void shouldReturnPost() {
      //Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("my test") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("my test"))
        ;
    }
}
