package com.ridhaa.Converter;

/**
 *
 * @author Ridhaa Cupido
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller {

    @RequestMapping(value = "/")
    public String index() {
        return "Hello World";
    }

    @RequestMapping(value = "/convertCmToInches/{imperial}")
    public double convertCmToInches(@PathVariable double imperial) {
        ImperialToMetric i = new ImperialToMetric(imperial);

        return i.convertCmToInches();
    }
    
    @RequestMapping(value = "/convertMetersToFeet/{imperial}")
    public double convertMetersToFeet(@PathVariable double imperial) {
        ImperialToMetric i = new ImperialToMetric(imperial);

        return i.convertMetersToFeet();
    }
    
    @RequestMapping(value = "/convertKmToMiles/{imperial}")
    public double convertKmToMiles(@PathVariable double imperial) {
        ImperialToMetric i = new ImperialToMetric(imperial);

        return i.convertKmToMiles();
    }

}
