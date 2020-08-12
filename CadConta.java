//GFT Exerc 03

import java.util.Scanner;

public class CadConta
{
   public static void main(String args[])
   {
      Scanner inpN = new Scanner(System.in);
      Scanner inpS = new Scanner(System.in);
   
      int codCta, opc;
      String nmTitular;
      double sldInic;
      
      System.out.println("Cadastro de Contas");
      System.out.print("Tipo da Conta (1 - Conta Corrente  /  2 - Conta Poupanca  : ");
      opc = inpN.nextInt();
      
      if (opc == 1 || opc == 2)
      {
         System.out.print("Numero da Conta        : ");
         codCta = inpN.nextInt();
         System.out.print("Nome do Titular        : ");
         nmTitular = inpS.nextLine();
         System.out.print("Saldo Inicial da Conta : ");
         sldInic = inpN.nextDouble();
         
         if (opc == 1)
         {
            ContaCorrente cc = new ContaCorrente(codCta, nmTitular, sldInic);
            cc.imprime();
         }
         else
         {
            ContaPoupanca cp = new ContaPoupanca(codCta, nmTitular, sldInic);
            cp.imprime();
         }
      }
            
   }
   
}