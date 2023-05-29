import java.util.Comparator;
public class SortByBurstTime implements Comparator<Process> {

	@Override
	public int compare(Process o1, Process o2) {
		
		return o1.BT-o2.BT;
	}

}
