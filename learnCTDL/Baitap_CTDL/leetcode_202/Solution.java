import java.util.HashMap;

class  Solution {
    public static int getSquareSum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem*rem;
            n /= 10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        while(true) {
            int sum = getSquareSum(n);
            if (mp.get(sum) != null) {
                return false;
            }
            if (sum == 1) {
                return true;
            } else {
                mp.put(sum, n);
            }
            n = sum;
        }
    }

    public static void main(String[] args) {
        boolean numBer = isHappy(19);
        System.out.println(numBer);
        
    }
}