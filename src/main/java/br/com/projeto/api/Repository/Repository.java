package br.com.projeto.api.Repository;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.api.Model.Customer;

public interface Repository extends CrudRepository<Customer, Long> {

    
}
