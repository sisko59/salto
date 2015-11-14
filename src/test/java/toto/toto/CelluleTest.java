package toto.toto;

import org.junit.Assert;
import org.junit.Test;

public class CelluleTest {

	@Test
	public void doit_mourir_si_moins_de_2() {
		Cellule cellule = new Cellule();

		Assert.assertTrue(cellule.estMorte());
	}

}
