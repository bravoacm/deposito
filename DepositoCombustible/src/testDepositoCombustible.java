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
 *	DM-> getDepositoMax
 *
 */
public class testDepositoCombustible {

	private DepositoCombustible tank;
	private double depMax;


	void DepositoCombustible(double tankMax, double tankLevel) {
	       this.depMax   = tankMax;
	    }
	public double getDepositoMax(){
	       return depMax;
	    }
	
	
	@Before
	public void getDN1() {
	 tank = new DepositoCombustible(40.0,0.0);
	}
	@Test
	public void testDN1() {
		if (tank.getDepositoMax() != 40.0)
			fail();
	}
}
