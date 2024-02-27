package br.com.projeto.api.Controller;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private Repository action;

    @GetMapping("/")
    public String teste() {
        return "Hello world!";
    }
}
