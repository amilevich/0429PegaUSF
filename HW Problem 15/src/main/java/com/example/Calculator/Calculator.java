public class Calculator {

    public boolean areTwoIntegersEqual(int x, int y) {
        if (x==y) {
            return true;
        } else {
            return false;
        }
    }
    public int isSum(int x, int y) {
        int sum=x+y;
        return sum;
    }
    
    public int isDiff(int x, int y) {
        int diff=x-y;
        return diff;
        }
        
        
        
    public int isProd(int x, int y) {
        int Prod=x*y;
        return Prod;
    }
    
    public int isQuot(int x, int y) {
        int Quot=x/y;
        return Quot;
    }
    
    public int isSquare(double x) {
        double Square=Math.sqrt(x);
        return (int) Square;
    }
}