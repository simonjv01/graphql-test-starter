package dev.danvega.graphqltest.controller;

import dev.danvega.graphqltest.model.Coffee;
import dev.danvega.graphqltest.service.CoffeeService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CoffeeController {

    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    public List<Coffee> findAll() {
        return coffeeService.findAll();
    }
}
