//GFT Exerc 03

public class ContaCorrente extends Conta
{
   private double rend, impCalc;
      
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
   
   public double calcularImposto()
   {
      return impCalc = rend * 0.25; 
   }

   
   public void imprime()
   {
      System.out.println("Dados da Conta Corrente");
      super.imprime();
   }
}