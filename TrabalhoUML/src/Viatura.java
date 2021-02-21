import java.util.ArrayList;
import java.util.List;

public class Viatura {

	private int numero;
	private String placa;
	
	List<Matricula> lMatricula = new ArrayList<Matricula>(5);
	
	public boolean addMatricula(Matricula matricula) {
		return lMatricula.add(matricula);
	}
	
	List<Ocorrencia> lOcorrencia = new ArrayList<Ocorrencia>();
	
	public boolean addOcorrencia(String endereco) {
		Ocorrencia o = new Ocorrencia(endereco);
		return lOcorrencia.add(o);
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
		if (placa.length() == 7 )
			this.placa = placa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Viatura [Numero=");
		builder.append(numero);
		builder.append(", Placa=");
		builder.append(placa);
		builder.append("]");
		for (Matricula matricula : lMatricula) {
			builder.append(matricula.toString());
		}
		for (Ocorrencia ocorrencia : lOcorrencia) {
			builder.append(ocorrencia.toString());
		}
		return builder.toString();
	}
	
	
	
	
	
}
