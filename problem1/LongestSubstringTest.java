import java.util.Scanner;

public class LongestSubstringTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<sb.length();j++){
                if(str.charAt(i)==sb.charAt(j)){
                    sb.delete(0,j+1);
                }
            }
            sb.append(str.charAt(i));
            if(sb.length()>cnt){
                cnt=sb.length();
            }
        }

        System.out.println("Length: " + cnt);

        scanner.close();
    }
}