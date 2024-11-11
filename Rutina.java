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
      return "Rutina 3 veces a la semana\n" + //
                " \n" + //
                "\t1.\tSentadillas con peso corporal – 3 series de 10 repeticiones.\n" + //
                "\t2.\tFlexiones de brazos – 3 series de 8-10 repeticiones.\n" + //
                "\t3.\tDesplantes – 3 series de 12 repeticiones (6 en cada pierna).\n" + //
                "\t4.\tRemo con bandas (o pesas ligeras si tienes) – 3 series de 10 repeticiones.\n" + //
                "\t5.\tElevaciones de talones (para pantorrillas) – 3 series de 15 repeticiones.";
    } else if (imc>18.5 && imc<=25) {
      return "Esta es la rutina para peso normal";
    } else if (imc>25){
      return "Esta es la rutina para peso alto";
    } else {
      return "Error al calcular tu rutina";
    }
  
  }

}