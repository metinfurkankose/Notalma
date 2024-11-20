package com.mfk.notalma;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    //@RequestMapping("/")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {//Buradaki model inversition of control
        model.addAttribute("sayi",12);
        model.addAttribute("tempattr","/");
        return "index";
    }
    @RequestMapping(value = "/metin", method = RequestMethod.GET)
    public String homeS(Model model) {
        model.addAttribute("tempattr","/Metin");
        return "index";
    }
}
