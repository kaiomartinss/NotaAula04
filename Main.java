import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();

        System.out.print("Digite o nome do Gerente: ");
        gerente.setNome(scanner.nextLine());


        System.out.println("O nome do gerente é:" + gerente.getNome());

        System.out.print("Informe o salário do gerente: ");
        gerente.setSalario(scanner.nextDouble());

        double resultadobonus = gerente.calcularBonus();
        double resultado = gerente.calcularSalario();


        System.out.println("O seu bônus total é:" + resultadobonus);
        System.out.println("O salário total do gerente é:" + resultado);


    }

}

