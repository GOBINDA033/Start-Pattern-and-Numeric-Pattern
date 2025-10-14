//Here I, providing some Star pattern and numeric pattern by using java pattern 
// These are  written by using java method /(function) 
//The benifits of this file is that here everyone can learn about loops and also java method
//This is the best for practice loop concepts and java Method /function concepts.

public class Pattern {
 
// This is  pattern_1 module or method or function.
    public  static void Pattern_1()
    {
 for(int i=1;i<5;i++)
        { //this for loop using for row  
          for(int j=1;j<5;j++)
        { ////this forloop using for col
    System.out.print("*");
        }
        System.out.println("");
    }
    }


    //This is  pattern_2 module or method or function.
    public static void Pattern_2()
    {
        for(int i=1;i<5;i++)
        {
for(int j=1;j<=i; j++)
{
System.out.print
("*");
}
System.out.println("");
        }
    }


    //This is first pattern_3 module or method or function.
    public static void Pattern_3()
    {
      for(int i=1;i<6;i++)
      {
for(int j=1; j<i;j++)
{
    System.out.print(j);
}
  System.out.println("");
      }  
    
    }


    //This is first pattern_4 module or method or function.
    public static void Pattern_4()
    {
        for(int i=1;i<5;i++)
        { //this for loop using for row 
for(int j=1;j<i;j++)
{
System.out.print("*");
}
System.out.println("");
}  
 //This is second addition pattern code              
 for(int i=1;i<5;i++)
        { 
for(int j=5;j>i;j--)
{ 
System.out.print("*");
}
System.out.println("");

        }
    }



    //This is first pattern_5 module or method or function.

    public static void Pattern_5()
    {
        int inc=1;
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
System.out.print(inc);
inc++;
            }
        System.out.println("");     
    }
}

//This is the main method of java where we can called our all method or functions.
    public static void main(String agrs[])
    {
        System.out.println("These are some Star and Numeric Pattern  for practice Method and loop concepts in java");
 Pattern_1();
 System.out.println("");
 System.out.println("");
 Pattern_2();
 System.out.println("");
 Pattern_3();
 System.out.println("");
 System.out.println("");
 Pattern_4();
 System.out.println("");
 System.out.println("");
 Pattern_5();
 System.out.println("");
 System.out.println("");
    }
}
