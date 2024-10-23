public class Usuario {

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

  //metodo para comprobar informacion
  public void mostrarInfoUsuario() {
    System.out.println("Informacion del usuario: ");
    System.out.println("peso: " + peso);
    System.out.println("altura: " + altura);
    System.out.println("edad: " + edad);
    System.out.println("genero: " + genero);
  }

}