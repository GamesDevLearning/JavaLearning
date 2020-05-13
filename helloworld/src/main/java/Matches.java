import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** @author coding_java **/
public class Matches
{
  public static void main(String[] args)
  {
    String stringToSearch = "The best time for new beginnings"
            + " is now";
    Pattern pattern = Pattern.compile("beginnings");  
    Matcher m = pattern.matcher(stringToSearch);
    
    if (m.find())
      System.out.println("Match was found");
    else
      System.out.println("Didn't find a match");
  }
}
/*********************
    Output: 
    Match was found
 ********************/






/* 
Hi devs,
Today I am learning about regular expressions (or regex for short).
Regular expressions are useful for creating patterns allowing you to 
match, manipulate and locate text. For instance here I am checking if this 
String contains a very word. If there is a match, return "Match was found". 

Here I have used the Matcher and Pattern 
class, but in Java you can also use
the MatchResult interface or PatternSyntaxException class.

Happy coding :) 


*/