import java.util.*;
class Pattern
{
    public void Display(int iRow,int iCal)
    {
        int i =0;
        int j =0;
        char ch = '\0';
        for(i=1;i<=iRow;i++)
            {
                for(j=1,ch = 'a';j<=iCal;j++,ch++)
                {
                    
                    if(i%2!=1)
                    {
                        System.out.print(j+"\t");
                       
                    }
                    else
                    {
                        System.out.print(ch+"\t");
                    }
                }
                System.out.println(); 
            } 
                 
        
    }
}

class program29_3
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iValue1,iValue2 = 0;

        System.out.println("Enter the number of Row:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Column:");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);
    }
}