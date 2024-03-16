package br.com.projeto.api.Controller;

import br.com.projeto.api.Model.Customer;
import br.com.projeto.api.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private Repository action;

    @PostMapping("/")
    public Customer register(@RequestBody Customer c){
        return action.save(c);
    }

    @GetMapping("/")
    public Iterable<Customer> select() {
        return action.findAll();
    }

    @PutMapping("/")
    public Customer edit(@RequestBody Customer c) {
        return action.save(c);
    }
}
