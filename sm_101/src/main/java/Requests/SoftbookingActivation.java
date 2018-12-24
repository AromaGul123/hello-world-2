package Requests;

import Payload.SoftBookingActivationPayload;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;

import static io.restassured.RestAssured.given;

//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class SoftbookingActivation {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response ActivationSoftbooking() {

        given();
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, SoftBookingActivationPayload.SoftBookingActivationPayload);
        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/booking/33757/activateSoftlySavedBooking")
                .put(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("accessToken", "5174b619-f6b7-4e1a-ac52-02e42ee26616")
                .addHeader("isCustomerLoggedIn", "true")
                .addHeader("signedInUserId", "26804")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "2a17266e-73db-4250-94f3-acbbd5c363c6")
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