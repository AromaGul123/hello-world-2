package Testcases;

import General.Main;
import Requests.AddBooking;
import Requests.GetTokenForWebUser;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GetTokenForWebUserAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void getToken() {

        GetTokenForWebUser GIOU = new GetTokenForWebUser();
        ActualResponse = GIOU.GetTokenWeb();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Get Token for web user Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}