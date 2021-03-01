package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @GetMapping("/list")
    public String showList(ModelMap modelMap){
        modelMap.addAttribute("name","tungle");
        modelMap.addAttribute("age","19");
        modelMap.addAttribute("address","hd");
        return "list";
    }
}
