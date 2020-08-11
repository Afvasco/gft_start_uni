import java.util.Scanner;

public class GftExerc1{
   public static void main(String args[]){
      Scanner read = new Scanner(System.in);
      
      int inic, fim, n;
      
      System.out.printf("Informe o numero inicial =  ");
      inic = read.nextInt();

      System.out.printf("Informe o numero final =  ");
      fim = read.nextInt();

      n = inic;
      
     do {
         if (n%2 == 1){
            System.out.printf("%d ", n);
         }
         n+=1;
      } while (n <= fim);
      
      System.exit(0);
      
   }
}
