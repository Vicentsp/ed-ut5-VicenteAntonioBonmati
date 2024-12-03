public class PuntoApp {
    public PuntoApp() {
    }

    public static void main(String[] args) {
        Punto punto1 = new Punto(3.0, 4.0);
        Punto punto2 = new Punto(6.0, 8.0);
        System.out.println("practica4.Punto 1:");
        punto1.muestra();
        System.out.println("practica4.Punto 2:");
        punto2.muestra();
        punto1.desplaza(2.0, 3.0);
        punto2.desplazaX(1.5);
        System.out.println("practica4.Punto 1 después de desplazarlo:");
        punto1.muestra();
        double distancia = punto1.distanciaEuclidea(punto2);
        System.out.println("Distancia entre practica4.Punto 1 y practica4.Punto 2: " + distancia);
        System.out.println("practica4.Punto 2 después de desplazarlo en X:");
        punto2.muestra();
        distancia = punto1.distanciaEuclidea(punto2);
        System.out.println("Nueva distancia entre practica4.Punto 1 y practica4.Punto 2: " + distancia);
    }
}
