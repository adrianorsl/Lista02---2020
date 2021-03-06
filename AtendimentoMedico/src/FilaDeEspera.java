import java.util.ArrayList;
import java.util.List;

public class FilaDeEspera {

	private String hospital;
	private int x;
	
	

	public boolean medico(String nome, String cpf, String crm) {
		Medico m = new Medico(nome, cpf, crm);
		System.out.println(m);
		return true;
	}
	
	Paciente c = new Paciente();
	private List<Paciente> lpacienteEmergencia = new ArrayList<Paciente>();
	private List<Paciente> lpacienteUrgente = new ArrayList<Paciente>();
	private List<Paciente> lpacientePoucoUrgente = new ArrayList<Paciente>();
	private List<Paciente> lpacienteNaoUrgente = new ArrayList<Paciente>();
	private List<Paciente> lpacienteResultado = new ArrayList<Paciente>();
	private List<Paciente> lpaciente = new ArrayList<Paciente>();
	
	
	public boolean addPaciente(Paciente paciente) {
		c.resposta();
		x = c.getT();
		if (x == 4) {
			lpacienteEmergencia.add(paciente);
			return true;
		}else if (x == 3){
			lpacienteUrgente.add(paciente);
			return true;
		}else if (x == 2) {
			lpacientePoucoUrgente.add(paciente);
			return true;
		}else {
			lpacienteNaoUrgente.add(paciente);
			return  true;
		}
		
	}
	
	public boolean Mostrar() {
		lpacienteResultado.addAll(lpacienteEmergencia);
		lpacienteResultado.addAll(lpacienteUrgente);
		lpacienteResultado.addAll(lpacientePoucoUrgente);
		lpacienteResultado.addAll(lpacienteNaoUrgente);
		return true;
	}
	
	public boolean Remove() {
		lpaciente.add(lpacienteResultado.get(0));
		lpacienteResultado.remove(0);
		return true;
	}
	
	public String getHospital() {
		return hospital;
	}

	public void setProntoSocorro(String hospital) {
		if (hospital.length() > 0)
			this.hospital = hospital;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FilaDeEspera [Hospital=");
		builder.append(hospital);
		builder.append("]");
		for (Paciente paciente : lpacienteResultado) {
			builder.append(paciente.toString());
		}
		builder.append("Atendidos=");
		for (Paciente paciente : lpaciente) {
			builder.append(paciente.toString());
		}
		return builder.toString();
	}
	
	
}
