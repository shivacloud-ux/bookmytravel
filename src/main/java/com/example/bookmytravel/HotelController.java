package com.example.bookmytravel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HotelController {
    @GetMapping("/hotels")
    public String getHotels()
    {
        return "Available Hotels: Taj Hotel, Lemon Tree, Hyatt";
    }
}
