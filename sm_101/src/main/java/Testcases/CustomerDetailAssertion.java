package Testcases;

import General.Main;
import Requests.CustomerDetail;
import com.squareup.okhttp.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CustomerDetailAssertion extends Main {
    Response ActualResponse;

    int ActualStatusCode;
    int ExpectedStatusCode = 200;


    @Test
    public void getCustomerDetail() {

        CustomerDetail GIOU = new CustomerDetail();
        ActualResponse = GIOU.GetCustomerDetail();
        ActualStatusCode = ActualResponse.code();
        System.out.println("Status code of Get Customer Details Assertion is equal to " + ActualStatusCode);
        Assert.assertEquals("" + ActualStatusCode, "" + ExpectedStatusCode);
    }
}