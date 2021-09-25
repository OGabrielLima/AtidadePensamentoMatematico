package FormasGeometricas;

public class UsaFormasGeometricas {
	public static void main(String[] args) {
		Circulo circulo = new Circulo(10f);
		System.out.println("Area: "+circulo.calculaArea());
		System.out.println("Perimetro: "+circulo.calculaPerimetro());
		
		Retangulo retangulo = new Retangulo(5, 10);
		System.out.println("Area: "+retangulo.calculaArea());
		System.out.println("Perimetro: "+retangulo.calculaPerimetro());
		
		Retangulo quadrilatero = new Retangulo(5);
		System.out.println("Area: "+quadrilatero.calculaArea());
		System.out.println("Perimetro: "+quadrilatero.calculaPerimetro());
		System.out.println("Desenha Quadrado: ");
		System.out.println(quadrilatero.desenhaRetangulo());
	}
}
