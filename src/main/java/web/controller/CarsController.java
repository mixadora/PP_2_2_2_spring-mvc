package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {
    private final CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String PrintCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model){
        if (count == null || count > 5) {
            count = 5;
        }
        model.addAttribute("messages", carService.getListCar());
        model.addAttribute("locales", count);
        return "cars";
    }
}