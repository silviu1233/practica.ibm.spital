package com.ibm.practica.spital.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PacientDTO {

    private String firstName;
    private String lastName;
    private int age;
// Secializarea
    private String issue;

}
