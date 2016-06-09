import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class fileTest {


	public static void main(String[] argv) throws IOException
	{
		File file = new File("/Users/lqy/Desktop/dblp.plain");
		String line ="";
		BufferedReader reader = new BufferedReader(new FileReader(file));
		ArrayList<String> test =new ArrayList<String>();
		
		while ((line = reader.readLine())!=null)
		{
			test.add(line.trim());
		}
		
		System.out.println("The file has "+test.size()+"items");
		
	}
}
