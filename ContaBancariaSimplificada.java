package model;

public class ContaBancariaSimplificada {

    String nomeDoCorentista;
    double saldo;
    boolean contaEspecial;

     public void abreContaSimpes(String nome){
        nomeDoCorentista = nome;
        saldo = 0.0;
        contaEspecial = false;
    }

    public void depositar(double valor){
         saldo += valor;
    }

    public boolean retirada(double valor){
         if(!contaEspecial){
             if(valor <= saldo){
                 saldo -= valor;
                 return true;
             }else return false;
         }else {
             saldo -= valor;
             return true;
         }
    }

    public void mostarDados(){
         System.out.println("O nome do correntista é: ");
         System.out.println(nomeDoCorentista);
        System.out.println("O saldo é: ");
        System.out.println(saldo);
         if(contaEspecial){
             if(saldo < 0){
                 System.out.println("Alerta! saldo negativo");
             }
             System.out.println("Conta é especial");
         }else {
             System.out.println("conta é comum");
         }
    }

}
