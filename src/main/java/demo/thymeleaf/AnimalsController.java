package demo.thymeleaf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.service.AnimalService;

@Controller
@RequestMapping("/thymeleaf/")
public class AnimalsController {

    @Autowired
    AnimalService animalService;

    @RequestMapping("animals")
    public String index(Model model) {
        List<String> animals = animalService.getNames();
        model.addAttribute("animals", animals);

        return "thymeleaf/animals";
    }


}
