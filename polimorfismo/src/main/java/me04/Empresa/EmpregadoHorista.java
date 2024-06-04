package me04.Empresa;

public class EmpregadoHorista extends Empregado{
    public double valor;
    public double horas;
    
    public EmpregadoHorista(
                String nome,
                String snome,
                String doc,
                double valor,
                double hora
            ){
        super(nome, snome, doc);
        setEmpregadoHorista(valor, hora);
    }

    public void setEmpregadoHorista(double valor, double hora){
        this.valor = valor;
        this.horas = hora;
    }

    public double salario(){
        if (horas <= 40){
            return valor * horas;
        }
        return 40*valor+(horas-40)*valor*1.5;
    }

    public String toString() {
        return String.format("%s\n%s: %.2f\n%s: %.2f",
            super.toString(),
            "Horas Trabalhadas", horas,
            "Valor por hora", valor);
    }
    
}
