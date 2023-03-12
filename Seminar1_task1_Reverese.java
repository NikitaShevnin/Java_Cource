public class Seminar1_task1_Reverese
{
    public static String reverseTextString(String str) 
    {
        var list = str.replaceAll("\\s+", " ").split(" ");
        String newstr = "";
        for (int i = 0; i < list.length; i++) 
        {
            newstr += list[list.length - i - 1] + " ";
        }
        return newstr;
    }
}