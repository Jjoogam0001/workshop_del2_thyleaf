package workshop_del2.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Fever {

    @GetMapping("/feverHome")
    public String FeverPage(){
        return "FeverHome";
    }

    @PostMapping("/feverHome")
    public String TemperatureSubmit(TempServiceImpl temp, Model model) {
        model.addAttribute("temperature",temp);
        return "FeverHome";
    }
}
