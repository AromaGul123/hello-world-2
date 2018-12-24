package Requests;

import Payload.AddBookingPayload;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import Payload.AddBookingPayload.*;
import java.io.IOException;

import static io.restassured.RestAssured.given;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class AddBooking {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response PostBooking() {

        given();
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType,AddBookingPayload.addBookingPayload);
        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/request/add")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("accessToken", "5174b619-f6b7-4e1a-ac52-02e42ee26616")
                .addHeader("isCustomerLoggedIn", "false")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "0f35f258-7b60-4a37-b632-7ba4f5ee3afd")
                .build();

        com.squareup.okhttp.Response response = null;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;

    }


}