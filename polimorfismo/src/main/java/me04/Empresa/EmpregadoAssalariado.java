package me04.Empresa;

public class EmpregadoAssalariado extends Empregado{
    private double salarioSemanal;
    
    public EmpregadoAssalariado(
                String nome,
                String sobrenome,
                String documento,
                double salario){
        super(nome, sobrenome, documento);
        setSalarioSemanal(salario);
    }

    public void setSalarioSemanal(double salario){
        salarioSemanal = salario;
    }

    public double salario(){
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return String.format(
            "%s\n%s: %s",
            super.toString(),
            "Salario semanal: ", salarioSemanal
        );
    }
}
