package JavaCodes;

import java.util.Scanner;

public class FrequencyOfCharacters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();

        int len=s.length();
        char str[]=s.toCharArray();
        int freq[]=new int[len];
        int i,j;

        for(i=0;i<len;i++)
        {
            freq[i]=1;
            for(j=i+1;j<len;j++)
            {
                if(str[i]==str[j])
                {
                    freq[i]++;
                    str[j]='0';
                }
            }

        }
        for(i=0;i<freq.length;i++)
        {
            if(str[i]!= ' ' && str[i]!='0')
            {
                System.out.print(str[i] + " - " + freq[i]);
                System.out.println();
            }
        }

    }
}
