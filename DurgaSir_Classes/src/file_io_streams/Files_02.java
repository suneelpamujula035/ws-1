package file_io_streams;

import java.io.File;

public class Files_02 {

	public static void main(String[] args) {

		//to display the name of all files and directories present in specified location
		File f = new File("C:\\Simpli Learn\\DurgaSir_Classes\\suneel1234");
		String[] list = f.list();
		int count = 0;
		for(String s : list)
		{
			count++;
			System.out.println(s);
		}
		System.out.println("Total number of files :"+count);
		
		//to display the name of only file names present in specified location
		File f1 = new File("C:\\Simpli Learn\\DurgaSir_Classes\\suneel1234");
		String[] list1 = f1.list();
		int count1 = 0;
		for(String s1 : list1)
		{
			File f2 = new File(f1,s1);
			if(f2.isFile())
			{
				count1++;
				System.out.println(s1);
			}
		}
		System.out.println("Total number of files :"+count1);
	}

}
