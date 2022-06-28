package puzzles;

import java.util.Arrays;

public class MeetingRooms_02 {

	public int minNoOfMeetingsRooms(long[] start, long[] end)
	{
		Arrays.sort(start);
		Arrays.sort(end);
		
		int noOfOngoingMeetings = 1;
		int noOfMeetingRooms = 1;
		int i = 1;
		int j = 0;
		
		while(i<start.length && j<end.length)
		{
			if(start[i]<end[j])
			{
				noOfOngoingMeetings++;
				if(noOfMeetingRooms < noOfOngoingMeetings)
				{
					
					{
						noOfMeetingRooms = noOfOngoingMeetings;
					}
				}
				i++;
			}
			else
			{
				noOfOngoingMeetings--;
				j++;
			}
		}
		
		
		return noOfMeetingRooms;
	}
	public static void main(String[] args) {

		long start[] = { 9L, 11L, 9L };
		long end[] = { 14L, 12L, 11L };
		
		MeetingRooms_02 m = new MeetingRooms_02();
		int minRooms = m.minNoOfMeetingsRooms(start, end);
		System.out.println("Minimum number of rooms required : "+minRooms);
		
	}

}
