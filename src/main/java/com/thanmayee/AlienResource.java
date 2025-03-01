package com.thanmayee;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {

    @GetMapping("/aliens")
    public List<Alien> getAliens(){
        Alien alien = new Alien();
        alien.setId(1);
        alien.setName("Sai");
        alien.setColour("Green");

        Alien alien1 = new Alien();
        alien1.setId(2);
        alien1.setName("Thanmayee");
        alien1.setColour("yellow");

        return List.of(alien, alien1);
    }
}
