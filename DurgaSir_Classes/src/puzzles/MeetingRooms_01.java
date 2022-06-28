package puzzles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingRooms_01 {

	public int minMeetingRooms(List<Interval> intervals)
	{
		Collections.sort(intervals, (a,b)-> Integer.compare(a.start, b.start));
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int room = 0;
		for(Interval interval : intervals)
		{
			if(!pq.isEmpty() && interval.start>=pq.peek())
			{
				pq.poll();
			}
			else
			{
				room++;
			}
			pq.add(interval.end);
		}
		return room;
	}
	public static void main(String[] args) {

		Interval i1 = new Interval(30, 75);
		Interval i2 = new Interval(0, 50);
		Interval i3 = new Interval(60, 150);
		
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
				
		MeetingRooms_01 m = new MeetingRooms_01();
		int minRooms = m.minMeetingRooms(intervals);
		System.out.println("Minimum meeting rooms required : "+minRooms);
		
		Interval arr[] = new Interval[3];
		arr[0] = new Interval(30, 75);
		arr[1] = new Interval(0, 50);
		arr[2] = new Interval(60, 150);
		
	}

}
