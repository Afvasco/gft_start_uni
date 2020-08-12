//GFT Exerc 03

public class ContaPoupanca extends Conta
{
   private double rend;
   
   public ContaPoupanca(int numero, String titular, double saldo)
   {
      super.setNumero(numero);
      super.setTitular(titular);
      super.setSaldo(saldo);
   }
   
   public double rendimento()
   {
      return rend = saldo * 0.05; 
   }
   
   public void imprime()
   {
      System.out.println("Dados da Conta Poupanca");
      super.imprime();
   }
}