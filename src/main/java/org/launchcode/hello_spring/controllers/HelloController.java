package org.launchcode.hello_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    // handles request at path /hello


    // handless request of the form /hello?name=LaunchCode
   @RequestMapping(value = "hello", method = {RequestMethod.GET,RequestMethod.POST})
    public String hello(@RequestParam String name, Model model)
    {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting",greeting);
        return "hello";

    }


    // handles requests pf the form /hello/LaunchCode
    @GetMapping("hello/{name}")

    public String helloAgain(@PathVariable String name,Model model){
       String greeting = "Hello, " + name + "!";
       model.addAttribute("greeting",greeting);
        return "hello";
    }


    //hello/form
    @GetMapping("form")
    public String helloForm()
    {
       return "form";

    }

    @GetMapping("hello-names")
    public String helloNames(Model model)
    {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names",names);
        return "hello-list";
    }

}
