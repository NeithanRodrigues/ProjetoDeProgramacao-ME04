package me04.Oficina;

import java.util.Random;

public class Oficina {
    private int R = 0;
   
    public Veiculo proximo(){
        Veiculo v;
        Random r = new Random();
        R = r.nextInt(2);
        
        if (R == 0){
            v = new Automovel();
            return v;
        }
       
        v = new Bicicleta();
        return v;
    }

    public void manter(Veiculo v){
        System.out.println("\n---------------");
        v.verificaLista();
        v.reparar();
        v.lavar();
        System.out.println("\n---------------");
    }

    public int getR(){
        return R;
    }
}
