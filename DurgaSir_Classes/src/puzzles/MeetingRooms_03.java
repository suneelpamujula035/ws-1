package puzzles;

import java.util.Arrays;

public class MeetingRooms_03 {

	public int minimumNumberOfMeetingRooms(Interval arr[]) {

		Arrays.sort(arr, (a,b)->a.start - b.start);
	   
	    int i = 1;
	    int j = 0;

	    int minMeetingRoomsRequired = 1;
	    int noOfOngoingMeetings = 1;

	    while(i<arr.length && j<arr.length) 
	    {
	    	if(arr[i].start < arr[i].end)
	    	{
	    		noOfOngoingMeetings++;
	    		if(minMeetingRoomsRequired < noOfOngoingMeetings)
	    		{
	    			minMeetingRoomsRequired = noOfOngoingMeetings;
	    		}
	    		i++;
	    	}
	    	else
	    	{
	    		noOfOngoingMeetings--;
	    		j++;
	    	}
	    }
		return minMeetingRoomsRequired;
	  }
	public static void main(String[] args) {

		Interval arr[] = new Interval[3];
		arr[0] = new Interval(30, 75);
		arr[1] = new Interval(0, 50);
		arr[2] = new Interval(60, 150);
		
		MeetingRooms_03 m = new MeetingRooms_03();
		int minRooms = m.minimumNumberOfMeetingRooms(arr);
		System.out.println("Minimum meeting rooms required : "+minRooms);
	}

}
