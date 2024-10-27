public class Ejercicio10 {
    public static void main(String[] args) {
        int v1, v2, v3, v4, v5;
        boolean respuesta; 
        v1 = 25;
        v2 = 10;
        v3 = 100;
        v4 = 5;
        v5 = 2;
        respuesta = ((Math.sqrt(v1) * v2 >= v3)) && true || false || 
                ((v2 / v4) >= v5);
        System.out.println("respuesta = " + respuesta);
        
    }
}
