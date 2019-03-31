package dds.quemepongo.model;

public class Color {

	private int rojo;
	private int verde;
	private int azul;
	
	public Color(int rojo, int verde, int azul) {
		this.setRojo(rojo);
		this.setVerde(verde);
		this.setAzul(azul);
	}

	public int getRojo() {
		return rojo;
	}

	public void setRojo(int rojo) {
		this.rojo = rojo;
	}

	public int getVerde() {
		return verde;
	}

	public void setVerde(int verde) {
		this.verde = verde;
	}

	public int getAzul() {
		return azul;
	}

	public void setAzul(int azul) {
		this.azul = azul;
	}
	
}
