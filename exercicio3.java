import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int idade;
        int idadeAux;
        double peso;
        double pesoAux;

        Scanner leitor = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Digite a idade: ");
            idade = leitor.nextInt();
            System.out.println("Digite o peso: ");
            peso = leitor.nextInt();

            idadeAux = idade;
            pesoAux = peso;

            if (peso < pesoAux) {
                idadeAux = idade;
                pesoAux = peso;
            }

            System.out.println("A idade da pessoa mais magra é: " + idadeAux + " Anos");
            System.out.println("O peso dela é: " + pesoAux);
        }
        leitor.close();
    }

}
