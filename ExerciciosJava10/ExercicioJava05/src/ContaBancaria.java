//NOME:DANIEL ANDRADE LOPES 
//RA:1261946795
         public class ContaBancaria {
         String titular;
         String NumeroConta;
         double saldo;

         void depositar(double valor){
            if(valor<=0){
             System.out.println("valor invalido para deposito.");
             return;
        }
          saldo += valor;
          System.out.println("Deposito de real"+valor+"realizado");
        }

         void sacar(double valor){
            if(valor<=0){
             System.out.println("valor de saque invalido.");
            return;
        }
            if (valor>saldo ) {
             System.out.println("seu saldo e insuficiente para saque!"+saldo);
             return;
         
        }
          saldo-=valor;
          System.out.println("saque de:"+valor+"saque realizado!");
        }   
         void exibirExtrato(){
         System.out.println("====== Extrato ======");
         System.out.println("Titular: " + titular);
         System.out.println("Conta: " + NumeroConta);
         System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
         System.out.println("=====================");
        }    

    }

