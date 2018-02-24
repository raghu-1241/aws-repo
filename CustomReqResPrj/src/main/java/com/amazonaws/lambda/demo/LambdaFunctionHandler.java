package com.amazonaws.lambda.demo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request req, Context context) {
    	LambdaLogger logger = context.getLogger();
    	logger.log("In handleRequest method: " + req.getFirstName() + " " + req.getLastName());
    	
    	Response res = new Response();
    	res.setRespData(String.format("Hello %s %s Welcome to Lambda function programming", 
    			new Object[] {req.getFirstName().toUpperCase(), req.getLastName().toUpperCase()}));
    	return res;
    }

}
