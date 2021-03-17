import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.Document;
import javax.swing.text.html.parser.Element;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		
		// Criando uma lista de ocorrencias
		List<Ocorrencia> l1 = new ArrayList<Ocorrencia>();
		
		//Criando agentes
		Agente a1 = new Agente("Adriano", "11111111111", "353535");
		Agente a2 = new Agente("Leonardo", "22222222222", "010101");
		Agente a3 = new Agente("Lucimeri", "33333333333", "020202");
		
		// Criando uma viatura
		Viatura v1 =  new Viatura(525, "QHX2525");
		v1.addAgente(a1);
		v1.addAgente(a2);
		v1.addAgente(a3);
		
		// Criando Envolvidos
		Envolvido e1 = new Envolvido("Leticia", "35735725801", "Al.aristiliano Ramos n5214", Relacao.Vítima);
		Envolvido e2 = new Envolvido("Marcos", "52152152147", "Rua Guanabara n741", Relacao.Autor);
		Envolvido e3 = new Envolvido("Lucio", "41235895410", "Beco Esperança s/n ", Relacao.Solicitante);
		
		// Criando as ocorrencias e adicionando Envolvidos e adicionando viatura
		Ocorrencia o1 = new Ocorrencia("Rua Carlos Gomes n34", Tipo.Roubo);
		o1.addEnvolvido(e1);
		o1.addEnvolvido(e2);
		o1.addViatura(v1);
		l1.add(o1);
		Ocorrencia o2 = new Ocorrencia("Rua 7 de maio n59", Tipo.Acidente);
		o2.addEnvolvido(e3);
		o2.addViatura(v1);
		l1.add(o2);
		
		// json
		final PersistenciaJSON json = new PersistenciaJSON();
		json.gravar(l1);
		
		
		
		  
		 
	}


}
