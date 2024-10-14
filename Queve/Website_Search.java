import java.util.Scanner;

public class Website_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("This ia an organization website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is a indian website");
        }
    }
}
