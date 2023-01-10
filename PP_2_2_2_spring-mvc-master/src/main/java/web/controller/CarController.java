package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.ServiceCars;

@Controller
public class CarController {

    @Autowired
    private ServiceCars serviceCars;

    @GetMapping(value ="cars")
    public String showCars(@RequestParam(value = "count", required = false,
            defaultValue = "0") int i, ModelMap model) {
        model.addAttribute("key", serviceCars.show(i));
        return "cars";
    }
}

