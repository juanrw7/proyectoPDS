public class Rutina {

  private String grupoMuscular;
  private double duracion;
  private String pasos;

  public Rutina(String grupoMuscular, double duracion, String pasos){
    this.grupoMuscular = grupoMuscular;
    this.duracion = duracion;
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