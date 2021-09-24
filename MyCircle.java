public class MyCircle {
    private MyPoint center;
    private int radius;

    //MyCircle
    public MyCircle() {
        center = new MyPoint();
        radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    //Metodo get e set Radius
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    //Metodo get e set Center
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    //Metodo get CenterX
    public int getCenterX() {
        return center.getX();
    }

    //Metodo get CenterY
    public int getCenterY() {
        return center.getY();
    }

    //Metodo set CenterXY
    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    //Metodo equals
    public boolean equals(MyCircle other) {
        boolean resultado = false;
        if(other != null) {
            resultado = ( this.radius == other.getRadius() &&
                          this.center == other.getCenter() );
        }
        return resultado;
        
        /*
        //TESTE
        if (other == this) {
            return true;
        }
        if (other == null || other.getClass() != this.getClass()) {
            return false;
        }
        return ( other.radius == this.radius &&
                 other.center.equals(this.center) );
        */
    }

    //Metodo toString
    public String toString() {
        String resultado = "MyCircle(center=" + center + ", radius=" + radius + ")";
        return resultado;
    }

    //Metodo get Area
    public double getArea() {
        double resultado = 0.0;
        resultado = Math.PI * radius * radius;
        return resultado;
    }
}