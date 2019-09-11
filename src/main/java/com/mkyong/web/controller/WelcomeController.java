package com.mkyong.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

@Controller
@SessionAttributes("sesion")
public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @ModelAttribute("sesion")
    public Sesion getSesion() {
    	logger.debug("@ModelAttribute(\"sesion\")");
    	Sesion sesion = new Sesion("cesar", "cyrano");
        return sesion;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        logger.debug("Welcome to mkyong.com...");
        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        return "index";

    }
    
    @RequestMapping(value = "/inicio", method = RequestMethod.GET)
    public String inicio(@ModelAttribute("sesion") Sesion sesion) {
        logger.debug("inicio...: " + sesion);
        return "fin";

    }

    @RequestMapping(value = "/change", method = RequestMethod.GET)
    public String change(@ModelAttribute("sesion") Sesion sesion) {
    	sesion.setPassword("model");
        logger.debug("inicio...: " + sesion);
        return "fin";

    }

    public String getMessage() {
        return "Hello World";
    }

}
