import java.util.*;
class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print((char)('A'+(iCnt-1))+"\t");
        }
        
    }
}

class program26_1
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        System.out.println("Enter the frequnce:");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}