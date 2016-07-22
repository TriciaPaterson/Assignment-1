
public class Event implements EventList {

	private static String eventName;
	private static String eventHeadline;
	
	public Event()
	{
		
	}
	
	public Event(String n, String d)
	{
		eventName = n;
		eventHeadline = d;
	}
	
	@Override
	public String setEventName(String eName) {
		
		return eventName = eName;
	}
	
	@Override
	public String setHeadline(String eHeadline) {
		
		return eventHeadline = eHeadline;		
	}

	@Override
	public void display(String eventName, String eventHeadline) {
	
		System.out.println(eventName + "\t" + eventHeadline);		
	}
	
	@Override
	public void displayHeader() {
		
		System.out.println("Event\t\tEvent Headline\n" + 
				"-----------------------------------------------------------------------------\n");
		
	}
	
	public static void main(String[] args)
	{
		
		Event e = new Event();
		e.displayHeader();
		e.setEventName("Burgulary");  //Name of event
		e.setHeadline("Alarm going male seen running from the scene"); // initial information from caller
		e.display(eventName, eventHeadline);
		e.setEventName(" \t");
		e.setHeadline("TD 2 minutes"); // TD means Time Delay. The rest of the headlines are updated information coming in from call taker.
		e.display(eventName, eventHeadline);
		e.setHeadline("DOT right on to Skyline Street"); // DOT means Direction of travel. Updated information
		e.display(eventName, eventHeadline);
		e.setHeadline("MOT on foot"); // MOT means Mode of travel. Updated information
		e.display(eventName, eventHeadline);
		e.setHeadline("Male caucasian green hoodie dark coloured pants");// Updated information
		e.display(eventName, eventHeadline);	
	}



}
