package com.itransition.profunding.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author v.tarasevich
 * @version 1.0
 * @since 08.09.2017 16:29
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserDto {
    private Long id;
    private String username;
    private String role;
}
