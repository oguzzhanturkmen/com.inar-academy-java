package chapters.chapter_09;
/*  UML DIAGRAM
    -----------------------
    n : int
    side : double
    x : double
    y : double
    ------------------------
    +RegularPolygon()
    +RegularPolygon(n: int , side: double , x: double , y: double)
    +RegularPolygon(n: int , side: double )
    +getN(): int
    +getSide(): double
    +getX(): double
    +getY(): double
    +setN(n : int) : void
    +setSide(side: double): void
    +setX(x: double): void
    +setY(y: double): void
    +getPerimeter() : double
    +getArea(): double
     ------------------------
 */
public class Exercise_09 {
    public static void main(String[] args) {


        RegularPolygon x = new RegularPolygon();
        RegularPolygon y = new RegularPolygon(6, 4);
        RegularPolygon z = new RegularPolygon(10, 4, 5.6, 7.8);

        RegularPolygon[] array = {x , y , z };

        for (int i = 0; i < array.length; i++) {
            System.out.println("RegularPolygon " + (i+1) + "'s perimeter : " + array[i].getPerimeter() + "    area : " + array[i].getArea());
        }
        }
    }

