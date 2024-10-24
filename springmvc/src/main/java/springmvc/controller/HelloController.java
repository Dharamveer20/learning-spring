package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/find")
public class HelloController {
    @RequestMapping(path="/home", method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("name","Kano"); // key and object (object can be String, Integers, Collection,etc)
// Note: name is key which we'll use i  n our index.js view to store the object (here String object "Kano")

        // Eg for Collection
        ArrayList<String> names = new ArrayList<>();
        names.add("Lano");
        names.add("Oano");
        names.add("Wano");
        model.addAttribute("names", names);
        return "index";
    }
    @RequestMapping("/about")
    public String about(){
        System.out.println("Hello this is home url!");
        return "about";
    }

//    @RequestMapping("/help")
//    public ModelAndView help(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("name", "Cano");
//        modelAndView.setViewName("help"); // setting view name
//        return modelAndView;
//    }
}
