package workshop_del2.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class Home {
   private List<String> store = new ArrayList<String>();




    @GetMapping("/index")
    public String Index(){
        return "index";
    }

    @GetMapping("/contact")
    public String Contact(){
        return "contact";

    }
    @PostMapping("/contact")
    public String addContact(@RequestParam(value = "contact") String contact){
        store.add(contact);
        System.out.println(store.toString());
        return "redirect:/contact";

    }

    @RequestMapping(value = "/contact/contact", method = RequestMethod.GET)
    public String Listofcontacts(Model model){
        model.addAttribute("contacts", store);

        return "contact";
    }
    @GetMapping("/about")
    public String About(){
        return "about";
    }





}
