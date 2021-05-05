package interfaces;

public class FileLoger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Dosyaya loglandý : "+message );
	}
	
}
