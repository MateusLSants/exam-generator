package br.com.dev.examgenerator.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
public class Professor extends AbstractEntity {
    @NotEmpty(message = "the field name cannot be empty")
    private String name;
    @Email(message = "This email is not valid")
    @NotEmpty(message = "The field email cannot be empty")
    @Column(unique = true)
    private String email;
}
