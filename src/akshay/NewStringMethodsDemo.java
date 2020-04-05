package akshay;

import java.nio.file.Files;
import java.nio.file.Path;

public class NewStringMethodsDemo {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) throws Exception {
		
		String json = "{\n" + 
		"	\"name\": \"ABC\",\n" +
		"	\"gender\": \"Male\"\n"+
		"}\n";
			
		//Retains the incidental white spaces in the string to match the text block functionality
		System.out.println(json.stripIndent());	
		
		demoTranslateEscape();
		
		demoFormatted();
	}

	@SuppressWarnings("removal")
	private static void demoTranslateEscape() throws Exception {
		
		String line = Files.readString(Path.of("test.txt"));
		
		//Will print {\"name\": \"ABC\",\"gender\": \"Male\"}
		System.out.println(line);
		
		
		//Will print this:{"name": "ABC","gender": "Male"}
		System.out.println(line.translateEscapes());
	}
	
	@SuppressWarnings({ "preview", "removal" })
	private static void demoFormatted() {
		
		String json = """
				{
					"name": %s,
					"gender": %s
				}
				""".formatted("ABC","Male");
		
		/*
		 * Will print this:
		 * {
		 *		"name": ABC,
		 *		"gender": Male
		 *	}		
		 */
		System.out.println(json);
		
	}
}
