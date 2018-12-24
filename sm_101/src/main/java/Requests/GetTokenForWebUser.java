package Requests;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;

import static io.restassured.RestAssured.given;

//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class GetTokenForWebUser {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response GetTokenWeb() {

        given();
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=password&username=aroma.gul%40venturedive.com%20&password=q7doet3f&client_id=SM-WEB-CLIENT&undefined=");
        Request request = new Request.Builder()
                .url("https://aratech-api.servicemarket.com/oauth/token")
                .post(body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "c658c067-8d33-46f2-bb79-bcfc3ee08d68")
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