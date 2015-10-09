
public class Fakultaet {
	static double fac(double i){
	return i==0?1:i*fac(i-1);	
	}
	public static void main(String[] args) {
		System.out.println("fac(150) = "+fac(150));
	}

}
