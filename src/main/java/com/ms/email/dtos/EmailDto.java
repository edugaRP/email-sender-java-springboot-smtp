package com.ms.email.dtos;

import lombok.Data;

import javax.persistence.ElementCollection;
import javax.validation.constraints.*;
import java.util.List;

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;

}
