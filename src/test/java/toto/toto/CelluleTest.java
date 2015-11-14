package toto.toto;

import org.junit.Assert;
import org.junit.Test;

public class CelluleTest {

	@Test
	public void doit_mourir_si_moins_de_2() {
		Cellule cellule = new Cellule();

		Assert.assertTrue(cellule.estMorte());
	}

	@Test
	public void doit_vivre_si_2_ou_3() throws Exception {
		Cellule cellule = new Cellule();

		Assert.assertTrue(cellule.estVivante());
	}

	@Test
	public void doit_mourir_si_superieur_3() throws Exception {
		Cellule cellule = new Cellule();

		Assert.assertTrue(cellule.estMorte());
	}

	@Test
	public void doit_revivre_si_egale_3() throws Exception {
		Cellule cellule = new Cellule();

		Assert.assertTrue(cellule.estVivante());
	}

}
