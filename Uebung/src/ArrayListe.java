import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListe {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();
		
		liste.add(0,"Leibesübung");
		liste.add(1,"Physik");
		liste.add(2,"Musik");
		System.out.println("Meine Lieblingsfächer sind:");
		for(String ausgabe : liste)
		{
			System.out.println(ausgabe);
		}
		
		
		
		
		ArrayList<Integer> lottozahlen = new ArrayList<Integer>();
		
		lottozahlen.add(0,1);
		lottozahlen.add(1,17);
		lottozahlen.add(2,25);
		lottozahlen.add(3,30);
		lottozahlen.add(4,31);
		lottozahlen.add(5,33);
		
		System.out.println(lottozahlen.contains(12));	
		System.out.println(lottozahlen.contains(31));
		System.out.println(lottozahlen.size());
		
		lottozahlen.remove(1);
		for(int ausgabe : lottozahlen)
		{
			System.out.println(ausgabe);
		}
		
		ArrayList<Integer> zahlen = new ArrayList<Integer>();
		
		for(int i = 10; i<=1000; i+=10){
			zahlen.add(i);
		}
		
		for(int ausgabe : zahlen)
		{
			System.out.println(ausgabe);
		}
		
		ListIterator<Integer> li = zahlen.listIterator();
		 
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		
		
		
		
		
		
			
	}

}
