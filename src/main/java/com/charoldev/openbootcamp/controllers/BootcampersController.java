package com.charoldev.openbootcamp.controllers;

import com.charoldev.openbootcamp.models.Bootcamper;
import com.charoldev.openbootcamp.service.BootcampersService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.*;
import java.util.List;

@Component
@Path("/bootcampers")
public class BootcampersController {

    private final BootcampersService bootcampersService;

    public BootcampersController(BootcampersService bootcampersService) {
        this.bootcampersService = bootcampersService;
        bootcampersService.add("Harold");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public List<Bootcamper> getAllBootcampers() {
        return bootcampersService.findAll();
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public Bootcamper getBootcamperByName(@PathParam("name") String name) {
        return bootcampersService.findByName(name);
    }

    @POST()
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public Bootcamper saveBootcamper(@RequestBody Bootcamper bootcamper) {
        return bootcampersService.add(bootcamper);
    }

}
