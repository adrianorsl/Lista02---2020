/**
 * @author Adriano Zimmermann
 *
 */
public class Piramite {

	private double altura;
	private double base;
	private int tinta;
	private double apotema;
	private double areaFace;
	private double areaTotalFace;
	private double areaBase;
	private double areaPiramite;
	private double volume;
	private double litros;
	private int latas;
	
	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		}
	}
	
	public double getBase() {
		return base;
	}
	
	public void setTinta(int tinta) {
		if ((tinta > 0) && (tinta < 4)) {
			this.tinta = tinta;
		}
	}
	
	public int getTinta() {
		return tinta;
	}
	
	public double apot() {
		apotema = (base ) * (base ) + (altura * altura);
		apotema = Math.sqrt(apotema);
		  return apotema;
	}
	
	public double areaFace() {
		areaFace = (apotema * base);
		  return areaFace;
	}
	
	public double areaBase() {
		areaBase = (base * base) * 4;
		  return areaBase;
	}
	
	public double areaPiramite() {
		areaTotalFace = areaFace * 4;
		areaPiramite = areaBase + areaTotalFace;
		  return areaPiramite;
	}
	
	public double volume() {
		double div = 1;
		volume = (areaBase * altura) * (div / 3)  ;
		  return volume;
	}
	
	public double litros() {
		litros = areaPiramite / 4.76;
		  return litros;
	}
	
	public int latas() {
		if (litros % 18 == 0) {
			latas = (int) (litros / 18);
			return latas;
		}else {
			latas = (int) (litros / 18) + 1;
			return latas;
		}
	}
	
	public float preco() {
		if (tinta == 1) {
			return (float) (latas * 127.90);
		}else if (tinta == 2) {
			return (float) (latas * 258.98);
		}else {
			return (float) (latas * 344.34);
		}
	}
	
	
	
}
