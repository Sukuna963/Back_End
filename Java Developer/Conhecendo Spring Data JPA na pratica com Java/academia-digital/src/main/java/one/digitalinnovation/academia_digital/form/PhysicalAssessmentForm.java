package one.digitalinnovation.academia_digital.form;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class PhysicalAssessmentForm {

    @Positive(message = "Id do aluno precisa ser positivo.")
    private Long memberId;

    @NotNull(message = "Campo nao pode ser vazio.")
    @Positive(message = "'${validatedValue}' precisa ser positivo.")
    private double weight;

    @NotNull(message = "Campo nao pode ser vazio.")
    @Positive(message = "${validatedValue}' precisa ser positivo.")
    @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
    private double height;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
