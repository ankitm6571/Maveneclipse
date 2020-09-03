import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNG {
  @Test
  public void f() {
	  System.out.println("Success");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Beforetrst");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

}
