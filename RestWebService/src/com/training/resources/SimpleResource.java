package com.training.resources;

import java.util.HashMap;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.owlike.genson.Genson;

@Path("/simple")

// Advanced REST client

public class SimpleResource {

    HashMap<Integer, String> data = new HashMap<Integer, String>();

    public void init() {
        data.put(1, "bob");
        data.put(2, "sally");
    }

    public void init2() {
        data.put(1, "kev");
        data.put(2, "tree");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "You haev configured jersey properly";
    }

    @Path("/inv")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getInfo() {

        Invoice inv = new Invoice(101, "Ramesh", 4500);
        Genson serializer = new Genson();
        String resp = serializer.serialize(inv);
        return resp;
    }

    @Path("/add")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String addUser(@FormParam("userId") int id, @FormParam("userName") String userName) {
        init();
        data.put(id, userName);
        return data.toString();
    }

    @Path("/find/{userId}")
    @GET
    public String findUser(@PathParam("userId") int id) {
        init();
        return data.get(id);
    }

    @Path("/remove/{userId}")
    @DELETE
    public String deleteUser(@PathParam("userId") int id) {
        init2();
        String bear = data.remove(id);
        System.out.println(bear);
        return bear;
        // data.remove(id);
        // return "" + data.size();
    }

}
