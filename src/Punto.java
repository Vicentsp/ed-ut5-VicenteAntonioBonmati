public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        this.x += dx;
    }

    public void desplazaY(double dy) {
        this.y += dy;
    }

    public void desplaza(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanciaEuclidea(Punto otro) {
        double dx = otro.getX() - this.x;
        double dy = otro.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void muestra() {
        System.out.println("Punto: (" + this.x + ", " + this.y + ")");
    }
}