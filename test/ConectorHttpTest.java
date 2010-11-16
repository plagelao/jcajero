import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

public class ConectorHttpTest {

	@Test
	public void preguntarGoogleConHttpGet() throws Exception {
		URL url = new URL("http://209.85.229.104");
		URLConnection conexion = url.openConnection();

		BufferedReader rd = new BufferedReader(new InputStreamReader(
				conexion.getInputStream()));

		String respuesta = "";
		String line;
		while ((line = rd.readLine()) != null) {
			respuesta += line;
		}
		System.out.println("devuelve: " + respuesta);
	}
}
