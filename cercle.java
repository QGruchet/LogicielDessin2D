import java.lang.*;

public class cercle extends tabFig{

    private point p;
    private double rayon;

    public cercle(point centre, double rayon) {
        this.p = centre;
        this.rayon = rayon;
    }

    public double getRayon(){
        if(this.rayon < 0){
            System.out.println("Diamètre negatif impossible");
            System.exit(-2);
        }
        return this.rayon;
    }

    public double getAire(){
        double Aire = getRayon()*getRayon() * Math.PI;
        return Aire;
    }

    public double getPerimetre(){
        double perimetre = 2 * Math.PI * getRayon();
        return perimetre;
    }

    public void deplacement(double X, double Y){
        this.p.deplacement(X, Y);
    }

    public void print(){
        System.out.println("Centre du cercle : (" + this.p.getx() + ", " + this.p.gety() + ")");
        System.out.println("Diamètre du cercle de " + getRayon() * 2 + "cm");
        System.out.println("Perimètre du cercle de : " + getPerimetre() + "cm²");
        System.out.println("Aire du cercle de : " + getAire() + "cm³");
    }
}
