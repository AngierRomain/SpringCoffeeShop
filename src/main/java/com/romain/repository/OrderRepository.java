package com.romain.repository;

import com.romain.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Romain Angier on 22/10/19.
 */
public interface OrderRepository extends CrudRepository<CustomerOrder,Long>{

}
