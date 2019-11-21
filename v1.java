import java.util.Scanner;
public class v1{
	public static void main(String[] args) {
	    
	    int a[]= new int[10],b[]= new int[10], i=0, j=9,k=0;
	    Scanner leia = new Scanner(System.in);
	    
	    while(i<10){
	        System.out.println("Digite o "+(i+1)+"° valor");
	        a[i]=leia.nextInt();
	        i++;
	    }
	    i=0;
	    
	    while(i<10 && j>0){
	        if(a[i]%2==0){
	            b[k]=a[i];
	            k++;
	        }
	        else if (a[i]%2==1){
	            b[j]=a[i];
	            j--;
	        }
	        i++;
	    }
	    i=1;
	    System.out.println(" Vetor B:");
	    System.out.print(b[0]+"-");
	    while(i<9){
	        System.out.print(b[i]+"-");
	        i++;
	    }
	    System.out.print(b[9]);
	    
	}
}
