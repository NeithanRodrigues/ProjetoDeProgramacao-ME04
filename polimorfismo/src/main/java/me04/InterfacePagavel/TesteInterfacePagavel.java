package me04.InterfacePagavel;

public class TesteInterfacePagavel {
    public static void main(String[] args) {
        Pagavel[] pagavel = new Pagavel[4];
        pagavel[0] = new NotaFiscal("01234", "banco", 2, 375.0);
        pagavel[1] = new NotaFiscal("56789", "pneu", 4, 79.95);
        pagavel[2] = new EmpregadoAssalariado("John", "Smith", "111-11-1111", 800.00);
        pagavel[3] = new EmpregadoAssalariado("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println("Notas Fiscais e Empregados processados polimorficamente");
        for (Pagavel elem : pagavel) {
            System.out.printf("\n%s \n%s: $%.2f\n",
                    elem.toString(), "Pagamento Devido",
                    elem.getValorAPagar());
        }
    }
}