import java.util.Scanner;
public class v4 {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	 
	int a[] = new int [10];
	int i = 0, n = 0;
	
	for(i=0; i<10; i++) {
		System.out.println("Informe o numero");
		a[i] = ler.nextInt();
		
		for(n = 0; n<=a[i]; n++) {
			if((n%2)==0) {
				
				System.out.println(n);
				
			}
		}
		
		
	}


}
}
