package packageB;


public class ClassB1 {
    public static void main(String[] args) {

        //Task24: Create a method in Class B that can only be accessed within a class.

        ClassB1 privateVariable = new ClassB1();
        privateVariable.packageBMethod();

        }
        private void packageBMethod(){
            System.out.println("This method is private and can only be accessed within this class");


        }
        }





