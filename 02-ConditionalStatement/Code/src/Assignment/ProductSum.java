package Assignment;

//Subtract the Product and Sum of Digits of an Integer

class ProductSum {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            product = product * rem;
            n/=10;
        }
        return product - sum;
    }
}