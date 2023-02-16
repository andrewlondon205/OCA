package com.pluralsight.oracle.oca.arrays;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Human {

    private String name;
    private String lastName;
    private Integer age;
    private String address;
    private Gender gender;

}
