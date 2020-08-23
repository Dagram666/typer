package pl.typer.hibernate.entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(ModelMap map) {
        map.put("name", "Michał");
        return "typer";
    }
@GetMapping("/form")
        public  String getForm(){
        return  "form;";

}

}
