import java.util.Scanner;
public class v2{
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a[]= new int[5], i=0, j=1;
    while(i<5){
      System.out.println("Digite o "+(i+1)+"° valor do vetor A");
      a[i]=ler.nextInt();
      i++;
    }
    i=0;
    System.out.println("Tabuada:");
    while(i<10){
     	 System.out.println("Tabuada do elemento "+a[i]+":");
     	 while(j<=10){
      		 System.out.println(a[i]+"X"+j+"="+(a[i]*j));
   				 j++;
    	}
    j=1;
    i++;
		}
	}
}
