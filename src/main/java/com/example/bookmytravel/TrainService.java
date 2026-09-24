package com.example.bookmytravel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TrainService {
    @GetMapping("/TrainService")
    public String getTrains() {
        return "Available Trains: Delhi to Mumbai Rajdhani, Delhi to Bangalore Express, Delhi to Goa Express";
    }
}
