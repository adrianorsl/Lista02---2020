import java.util.ArrayList;
import java.util.List;

public class Viatura {

	private int numero;
	private String placa;
	
	List<Agente> lAgente = new ArrayList<Agente>(5);
	
	public boolean addAgente(Agente agente) {
		return lAgente.add(agente);
	}
	
	public Viatura() {
		
	}
	
	public Viatura(int numero, String placa) {
		setNumero(numero);
		setPlaca(placa);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0)
			this.numero = numero;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if (placa.length() == 7)
			this.placa = placa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Viatura [numero=");
		builder.append(numero);
		builder.append(", placa=");
		builder.append(placa);
		for (Agente agente : lAgente) {
			builder.append(agente.toString());
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
