//GFT Exerc 03

public class ContaCorrente extends Conta
{
   private double rend = 0;
      
   public ContaCorrente(int numero, String titular, double saldo)
   {
      super.setNumero(numero);
      super.setTitular(titular);
      super.setSaldo(saldo);
   }
   
   public double rendimento()
   {
      return rend = saldo * 0.03; 
   }
   
   public void imprime()
   {
      System.out.println("Dados da Conta Corrente");
      super.imprime();
   }
}