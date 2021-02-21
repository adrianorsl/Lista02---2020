
public class Main {

	public static void main(String[] args) {
		
		Matricula m1 = new Matricula("Adriano", "11111111111", 55555);
		Matricula m2 = new Matricula("Robson ", "66666666666", 22222);
		
		Viatura v = new Viatura(250, "QHX2525");
		v.addMatricula(m1);
		v.addMatricula(m2);
		v.addOcorrencia("Av. Oscar Barcelos");
		v.addOcorrencia("Al. Aristiliano Ramos");
		System.out.println(v);
		
		Tipo t1 = new Tipo();
		t1.setTipo(1);
		t1.setDescricao("furto");
	
		Tipo t2 = new Tipo();
		t2.setTipo(3);
		t2.setDescricao("Acidente de Trânsito");
	
		Ocorrencia o1 = new Ocorrencia();
		o1.setEndereco("Av. Oscar Barcelos");
		o1.tipificacao(t1);
		
		Ocorrencia o2 = new Ocorrencia();
		o2.setEndereco("Al. Aristiliano Ramos");
		o2.tipificacao(t2);
		
		
		
	}

}
