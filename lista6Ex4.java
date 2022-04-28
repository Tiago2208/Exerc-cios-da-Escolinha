import java.util.Scanner;

public class lista6Ex4 {
    public static void main(String[] args) {
        int idadeMaior = 0;
        int idadeMenor = 100;
        int quantidadeDeMulheres = 0;
        double somaSalario = 0;
        int quantidadeDeFuncionarios = 0;
        Scanner leitor = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.println("Insira sua idade: " + "(Digite 0 para sair)");
            int idade = leitor.nextInt();
            if (idade == 0) {
                break;
            }
            leitor = new Scanner(System.in);
            String sexo;
            do {
                System.out.println("Insira seu sexo: digite M para masculino e F para feminino ");
                sexo = leitor.nextLine();
            } while (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M"));

            System.out.println("Insira o seu salário: ");
            double salario = leitor.nextDouble();
            somaSalario += salario;
            if (idade > idadeMaior) {
                idadeMaior = idade;

            }
            if (idade < idadeMenor) {
                idadeMenor = idade;

            }
            if (sexo.equalsIgnoreCase("F") && salario >= 4000) {
                quantidadeDeMulheres += 1;

            }
            if (salario > 0) {
                quantidadeDeFuncionarios += 1;
            }
        }
        System.out.println("A idade menor é: " + idadeMenor);
        System.out.println("A idade maior é: " + idadeMaior);
        System.out.println("A quantidade de mulheres com salário superior a 4000 é: " + quantidadeDeMulheres);
        System.out.println("A média dos salários é: " + somaSalario / quantidadeDeFuncionarios);
    }
}