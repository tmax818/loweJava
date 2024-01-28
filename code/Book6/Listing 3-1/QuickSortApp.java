public class QuickSortApp
{

   private static int[] a = new int[100];

   public static void main(String[] args)
   {
       for (int i = 0; i < a.length; i++)
           a[i] = (int)(Math.random() * 90) + 1;

       System.out.println("Unsorted array:");
       printArray();

       sort(0, a.length - 1);

       System.out.println("\n\nSorted array:");
       printArray();
   }

   private static void printArray()
   {
       System.out.println();
       for (int i = 0; i < a.length; i++)
       {
           if (a[i] < 100)
               System.out.print(" ");

           if (a[i] < 10)
               System.out.print(" ");

           System.out.print(a[i] + " ");

           if ((i + 1) % 18 == 0)
               System.out.println();
      }
   }

   public static void sort(int startIndex, int endIndex)
   {
       if (startIndex >= endIndex)
           return;

       int pivotIndex = partition(startIndex, endIndex);

       sort(startIndex, pivotIndex);
       sort(pivotIndex + 1, endIndex);
   }

   public static int partition(int startIndex, int endIndex)
   {
       int pivotValue = a[startIndex];

       int i = startIndex - 1;
       int j = endIndex + 1;

       while (i < j)
       {
           for (i++; a[i] < pivotValue; i++);
           for (j--; a[j] > pivotValue; j--);
           if (i < j)
               swap(i, j);
      }
      return j;
   }

   public static void swap(int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}
