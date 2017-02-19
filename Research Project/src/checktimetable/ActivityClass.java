/**
 * 
 */
package checktimetable;

/**
 * @author Sitong Chen
 *
 */

public class ActivityClass {
	private String title;
	private int startTime;
	private int endTime;
	private int day;
	
	public ActivityClass(String title, int startTime, int endTime, int day) {
		this.title = title;
		this.startTime = startTime;
		this.endTime = endTime;
		this.day = day;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the startTime
	 */
	public int getStartTime() {
		return startTime;
	}

	/**
	 * @return the endTime
	 */
	public int getEndTime() {
		return endTime;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	
	
}
