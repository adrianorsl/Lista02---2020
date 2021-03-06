
import java.util.Date;
import java.util.Scanner;

public class Paciente extends Pessoa{

	Scanner entrada = new Scanner(System.in);

	private int idade;
	private Date chegada;
	private int t;
	
		
	public Paciente() {
		super();
	}
	
	public Paciente(String nome, String cpf, int idade, Date chegada) {
		super(nome, cpf);
		setIdade(idade);
		setChegada(chegada);
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade >= 0)
			this.idade = idade;
	}
	public Date getChegada() {
		return chegada;
	}
	public void setChegada(Date chegada2) {
		this.chegada = chegada2;
	}
	
	public boolean resposta() {
		System.out.println("Paciente está com hemorragia? 1 - sim // 2 - não");
		if (entrada.nextInt() == 1) {
			System.out.println("Paciente está com hemorragia grave? 1 - sim // 2 - não");
			if (entrada.nextInt() == 1) {
				t = 4;
				return true;
			}else {
				System.out.println("Paciente está inconsciente? 1 - sim // 2 - não");
				if (entrada.nextInt() == 1) {
					t = 4;
					return true;
				}else {
					t = 3;
					return true;
				}
			}
		}else {
			System.out.println("Paciente está acordado? 1 - sim // 2 - não");
			if (entrada.nextInt() == 1) {
				System.out.println("Paciente tem mais de 60 anos? 1 - sim // 2 - não");
				if (entrada.nextInt() == 1) {
					t = 2;
					return true;
				}else {
					System.out.println("Paciente tem menos de 6 anos? 1 - sim // 2 - não");
					if (entrada.nextInt() == 1) {
						t = 2;
						return true;
					}else {
						t = 1;
						return true;
					}
				}
			}else {
				t = 4;		
				return true;
			}
			
		}
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Paciente [idade=");
		builder.append(idade);
		builder.append(", chegada=");
		builder.append(chegada);
		builder.append("]");
		return builder.toString();
	}
	
	

	
	
	
}
