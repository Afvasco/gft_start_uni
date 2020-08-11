
public abstract class Conta
{
   protected int numero;
   protected String titular;
   protected double saldo;
   
   public void setNumero(int numero) throws Exception
   {
      if (numero < 0) 
         throw new Exception ("Numero da conta deve ser informado e ser maior que zero");
      else
         this.numero = numero;
   }
   
   public void setTitular(String titular) throws Exception
   {
      if (titular == "") 
         throw new Exception ("Nome eh obrigatorio");
      else
         this.titular = titular;
   }

   
   public abstract double saldo();
   
   public void imprime()
   {
      System.out.println("Numero Conta : " + numero);
      System.out.printf("Titular : %s\n", titular);
      System.out.printf("Saldo : %.2f\n", saldo());
   }
}