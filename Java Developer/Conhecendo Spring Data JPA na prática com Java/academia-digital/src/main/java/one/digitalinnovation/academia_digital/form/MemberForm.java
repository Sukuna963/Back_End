package one.digitalinnovation.academia_digital.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class MemberForm {

    @NotEmpty(message = "Campo nao pode ser vazio.")
    @Size(min = 3, max = 50, message = "Campo nome precisa ter entre {min} e {max} caracteres.")
    private String name;

    @NotEmpty(message = "Campo nao pode ser vazio.")
    @CPF(message = "CPF Invalido.")
    private String cpf;

    @NotEmpty(message = "Campo nao pode ser vazio.")
    @Size(min = 3, max = 50, message = "Campo bairro precisa ter entre {min} e {max} caracteres.")
    private String neighborhood;

    @NotNull(message = "Campo nao pode ser vazio.")
    @Past(message = "Data informada invalida.")
    private LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}