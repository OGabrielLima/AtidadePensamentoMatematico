package FormasGeometricas;

public class Retangulo {
	private float ladoA;
	private float ladoB;
	private float perimetro;
	private float area;
	
	
	public Retangulo(float ladoA, float ladoB){
		this.ladoA= ladoA;
		this.ladoB= ladoB;
				
	}
	
	public Retangulo(float ladoA) {
		this.ladoA = ladoA;
		this.ladoB = ladoA;
	}
	
	public float calculaPerimetro() {
		perimetro = ladoA+ladoB;
		return perimetro;
	}
	
	public float calculaArea() {
		area = ladoA*ladoB;
		return area;
	}

	public String desenhaRetangulo() {
		String linha = "";
		String col = "";
		String espaco = "";
		String toReturn = "";
		for(int i=0; i<getLadoA(); i++) {
			linha += "---";
			espaco += "   ";
		}
		for(int y=0; y<getLadoB(); y++) {
			col += "|"+ espaco +"| \n";
		}
		
		toReturn += "+"+linha +"+ \n" + col + "+"+linha+"+";
		return toReturn;
	}
	
	public float getLadoA() {
		return ladoA;
	}
	public void setLadoA(float ladoA) {
		this.ladoA = ladoA;
	}
	public float getLadoB() {
		return ladoB;
	}
	public void setLadoB(float ladoB) {
		this.ladoB = ladoB;
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
