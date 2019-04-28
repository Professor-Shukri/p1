package p1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tester {
@Test
public void AddMethodReturnsAddition() {
	Class1 tester=new Class1();
	assertEquals(0,tester.add(0, 0),"0+0 must equal zero");
}
}
