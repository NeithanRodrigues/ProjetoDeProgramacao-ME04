package me04.InterfacePagavel;

public class EmpregadoAssalariado extends Empregado {
    private double salarioMensal;

    public EmpregadoAssalariado(String n, String s, String d, double salario) {
        super(n, s, d);
        this.salarioMensal = salario;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salario) {
        this.salarioMensal = salario < 0.0 ? 0.0 : salario;
    }

    public String toString() {
        return String.format("\n%s %s\n%s: $%.2f",
                "Empregado Assalariado", super.toString(),
                "Salario", getSalarioMensal());
    }

    public double getValorAPagar() {
        return getSalarioMensal();
    }
}