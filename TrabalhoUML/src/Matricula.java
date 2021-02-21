
public class Matricula extends Guarda {

	private double numero;

	public Matricula() {
		super();
	}
	
	public Matricula(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public Matricula(String nome, String cpf, double numero) {
		super(nome, cpf);
		setNumero(numero);
	}
	
	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		if (numero > 0)
			this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Matricula [numero=");
		builder.append(numero);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
