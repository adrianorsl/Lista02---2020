
public class Main {

	public static void main(String[] args) {
		
		// Quest�o 1
		Pessoa p = new Pessoa("Adriano","Rio do Sul");
		System.out.println(p);
		System.out.println("\n");
			
		//Usar CTRL para verificar qual construtror est� sendo usado
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Adriano Zimmermann");
		pf.setEndereco("Rio do Sul");
		pf.setCpf("11111111111");
		pf.setEstadoCivil("Casado");
		System.out.println(pf);
		System.out.println("\n");
		
		//Usar CTRL para verificar qual construtror est� sendo usado
		PessoaFisica pf2 = new PessoaFisica("Jamile", "Rio do Sul", "22222222222", "Casado");
		System.out.println(pf2);
		System.out.println("\n");
		
		PessoaJuridica pj = new PessoaJuridica("JCK", "Lontras", "01,010,010/0001-40", "Fac��o");
		System.out.println(pj);
		System.out.println("\n");
		
		
		// Quest�o 2
		
		Livro l = new Livro(1, "livro de Fantasia", "Robert");
		System.out.println(l);
		System.out.println("\n");
		
		CD cdAudio = new CD(2, "M�sica", "Universal", 11.35f, 11, "Vera Louca", "O dia de amanh�");
		System.out.println(cdAudio);
		System.out.println("\n");
		
		VHS vhsAudio = new VHS(3, "M�sica", "Universal", 13.40f, "O louco meu");
		System.out.println(vhsAudio);
		System.out.println("\n");
		
		// Quest�o 3
		
		ContaEspecial cEspecial = new ContaEspecial("Caixa Economica Federal", 001, 1010, 10000, 12, 2500);
		System.out.println(cEspecial);
		System.out.println("\n");
		
		ContaSimples cSimples = new ContaSimples("Banco do Brasil", 30, 1515, 15000, 6000);
		System.out.println(cSimples);
	}

}
