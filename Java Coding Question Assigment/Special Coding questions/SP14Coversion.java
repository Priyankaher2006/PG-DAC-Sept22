/*
14. You are given a list of strings, times, where each string represent a timestamp of a 
twenty-four hour clock (i.e. hours and minutes - “HH:MM”). Return the minimum 
difference, in minutes, between any two of the timestamps in the list.
Ex: Given the following times…
times = ["01:00", "01:10"], return 10 (i.e. there are 10 minutes between the two times).
Ex: Given the following times…
times = ["00:00", "12:23", "05:50", "23:12"], return 48.
*/

import java.util.*;

public class SP14Coversion
{
    public int findMinDifference(List<String> timePoints) 
	{

        System.out.println("times = " + Arrays.toString(timePoints.toArray()));
        int minimum = Integer.MAX_VALUE;

        List<Integer> minutesList = getMins(timePoints);
        
		Collections.sort(minutesList);
        
		int first = minutesList.get(0);
        int last = minutesList.get(minutesList.size()-1);
        
		minimum = Math.min(minimum, first+1440-last);
        int prev = minutesList.get(0);
        
		for(int i=1;i<minutesList.size();i++)
		{
            int x = minutesList.get(i)-prev;
            int y = prev + 1440 -  minutesList.get(i);
            minimum = Math.min(Math.min(x, y), minimum);
            prev =  minutesList.get(i);
        }
        
		System.out.println("minimum time difference: " + minimum);
        return minimum;
    }

    private List<Integer> getMins(List<String> timePoints)
	{
        List<Integer> minutesList = new ArrayList<>();
        for(int i=0;i<timePoints.size();i++) 
		{
            String[] temp = timePoints.get(i).split(":");
            int hour = Integer.parseInt(temp[0]);
            int min = Integer.parseInt(temp[1]) + 60 * hour;
            minutesList.add(min);
        }
        return minutesList;
    }

    public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String filtered = str.replaceAll("\\[|\\]|\"| ","");
		
		List<String> timePoints = new ArrayList<String>(Arrays.asList(filtered.split(",")));
				
        TimeDiff m = new TimeDiff();
		
        m.findMinDifference(timePoints);
    }
}