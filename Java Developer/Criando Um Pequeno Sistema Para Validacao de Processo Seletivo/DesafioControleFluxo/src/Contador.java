import java.util.Scanner;

/**
* <h1>Contador</h1>
* O Contador recebe a entrada do usuario e imprimi na tela
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classe
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Leonardo Marques
* @version 1.0
* @since   10/04/2024
*/
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int segundoNumero = scanner.nextInt();

        scanner.close();

        System.out.println("-----------");
        try{

            contar(primeiroNumero, segundoNumero);

        } catch(ParametrosInvalidosException exception) {
            
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }
    }

     /**
   * Este método é utilizado para imprimir a logica de negocio com as informacoes passada pelo usuario,
   * devendo o segundo parametro sempre ser maior que o primeiro, senao e lancado uma Exception
   * @param primeiroNumero este recebe o primeiro numero informado pelo usuario
   * @param segundoNumero este recebe o segundo numero passado pelo usuario
   */
    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{

        if(primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException();
        }

        int quantidadeInteracoes = segundoNumero - primeiroNumero;

        for(int i=1; i<=quantidadeInteracoes; i++) {
            System.out.print(i + " ");
        }
    }
}
