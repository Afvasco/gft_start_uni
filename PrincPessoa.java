//GFT Exercicio 02
//Classe Principal Pessoa

import java.util.Scanner;

public class PrincPessoa
{
   public static void main(String args[])
   {
      Scanner dados = new Scanner(System.in);
      
      String nome, ender, telef;
      
      System.out.println("Dados Cadastrais");
      System.out.print("Nome : ");
      nome = dados.nextLine();
      System.out.print("Endereço : ");
      ender = dados.nextLine();
      System.out.print("Telefone : ");
      telef = dados.nextLine();      
      
      Pessoa pess = new Pessoa(nome, ender, telef);
      pess.verDados();                 
           
   }
}
