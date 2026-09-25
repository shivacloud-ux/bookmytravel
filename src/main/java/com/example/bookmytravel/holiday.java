package com.example.bookmytravel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class holiday
{
    @GetMapping("/holiday")
    public String getholidaydata()
    {
        return "Bookmytravel: , booking holiday in Delhi";
    }

}
