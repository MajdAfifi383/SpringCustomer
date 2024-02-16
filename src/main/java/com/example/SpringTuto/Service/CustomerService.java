package com.example.SpringTuto.Service;

import com.example.SpringTuto.DTO.CustomerDTO;
import com.example.SpringTuto.DTO.CustomerSaveDTO;
import com.example.SpringTuto.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);
    List<CustomerDTO> getAllCustomer();
    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);
    boolean deleteCustomer(int id);
}
