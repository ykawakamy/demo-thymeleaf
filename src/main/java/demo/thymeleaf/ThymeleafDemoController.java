package demo.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf/")
public class ThymeleafDemoController {

    @RequestMapping("animals")
    public String index(Model model) {
        String[] animals = {"イヌ", "ネコ", "リス"};
        model.addAttribute("animals", animals);

        return "thymeleaf/animals";
    }


}
