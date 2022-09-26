package com.charoldev.openbootcamp.rest;

import com.charoldev.openbootcamp.service.BootcampersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Component
@Path("/openboot")
@AllArgsConstructor
public class HomeController {

    private final BootcampersService bootcampersService;

    @GET
    @Produces("application/json")
    public String greeting() {
        return bootcampersService.greeting();
    }
}
