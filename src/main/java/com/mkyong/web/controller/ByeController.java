package com.mkyong.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("sesion")
public class ByeController {

    private final Logger logger = LoggerFactory.getLogger(ByeController.class);

    @RequestMapping(value = "/fin", method = RequestMethod.GET)
    //public String index(@ModelAttribute("sesion") Sesion sesion) {
    public String fin(@SessionAttribute("sesion") Sesion sesion, Model model) {
    	sesion.setPassword("magic");
    	//model.addAttribute("sesion", sesion);
        logger.debug("fin...: " + sesion);
        return "fin";

    }

    @RequestMapping(value = "/adios", method = RequestMethod.GET)
    public String adios(@ModelAttribute("sesion") Sesion sesion) {
        logger.debug("adios...: " + sesion);
        return "fin";

    }

    @RequestMapping(value = "/joder", method = RequestMethod.GET)
    public String adios2(@SessionAttribute("sesion") Sesion sesion ) {
        logger.debug("joder...: " + sesion);
        return "fin";

    }

}
