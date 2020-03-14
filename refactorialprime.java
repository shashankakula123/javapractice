public class Main {
    int n;
    int fact;
    int count;

    public static void main(String[] args) {

        int n=6,fact=1,count=0;
        for (int j = 1; j<n ; j++) {
            if (n % j == 0) {
                count++;
            }
        }

        if (count == 2) {
                            System.out.println(n);
                            System.out.println("it is prime");

                }
        else{
                System.out.println("it is not prime");
            }


        for(int i=1;i<=n;i++){

            fact=fact*i;
        }
        System.out.println(fact);

	// write your code here
    }
}
