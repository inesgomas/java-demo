package com.javademo.resources;

import com.google.common.base.Optional;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class Test {


    public Test() {

    }

    public int getFibonacci(Integer n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
 
        int prevPrev = 0;
        int prev = 1;
        int result = 0;
 
        for (int i = 2; i <= n; i++)
        {
            result = prev + prevPrev;
            prevPrev = prev;
            prev = result;
        }
        return result;
    }
}