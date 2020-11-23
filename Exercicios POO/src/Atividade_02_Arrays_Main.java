import java.util.Random;
import java.util.Scanner;

public class Atividade_02_Arrays_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int con = 0;
		boolean repetir;
		int valor = 0;
		int maior = 0;
		int menor = 5001;
		long soma = 0;
		int aux = 0;
		int aux_2 = 0;
		int moda = 0;
		int moda_2 = 0;
		float mediana = 0;
		float varianca = 0;
		double desvio_padrao = 0;
		boolean primo;
		int conta_2 = 0;
		Random generator = new Random();
		
		
		do {
			System.out.println("Digite a quantidade de números");
			valor = sc.nextInt();
			
		do {
			
			if (valor <= 0 || valor >= 5000) {
				System.out.println("Número inválido");	
			}
		}while(valor <= 0 || valor >= 5000);	
		
		int vet[] = new int [valor]; 
		int vet_par[] = new int[valor];
		int vet_impar[] = new int[valor];
		System.out.println("Números: " + valor);
		
		// maior e menor número
		for (int x = 0; x < valor; x++) {
			vet[x] = generator.nextInt(valor);
			System.out.println(vet[x]);
			aux = vet[x];
			if(aux > maior ) {
				maior = aux;
			}
			
			if (aux < menor) {
				menor = aux;
			}			
		}
	    //
		
		// Verificar pares e ímpares
		for (int y = 0; y < valor; y++) {
			aux = vet[y];
			if (aux % 2 == 0) {
				vet_par[y] = aux;	
			}
			if (vet_par[y] != 0) {
				System.out.println("Números pares: " + vet_par[y]);
			}	
		}
		for (int i = 0; i < valor; i++) {
			aux = vet[i];
			if(aux % 2 != 0) {
				vet_impar[i] = aux;	
			}
			if (vet_impar[i] != 0) {
				System.out.println("Números ímpares: " + vet_impar[i]);
			}	
		}
		//
		
		// soma e media
		for (int s = 0; s < valor; s ++) {
			aux = vet[s];
			soma = soma + vet[s];			
		}
		float media = 0;
		media = soma / valor;
		for (int m = 0; m < valor; m ++) {
			int conta = 1;	
			aux = vet[m];
			for(int b = 0; b < valor; b ++) {
				aux_2 = vet[b];
				if (aux == aux_2) {
					conta++;	
				}	
			}
			//
			
			// moda
			if (conta > conta_2) {
				conta_2 = conta;
				moda = vet[m];
			} 
			if (conta_2 == conta) {
				moda_2 = moda;
				moda = vet[m];
			}
		}
		//
		
		// colocar em seguência
		int l = 0;
		for (int w = 0; w < valor; w++) {	
			for(l = 1; l < valor ; l++) {
				if(vet[l - 1] < vet[l]) {
					aux = vet[l - 1];
					vet[l - 1] = vet[l];
					vet[l] = aux;
				}
			}	
		}
		//
		// calcular a mediana
		for(int seguencia = 0; seguencia < valor; seguencia++) {
			System.out.println("Seguencia: " + vet[seguencia]);
			if (vet.length % 2 == 0) {
				for(int med = 0; med < valor / 2 + 1; med++) {
					mediana = aux; 
					aux = vet[med];
				}
				mediana = (mediana + aux) / 2;
			}else {
				for (int med = 0; med < valor / 2 + 1; med++) {
					mediana = vet[med];
				}
			}
		}
		//
		// calcular a variança
		for(int q = 0; q < valor; q++) {
			aux = (int) ((int) (vet[q] - media) * (vet[q] - media));
			varianca = varianca + aux;
			
		}
		//
		// calcular o desvio padrão
		desvio_padrao = (varianca / valor);
		//
		// calcular os Primos
				for (int v = 0; v < valor; v++) {
						primo = true;
						if ((vet[v] == 0) || (vet[v] == 1)) {
							primo = false;
						}
						for(int pr = 2; pr < vet[v] - 1; pr++ ) {
							if(vet[v] % pr == 0) {
								primo = false;
								break;
							}
						}
						if(primo == true) {
							System.out.println("Número primo: " + vet[v]);
						}
					}
		//
		
		System.out.println("Maior número é: " + maior);
	    System.out.println("Menor número é: " + menor);
	    
		if ( conta_2 == 0) {
			System.out.println("sem moda");
		}
		if (moda == moda_2) {
			System.out.println("Moda: " + moda);
		}else {
			System.out.println("Bimodal: " + moda + ", " + moda_2);
		}
		
		System.out.println("Mediana: " + mediana);
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		System.out.println("Variança : " + varianca / valor);
		System.out.println("Desvio Padrão: " + Math.sqrt(desvio_padrao));
		
		do {
			System.out.println("Deseja continuar a consulta?");
			System.out.println("Se SIM digite 1");
			System.out.println("Se Não digite 2");
			con = sc.nextInt();
			if (con == 1) {
				repetir = true;
			}else {
				repetir = false;
			}
		}while ((con != 1) && (con != 2));
		
		
		}while(repetir == true);
		
		sc.close();
		}
		
	}


