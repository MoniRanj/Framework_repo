package pack1;

import org.testng.annotations.Test;

public class contactTest {
@Test
public void createcontactTest()
{
	
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println("execute createcontactTest");
}
@Test
public void modifycontactTest()
{
	System.out.println("Hi");
	System.out.println("execute modifycontactTest");
}
@Test
public void deletecontactTest()
{
	System.out.println("Hi");
	System.out.println("execute deletecontactTest");
	
}
}
