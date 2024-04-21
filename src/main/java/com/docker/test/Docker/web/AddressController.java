package com.docker.test.Docker.web;


import com.docker.test.Docker.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    @GetMapping
    public Address getAddresss(){
        Address address = Address.builder().id(1).postalCode("641004").streetName("Avinashi Road").build();
        return address;
    }

    @GetMapping("all")
    public List<Address> getAllAddresss(){
        Address address1 = Address.builder().id(1).postalCode("641004").streetName("Avinashi Road").build();
        Address address2 = Address.builder().id(2).postalCode("641004").streetName("Peelamedu").build();
        return Arrays.asList(address1, address2);
    }


}
