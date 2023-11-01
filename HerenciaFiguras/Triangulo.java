public class Triangulo extends Figura {

	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		calcularArea();
		calcularPerimetro();
	}

	protected void calcularArea() {
		area = base * altura / 2;
	}

	protected void calcularPerimetro() {
		perimetro = lado1 + lado2 + lado3;
	}

    public String getArea() {
        return null;
    }
}
