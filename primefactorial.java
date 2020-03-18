public class factorial {
    int n;     // variable used to pass prime
    int fact; // value of factorial is stored in this
    int count;
    factorial(int n,int fact,int count){
        this.n=n;
        this.fact=fact;
        this.count=count;

    }
    int perform(int k){

       fact=fact*k;

       if(k==1) {

           return 0;
       }

           perform(k - 1);
        return fact;
    }
    int prime(int g,int i){

        if(g%i==0){
            count++;

        }
        if(g==i) {
            return g;
        }
        if(count>2) {
            return g;
        }



            prime(g, i + 1);


        if(count==2) {
            System.out.println(g);
            System.out.println("it is prime number");
            return g;
        }else{
            System.out.println(g);
            System.out.println("it is not a prime number");
        }
        return g;

    }
    public static void main(String[] args){
        factorial obj=new factorial(6,1,0);

        int[] a = new int[]{ 2,4,5,6,7,8,10};

        for(int j=0;j<a.length;j++){
            obj.fact=1;
            obj.count=0;
            obj.fact = obj.perform(a[j]);
            obj.prime(obj.fact,1);

        }

    }
}
