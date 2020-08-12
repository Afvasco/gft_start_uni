//GFT Exerc 03


public abstract class Conta
{
   protected int numero;
   protected String titular;
   protected double saldo;
   
   public void setNumero(int numero)
   {
      if (numero < 0) 
         System.out.println("Numero da conta deve ser informado e ser maior que zero");
      else
         this.numero = numero;
   }
   
   public void setTitular(String titular)
   {
      if (titular == "") 
         System.out.println("Nome eh obrigatorio");
      else
         this.titular = titular;
   }

   public void setSaldo(double saldo)
   {
      if (saldo <= 0) 
         System.out.println("Saldo devedor, nao permitido");
      else
         this.saldo = saldo;
   }

   
   public abstract double rendimento();
   
   public void imprime()
   {
      System.out.println("Numero Conta : " + numero);
      System.out.printf("Titular : %s\n", titular);
      System.out.printf("Saldo : %.2f\n", saldo);
      System.out.printf("Rendimento : %.2f\n", rendimento());
   }
}