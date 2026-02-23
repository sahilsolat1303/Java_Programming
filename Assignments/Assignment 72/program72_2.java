import java.util.*;
class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Enter the Element of matrix:");
        
        for(i = 0; i<iRow; i++)
        {
            System.out.println("Enter the element of row :"+(i+1));

            for(j = 0; j<iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Element of matrix are :");
        
        for(i = 0; i<iRow; i++)
        {            
            for(j = 0; j<iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
        
    }

    public int Frequency(int iNo)
    {
        int i = 0, j = 0;

        int iCount = 0;
        
        for(i = 0; i<iRow; i++)
        {            
            for(j = 0; j<iCol; j++)
            {
                if(Arr[i][j] == iNo)
                    {
                        iCount = iCount+1;
                    }   
            }
            
        }
        return iCount;        
    }

    
}

class program72_2
{
    public static void main(String[] args)throws Exception 
    {
        int iRet = 0;
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        Matrix mobj = new Matrix(4, 4);  
        
        mobj.Accept();
        mobj.Display();

        System.out.println("Enter the number");
        iNo = sobj.nextInt();

        iRet = mobj.Frequency(iNo);

        System.out.println("Frequency of "+ iNo +" are :"+iRet);

       
    }
}