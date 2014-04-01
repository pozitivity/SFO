package ru.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("/service")
public class service {
    
    @GET
    @Path("/test")
    public Response test() {
        return Response.status(200).entity("Hi").build();
    }

}
