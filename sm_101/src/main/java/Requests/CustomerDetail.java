package Requests;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class CustomerDetail {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response GetCustomerDetail() {

        given();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/v1.0/customer/27")
                .get()
                .addHeader("accessToken", "5174b619-f6b7-4e1a-ac52-02e42ee26616")
                .addHeader("cache-control", "no-cache")
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