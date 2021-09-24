public class MyPoint {
    private int x, y;

    //Clase MyPoint
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Metodo get e set X
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    //Metodo get e set Y
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    //Metodo void set XY
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    //Metodo distance
    public double distance(int x, int y) {
        double resultado = 0;
        double v1 = Math.pow(this.x - x, 2);
        double v2 = Math.pow(this.y - y, 2);
        resultado = Math.sqrt(v1 + v2);
        return resultado;
    }
    public double distance(MyPoint p) {
        return this.distance(p.getX(), p.getY());
    }
    
    //Metodo equals
    public boolean equals(MyPoint other) {
        boolean resultado = false;
        if(other != null) {
            resultado = (this.x == other.getX() && this.y == other.getY());
        }
        return resultado;
    }

    //Metodo toString
    public String toString() {
        String resultado = "MyPoint(" + this.x + ", " + this.y + ")";
        return resultado;
    }
}