public class Reversal {

    public static String reverse(String text)
    {
        String reversedText="";

        if(text.length() <=1)
        {
            return text;
        }

        return text = reverse(text.substring(1)) + text.charAt(0);
    }
}
