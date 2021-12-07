package com.sergifi.estore.ProductsService.rest;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

    // Use this environment object to access port number.
    private final Environment env;

    public ProductsController(Environment env) {
        this.env = env;
    }

    @PostMapping
    public String createProduct() {
        return "HTTP POST Handled";
    }

    @GetMapping
    public String getProduct() {

        final String portNumber = env.getProperty("local.server.port");
        return String.format("HTTP GET Handled on port :{}", portNumber);
    }

    @PutMapping
    public String updateProduct() {
        return "HTTP PUT Handled";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "HTTP DELETE Handled";
    }
}
