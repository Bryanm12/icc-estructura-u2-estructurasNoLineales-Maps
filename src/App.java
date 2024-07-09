import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        runMapExample();
        runEmpleadoExample();
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empCtri = new EmpleadoContoller();
        empCtri.addEmpleados(new Empleado(1, "Matias", "Developer"));
        empCtri.addEmpleados(new Empleado(5, "Mateo", "Developer"));
        empCtri.addEmpleados(new Empleado(3, "Miguel", "Analyst"));
        empCtri.addEmpleados(new Empleado(400, "Pedro", "Tester"));

        empCtri.imprimirEmpleados();

    }

    private static void runMapExample() {
        new Mapa();
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();
    // Test para sumatoriaDeDos
    int[] nums = { 11, 2, 7, -2 };  
    int objetivo = 5;
    int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
    if (resultado.length == 2) {
    System.out.println(
    "Suma de dos para objetivo " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
    } else {
    System.out.println("No se encontraron dos números que sumen " + objetivo);
    }

    objetivo = 10;
    resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
    if (resultado.length == 2) {
    System.out.println(
    "Suma de dos para objetivo " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
    }   else {
    System.out.println("No se encontraron dos números que sumen " + objetivo);
    }

    //// EJERCICIO 2
    // Test para areAnagrams
    String str1 = "listen";
    String str2 = "silent";
    boolean sonAnagramas = Ejercicios.areAnagrams(str1, str2);
    System.out.println("¿Son anagramas '" + str1 + "' y '" + str2 + "'? " + sonAnagramas);

    str1 = "hello";
    str2 = "bello";
    sonAnagramas = Ejercicios.areAnagrams(str1, str2);
    System.out.println("¿Son anagramas '" + str1 + "' y '" + str2 + "'? " + sonAnagramas);

    }
}
