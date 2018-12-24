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

public class NewTokenGeneration_VJ {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response NewTokenGeneration_VJ() {

        given();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://webservicetest.vistajet.com/extranetServices/1.1/user/customerappadmin/lucy@vd.com/token")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "2d9ef3d1-75bd-4e5d-a25d-81f723d8e0b9")
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