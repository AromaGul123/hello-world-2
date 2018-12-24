package Requests;

import Payload.AddBookingPayload;
import Payload.RegisterUser_VJPayload;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;

import java.io.IOException;

import static io.restassured.RestAssured.given;
//import io.restassured.http.Header;
//import io.restassured.response.Response;

public class RegisterUser_VJ {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response RegisterUser() {

        given();
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, RegisterUser_VJPayload.registerPayload);
        Request request = new Request.Builder()
                .url("https://webservicetest.vistajet.com/extranetServices/1.5/customerapp/customerappadmin/d0cc7db09d2846efa490cda6209e4656/user/register?mode=REGISTER")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "748d13f3-c0e3-4f53-82ef-988bbba57dc7")
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