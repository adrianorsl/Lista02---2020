
public class Ocorrencia {

	private String endereco;
	
	public Ocorrencia() {
		
	}
	
	public Ocorrencia(String endereco) {
		setEndereco(endereco);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() > 0)
			this.endereco = endereco;
	}
	
	public void tipificacao(Tipo tipo) {
		System.out.println(tipo.toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ocorrencia [Endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
