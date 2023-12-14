package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    @RequestMapping({"","/","ownerIndex","ownerIndex.html"})
    public String getOwnerInfo(){
        return "owner/ownerIndex";
    }
}
