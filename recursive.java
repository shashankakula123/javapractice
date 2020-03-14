public class recursive {
    recursive(){

    }
    void print(int n){
        System.out.print(n);
        System.out.println(" hello world");

        if(n==1){
            return;
        }
        print(n-1);

    }

    public static void main(String[] args) {
        recursive obj=new recursive();
        obj.print(5);




    }
}
