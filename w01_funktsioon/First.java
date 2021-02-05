public class First { //deklareerime, et on klass
    public static void main(String[] args){ //funktsioon nimega main
        //System.out.println(args.length); //stringi massiivi pikkus
        int[] numberArray = new int[5];

        String[] stringArray = new String[5];
        String[] greetingsArray = String[]{ "Hello", "world", "!"}; //algväärtustamine

        String name = "Raimo"; //klass
        //primitiivtüübid
        int year = 2021;     
        byte myByte = Byte.MAX_VALUE; //-128 to 127
        short myShort = Short.MAX_VALUE;
        long myLong = Long.MAX_VALUE;
        double doubleNumber = 3.4;
        float floatNumber = 3.4f;
        boolean flag = true; //false
        char character = 'F'; //char'ilsingle quote '


        //for (algus; kaua; mis juhtub iga korraga)
        //
        for (int i = 0; i < greetingsArray.length; i++){
            System.out.println(greetingsArray[i]);
        }

        for (String text : greetingsArray){
            System.out.println(text);
        }

        int length = greetingsArray.length;
        while(length > 0){
            length--; //v6tab yhe maha
            System.out.println("Inside while");
        }

        if(year == 2021){
            System.out.println(year + " is equal to 2021");
        } else if(year > 2021){
            System.out.println(year + " is not equal or larger of 2021");
        }
        
        System.out.println("Hello world!"); //println teeb ka reavahetuse, lihtsalt print mitte
        
        //System.out.print("\n"); //rea vahetus

        String hello = "Hello world!";
    }
}
