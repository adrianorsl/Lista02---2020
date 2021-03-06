import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Scanner entrada = new Scanner(System.in);
		int op=0;
		
		
		FilaDeEspera f = new FilaDeEspera();
		f.medico("Jamile", "00500500500", "12535");
		
		while (op != 4) {
			System.out.println("Menu de opções");
			System.out.println("1 - Inserir pacientes");
			System.out.println("2 - Mostrar fila de espera");
			System.out.println("3 - Remover paciente da fila");
			System.out.println("4 - Sair");
			op = entrada.nextInt();
			
			
			
			if (op == 1) {
	
				Paciente p1 = new Paciente("Carlos", "11111111111", 36, sdf.parse("15/01/2020 08:00:00"));
				Paciente p2 = new Paciente("Julia", "12121212121", 55, sdf.parse("15/01/2020 08:05:10"));
				Paciente p3 = new Paciente("João", "12312312312", 22, sdf.parse("15/01/2020 08:09:55"));
				Paciente p4 = new Paciente("Matheus", "22222222222", 13, sdf.parse("15/01/2020 08:12:38"));
				Paciente p5 = new Paciente("Lucas", "33333333333", 39, sdf.parse("15/01/2020 08:15:00"));
				Paciente p6 = new Paciente("Teodoro", "23123123123", 75, sdf.parse("15/01/2020 08:17:10"));
				Paciente p7 = new Paciente("Roger", "44444444444", 17, sdf.parse("15/01/2020 08:45:65"));
				Paciente p8 = new Paciente("Maria", "22222222222", 28, sdf.parse("15/01/2020 08:56:22"));
				Paciente p9 = new Paciente("Juliana", "43214321432", 21, sdf.parse("15/01/2020 09:01:08"));
				Paciente p10 = new Paciente("Roberto", "55555555555", 68, sdf.parse("15/01/2020 09:05:11"));
				Paciente p11 = new Paciente("Roberta", "54321543211", 1, sdf.parse("15/01/2020 09:09:17"));
				Paciente p12 = new Paciente("Mauricio", "66666666666", 44, sdf.parse("15/01/2020 09:12:38"));
				Paciente p13 = new Paciente("Antonio", "65656565656", 33, sdf.parse("15/01/2020 09:15:00"));
				Paciente p14 = new Paciente("Antenor", "54545454545", 92, sdf.parse("15/01/2020 09:17:10"));
				Paciente p15 = new Paciente("Lucimeri", "45454545454", 12, sdf.parse("15/01/2020 09:45:65"));
				Paciente p16 = new Paciente("Graziela", "88888888888", 31, sdf.parse("15/01/2020 09:56:22"));
				Paciente p17 = new Paciente("Claudionir", "99999999999", 45, sdf.parse("15/01/2020 10:01:08"));
				Paciente p18 = new Paciente("Leticia", "85858585858", 53, sdf.parse("15/01/2020 10:05:11"));
				Paciente p19 = new Paciente("Sara", "95959595959", 5, sdf.parse("15/01/2020 10:09:17"));
				Paciente p20 = new Paciente("Jose", "77777777777", 48, sdf.parse("15/01/2020 10:12:38"));
				
				
				f.setProntoSocorro("Regional");
				System.out.println("p1");
				f.addPaciente(p1);
				System.out.println("p2");
				f.addPaciente(p2);
				System.out.println("p3");
				f.addPaciente(p3);
				System.out.println("p4");
				f.addPaciente(p4);
				System.out.println("p5");
				f.addPaciente(p5);
				System.out.println("p6");
				f.addPaciente(p6);
				System.out.println("p7");
				f.addPaciente(p7);
				System.out.println("p8");
				f.addPaciente(p8);
				System.out.println("p9");
				f.addPaciente(p9);
				System.out.println("p10");
				f.addPaciente(p10);
				System.out.println("p11");
				f.addPaciente(p11);
				System.out.println("p12");
				f.addPaciente(p12);
				System.out.println("p13");
				f.addPaciente(p13);
				System.out.println("p14");
				f.addPaciente(p14);
				System.out.println("p15");
				f.addPaciente(p15);
				System.out.println("p16");
				f.addPaciente(p16);
				System.out.println("p17");
				f.addPaciente(p17);
				System.out.println("p18");
				f.addPaciente(p18);
				System.out.println("p19");
				f.addPaciente(p19);
				System.out.println("p20");
				f.addPaciente(p20);
				f.Mostrar();
			}
			
			if (op == 2) {
				System.out.println(f);
			}
			
			if (op == 3) {
				f.Remove();
				System.out.println(f);
			}
		}
		entrada.close();
	}

}
