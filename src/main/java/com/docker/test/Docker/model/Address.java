package com.docker.test.Docker.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private long id;

    private String streetName;

    private String postalCode;



}
