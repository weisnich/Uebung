public class Fibonacci {

	public static void main(String[] args) {
long zahl1 = 1,zahl2 = 1,i=0;
while(i<=50){
	if(i%2==0){
		System.out.println(zahl1);
		zahl1+=zahl2;
				}
	else{System.out.println(zahl2);
		zahl2+=zahl1;
		}	
		i++;
		}	
	}
}