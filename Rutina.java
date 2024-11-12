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
      return "Esta es la rutina para peso bajo\n" + "Rutina 3 veces a la semana\n" + //
                " \n" + //
                "\t1.\tSentadillas con peso corporal – 3 series de 10 repeticiones.\n" + //
                "\t2.\tFlexiones de brazos – 3 series de 8-10 repeticiones.\n" + //
                "\t3.\tDesplantes – 3 series de 12 repeticiones (6 en cada pierna).\n" + //
                "\t4.\tRemo con bandas (o pesas ligeras si tienes) – 3 series de 10 repeticiones.\n" + //
                "\t5.\tElevaciones de talones (para pantorrillas) – 3 series de 15 repeticiones.";
    } else if (imc>18.5 && imc<=25) {
      return "Esta es la rutina para peso normal\n" + "Rutina 4 veces por semana\n" + //
                "\n" + //
                "\t1.\tSentadillas con salto – 3 series de 15 repeticiones.\n" + //
                "\t2.\tPlancha – 3 series de 30 segundos a 1 minuto.\n" + //
                "\t3.\tMountain Climbers – 3 series de 20 repeticiones.\n" + //
                "\t4.\tAbdominales en bicicleta – 3 series de 20 repeticiones (10 por lado).\n" + //
                "\t5.\tBurpees – 3 series de 10 repeticiones.\n" + //
                "      6.  Realizar cardio (ejercicio a elección)";
    } else if (imc>25){
      return "Esta es la rutina para peso alto\n" + "Rutina 5 veces por semana\n" + //
                "\n" + //
                "\t1.\tCaminar a paso rápido – 30 a 45 minutos.\n" + //
                "\t2.\tSentadillas – 3 series de 10 repeticiones.\n" + //
                "\t3.\tElevaciones de pierna lateral – 3 series de 15 repeticiones (por pierna).\n" + //
                "\t4.\tRotaciones de torso – 3 series de 10 repeticiones.\n" + //
                "\t5.\tEjercicio de respiración profunda – 5 minutos de práctica al final para relajación.";
    } else {
      return "Error al calcular tu rutina";
    }
  
  }

}