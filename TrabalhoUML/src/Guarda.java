
public class Guarda {

	private String nome;
	private String cpf;
	
	public Guarda() {
		
	}
	
	public Guarda(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome.length() > 0)
			this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (cpf.length() == 11)
			this.cpf = cpf;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Guarda [Nome=");
		builder.append(nome);
		builder.append(", CPF=");
		builder.append(cpf);
		builder.append("]");
		return builder.toString();
	}
}
