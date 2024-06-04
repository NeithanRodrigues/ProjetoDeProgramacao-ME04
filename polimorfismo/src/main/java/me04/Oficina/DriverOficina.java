package me04.Oficina;

public class DriverOficina {
    public static void main(String[] args) {
        Oficina oficina = new Oficina();
        Veiculo vec;

        for (int i=0; i <4; i++){
            vec = oficina.proximo();
            oficina.manter(vec);
        }
    }
}
