package edu.icet.service;

import edu.icet.model.dto.Customer;
import edu.icet.model.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void addCustomer(Customer customer) {
        customerRepository.save(new CustomerEntity(
                customer.getId(),
                customer.getTitle(),
                customer.getName(),
                customer.getPhoneNumber()
        ));
    }

}
