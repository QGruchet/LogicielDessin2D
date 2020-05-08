public class point {
    private double x;
    private double y;

    public point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getx(){
        return this.x;
    }

    public double gety(){
        return this.y;
    }

    public void deplacement(double X, double Y) {
        this.x = this.x + X;
        this.y = this.y + Y;
    }
}
