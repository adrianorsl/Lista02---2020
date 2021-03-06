
public class Medico extends Pessoa {

	private String crm;

	public Medico() {
		super();
	}
	
	public Medico(String nome, String cpf, String crm) {
		super(nome, cpf);
		setCrm(crm);
	}
	
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		if (crm.length() > 0)
			this.crm = crm;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Medico [crm=");
		builder.append(crm);
		builder.append("]");
		return builder.toString();
	}
	
	
}
