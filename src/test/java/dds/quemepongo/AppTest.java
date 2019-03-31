package dds.quemepongo;

import org.junit.Test;

import dds.quemepongo.model.Color;
import dds.quemepongo.model.Material;
import dds.quemepongo.model.Prenda;
import dds.quemepongo.model.TipoPrenda;


/**
 * Test de QueMePongo
 */
public class AppTest {
	
	/**
	 * Asegurar que no pueden crearse prendas sin tipo
	 */
	@Test(expected = NullPointerException.class)
	public void whenCreateWithNonTipo() {
		Color colorPrincipal = new Color(13,13,13);
		Prenda prenda = new Prenda(Material.TELA, colorPrincipal, null);
		prenda.getTipo();
	}
	
	/**
	 * Asegurar que no pueden crearse prendas sin material
	 */
	@Test(expected = NullPointerException.class)
	public void whenCreateWithNonMaterial() {
		Color colorPrincipal = new Color(13,13,13);
		Prenda prenda = new Prenda(null, colorPrincipal, TipoPrenda.CAMISA);
		prenda.getMaterial();
	}
	
	/**
	 * Asegurar que no pueden crearse prendas sin color principal
	 */
	@Test(expected = NullPointerException.class)
	public void whenCreateWithNonColor() {
		Prenda prenda = new Prenda(Material.TELA, null, TipoPrenda.CAMISA);
		prenda.getColorPrincipal();
	}
}
