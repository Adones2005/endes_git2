/**
  Representa estructura básica de figura geométricas.
  Las subclases deben implementar los métodos para calcular área y perímetroi
  
  @author Pablo
*/
public abstract class Figura {

	/**
	Retorna el área de la figura
	@return Area como double
	*/
	public abstract double area();
	/**
	Retorna el permietro de la figura
	@return  Perimetro como double
	*/
	public abstract double perimetro();
}
