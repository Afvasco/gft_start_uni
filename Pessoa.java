//GFT Exercicio 02
//Classe Pessoa

public class Pessoa
{
   private String nome;
   private String ender;
   private String telef;
   
   public Pessoa(String nome, String ender, String telef)
   {
      setNome(nome);
      setEnder(ender);
      setTelef(telef);
   }
   
   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public void setEnder(String ender)
   {
      this.ender = ender;
   }
   
   public void setTelef(String telef)
   {
      this.telef = telef;
   }   
   
   public String getNome()
   {
      return nome;
   }
   

   public String getEnder()
   {
      return ender;
   }
   
 
   public String getTelef()
   {
      return telef;
   }
   
   public void verDados()
   {
      System.out.printf("\nNome     : %s ", getNome());
      System.out.printf("\nEndereco : %s", getEnder());
      System.out.printf("\nTelefone : %s\n", getTelef());
   }

}