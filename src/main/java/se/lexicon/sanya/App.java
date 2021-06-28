package se.lexicon.sanya;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {

        System.out.println( "Hello World!" );

        Employee sanya = new SystemDeveloper("sanya", new String[]{"MCP", "OCP", "JSP"}, new String[]{"PHP", "c#", "Angular"});
        Employee subuloye = new SystemDeveloper("subuloye", new String[]{"OCP"}, new String[]{"c++"});
        System.out.println("sanya = " + sanya);
        System.out.println("subuloye = " + subuloye);
    }


}
