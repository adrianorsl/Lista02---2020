
public class Cone {

	private float z;
	private float r;
    private int tinta;
    private float pi = (float) 3.14;
    
    public Cone(float r, float z) {
    	setR(r);
    	setZ(z);
    }
    
    public Cone(float r, int tinta) {
    	setR(r);
    	setTinta(tinta);
    }
    
    public Cone( int tinta) {
    	setTinta(tinta);
    }
    
    
    public Cone(float r, float z, int tinta) {
    	setR(r);
    	setZ(z);
    	setTinta(tinta);
    }
    
    
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		if (z > 0) {
			this.z = z;
		}
	}
	public float getR() {
		return r;
	}
	public void setR(float r) {
		if (r > 0) {
		    this.r = r;
		}
	}
	public int getTinta() {
		return tinta;
	}
	public void setTinta(int tinta) {
		if (tinta > 0 && tinta < 4) {
		    this.tinta = tinta;
		}
	}
	
	public double geratriz() {
		double g = r * r + z * z;
		return Math.sqrt(g);
	}
	
	public double areaDoCirculo() {
		return pi * (r * r);
	}
	
	public double areaLateralDoCone() {
		double g = r * r + z * z;
		return pi * r * Math.sqrt(g);
	}
	
	public double areaTotalDoCone() {
		double g = r * r + z * z;
		g = Math.sqrt(g);
		return  (pi * r * (r + g));
	}
	
	public double litros() {
		return areaTotalDoCone() * 3.45;
	}
	
	public int latas() {
		return (int) ((litros() / 18) + 1);
	}
	
	public float precoTotal() {
		if( tinta == 1) {
			return (float) (latas() * 238.90);
		}else if (tinta == 2) {
			return (float) (latas() * 467.98);
		}else {
			return (float) (latas() * 758.34);
		} 
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [R=");
		builder.append(r);
		builder.append(", Z=");
		builder.append(z);
		builder.append(", tinta=");
		builder.append(tinta);
		builder.append(", geratriz()=");
		builder.append(geratriz());
		builder.append(", areaDoCirculo()=");
		builder.append(areaDoCirculo());
		builder.append(", areaLateralDoCone()=");
		builder.append(areaLateralDoCone());
		builder.append(", areaTotalDoCone()=");
		builder.append(areaTotalDoCone());
		builder.append(", litros()=");
		builder.append(litros());
		builder.append(", latas()=");
		builder.append(latas());
		builder.append(", precoTotal()=");
		builder.append(precoTotal());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
