public class triangle extends tabFig{

    final private point p1;
    final private point p2;
    final private point p3;

    public triangle(point p1, point p2, point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getAire(){
        double distP1P2 = Math.sqrt(Math.pow(this.p2.getx()-this.p1.getx(), 2) + Math.pow(this.p2.gety()-this.p1.gety(), 2));
        double distP2P3 = Math.sqrt(Math.pow(this.p3.getx()-this.p2.getx(), 2) + Math.pow(this.p3.gety()-this.p2.gety(), 2));
        double distP3P1 = Math.sqrt(Math.pow(this.p1.getx()-this.p3.getx(), 2) + Math.pow(this.p1.gety()-this.p3.gety(), 2));
        double aire = Math.sqrt(((distP1P2 + distP2P3 + distP3P1)/2)*(((distP1P2 + distP2P3 + distP3P1)/2)-distP1P2)*(((distP1P2 + distP2P3 + distP3P1)/2)-distP2P3)*(((distP1P2 + distP2P3 + distP3P1)/2)-distP3P1));
        return aire;
    }

    public double getPerimetre(){
        double distP1P2 = Math.sqrt(Math.pow(this.p2.getx()-this.p1.getx(), 2) + Math.pow(this.p2.gety()-this.p1.gety(), 2));
        double distP2P3 = Math.sqrt(Math.pow(this.p3.getx()-this.p2.getx(), 2) + Math.pow(this.p3.gety()-this.p2.gety(), 2));
        double distP3P1 = Math.sqrt(Math.pow(this.p1.getx()-this.p3.getx(), 2) + Math.pow(this.p1.gety()-this.p3.gety(), 2));
        double perimetre = distP1P2 + distP2P3 + distP3P1;
        return perimetre;
    }

    public void deplacement(double X, double Y){
        this.p1.deplacement(X, Y);
        this.p2.deplacement(X, Y);
        this.p3.deplacement(X, Y);
    }

    public void print(){
        System.out.println("Point en bas a gauche : ");
        System.out.println("("+ this.p1.getx() + ", " + this.p1.gety() +")");
        System.out.println("Point en haut : ");
        System.out.println("(" + this.p2.getx() + ", " + this.p2.gety() + ")");
        System.out.println("Point en bas a droite : ");
        System.out.println("(" + this.p3.getx() + ", " + this.p3.gety() + ")");

        System.out.println("Perimetre du triangle : " + getPerimetre() + "cm");
        System.out.println("Aire du triangle : " + getAire() + "cm²");
    }
}
