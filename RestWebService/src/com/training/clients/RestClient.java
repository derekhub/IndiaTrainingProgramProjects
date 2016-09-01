package com.training.clients;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class RestClient {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http");

    }

}
