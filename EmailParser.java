import java.lang.*;

public class Basic{
    public static void main(String[] args) {
        String str = "mohammadsameer@gmail.com";
        int ch = str.indexOf("@");
        String uname = str.substring(0,ch);
        String domain = str.substring(ch+1, str.length());
        System.out.println("Username is: " + uname);
        System.out.println("Domain is: " + domain);

        int j = domain.indexOf(".");
        String name = domain.substring(0, j);
        System.out.println(name.equals("gmail.com"));
    }
}
