public class rectangle extends tabFig{

    final private point x;
    final private point y;

    public rectangle(point BasGauche, point HautDroit){
        this.x = BasGauche;
        this.y = HautDroit;
    }

    public point hautGauche(){
        point p_hg = new point(this.x.getx(), this.y.gety());
        return p_hg;
    }

    public point basDroit(){
        point p_bd = new point(this.y.getx(), this.x.gety());
        return p_bd;
    }

    public double getHauteur(){
        double hauteur = this.y.gety() - this.x.gety();
        return hauteur;
    }

    public double getLargeur(){
        double largeur = this.y.getx() - this.x.getx();
        return largeur;
    }

    public double getAire(){
        double aire = getHauteur() * getLargeur();
        return aire;
    }

    public double getPerimetre(){
        double perimetre = (getHauteur() + getLargeur())*2;
        return perimetre;
    }

    public void deplacement(double X, double Y){
        this.x.deplacement(X, Y);
        this.y.deplacement(X, Y);
    }

    public void print(){
        System.out.println("Point en bas a gauche : ");
        System.out.println("("+ this.x.getx() + ", " + this.x.gety() +")");
        System.out.println("Point en haut a droite : ");
        System.out.println("(" + this.y.getx() + ", " + this.y.gety() + ")");
        System.out.println("Point en haut a gauche : ");
        System.out.println("(" + hautGauche().getx() + ", " + hautGauche().gety() + ")");
        System.out.println("Point en bas a droite : ");
        System.out.println("(" + basDroit().getx() + ", " + basDroit().gety() + ")");

        System.out.println("Rectangle de hauteur : " + getHauteur() + "cm et de largeur : " + getLargeur() + "cm");
        System.out.println("Aire du rectangle : " + getAire() + "cm²");
        System.out.println("Perimetre du rectangle : "+ getPerimetre() + "cm");

    }
}
