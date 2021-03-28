package JavaLesson1;

import java.util.Arrays;
import java.util.regex.Pattern;



public class TT1503 {


    public int toInteger(String input) throws Exception {
    /**
     *Kirjuta Java meetod, mis võtab argumendiks String tüüpi argumendi ning muudab ette antud arvu täisarvuks,
     * ka negatiivsed arvud. Kui argumendis leidub midagi
     * muud peale numbrite või on tühi sõne, siistagastab 0-i.
     */
        /*try {
            int value = Integer.parseInt(input);
            return value;
        } catch (Exception e){
            return 0;
        }*/

        String[] elements = input.split("");
        int result = 0;
        int multiply = 1;
        boolean negative = false;
        int leaveTheFirstIn = -1;
        if (elements[0].equals("-")){
            negative = true;
            leaveTheFirstIn = 0;

        }

        for (int i = elements.length - 1; i > leaveTheFirstIn; i--){
            if (elements[i].equals("0")){
                result += 0;

            }
            else if (elements[i].equals("1")){
                result += multiply;

            }
            else if (elements[i].equals("2")){
                result += multiply*2;

            }
            else if (elements[i].equals("3")){
                result += multiply*3;

            }
            else if (elements[i].equals("4")){
                result += multiply*4;
            }
            else if (elements[i].equals("5")){
                result += multiply*5;

            }
            else if (elements[i].equals("6")){
                result += multiply*6;

            }
            else if (elements[i].equals("7")){
                result += multiply*7;

            }
            else if (elements[i].equals("8")){
                result += multiply*8;

            }
            else if (elements[i].equals("9")){
                result += multiply*9;

            }
            else {
                result = 0;
                break;
            }

            multiply *= 10;
                    }
        if (negative){
            return result*-1;
        }

        return result;

    }

    public int reverseAndToInteger(String string) throws Exception {
    /**
     * Kirjuta Java meetod, mis võtab String tüüpi argumendi, pöörab selle teistpidi ning kasutades eelmist meetodit
     * muudab täisarvuks.
     */
        String reverse = "";
        String[] elements = string.split("");
        for (int i = elements.length - 1; i > - 1; i--){
            reverse += elements[i];
        }

        return toInteger(reverse);

    }
    public int[] reverseArray(int[] array) throws Exception {
    /**
     * Kirjuta Java meetod, mis võtab argumendiks int[] tüüpi argumendi ning pöörab selle elementide järjekorra teistpidi.
     * Ei tohi kasutada Java meetodeid, mis juba teevad seda.
     */
        int[] reverse = new int[array.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[0] = array[array.length - 1 - i];
        }
        return reverse;
    }
}
