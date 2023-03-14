package br.com.dev.examgenerator.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class ApllicationUser extends AbstractEntity {
    @NotEmpty(message = "The field username cannot be empty")
    @Column(unique = true)
    private String username;
    @NotEmpty(message = "The field password cannot be empty")
    private String password;
    @OneToOne
    private Professor professor;

}
