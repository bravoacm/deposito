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

		private double depMax;
	    private double depNivel;
		private DepositoCombustible tank;
		private DepositoCombustible tank2;
		private DepositoCombustible tank3;
		private DepositoCombustible tank4;
		private DepositoCombustible tank5;
		private DepositoCombustible tank6;
		private DepositoCombustible tank7;
		private DepositoCombustible tank8;
		private DepositoCombustible tank9;
		private DepositoCombustible tank10;

		void DepositoCombustible(double tankMax, double tankLevel) {
	       this.depMax   = tankMax;
	       this.depNivel = tankLevel;
	    }
	    public double getDepositoNivel(){
	       return depNivel;
	    }
		public double getDepositoMax(){
	       return depMax;
	    }
	    public boolean estaVacio(){
	      return depNivel == 0;
	    }
	    public boolean estaLleno(){
		  return depNivel == depMax;
	    }
	    public void fill(double amount){
	       depNivel = depNivel + amount;
	    }
		public void consumir(double amount){
	       depNivel = depNivel - amount;
	    }
	
	@Before
	public void getDN1() {
	 tank = new DepositoCombustible(40.0,10.0);
	}
	@Test
	public void testDN1() {
		if (tank.getDepositoNivel() != 10.0)
			fail();
	}
	
	@Before
	public void getDM1() {
	 tank2 = new DepositoCombustible(40.0,0.0);
	}
	@Test
	public void testDM1() {
		if (tank2.getDepositoMax() != 40.0)
			fail();
	}
	
	@Before
	public void getV1() {
	 tank3 = new DepositoCombustible(40.0,0.0);
	}
	@Test
	public void testV1() {
		tank3.fill(25);
		if (tank3.estaVacio() == false)
			fail();
	}
	@Before
	public void getV2() {
	 tank4 = new DepositoCombustible(40.0,0.0);
	}
	@Test
	public void testV2() {
		if (tank4.estaVacio() == false)
			fail();
	}
	
	@Before
	public void getL1() {
	 tank5 = new DepositoCombustible(40.0,0.0);
	}
	@Test
	public void testL1() {
		tank5.fill(40);
		if (tank5.estaLleno() == false)
			fail();
	}
	@Before
	public void getL2() {
	 tank6 = new DepositoCombustible(40.0,0.0);
	}
	@Test
	public void testL2() {
		if (tank6.estaLleno() == false)
			fail();
	}
	
	@Before
	public void getF1() {
	 tank7 = new DepositoCombustible(40.0,0.0);
	}
	@Test
	public void testF1() {
		tank7.fill(20);
		if (tank7.getDepositoNivel() == 0.0)
			fail();
	}
	@Before
	public void getF2() {
	 tank8 = new DepositoCombustible(40.0,0.0);
	}
	@Test
	public void testF2() {
		tank8.fill(-10);
		if (tank8.getDepositoNivel() == 0.0)
			fail();
	}
	@Before
	public void getC1() {
	 tank9 = new DepositoCombustible(40.0,30.0);
	}
	@Test
	public void testC1() {
		tank9.consumir(20);
		if (tank9.getDepositoNivel() == 30.0)
			fail();
	}
	
	@Before
	public void getC2() {
	 tank10 = new DepositoCombustible(40.0,20.0);
	}
	@Test
	public void testC2() {
		tank10.consumir(-10);
		if (tank10.getDepositoNivel() == 20.0)
			fail();
	}
}
