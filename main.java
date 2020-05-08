import java.util.*;

public class main {
    public static void main(String [] args){

        tabFig[] tabfig = new tabFig[10];
        int i = 0;

        while(true) {
            Scanner cmd = new Scanner(System.in);
            Scanner choixFig = new Scanner(System.in);
            System.out.println("Entrez une commande : ");
            String commande = cmd.nextLine();
            switch (commande) {
                case "dessin":
                    System.out.println("Quel figure ?");
                    String figure = choixFig.nextLine();
                    switch(figure){
                        case "rectangle":
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Entrez un nombre pour le coin inférieur gauche (x)");
                            double d1 = sc.nextDouble();
                            System.out.println("Entrez un nombre pour le coin inférieur gauche (y)");
                            double d2 = sc.nextDouble();
                            System.out.println("Entrez un nombre pour le coin supérieur droit (x)");
                            double d3 = sc.nextDouble();
                            System.out.println("Entrez un nombre pour le coin supérieur droit (y)");
                            double d4 = sc.nextDouble();

                            if (d1 > d3 || d2 > d4) {
                                System.out.println("Erreur dans la saisie des points, geometrie non possible");
                                System.exit(-1);
                            }

                            tabfig[i] = new rectangle(new point(d1, d2), new point(d3, d4));
                            tabfig[i].print();
                            i++;

                            break;

                        case "cercle":
                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("Entrez un nombre pour le centre du cercle (x)");
                            double cercleX = sc2.nextDouble();
                            System.out.println("Entrez un nombre pour le centre du cercle (y)");
                            double cercleY = sc2.nextDouble();
                            System.out.println("Entrez un nombre pour le rayon du cercle (y)");
                            double cercleDiametre = sc2.nextDouble();
                            tabfig[i] = new cercle(new point(cercleX, cercleY), cercleDiametre);
                            tabfig[i].print();
                            i++;
                            break;

                        case "triangle":
                            Scanner sc3 = new Scanner(System.in);
                            System.out.println("Entrez un nombre pour le bas gauche (x)");
                            double bgx = sc3.nextDouble();
                            System.out.println("Entrez un nombre pour le bas droit (y)");
                            double bgy = sc3.nextDouble();
                            System.out.println("Entrez un nombre pour haut (x)");
                            double hx = sc3.nextDouble();
                            System.out.println("Entrez un nombre pour le haut (y)");
                            double hy = sc3.nextDouble();
                            System.out.println("Entrez un nombre pour le bas droit (x)");
                            double bdx = sc3.nextDouble();
                            System.out.println("Entrez un nombre pour le bas droit (y)");
                            double bdy = sc3.nextDouble();
                            tabfig[i] = new triangle(new point(bgx, bgy), new point(hx, hy), new point(bdx, bdy));
                            tabfig[i].print();
                            i++;
                            break;

                        case "quitter":
                            System.out.println("Au revoir");
                            System.exit(-1);
                            break;

                        default:
                            System.out.println("Mauvaise figure");
                            break;
                    }

                case "bouger":
                    for(tabFig fig : tabfig){
                        fig.deplacement(2, 3);
                        fig.print();
                    }
                    break;

                case "quitter":
                    System.out.println("Au revoir");
                    System.exit(-1);
                    break;
            }
        }
    }
}
