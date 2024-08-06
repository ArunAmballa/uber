package com.arun.project.uber.uberApp.dto;

import com.arun.project.uber.uberApp.enums.Role;
import lombok.*;

import java.util.Set;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String name;

    private String email;

    private Set<Role> roles;
}
