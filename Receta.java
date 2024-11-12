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
      return "Esta es la receta para peso normal\n" + "Desayuno:\n" + //
                "\t•\tOmelet de 2 huevos con espinacas, champiñones y queso, acompañado de una\n" + "\t \ttostada de pan integral con aguacate.\n" + //
                "\t•\tBatido de leche, banana y avena, con una cucharadita de mantequilla de maní.\n" + //
                "\n" + //
                "Almuerzo:\n" + //
                "\t•\tPollo al horno con arroz integral y vegetales asados (zanahorias, pimientos y brócoli).\n" + //
                "\t•\tLentejas guisadas con arroz y aguacate.\n" + //
                "\n" + //
                "Cena:\n" + //
                "\t•\tWrap de pollo con hummus, lechuga, tomate y zanahoria rallada en tortilla integral.\n" + //
                "\t•\tSalmón a la plancha con puré de papas y ensalada mixta (pepino, zanahoria y\n" + "\t \tespinaca).";
    } else if (imc>18.5 && imc<=25) {
      return "Esta es la receta para peso normal\n" + "Desayuno:\n" + //
                "\t•\tTostadas de aguacate con huevo cocido y espinacas frescas.\n" + //
                "\t•\tYogur natural con granola y frutas frescas (fresas, moras o manzana).\n" + //
                "\n" + //
                "Almuerzo:\n" + //
                "\t•\tPasta integral con verduras (pimientos, calabacín, champiñones)\n" + "\t \ty pechuga de pollo.\n" + //
                "\t•\tEnsalada de quinoa con pepino, tomate, garbanzos, perejil y limón.\n" + //
                "\n" + //
                "Cena:\n" + //
                "\t•\tTaco de pescado (tilapia o salmón) con col rallada, guacamole y salsa de yogur\n" + "\t \ten tortilla integral.\n" + //
                "\t•\tSopa de vegetales (calabacín, espinaca, zanahoria, apio) con garbanzos\n" + "\t \ty una rodaja de pan integral.";
    } else if (imc>25){
      return "Esta es la receta para peso alto/n" + "Desayuno:\n" + //
                "\t•\tAvena cocida con frutos rojos, canela y un poco de almendras.\n" + //
                "\t•\tSmoothie verde: Espinaca, pepino, manzana y un poco de jengibre,\n" + "\t \tendulzado con un toque de miel.\n" + //
                "\n" + //
                "Almuerzo:\n" + //
                "\t•\tEnsalada de pollo a la parrilla con lechuga, zanahoria, pepino y un\n" + "\t \taderezo de yogur y limón.\n" + //
                "\t•\tVerduras al vapor con pechuga de pollo y una pequeña porción\n" + "\t \tde arroz integral.\n" + //
                "\n" + //
                "Cena:\n" + //
                "\t•\tSopa de lentejas y espinacas con zanahoria y cebolla, acompañada\n" + "\t \tde un pedazo de pan integral.\n" + //
                "\t•\tPescado a la plancha (róbalo o trucha) con ensalada de tomate,\n" + "\t \tpepino y cilantro.";
    } else {
      return "Error al obtener tu receta";
    }
  
  }
  
}