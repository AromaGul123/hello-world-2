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

public class GetAdminToken_VJ {

//    String res1;
//    Response response;
//    Header header;

    public com.squareup.okhttp.Response GetAdminToken_VJ() {

        given();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://webservicetest.vistajet.com/extranetServices/1.1/user/customerappadmin/customerappadmin/token")
                .get()
                .addHeader("cache-control", "no-cache")
                .addHeader("Postman-Token", "70f97ad9-6ade-46ad-be9e-648cc165889e")
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