package inheritance;

public class ParentT28 {
    //Task 28: Polymorphism- OVERLOADING: Create a method in a class
    //and Overload in using the 3 different  ways of overloading that you know.

    //1. Number of parameters
    public void playSoccer(){
        System.out.println("Overloading Task done.");
    }
    public void playSoccer(String type, int number){
        System.out.println("Parent has been soccer fan for 26 years");
    }

    //2. Data type of parameters
    public void playSoccer(boolean condition,int number){
        System.out.println("Has parent been soccer fans for 26 years?" );
    }

    //3. Sequence of Data of parameters
    public void playSoccer(int type, boolean condition){
    }

//OVERRIDING: Create two methods in a parent class with arguments. write a print statement in the
    //method body, Override the 2 methods in the child class and write a
    //different print statement in the body of the overriding method

    public void playRugby(String type,int number){
        System.out.println("Parents love Rugby sport");

    }

    public void playSoccer(String condition, boolean type){
        System.out.println("Will parent play soccer?");

    }

}
