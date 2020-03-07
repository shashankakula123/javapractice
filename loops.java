public class loops {
    public static void main(String[] args) {
        

        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        for (int i = 4; i >= 0; i--) {
            System.out.println(a[i]);
        }
        int i = 4;
        while (i >= 0) {
            System.out.println(a[i]);
            i--;
        }


        int j = 0;
        do {
            System.out.println(a[j]);
            j++;
        } while (j <= 4);
        
        char[] a={'s','h','a','s','h','a','n','k'};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
        System.out.println(a[6]);
        System.out.println(a[7]);

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);

        }


        String praveen = "hi";
        String[] name={"shashank","rahul",praveen,"sahiti","raghavendra"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        for (int i = 0; i < 5; i++)
        {
            System.out.println(name[i]);

        }
        
        
        int[][] a = {{1,2},{6,7}};


        for (int i =0; i <= 1; i++) {
            for (int j =0; j <= 1; j++) {
            System.out.print(a[i][j]);
            }

        }

        String[][] name={{"shashank","rahul"},{"sahiti","praveen"}};

        for (int i =0; i <= 1; i++) {
            for (int j =0; j <= 1; j++) {
                System.out.println(name[i][j]);
            }
        }
        
        
        
        
        
        
        
        
        
        
    }


}
