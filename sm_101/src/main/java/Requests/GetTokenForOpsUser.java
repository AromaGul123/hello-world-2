package Requests;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;

import static io.restassured.RestAssured.given;

//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class GetTokenForOpsUser {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response GetTokenOps() {

        given();
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=password&username=admin&password=v3nturedive&client_id=SM-IP-CLIENT&undefined=");
        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/oauth/token")
                .post(body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "e379f0d6-c9b7-48f3-9e20-78c1c41e79fd")
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