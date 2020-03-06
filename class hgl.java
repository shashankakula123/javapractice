class hgl{
    int c;
    String sap;
    int total;

hgl( int c,String sap,int total)
{
    this.c=4;
    this.sap="abap";
    this.total=10000;



}
void print(){
    System.out.println(this.c);
    System.out.println(this.sap);
    System.out.println(this.total);
}


public static void main(String[] args){

    hgl obj=new hgl(4,"abap",10000);
    obj.print();


}


}
