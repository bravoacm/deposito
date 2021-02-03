import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Adrian Bravo
 *
 *	Set de pruebas
 *
 *	Nomenclaturas:
 *	DN-> getDepositoNivel
 *
 */
public class testDepositoCombustible {

	private double depNivel;
	private DepositoCombustible tank;


	void DepositoCombustible(double tankMax, double tankLevel) {
	       this.depNivel = tankLevel;
	    }
	public double getDepositoNivel(){
	       return depNivel;
	    }
	
	
	@Before
	public void getDN1() {
	 tank = new DepositoCombustible(40.0,0.0);
	}
	@Test
	public void testDN1() {
		if (tank.getDepositoNivel() != 0.0)
			fail();
	}
}
