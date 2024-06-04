package me04.Empresa;

public class EmpregadoComissionadoAssalariado extends EmpregadoComissionado {
    private double salarioMensal;

    public EmpregadoComissionadoAssalariado(String nome, String sobrenome, String doc, double v, double c, double sm) {
        super(nome, sobrenome, doc, v, c);
        setSalarioMensal(sm);
    }

    public void setSalarioMensal(double sm) {
        salarioMensal = sm;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public double salario() {
        return getSalarioMensal() + super.salario();
    }

    public String toString() {
        return String.format("%s\n%s: %.2f",
            super.toString(),
            "Salario Mensal", getSalarioMensal());
    }
}
