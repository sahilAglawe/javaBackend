package kapilit;

import java.io.IOException;

public class superClass {

	
	void show(int i) throws IOException, Exception {
		if(i == 0)
		{
			throw new IOException("this is a checked exception");
		}
		System.out.println("superClass show");
		System.out.println(i);
	}
}
