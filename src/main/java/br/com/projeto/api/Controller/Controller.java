package br.com.projeto.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.Model.Customer;
import br.com.projeto.api.Repository.Repository;

@RestController
public class Controller {
    
    @Autowired
    private Repository action;

    @PostMapping("/")
    public Customer register(@RequestBody Customer c){
        return action.save(c);
    }

    @GetMapping("/")
    public String teste() {
        return "Hello world!";
    }
}
