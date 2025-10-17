public class R{
     public static void Pattern__5()
    {
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(i == 1 || i == n || j == 1 || j == n)
{
System.out.print("*");
}
else{
System.out.print(" ");//This is maily for space
}
}
System.out.println("");

}
    }
    //This method used for print L charcater .
    public static void Pattern_6()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
for(int j=1;j<=n;j++)
{
if(j==1||i==n)
{
    System.out.print("*");
}
}
System.out.println("");
        }

    }
    public static void main(String args[])
    {
Pattern__5();
System.out.println(" ");
Pattern_6();
    }
}


