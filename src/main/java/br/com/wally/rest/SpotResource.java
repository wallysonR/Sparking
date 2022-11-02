package br.com.wally.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Collection;

@Path("/spots")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SpotResource {

    @GET
    public Collection<Spot> listSpots() {
        return ParkingSpot.GetParkingSpot().viewAllSpots();
    }

    @Path("/{id}")
    @DELETE
    public Spot removeSpot(@PathParam("id") String spotId) {
        return ParkingSpot.GetParkingSpot().takeSpot(spotId);
    }

    @POST
    public void registerSpot(Spot newSpot) {
        ParkingSpot.GetParkingSpot().registerSpot(newSpot);
    }

    @Path("/{id}")
    @PUT
    public void updateSpot(@PathParam("id") String spotId, Spot spot) {
        ParkingSpot.GetParkingSpot().updateSpot(spotId,spot);
    }


}
