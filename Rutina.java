public class Rutina {

  private String ingredientes;
  private double cantidades;
  private double calorias;
  private String pasos;

  public Rutina(String ingredientes, double cantidades, double calorias, String pasos){
    this.ingredientes = ingredientes;
    this.cantidades = cantidades;
    this.calorias = calorias;
    this.pasos = pasos;
  }

  public static String calcularTipoRutina(double imc) {

    if(imc<=18.5) {
      return "Esta es la rutina para peso bajo";
    } else if (imc>18.5 && imc<=25) {
      return "Esta es la rutina para peso normal";
    } else if (imc>25){
      return "Esta es la rutina para peso alto";
    } else {
      return "Error al calcular tu rutina";
    }
  
  }

}