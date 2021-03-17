import java.util.ArrayList;
import java.util.List;

public class Ocorrencia {

	private String enderecoOco;
	private Tipo tip;

	List<Viatura> lViatura = new ArrayList<Viatura>();
	List<Envolvido> lEnvolvido = new ArrayList<Envolvido>();
	
	public List<Viatura> getlViatura() {
		return lViatura;
	}

	public void setlViatura(List<Viatura> lViatura) {
		this.lViatura = lViatura;
	}

	public List<Envolvido> getlEnvolvido() {
		return lEnvolvido;
	}

	public void setlEnvolvido(List<Envolvido> lEnvolvido) {
		this.lEnvolvido = lEnvolvido;
	}

	
	public boolean addViatura(Viatura viatura) {
		return lViatura.add(viatura);
	}
	
	
	public boolean addEnvolvido(Envolvido envolvido) {
		return lEnvolvido.add(envolvido);
	}
	
	public Ocorrencia() {
		
	}
	
	public Ocorrencia(String enderecoOco, Tipo tip) {
		setEnderecoOco(enderecoOco);
		setTip(tip);
	}
	
	public String getEnderecoOco() {
		return enderecoOco;
	}

	public void setEnderecoOco(String enderecoOco) {
		if (enderecoOco.length() > 0)
			this.enderecoOco = enderecoOco;
	}
	
	public Tipo getTip() {
		return tip;
	}

	public void setTip(Tipo tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ocorrencia [enderecoOco=");
		builder.append(enderecoOco);
		builder.append(", tip=");
		builder.append(tip);
		for (Viatura viatura : lViatura) {
			builder.append(viatura.toString());
		}
		for (Envolvido envolvido : lEnvolvido) {
			builder.append(envolvido.toString());
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
