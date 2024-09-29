package STRING;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        String str = "DSA IN JAVA BOOT CAMP";
        String s = "";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=' '){
                s += str.charAt(i);

            }
            else continue;
        }
        System.out.println(s);
    }
}
