package introToOOP;

public class ClassB2 {

    public static void main(String[] args) {
       ClassA2 square = new ClassA2();

       square.setShapeLength(6);
       int squareLength = square.getShapeLength();
        //System.out.println(squareLength);


       square.setShapeBreath(6);
       int squareBreath = square.getShapeBreath();
        //System.out.println(squareBreath);

        int squareSides = square.getShapeSides();
        int area=(squareLength*squareBreath);
        System.out.println("The area of a square of length: "+squareLength);

        System.out.println("And breadth : " +squareBreath);
        System.out.println("The area is : " + area);


    }

}












