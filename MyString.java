public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        for( int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if( ch >= 65 && ch <= 90){
               if (i==0)
                str = (char)(ch + 32) + str.substring(1); 
                else{
                str = str.substring(0,i) + (char)(ch + 32) + str.substring(i+1);
                }
            }
        
    }
    return str;
       }
          

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() > str1.length()){
        return false;
        } 
        else{
            for(int i = 0; i <= str1.length() - str2.length(); i++){//unhappy    happy//i<=2
                int index = i;//2
                int j;
                
                for(j = 0; j < str2.length(); j++){//j<5
                if (str1.charAt(index) != str2.charAt(j)){
                 break;
        }
                    index++;//6//j4
                }
                
                if (j ==str2.length()){
                return true;
                }
            }
            return false;
        }
    }
}
