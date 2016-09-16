package pnshsh.spring;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

public class MavenPropertiesTest {

	@Value("${system.name}")
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Test
	public void testName(){
		System.out.println(name);
	}
	
}
