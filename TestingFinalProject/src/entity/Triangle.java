package entity;

public class Triangle {

    private int side1;
    private int side2;
    private int side3;
    private String TriangleType;

    public void setSide(int s1, int s2, int s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public boolean isTriangle() {
        return ((side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side2 + side1));
    }

    public String classify() {
        if (isTriangle()) {
            if ((side1 == side2) && (side2 == side3)) {
                return "Equilateral";
            } else if ((side1 != side2) && (side1 != side3) && (side2 != side3)) {
                return "Scalene";
            } else {
                return "Isosceles";
            }
        }
        return "Not A Triangle";
    }
}
