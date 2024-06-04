package me04.InterfacePagavel;

public abstract class Empregado implements Pagavel {
    private String nome;
    private String sobrenome;
    private String documento;

    public Empregado(String n, String s, String d) {
        nome = n;
        sobrenome = s;
        documento = d;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String toString() {
        return String.format("\n%s %s\n%s: %s",
                getNome(), getSobrenome(),
                "documento", getDocumento());
    }
}
