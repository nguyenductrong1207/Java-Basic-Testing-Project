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
        if ((side1 < side2 + side3) || (side2 < side1 + side3) || (side3 < side1 + side2)) {
            return true;
        } else {
            return false;
        }
    }

    public String classify() {
        boolean c1, c2, c3;

        c1 = (10 <= side1) && (side1 <= 220);
        c2 = (10 <= side2) && (side2 <= 220);
        c3 = (10 <= side3) && (side3 <= 220);

        if (!c1 || !c2 || !c3) {
            TriangleType = "Out Of Range";
        } else {
            if (isTriangle()) {
                if ((side1 == side2) && (side2 == side3)) {
                    TriangleType = "Equilateral";

                } else if ((side1 != side2) && (side1 != side3) && (side2 != side3)) {
                    TriangleType = "Scalene";

                } else {
                    TriangleType = "Isosceles";
                }
            } else {
                TriangleType = "Not A Triangle";
            }
        }
        return TriangleType;
    }
}
