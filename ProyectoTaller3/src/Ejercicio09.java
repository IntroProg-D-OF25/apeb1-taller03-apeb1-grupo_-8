public class Ejercicio09 {
    public static void main(String[] args) {
        int v1, v2, v3, v4; 
        boolean respuesta; 
        v1 = 81;
        v2 = 25; 
        v3 = 10; 
        v4 = 50; 
        respuesta = ((Math.sqrt(v1) + (Math.sqrt(v2) * (v3)) ) >= 50);
        System.out.println("respuesta = " + respuesta);
    }
}
