package Animal;
public class ELEPHANT {
    String Color="Black";
    Double Weight=500.5;
    int age=20;
    String getSound(){
        return "trumpet,";
    }
    boolean isVeg(){
        return true;
    }
    boolean canClimb(){
        return false;
    }

    public static void main(String[] args) {
        // Lion l=new Lion();
        ELEPHANT e=new ELEPHANT();
        // System.out.println(l.isVeg());
        // System.out.println(l.getSound());
        // System.out.println(l.canClimb());
        // System.out.println("Inside lion class");
        System.out.println(e.isVeg());
        System.out.println(e.getSound());
        System.out.println(e.canClimb());
        System.out.println("Inside Elephant class");
    }
}
