
public class ConeMain {

	public static void main(String[] args) {
		
		Cone c1 = new Cone(1);
		c1.setR(6);
		c1.setZ(8);
		System.out.println(c1);
			
		Cone c2 = new Cone(3.5, 2);
		c2.setZ(9);
		System.out.println(c2);
		
		Cone c3 = new Cone(20, 13.9);
		c3.setTinta(2);
		System.out.println(c3);
		
		Cone c4 = new Cone(37.78, 16.53, 3);
		System.out.println(c4);

	}

}
