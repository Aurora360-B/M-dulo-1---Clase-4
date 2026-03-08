public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("Registrando datos de Carlos en el sistema...");
        // System.out.println("Registrando datos de Ana en el sistema...");
        // System.out.println("Registrando datos de Aurora en el sistema...");
        // System.out.println("Registrando datos de Lina en el sistema...");

        /*
         * Se están repitiendo acciones, las acciones es solo una línea en este ejemplo
         * pero cuando se vuelva mas compleja
         * entonces se vuelve muy dificil, ejemplo si son 10 lineas se repitierían 4
         * veces, en total 40.
         * 
         * Para dar orden a lo que se hace, se debe reutilizar código, para facilitar la
         * lectura del código a medida que repetimos
         * acciones
         */

        // LO MEJOR ES HACER LO SIGUIENTE: El código se lee con mayor facilidad, para
        // actualizar también,
        // si hay un error puedo ubicar facil el fragmento y arreglar en caso de falla.
        // Es mejor tener todo en una misma
        // pieza

        registrarUsuario("Carlos");
        registrarUsuario("Ana");
        registrarUsuario("Aurora");
        registrarUsuario("Lina");
        //MOMENTO 2.
        sumar(4, 5); //Se llama a la función con valores concretos, los que se llaman, ya no se llaman parámetros, se llaman argumentos. 

        /*
         * Reciclar código tiene mucha ventaja, ya que facilita casi todo.
         * 
         * Procesos internos.
         * Valores - Parámetros (Lo que necesita el programa para funcionar.)
         * Bandeja de salida - resultado
         * Encendido y apagado.
         * 
         * ¿Que es una función?
         * Java cierra en llaves, un conjunto de líneas. (Bloques, sub-bloque, puedeb
         * haber otros y otros, no tiene fin.)
         * static void registrarUsuario (String nombre) = se compone de un encabezado,
         * firma de la función o firma
         * del método.
         * 
         * stactic = SE UTILIZA CADA QUE SE VA A USAR UNA FUNCIÓN.
         * void = palabra reservada - no retorna un tipo de dato - si mi maquina
         * retornara pondría un boolean, lo pondría y así
         * suesivamente.
         * El nombre que le hayamos puesto a la máquina, éste nombre por lo general es
         * un verbo, emppiezan por minusculas, la
         * 2d palabra va a empezar con Mayúscula, lo que se llama camelCase.
         * (String nombre) - Parámetros que mi maquina necesita para funcionar.
         * Semantica: pensar las palabras con un significado.
         * Entre los bloques está la información interna, se abre en la misma línea de
         * la función.
         * 
         * NOTA: Si pongo el curso en la función "println", presiono "Control", aparece
         * una manito y al darle clic, me lleva
         * a otro archivo.
         * el newLine par Java es una función. private void newLine().
         * Una función puede llamar a otra función.
         * 
         */

    }

    static void registrarUsuario(String nombre) {
        System.out.println("Registrando datos de " + nombre + "en el sistema...");
        System.out.println("");
    }

    // boolean retorna solo dos valores, true o false.
    // Si en los parámetros se necesita agregar más, se separan con una coma.
    // Como en este caso si retorna, entonces se debe usar dentro del cuerpo,
    // "return" y al frente, el dato de lo que vamos a recordar.
    // >= operador de comparación. Si edad no cumple (true), devuelve un "false"
    static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    //MOMENTO 1: Donde se fabrica o declara la función. 
    static int sumar(int a, int b) {//Parámetros ya declarados.
        System.out.println("Sumando " + a + " + " + b);
        return a + b; // Si no le pongo return va a rrojar error en la línea de la función.
        // Si uso un boolean, no coincidiría, se debe terne en cuenta.
    }

    //Concepto: pasaje por valor: es que se crea una copia del valor interna, dentro de otro método
    // se ejecuta, se hace lo correspondiente, pero la original queda intacta.  
    //quedé en 1 h y 1 min





}
