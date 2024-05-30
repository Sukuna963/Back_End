import java.util.Scanner;

/**
* <h1>Conta Teminal</h1>
* O Terminal recebe a entra do usuario e imprimi na tela
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classe
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Leonardo Marques
* @version 1.0
* @since   08/04/2024
*/

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String nome;
        String agencia;
        int numero;
        double saldo = 0.00;

        Scanner scanner = new Scanner(System.in);

        layout();
        System.out.println("Bem Vindo ao Banco DIO");
        layout();

        System.out.println("Digite o seu nome: ");
        nome = scanner.nextLine();
        layout();

        System.out.println("Digite a agencia bancaria: (Obs: Siga esse modelo '000-0')");
        agencia = scanner.nextLine();
        layout();

        System.out.println("Digite o numero da conta: (Obs: Sua conta possui apenas 4 numeros)");
        numero = scanner.nextInt();

        scanner.close();

        layout();
        System.out.println(imprimir(nome, agencia, numero, saldo));
        layout();

    }

    /**
   * Este método é utilizado para definir o layout padrao
   * do banco
   */
    static void layout() {
        System.out.println("*".repeat(30));
    }

    /**
   * Este método é utilizado para imprimir as informacoes passada pelo usuario
   * @param nome este recebe o nome do usuario
   * @param agencia este recebe a agencia que usuario informor com tres numero iniciais depois mais um apos Hífen
   * @param numero este recebe o numero da conta, possuindo apenas quatro numeros
   * @param saldo este inicia-se zerado por padrao pois o usuario acabou de criar a conta
   * @return String retorna as informacoes do usuario, com o padrao de mensagem do banco.
   */
    static String imprimir(String nome, String agencia, int numero, double saldo) {
        return String.format("\nOlá %s, obrigado por criar uma conta em nosso banco, \nsua agência é %s, \nsua conta é %d \nseu saldo %.2f já está disponível para saque"
        ,nome,agencia, numero, saldo);
    }
}