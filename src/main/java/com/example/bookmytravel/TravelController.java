package com.example.bookmytravel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TravelController
{
    @GetMapping("/travel")
    public String getTravelData()
    {
        return "BookMyTravel: Delhi to Mumbai, Flight: IndiGo, Hotel: Taj Hotel";
    }

}
