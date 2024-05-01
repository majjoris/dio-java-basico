import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nome_cliente;
        float saldo;
        
        System.out.println("Por favor, digite o nome do cliente !");
        nome_cliente=ler.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        numero=ler.nextInt();

        System.out.println("Por favor, digite qual é a Agência !");
        agencia=ler.next();

        System.out.println("Por favor, digite o saldo da conta !");
        saldo=ler.nextFloat();

        ler.close();

        System.out.println("Olá "+ nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
