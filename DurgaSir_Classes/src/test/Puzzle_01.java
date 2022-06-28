package test;

public class Puzzle_01 {

	public boolean addElements(int[] arr, int k)
	{
        for (int i=0; i<=arr.length-1; i++)
        {
            for (int j=i+1; j<=arr.length-1; j++)
            {
                if (arr[i]+arr[j]==k)
                {
                    return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		
		int[] arr = {10,15,3,7,5};
		Puzzle_01 p = new Puzzle_01();
        boolean status = p.addElements(arr, 21);
        System.out.println(status);
	}

}
