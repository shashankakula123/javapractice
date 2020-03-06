public class customer {
    String name;
    int id;
    String gender;
    String country;
    String address;

    customer(){


    }
     customer( String name,int id,String gender,String country,String address) {
         this.name=name;
         this.id =id;
         this.gender=gender;
         this.country=country;
         this.address=address;


    }

    void print() {
         System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.gender);
        System.out.println(this.country);
        System.out.println(this.address);


    }

}

class hgl{
    public static void main(String[] args){

        customer c1= new customer("shashank",12345,"male","india","malakpet");

        c1.print();


    }

}
