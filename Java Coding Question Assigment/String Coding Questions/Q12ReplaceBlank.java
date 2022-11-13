/*12. For example, if the input is "Java is Great" and asked to replace space with %20 then it should be "Java%20is%20Great".*/

class Q12ReplaceBlank
{
    public static void main(String[] args)
    {
        // Instantiate the string
        String str = "Java is Great";
         
        // Trim the given string
        str = str.trim();
         
        // Replace All space (unicode is \\s) to %20
        str = str.replaceAll("\\s", "%20");
         
        // Display the result
        System.out.println(str);
    }
}
/*Java%20is%20Great*/