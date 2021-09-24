public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        c1.setCenterXY(0, 4);
        System.out.println(c1);

        MyPoint p1 = new MyPoint(6, 8);
        MyCircle c2 = new MyCircle(p1, 8);
        System.out.println(c2);

        MyPoint p2 = new MyPoint(3, 0);
        MyCircle c3 = new MyCircle(p2, 5);
        System.out.println(c3);

        System.out.println(c2.equals(c3));
    }
}