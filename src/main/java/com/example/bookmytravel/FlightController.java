package com.example.bookmytravel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FlightController {
    @GetMapping("/flights")
    public String getFlights() {
        return "Available Flights: Delhi to Mumbai, Delhi to Bangalore, Delhi to Goa";

    }
}
