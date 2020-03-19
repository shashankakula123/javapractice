public class palindrome {
    palindrome(){

    }



    public static void main(String[] args){



    //        char[] ch = {'s','h','a','s','h','a','n','k'};
      //  for (int i = 0; i <ch.length; i++) {
         //   System.out.println(ch[i]);
        String ch="33322333";
        String hc=ch;
        int count=0;
        for (int i = 0; i <ch.length() ; i++) {
            System.out.print(ch.charAt(i));
        }
        for (int i = ch.length(); i >0 ; i--) {
            System.out.println(ch.charAt(i-1));
        }


        boolean ispalindrome = false;

        for (int i = 0; i <ch.length() ; i++) {
            if (ch.charAt(i) == hc.charAt(ch.length()-1-i)) {
                count++;

            }

        }

            if(count==ch.length()){
                System.out.println ("it is palindrome " + ch);


            }
            else{
                System.out.print("it is not palindrome "+ ch);

            }


        }












    }
