/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Alice{
    public Alice(){
        System.out.println("我是Alice沒內容的建構子");
    }
    public Alice(String str){
        System.out.println(str);
    }
}
class BOB extends Alice{
    public BOB(){
        System.out.println("我是BOB沒內容的建構子");
    }
    public BOB(String str){
        System.out.println(str);
    }
}
public class Object_oriented_practice
{
    public static void main (String[] args) throws java.lang.Exception
    {
        new BOB("Hiiiii");
    }
}
