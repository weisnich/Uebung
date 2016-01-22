
public class Test {

	public static void main(String[] args) {
		Liste liste = new Liste(3);
		liste.add(5);
		liste.add(7);
		liste.add(234);
		liste.add(789);
		liste.add(1234534);
		liste.add(2365);
		liste.add(75389);
		liste.add(345);
		liste.add(23168234);
		liste.add(563246);
		liste.add(2543);
		System.out.println(liste);
		System.out.println(liste.getGroesse());
	}

}
