package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    // When the user enters the url corresponding to the
    // parameters within RequesMapping the getResult method will be mapped to it.
    @RequestMapping({"","/","index","index.html"})
    public String getResult(){
        return "index";
    }
}
