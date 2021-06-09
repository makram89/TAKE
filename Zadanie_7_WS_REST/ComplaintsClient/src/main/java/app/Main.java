/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author marek
 */
public class Main {

    public static void main(String[] args) {

        String id = "355";

        Client client = ClientBuilder.newClient();
        String count = client.target("http://localhost:8080/Complaints/" + "resources/complaints/count")
                .request(MediaType.TEXT_PLAIN).get(String.class);

        System.out.println("Count: " + count);

        String allComplaints = client.target("http://localhost:8080/Complaints/resources/complaints")
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
        System.out.println("All complaints: " + allComplaints);

        String one = client.target("http://localhost:8080/Complaints/resources/complaints/" + id)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
        System.out.println("One: " + one);

        String newComplaint = one.replace("\"status\":\"open\"", "\"status\":\"closed\"");

        client.target("http://localhost:8080/Complaints/resources/complaints/" + id)
                .request(MediaType.APPLICATION_JSON)
                .put(Entity.json(newComplaint));

        String openComplaints = client
                .target("http://localhost:8080/Complaints/resources/complaints?status=open")
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
        
        System.out.println("Open complaints: " + openComplaints);

        client.close();

    }

}
