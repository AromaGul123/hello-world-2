package Requests;

import Payload.AddBookingPayload;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;

import static io.restassured.RestAssured.given;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class ServiceLocations {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response ServiceLocations() {

        given();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1/constants/service-locations")
                .get()
                .addHeader("accessToken", "5174b619-f6b7-4e1a-ac52-02e42ee26616")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "d2f34dbd-fb55-4c80-9a84-6f806095ee5c")
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