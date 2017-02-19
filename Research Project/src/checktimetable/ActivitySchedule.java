/**
 * 
 */
package checktimetable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sitong Chen
 *
 */
public class ActivitySchedule {
	private List activities = new ArrayList();

	/**
	 * @return the activities
	 */
	public List getActivities() {
		return activities;
	}
	
	public void addActivity(ActivityClass activityClass) {
		activities.add(activityClass);
	}
}
