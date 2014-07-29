 import java.util.*;
import java.io.File;
import java.util.regex.*;

class TestScanner
{
public static void main(String args[])
{
try
{
Scanner input = new Scanner(new File("test.txt"));
input.useDelimiter(Pattern.compile("[^a-zA-Z]"));
input.skip("[^a-zA-Z]*");
String line;
while (input.hasNext())
{
line = input.next();
System.out.println(line);
}
}
catch (java.io.FileNotFoundException e) {}
}
}