package week5.day2;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

public class DailyQuestion {
 @Test
	public void a()
	{
		System.out.println("a");
	}
	@Test(dependsOnMethods = "c")
	public void b()
	{
		System.out.println("b");
	}
	@Test(dependsOnMethods = "a")
	public void c()
	{
		System.out.println("c");
	}
	@Test
	public void d()
	{
		System.out.println("d");
	}
}
