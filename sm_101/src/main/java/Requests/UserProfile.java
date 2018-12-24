package Requests;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;


public class UserProfile {



    public com.squareup.okhttp.Response GetUserProfile() {

        given();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/user/profile")
                .get()
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "bearer 5174b619-f6b7-4e1a-ac52-02e42ee26616")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "d9670cd7-0af0-4eb3-9bcc-e87cf50fdad9")
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