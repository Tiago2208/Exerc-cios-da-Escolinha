import java.util.Scanner;

public class lista6Ex4 {
    public static void main(String[] args) {
        int idadeMaior = 0;
        int idadeMenor = 100;
        int quantidadeDeMulheres = 0;
        double somaSalario = 0;
        int quantidadeDeFuncionarios = 0;
        for (int i = 1; i <= 4; i++) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Insira sua idade: " + "(Digite 0 para sair)");
            int idade = leitor.nextInt();
            System.out.println("Insira seu sexo: digite 1 para masculino e 2 para feminino ");
            int sexo = leitor.nextInt();
            System.out.println("Insira o seu salário: ");
            double salario = leitor.nextDouble();
            somaSalario += salario;
            if (idade > idadeMaior) {
                idadeMaior = idade;

            }
            if (idade < idadeMenor) {
                idadeMenor = idade;

            }
            if (sexo == 2 && salario >= 4000) {
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
