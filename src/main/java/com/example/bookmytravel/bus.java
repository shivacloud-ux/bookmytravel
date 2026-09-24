package com.example.bookmytravel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class bus {
    @GetMapping("/bus")
    public String getbus() {
        return "Available Bus: Delhi to Mumbai Rajdhani, Delhi to Bangalore Express, Delhi to Goa Express";
    }
}
