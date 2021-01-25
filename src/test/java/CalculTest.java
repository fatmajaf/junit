import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
	Calcul calcul = new Calcul();

	@Test
	public void testCalculSomme() {

		Assert.assertEquals(25, calcul.calculerSom(10, 15));
	}

	@Test
	public void testCalculDiff() {

		Assert.assertEquals(30, calcul.calculerDiff(40, 10));
	
	}

}
