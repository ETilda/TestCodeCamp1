package introToOOP;

public class ClassA2 {

    //Task25:Create 3 different constructors of a class A. Create 3 objects of Class A in class B
    //and use the 3 different constructors when creating each of the objects of class A in class B
    String vegetableType;
    int calories;
    boolean carbohydrates;

    public ClassA2(String vegetableType){
        this.vegetableType=vegetableType;

    }
    public ClassA2(String vegetableType, int calories){
        this.calories=calories;

    }
    public ClassA2(String vegetableType, int calories, boolean carbohydrates){
        this.carbohydrates= carbohydrates;
    }


    public void printVegetable(){
        System.out.println(calories);

    }
}