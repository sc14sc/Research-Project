package checktimetable;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScheduleServlet
 */
@WebServlet("/ScheduleServlet")
public class ScheduleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		int starttime = Integer.parseInt(request.getParameter("starttime"));
		int endtime = Integer.parseInt(request.getParameter("endtime"));
		String[] days = request.getParameterValues("day");
		ActivitySchedule schedule = (ActivitySchedule)request.getSession(true).getAttribute("schoolschedule");
		if(schedule == null) {
			schedule = new ActivitySchedule();
			}
		if(days != null) {
			for(int i = 0; i < days.length; i++){
				String dayString = days[i];
				int day;
				if(dayString.equalsIgnoreCase("SUN")) day = 0;
				else if(dayString.equalsIgnoreCase("MON")) day = 1;
				else if(dayString.equalsIgnoreCase("TUE")) day = 2;
				else if(dayString.equalsIgnoreCase("WED")) day = 3;
				else if(dayString.equalsIgnoreCase("THU")) day = 4;
				else if(dayString.equalsIgnoreCase("FRI")) day = 5;
				else day = 6;
				
				ActivityClass act = new ActivityClass(title, starttime, endtime, day);
				schedule.addActivity(act);
				}
			}
		
		request.getSession().setAttribute("schoolschedule",  schedule);
		getServletContext().getRequestDispatcher("/Schedule.jsp").forward(request, response);
		}
	}
