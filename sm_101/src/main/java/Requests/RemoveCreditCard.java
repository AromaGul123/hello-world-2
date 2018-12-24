package Requests;

import com.squareup.okhttp.*;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

import static io.restassured.RestAssured.given;

//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class RemoveCreditCard {

//    String res1;
//    Response response;
//    Header header;

    public Response RemoveCredit() {

        given();
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n\t\"creditCardId\" : 4201\n}");
        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/creditCards/remove/4201")
                .put(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("accessToken", "5174b619-f6b7-4e1a-ac52-02e42ee26616")
                .addHeader("isCustomerLoggedIn", "true")
                .addHeader("signedInCustomerId", "50878")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "2e6948e0-75a0-4130-9904-906cf57e0ae0")
                .build();


        Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;

    }
}