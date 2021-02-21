
public class Tipo {

	private int tipo;
	private String descricao;
	
	public Tipo() {
		
	}
	
	public Tipo(int tipo, String descricao) {
		setTipo(tipo);
		setDescricao(descricao);
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		if (tipo > 0)
			this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if (descricao.length() > 0)
			this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tipo [tipo=");
		builder.append(tipo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
