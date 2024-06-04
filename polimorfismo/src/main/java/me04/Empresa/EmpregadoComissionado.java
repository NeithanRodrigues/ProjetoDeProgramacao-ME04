package me04.Empresa;

public class EmpregadoComissionado extends Empregado {
    private double vendas;
    private double comissao;

    public EmpregadoComissionado(String nome, String sobrenome, String doc, double v, double c) {
        super(nome, sobrenome, doc);
        setEmpregadoComissionado(v, c);
    }

    public void setEmpregadoComissionado(double v, double c) {
        vendas = v;
        comissao = c;
    }

    public double salario() {
        return vendas * comissao;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s: %.2f\n%s: %.2f",
            super.toString(),
            "Total em vendas", vendas,
            "Comissão", comissao);
    }


}
