mport java.util.Scanner;
public class Anton_and_Danik{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int A = 0;
        int D = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A'){
                A++;
            }
            else{
                D++;
            }
        }
        if (A > D) {
            System.out.print("Anton");
        }       
        else if (D > A) {
            System.out.print("Danik");
        }
        else {
            System.out.print("Friendship");
        }
    }
}
