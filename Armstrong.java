public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    static boolean isArmstrong(int n){
    int original = n;
    int sum = 0;
    while(n>0){
        int rem = n%10;
        int cube = rem*rem*rem;
        n = n/10;
        sum+=cube;
    }
    return sum == original;
    }
}
