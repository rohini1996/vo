import java.io.*;
import java.util.Scanner;
class vowel
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }
    }
}

