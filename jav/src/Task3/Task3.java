package Task3;

public class Task3 {
    public static void main(final String[] args) {
        final char[] ArrayChar = {'d','m','i','t','r','o'};
        final int[] ArrayInt = {1,5,7,9,0};
        String ArrayString  = "";
        for(int i=0;i< Math.max(ArrayInt.length,ArrayChar.length);i++) {
            if (i < ArrayInt.length) {
                ArrayString += ArrayInt[i];
            }
            if (i<ArrayChar.length) {
                ArrayString += ArrayChar[i];
            }
        }
        System.out.println(ArrayString);
    }
}
