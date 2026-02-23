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

    public void SwapRows()
    {
        int i = 0, j = 0;
        int temp = 0;
        
        for(i = 0; i<iRow-1; i = i + 2)
        {           
            for(j = 0; j<iCol; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = temp;
            }
  
        }        
    }

    
}

class program72_5
{
    public static void main(String[] args)throws Exception 
    {
        
        Matrix mobj = new Matrix(4, 4);  
        
        mobj.Accept();
        mobj.Display();

        mobj.SwapRows();
        System.out.println("After Swapping : ");
        mobj.Display();

    }
}