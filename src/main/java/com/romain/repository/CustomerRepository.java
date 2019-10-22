package com.romain.repository;

import com.romain.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Romain Angier on 22/10/19.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
