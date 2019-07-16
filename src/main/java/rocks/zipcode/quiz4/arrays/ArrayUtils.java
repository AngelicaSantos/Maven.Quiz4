package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        String middle = values[(values.length /2)];


        return middle;
    }

    public static String[] removeMiddleElement(String[] values) {
      String[] blahArray = new String[values.length-1];
      for (int i=0; i<blahArray.length/2;i++) {
          blahArray[i] = values [i];
      }
      for (int i= values.length/2; i<blahArray.length;i++) {
          blahArray[i] = values[i+1];
      }
      return blahArray;
    }


    public static String getLastElement(String[] values) {
        String last = values[values.length-1];

        return last;
    }

    public static String[] removeLastElement(String[] values) {

        String[] wowArray = new String[values.length-1];
        for(int i =0; i < wowArray.length; i++){
            wowArray[i] = values[i];
        }
        return wowArray;
    }
}