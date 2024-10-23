public class Usuario {
  // Instance variables
  private double peso;
  private double altura;
  private int edad;
  private String genero;


  public Usuario(double peso, double altura, int edad, String genero) {
    this.peso = peso;
    this.altura = altura;
    this.edad = edad;
    this.genero = genero;
  }

  public double calcularIMC() {
    return peso/(altura*altura);
  }

}