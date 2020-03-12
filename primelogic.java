public class primearray {
    //this array is used to store prime numbers
 //   int[] prime;
    //this array is used to store non prime numbers
 //   int[] nonprime;
    int[] range;    //used to store range
    // this variable is for prime logic
    boolean isprime;

    // constructor
    primearray() {

    }


    //parameterized constructor
    primearray(int[] range) {
     //   this.prime = prime;
      //  this.nonprime = nonprime;
        this.range = range;
        this.isprime = isprime;
    }

    void perform(){

        for(int i=0;i<range.length;i++){
            isprime=true;
            for(int j=2;j<range[i];j++){
                if(range[i]%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(range[i]);
            }
        }

    }



    public static void main(String[] args) {

       // int prange = Integer.parseInt(args[0]);

        int[] range  = new int[100];


       for (int i = 0; i<range.length; i++) {
            range[i]=i+2;
        }
       /*
        for (int i = 1; i <prange; i++) {
           System.out.println(numbers[i]);


        }

        primearray obj = new primearray(numbers);
        for (int i = 1; i <prange; i++) {
            System.out.println(obj.range[i]);


        }*/
        primearray obj = new primearray(range);

        obj.perform();




    }


}
