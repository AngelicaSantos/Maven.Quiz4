package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return null;
    }

    public static String capitalizeMiddleCharacter(String str) {
        return null;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {

        String cas = "";

        //get the char array from String
        char[] charArray = str.toCharArray();

        //process chars one by one
        for (int i = 0; i < charArray.length; i++) {

            //if char is uppercase, make it lower case
            if (Character.isUpperCase(charArray[i])) {

                charArray[i] = Character.toLowerCase(charArray[i]);

            } else if (Character.isLowerCase(charArray[i])) {

                charArray[i] = Character.toUpperCase(charArray[i]);

            }
        }
        // now you need to convert the new  char into string
        str = new String(charArray);
        System.out.println(str);
        return str;
    }

}