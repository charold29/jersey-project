package com.charoldev.openbootcamp.service;

import com.charoldev.openbootcamp.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcampersService {

    private final List<Bootcamper> bootcampers = new ArrayList<>();

    public List<Bootcamper> findAll() {
        return bootcampers;
    }

    public Bootcamper findByName(String name) {
        for (Bootcamper bc : bootcampers) {
            if (bc.getName().equalsIgnoreCase(name))
                return bc;
        }
        return null;
    }

    public Bootcamper add(Bootcamper bootcamper) {
        bootcamper.setValue(Math.random());
        bootcampers.add(bootcamper);

        return bootcamper;
    }

    public Bootcamper add(String name) {
        var bootcamper = new Bootcamper(name, Math.random());
        bootcampers.add(bootcamper);
        return bootcamper;
    }

}
