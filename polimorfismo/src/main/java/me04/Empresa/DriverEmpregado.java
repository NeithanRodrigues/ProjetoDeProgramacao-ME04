package me04.Empresa;

public class DriverEmpregado {
    public static void main(String[] args) {
        EmpregadoAssalariado ea = new EmpregadoAssalariado("John", "Smith", "1111111-1", 800.00);
        EmpregadoHorista eh = new EmpregadoHorista("Karen", "Price", "2222222-2", 16.75, 40);
        EmpregadoComissionado ec = new EmpregadoComissionado("Sue", "Jones", "3333333-3", 10000, 0.06);
        EmpregadoComissionadoAssalariado eca = new EmpregadoComissionadoAssalariado("Bob", "Lewis", "44444444-4", 5000, 0.04, 300);

        System.out.println("Processando individualmente\n");
        System.out.printf("%.2f\n", ea.salario());
        System.out.printf("%.2f\n", eh.salario());
        System.out.printf("%.2f\n", ec.salario());
        System.out.printf("%.2f\n", eca.salario());

        Empregado[] vetor = new Empregado[4];
        vetor[0] = ea;
        vetor[1] = eh;
        vetor[2] = ec;
        vetor[3] = eca;

        System.out.println("Processando polimorficamente");
        for (Empregado elem : vetor) {
            System.out.println(elem);
            System.out.println();
            if (elem instanceof EmpregadoComissionadoAssalariado) {
                EmpregadoComissionadoAssalariado tmp = (EmpregadoComissionadoAssalariado) elem;
                tmp.setSalarioMensal(tmp.getSalarioMensal() * 1.1);
                System.out.println(tmp);
            }
            System.out.println("Salario: " + elem.salario());
            System.out.println();
        }

        for (Empregado elem : vetor) {
            System.out.println("O empregado é " + elem.getClass().getSimpleName());
        }
    }
}
