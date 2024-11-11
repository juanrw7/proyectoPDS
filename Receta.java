public class Receta {

  private String ingredientes;
  private double cantidades;
  private double calorias;
  private String pasos;

  public Receta(String ingredientes, double cantidades, double calorias, String pasos){
    this.ingredientes = ingredientes;
    this.cantidades = cantidades;
    this.calorias = calorias;
    this.pasos = pasos;
  }

  public static String calcularTipoReceta(double imc) {

    if(imc<=18.5) {
      return "Receta: Batido de Avena, Banana y Mantequilla de Maní\n" + //
                "\n" + //
                "Ingredientes:\n" + //
                "\t•\t1 plátano maduro.\n" + //
                "\t•\t1/2 taza de avena.\n" + //
                "\t•\t1 cucharada de mantequilla de maní.\n" + //
                "\t•\t1 taza de leche entera.\n" + //
                "\t•\t1 cucharada de miel (opcional).\n" + //
                "\n" + //
                "Instrucciones:\n" + //
                "Mezclar todos los ingredientes en una licuadora hasta obtener una mezcla homogénea.";
    } else if (imc>18.5 && imc<=25) {
      return "Esta es la receta para peso normal";
    } else if (imc>25){
      return "Esta es la receta para peso alto";
    } else {
      return "Error al receta tu rutina";
    }
  
  }
  
}