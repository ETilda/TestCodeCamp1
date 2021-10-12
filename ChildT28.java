package inheritance;

public class ChildT28 extends ParentT28{

    public static void main(String[] args) {
        ChildT28 Davies =new ChildT28();
        Davies.playRugby("love rugby",4);
        Davies.playSoccer("Soccer fan",true);
    }
    //To override the parent play rugby method
    public void playRugby(String type,int number) {
        System.out.println("Child love Rugby sport");
    }

    public void playSoccer(String condition, boolean type) {
        System.out.println("Will child play soccer?");
    }
}
