package testing.project.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Triangle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int side1;
    private int side2;
    private int side3;

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
        if ((side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side2 + side1))
            return true;
        else
            return false;
    }

    public String classify() {

        boolean c1 = (1 <= side1) && (side1 <= 200);
        boolean c2 = (1 <= side2) && (side2 <= 200);
        boolean c3 = (1 <= side3) && (side3 <= 200);

        if (!c1 || !c2 || !c3) {
            return "OUT_OF_RANGE";
        }

        if (isTriangle()) {

            if ((side1 == side2) && (side2 == side3))
                return "EQUILATERAL";

            else if ((side1 != side2) && (side1 != side3) && (side2 != side3))
                return "SCALENE";

            else
                return "ISOSCELES";
        }
        return "IsNotTriangle";
    }

}
