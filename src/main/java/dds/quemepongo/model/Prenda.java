package dds.quemepongo.model;

import java.util.Objects;

public class Prenda {
	
	private Material material;
	private Color colorPrincipal;
	private Color colorSecundario;
	private TipoPrenda tipo;
	
	public Prenda(Material material, Color colorPrincipal, TipoPrenda tipo) {
		this.material = Objects.requireNonNull(material, "El material de la prenda es obligatorio");
		this.colorPrincipal = Objects.requireNonNull(colorPrincipal, 
				"El color principal de la prenda es obligatorio");
		this.tipo = Objects.requireNonNull(tipo, "El tipo de la prenda es obligatorio");
	}
	
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Color getColorPrincipal() {
		return colorPrincipal;
	}
	public void setColorPrincipal(Color colorPrincipal) {
		this.colorPrincipal = colorPrincipal;
	}
	public Color getColorSecundario() {
		return colorSecundario;
	}
	public void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	public TipoPrenda getTipo() {
		return tipo;
	}
	public void setTipo(TipoPrenda tipo) {
		this.tipo = tipo;
	}
	
	public Categoria getCategoria() {
		return this.getTipo().getCategoria();
	}
	
}
