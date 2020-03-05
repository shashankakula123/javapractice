class box {
    int length;
    int height;
    int width;
    int weight;
    String colour;
    String source;
    String destination;

    box(int length,
        int height,
        int width,
        int weight,
        String colour,
        String source,
        String destination) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.colour = "colour";
        this.source = "source";
        this.destination = "destination";
       /* System.out.println("parameterized constuctor");
        System.out.println(this.length);
        System.out.println(this.height);
        System.out.println(this.width);
        System.out.println(this.weight);
        System.out.println(this.colour);
        System.out.println(this.source);
        System.out.println(this.destination);*/
    }

    box() {
        /*System.out.println("default constuctor");
        System.out.println(this.length);
        System.out.println(this.height);
        System.out.println(this.width);
        System.out.println(this.weight);
        System.out.println(this.colour);
        System.out.println(this.source);
        System.out.println(this.destination);*/
    }


    void print()
    {
        System.out.println("print function");
        System.out.println(this.length);
        System.out.println(this.height);
        System.out.println(this.width);
        System.out.println(this.weight);
        System.out.println(this.colour);
        System.out.println(this.source);
        System.out.println(this.destination);

    return;
    }

    void price()
    {
        System.out.println("price function");
        int price=0;
        price =this.weight*500;
        System.out.println(price);
        return;
    }
}

class jackie {
    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box(0, 0, 0, 0, "", "", "");
        b1.length = 5;
        b1.height = 4;
        b1.width = 2;
        b1.weight = 50;
        b1.colour = "red";
        b1.source = "malakpet";
        b1.destination = "vanasthalipuram";
       /* System.out.println(b1.length);
        System.out.println(b1.height);
        System.out.println(b1.width);
        System.out.println(b1.weight);
        System.out.println(b1.colour);
        System.out.println(b1.source);
        System.out.println(b1.destination);*/

       b1.print();
       b1.price();

        b2.length = 11;
        b2.height = 12;
        b2.width = 13;
        b2.weight = 60;
        b2.colour = "blue";
        b2.source = "saidabad";
        b2.destination = "santoshnagar";
        /*System.out.println(b2.length);
        System.out.println(b2.height);
        System.out.println(b2.width);
        System.out.println(b2.weight);
        System.out.println(b2.colour);
        System.out.println(b2.source);
        System.out.println(b2.destination);*/
    }
}
