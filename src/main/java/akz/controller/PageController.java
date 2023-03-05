package akz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

    public class PageController {
    @RequestMapping("/")
        public String home(){

        return "home";

    }
    @RequestMapping("/about")
    public String about() {

        return "about";
    }
    @RequestMapping("/user/view")
    public String view() {

        return "user.view";
    }

    @RequestMapping("/user/edit")
    public String edit(){
        return "user.edit";
    }

}
