package com.amazonaws.lambda.demo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaFunctionHandlerTest {

    private static Request req;
    
    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        req = new Request();
        req.setFirstName("Raghunandan");
        req.setLastName("Muthyala");
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Custom Function Name");

        return ctx;
    }

    @Test
    public void testLambdaFunctionHandler() {
        LambdaFunctionHandler handler = new LambdaFunctionHandler();
        Context ctx = createContext();

        Response res = handler.handleRequest(req, ctx);

        // TODO: validate output here if needed.
        Assert.assertNotEquals("Hello from Lambda!", res.getRespData());
    }
}
