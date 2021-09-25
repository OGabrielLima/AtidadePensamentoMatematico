package FormasGeometricas;

/**
 * @author Gabriel Lima
 *
 */
public class Circulo {
	private float raio;
	private float perimetro;
	private float area;
	
	public Circulo(float raio) {
		this.raio = raio;
	}
	
	public float calculaPerimetro() {
		perimetro = (float) (2 * Math.PI * raio);
		return perimetro;
	}
	
	public float calculaArea() {
		area = (float) (Math.PI *  (raio*raio));
		return area;
	}
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	
}
