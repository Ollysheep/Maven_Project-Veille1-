import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestHomer {
		HomerSimpson simpson = new HomerSimpson();
		
		@Test
		public void testbeer() {
			assertEquals("I love Duff !", simpson.drinkBeer());
		}
		
		@Test
		public void testfood() {
			assertEquals("I love donuts !", simpson.eat());
		}

	}
