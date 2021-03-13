package szczapandrzej.quiz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
public class MainController {

    @RequestMapping
    public String index()
    {
        return ("/question/index");
    }

    @GetMapping("/login")
    public String login() {
        return  ("/question/login");
    }


}
