package com.example.bookmytravel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Carservices
{
    @GetMapping("/Carservices")
    public String getcarservices()
    {
        return "Available Carsservices: Delhi to Mumbai Rajdhani, Delhi to Bangalore Express, Delhi to Goa Express";
    }
}


