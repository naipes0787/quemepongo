package dds.quemepongo.model;

public enum TipoPrenda {
	
	ZAPATO(Categoria.CALZADO),
	PANTALON(Categoria.PARTE_INFERIOR),
	POLLERA(Categoria.PARTE_INFERIOR),
	REMERA(Categoria.PARTE_SUPERIOR),
	CAMISA(Categoria.PARTE_SUPERIOR);

	private Categoria categoria;
	
	private TipoPrenda(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return this.categoria;
	}
	
}
