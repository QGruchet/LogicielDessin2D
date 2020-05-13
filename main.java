import java.util.*;

public class main {
    static int sizeTab = 10;
    static tabFig[] tabfig = new tabFig[sizeTab];
    static int i = 0;


    public static void menuCmd(){
        System.out.println("dessin : permet de dessiner une figure");
        System.out.println("bouger : permet de déplacer les figures");
        System.out.println("vider : permet de vider le tableau de figure");
        System.out.println("help : affiche les commandes disponibles");
        System.out.println("quitter : permet de fermer le programme");
    }

    public static void menuFig(){
        System.out.println("rectangle : permet de dessiner un rectangle");
        System.out.println("carre : permet de dessiner un carre");
        System.out.println("cercle : permet de dessiner un cercle");
        System.out.println("triangle : permet de dessiner un triangle");
        System.out.println("help : affiche le menu des figures disponibles");
        System.out.println("quitter : permet de quitter le programme");
    }

    public static void choixMouvement(){
        int j;
        if(tabfig[0] != null) {
            System.out.println("De combien voulez-vous déplacer les figures ?");
            Scanner boug = new Scanner(System.in);
            System.out.println("Saississez le déplacement horizontal (x)");
            double dx = boug.nextDouble();
            System.out.println("Saississez le déplacement vertical (y)");
            double dy = boug.nextDouble();

            for (j = 0; j < i; j++) {
                System.out.println("Déplacement : ");
                tabfig[j].deplacement(dx, dy);
                tabfig[j].print();
            }
        }
        else System.out.println("Erreur vous n'avez fais aucune figure pour le moment");
    }

    public static void choixFigure() {
        Scanner choixFig = new Scanner(System.in);
        System.out.println("Quel figure ?");
        String figure = choixFig.nextLine();
        switch (figure) {
            case "help":
                menuFig();
                break;

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
                    System.out.println("Erreur dans la saisie des points, géometrie non possible");
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

            case "carre":
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Entrez un nombre pour le bas gauche (x)");
                double x = sc4.nextDouble();
                System.out.println("Entrez un nombre pour le bas droit (y)");
                double y = sc4.nextDouble();
                System.out.println("Entrez un nombre pour la longueur du carre");
                double longueur = sc4.nextDouble();
                tabfig[i] = new carre(new point(x,y), longueur);
                tabfig[i].print();
                i++;
                break;

            case "quitter":
                System.out.println("Au revoir");
                System.exit(-1);

            default:
                System.out.println("Mauvaise figure");
                break;
        }
    }

    public static void freeTab(){
        int a;
        if(tabfig[0] != null) {
            for (a = 0; a < sizeTab; a++) {
                tabfig[a] = null;
            }
            i = 0;
            System.out.println("Tableau de figure à présent vide");
        }
        else System.out.println("Erreur le tableau de figure est déjà vide !");
    }

    public static void main(String [] args){
        while(true) {
            Scanner cmd = new Scanner(System.in);
            System.out.println("Entrez une commande : ");
            String commande = cmd.nextLine();
            switch (commande) {

                case "help":
                    menuCmd();
                    break;

                case "dessin":
                    choixFigure();
                    break;

                case "bouger":
                    choixMouvement();
                    break;

                case "vider":
                    freeTab();
                    break;

                case "quitter":
                    System.out.println("Au revoir");
                    System.exit(-1);
                    break;

                default:
                    System.out.println("Mauvaise commande");
                    break;
            }
        }
    }
}
