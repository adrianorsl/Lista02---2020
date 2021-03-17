public class Agente extends Pessoa {
	
	private String matricula;
	
	public Agente() {
		super();
	}
	
	public Agente(String nome, String cpf, String matricula) {
		super(nome, cpf);
		setMatricula(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula.length() > 0)
			this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Agente [matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}