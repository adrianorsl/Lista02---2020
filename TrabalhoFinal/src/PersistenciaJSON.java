import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class PersistenciaJSON implements Persistencia {

	public void gravar(List<Ocorrencia> l1) throws IOException {
		
		 GsonBuilder builder = new GsonBuilder(); Gson gson = builder.create();
		  FileWriter writer = new FileWriter("json/ocorrencias.json");
		  writer.write(gson.toJson(l1)); writer.close();

			System.out.println(gson.toJson(l1)); builder = new GsonBuilder(); gson =
			builder.create(); BufferedReader bufferedReader = new BufferedReader( new
			FileReader("json/ocorrencias.json"));
			  
			Type listType = new TypeToken<ArrayList<Ocorrencia>>(){}.getType();
			  
			l1 = new ArrayList<Ocorrencia>();
			  
			l1 = new Gson().fromJson(bufferedReader, listType);
			  
			for (Iterator<Ocorrencia> iterator = l1.iterator(); iterator.hasNext();) {
			Ocorrencia especialidade = (Ocorrencia) iterator.next();
			System.out.println(especialidade.toString()); }


	}
}