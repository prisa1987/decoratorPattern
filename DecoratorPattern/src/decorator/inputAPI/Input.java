package decorator.inputAPI;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStream instream = new FileInputStream( "filename" );
		InputStreamReader reader = new InputStreamReader( instream );
		BufferedReader bufferReader = new BufferedReader( reader );
		String line = bufferReader.readLine( );
		System.out.println(line);
	}

}
