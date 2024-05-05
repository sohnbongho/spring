package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "hello"; // hello.html호출
    }

    //http://localhost:8080/hello-mvc?name=spring
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = true)String name, Model model){
        model.addAttribute("name", name);
        return "hello-template"; //
    }
}
