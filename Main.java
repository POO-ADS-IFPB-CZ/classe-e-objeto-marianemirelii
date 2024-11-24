package view;


import model.ContaBancariaSimplificada;

public class Main {

    public static boolean transfere(ContaBancariaSimplificada origem, ContaBancariaSimplificada destino, double valor) {
        if (origem.retirada(valor)) {
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada();
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada();

        conta1.abreContaSimpes("João");
        conta2.abreContaSimpes("Maria");

        conta1.depositar(500.0);
        conta2.depositar(200.0);

        System.out.println("Antes da transferência:");
        conta1.mostarDados();
        conta2.mostarDados();

        if (transfere(conta1, conta2, 150.0)) {
            System.out.println("\nTransferência realizada com sucesso!");
        } else {
            System.out.println("\nTransferência falhou (saldo insuficiente).");
        }

        System.out.println("\nDepois da transferência:");
        conta1.mostarDados();
        conta2.mostarDados();
    }
}