public class Ejercicio07 {
    public static void main(String[] args) {
        int v1, v2, v3, v4, v5, v6, v7;
        boolean respuesta; 
        v1 = 81;
        v2 = 9;
        v3 = 3;
        v4 = 10;
        v5 = 1;
        v6 = 100;
        v7 = 25; 
        respuesta = (((Math.sqrt(v1) + v2)/ (3) == 9) || (v4 > v5)
                && ((v6 / v7) + (Math.sqrt(v6))));
        System.out.println("respuesta = " + respuesta);
        
    }
}
