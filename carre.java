public class carre extends tabFig{

    final private point x;
    final private double longCote;

    public carre(point BasGauche, double longCote){
        this.x = BasGauche;
        this.longCote = longCote;
    }

    public double getLong(){
        return longCote;
    }

    public point hautGauche(){
        point p_hg = new point(this.x.getx(), this.x.gety() + longCote);
        return p_hg;
    }

    public point basDroit(){
        point p_bd = new point(this.x.getx() + longCote, this.x.gety());
        return p_bd;
    }

    public point hautDroit(){
        point p_hd = new point(this.x.getx() + longCote, this.x.gety() + longCote);
        return p_hd;
    }

    public void deplacement(double X, double Y){
        this.x.deplacement(X, Y);
    }

    public double getAire(){
        double aire =  Math.pow(getLong(), 2);
        return aire;
    }

    public double getPerimetre(){
        double perimetre = (getLong())*4;
        return perimetre;
    }

    public void print(){
        System.out.println("Point en bas a gauche : ");
        System.out.println("("+ this.x.getx() + ", " + this.x.gety() +")");
        System.out.println("Point en haut a droite : ");
        System.out.println("(" + hautDroit().getx() + ", " + hautDroit().gety() + ")");
        System.out.println("Point en haut a gauche : ");
        System.out.println("(" + hautGauche().getx() + ", " + hautGauche().gety() + ")");
        System.out.println("Point en bas a droite : ");
        System.out.println("(" + basDroit().getx() + ", " + basDroit().gety() + ")");

        System.out.println("Carré de longueur :" + getLong() + "cm");
        System.out.println("Aire du carré : " + getAire() + "cm²");
        System.out.println("Périmètre du carré : "+ getPerimetre() + "cm");

    }
}
