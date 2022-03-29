package immobili;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class Reg_Test {
	Reg r=new Reg();
	@Test
	void checktest() {
		assertTrue (r.check("pippo0"));
	}
	
	
	@Test
	void checktest2() {
		assertTrue (r.check("pippo0@"));
	}
		@Test
		void checktest3() {
			assertTrue (r.check("pippo0 "));
		}
		@Test
		void checktest4() {
			assertTrue (r.check("@"));
		}
		@Test
		void checktest5() {
			assertTrue (r.check("pippo$"));
		}


	
}
