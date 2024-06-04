package me04.InterfacePagavel;

public class NotaFiscal implements Pagavel {
    private String numeroPeca;
    private String descricaoPeca;
    private int quantidade;
    private double precoPorItem;

    public NotaFiscal(String peca, String descricao, int numero, double preco) {
        numeroPeca = peca;
        descricaoPeca = descricao;
        setQuantidade(numero);
        setPrecoPorItem(preco);
    }

    public void setQuantidade(int numero) {
        quantidade = numero > 0 ? numero : 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPrecoPorItem(double preco) {
        precoPorItem = preco > 0 ? preco : 0.0;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    public String toString() {
        return String.format("\n%s \n%s: %s (%s) \n%s: %d \n%s: $%.2f",
                "Nota", "peca numero", getNumeroPeca(), getDescricaoPeca(),
                "quantidade", getQuantidade(),
                "preco por item", getPrecoPorItem());
    }

    public double getValorAPagar() {
        return getQuantidade() * getPrecoPorItem();
    }
}