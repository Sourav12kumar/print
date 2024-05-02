
public class JaggedArray {
   public static void main(String a[])
   {    
      // Declaration of jagged Array 
    int nums[][] = new int[5][];
    nums [0] = new int[1];
    nums [1] = new int[2];
    nums [2] = new int[3];
    nums [3] = new int[4];
    nums [4] = new int[1];
   
      // Initializing of Array with Random Math library
    for(int i=0; i<nums.length; i++)
    {
      for(int j=0; j<nums[i].length; j++)
      {
         nums[i][j] = (int)(Math.random()*10);
      }
    }
    // For printing the value of array using unique technique
      for(int n[]: nums)
      {
         for(int m : n)
         {
         System.out.print(m+ " ");
         }
         System.out.println();
      }

          System.out.println();
      for(int i=0; i<nums.length; i++)
      {
          for(int j=0; j<nums[i].length; j++)
          {
             System.out.print(nums[i][j]+ " ");
          }
          System.out.println();
      }
      
    }
}
