import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.junit.Test;

public class ConectorHttpTest {

	@Test
	public void preguntarGoogleConHttpGet() throws Exception {
		URL url = new URL("http://wwww.google.com");
		URLConnection conexion = url.openConnection();

	//	BufferedReader rd = new BufferedReader(new InputStreamReader(
		//		conexion.getInputStream()));
		
		

	}
}
