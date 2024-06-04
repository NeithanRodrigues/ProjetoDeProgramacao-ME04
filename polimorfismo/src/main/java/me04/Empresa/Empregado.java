package me04.Empresa;

public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String documento;
    
    public Empregado(
                String nome,
                String sobrenome,
                String documento){
        setEmpregado(nome, sobrenome, documento);
    }

    public void setEmpregado(
                String nome,
                String sobrenome,
                String documento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
}

    @Override
    public String toString() {
        return String.format(
            "\n%s: %s\n%s: %s\n%s: %s",
            "Nome", nome,
            "Sobrenome", sobrenome,
            "Documento", documento
        );
    }

    public abstract double salario();
}