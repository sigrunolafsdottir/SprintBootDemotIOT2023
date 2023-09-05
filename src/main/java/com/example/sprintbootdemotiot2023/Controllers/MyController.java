package com.example.sprintbootdemotiot2023.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyController {

    @RequestMapping("/")
    public String HelloWorld(){
        return "Hello World!!!!";
    }

    @RequestMapping("/welcome")
    public String HelloWorld2(){
        return "<HTML><H1>Hello World!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!</H1></HTML>";
    }

    @RequestMapping("/welcome2")
    public String HelloWorld4(){
        return HelloWorld2();
    }

    @RequestMapping("/greeting")
    //@RequestParam verkar optional nuförtiden
    //parameternamnetn måste stämma överens med de parametrar man skickar in i sin url
    public String HelloWorld3(String first,  String last){
        return "Hejsan " + first+" "+last ;
    }



}
