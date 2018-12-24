package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.SimilarServiceProvider;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SimilarServiceProviderAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void similarserviceProvider() {

        SimilarServiceProvider GIOU = new SimilarServiceProvider();
        ActualResponse = GIOU.SimilarServiceProvider();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Similar Service Provider of user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}