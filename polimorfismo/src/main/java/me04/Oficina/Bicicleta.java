package me04.Oficina;

public class Bicicleta extends Veiculo{
    @Override
    public void verificaLista() {
        System.out.println("Verifica bicicleta");
    }
    @Override
    public void reparar() {
        System.out.println("Repara bicicleta");
    }
    @Override
    public void lavar() {
        System.out.println("Lava bicicleta");
    }
}
