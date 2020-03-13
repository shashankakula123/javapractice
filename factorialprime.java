public class factorial {
    int n;
    int fact;
    int count;
    factorial(int n,int fact,int count){
        this.n=n;
        this.fact=fact;
        this.count=count;

    }
    void perform(){
        for (int i = 1; i <n ; i++) {
            fact=fact*i;

        }
        System.out.println("the factorial is");
        System.out.println(fact);

    }
    void prime(){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }

        }
        if(count==2){
            System.out.println("it is prime number");

        }
        else{
            System.out.println("it is not a prime number");
        }

    }
    public static void main(String[] args){
        factorial obj=new factorial(6,1,0);
        obj.perform();
        obj.prime();


    }
}
