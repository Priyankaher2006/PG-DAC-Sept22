/*11. How to replace each given character to other e.g. blank with %20? */

class Q11ReplaceBlank
{
    public static void main(String[] args)
    {
        // Instantiate the string
        String str = "O O P J";
         
        // Trim the given string
        str = str.trim();
         
        // Replace All space (unicode is \\s) to %20
        str = str.replaceAll("\\s", "%20");
         
        // Display the result
        System.out.println(str);
    }
}
/*O%20O%20P%20J*/