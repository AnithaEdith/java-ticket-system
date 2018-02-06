package com.dasanjos.tickets.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    Logger logger=LoggerFactory.getLogger(this.getClass());

    @RequestMapping(method = RequestMethod.GET)
    public String showindex() {
        logger.debug("inside show index");
        return "index";
    }
}
