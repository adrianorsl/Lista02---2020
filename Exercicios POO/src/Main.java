
/**
 * @author Adriano Zimmermann
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Piramite novo = new Piramite();
		
		novo.setBase(10);
		novo.setAltura(10);
		novo.setTinta(3);
				
		System.out.println("ab: " + novo.getBase());
		System.out.println("h: " + novo.getAltura());
		System.out.println("a1: " + novo.apot());
		System.out.println("�rea do Tri�ngulo: " + novo.areaFace());
		System.out.println("�rea Base: " + novo.areaBase());
		System.out.println("�rea Total: " + novo.areaPiramite());
		System.out.println("Tipo da Tinta: " + novo.getTinta());
		System.out.println("Litros: " + novo.litros());
		System.out.println("Latas: " + novo.latas());
		System.out.println("Pre�o: " + novo.preco());
		System.out.println("Volume: " + novo.volume());
		 

	
	}

}
