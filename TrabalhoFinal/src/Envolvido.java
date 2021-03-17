public class Envolvido extends Pessoa {

	private String endereco;
	private Relacao rel;

	public Envolvido() {
		super();
	}
	
	public Envolvido(String nome, String cpf, String endereco, Relacao rel) {
		super(nome, cpf);
		setEndereco(endereco);
		setRel(rel);
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() > 0)
			this.endereco = endereco;
	}
	
	public Relacao getRel() {
		return rel;
	}

	public void setRel(Relacao rel) {
		this.rel = rel;
	}
 
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Envolvido [endereco=");
		builder.append(endereco);
		builder.append(", rel=");
		builder.append(rel);
		builder.append("]");
		return builder.toString();
	}
	
	
}
