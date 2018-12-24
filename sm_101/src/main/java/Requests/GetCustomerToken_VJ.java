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

public class GetCustomerToken_VJ {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response GetCustomerToken_VJ() {

        given();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://webservicetest.vistajet.com/extranetServices/1.1/user/customerapp/gul@vd.com/token")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "97747c4e-d0fa-46aa-bd30-2a59083a5753")
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