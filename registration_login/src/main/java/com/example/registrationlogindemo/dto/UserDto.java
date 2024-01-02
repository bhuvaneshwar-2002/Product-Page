package com.example.registrationlogindemo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;

    private Long phno;
    @NotEmpty
    private String qualification;
    @NotEmpty
    private String passed_out;
    @NotEmpty
    private String branch;
    @NotEmpty
    private String jobType;

    private Long salary;
    @NotEmpty(message = "Password should not be empty")
    private String password;
}
