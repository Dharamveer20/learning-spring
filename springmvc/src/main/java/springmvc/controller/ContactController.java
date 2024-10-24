package springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.User;

@Controller
public class ContactController {

    @ModelAttribute
    public void commonDetails(Model m){
//        m.addAttribute("header", "Code");
        m.addAttribute("para", "with me");
    }
    @RequestMapping("/contact")
    public String showForm(Model model){
        return "contact";
    }

    // Older way to receive Data from View To Controller using HttpServletRequest
//    @RequestMapping(path="processForm", method= RequestMethod.POST)
//    public String handleForm(HttpServletRequest request){
//        String email= request.getParameter("email"); // para -> name of the Attribute "name" of email field
//        System.out.println(email);
//        return "";
//    }

//    @RequestMapping(path="/processForm", method=RequestMethod.POST)
//    public String hendleForm(@RequestParam("email") String userEmail, @RequestParam("name") String userName, @RequestParam("password") String userPass, Model model){
////        Para passed to RequestParam => name of "name" attribute
//        System.out.println("userEmail: " + userEmail + "userName: " + userName + "userPass: " + userPass);
//        model.addAttribute("emailOfUser", userEmail);
//        model.addAttribute("userName", userName);
//        model.addAttribute("userPass", userPass);
//
//        return "success";
//    }

    @RequestMapping(path="processForm", method=RequestMethod.POST)
    public String handleForm(@ModelAttribute User user, Model model){
        return "success";
    }
}

