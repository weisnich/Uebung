
public class testVertex {
	public static void main(String[] args) {
		Vertex v1 = new Vertex(42,53);
		Vertex v2 = new Vertex(32,4);
		System.out.println(v1.distance(v2));
		v2.normalize();
		System.out.println(v1.toString());
		System.out.println(v1.length());  
	}
}
