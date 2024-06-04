package me04.TestePolimorfismo;

public class Main {
    public static void main(String[] args) {
        Super superClasse = new Super();
        Sub subClasse = new Sub();
        Super poli = new Sub();

        superClasse.print();
        subClasse.print();
        poli.print();
    }
}


