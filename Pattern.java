public class Pattern {
    public static void main(String[] args)
    {
        int row, col;
        int n = 5;
        for(row=1;row<=n;row++)
        {
            for(col=1;col<=row; col++)
            {
                System.out.print(row);
            }
            System.out.print("\n");
    }

    }
}