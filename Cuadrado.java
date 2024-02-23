public class Cuadrado extends Figura{
	private double base;
	private double altura;
	
	
	public Cuadrado(double base, double altura){
	this.base = base;
	this.altura = altura;
	}
	
	@Override
	public double area(){
		return base * altura;
	}
	
	@Override
	public double perimietro(){
		return 2*base+2*altura;
	}

}
