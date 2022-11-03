package soruCozumu.week_04;
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

        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10 , 4 , 5.6 , 7.8);

        RegularPolygon[] array = {polygon1 , polygon2, polygon3};

        for (int i = 0; i < array.length; i++) {

            System.out.println("RegularPolygon "  + (i+1) + "'s perimeter is : " + array[i].getPerimeter() + "    area is :  " + array[i].getArea());
        }
    }
}
