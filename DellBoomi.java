import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DellBoomi {
	 static ZoneId pst = ZoneId.of("America/Los_Angeles");
	   // static ZoneId est = ZoneId.of("America/New_York");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime parse = LocalDateTime.parse("2019-03-01T04:41:53.620");
        ZonedDateTime currentPSTime = parse.atZone(pst);                //India Time
      //  ZonedDateTime currentESTime = currentPSTime.withZoneSameInstant(est);       //ET Time
	
        //DateTimeFormatter.
       // System.out.println(currentESTime);
        String timeColonPattern = "yyyy-MM-dd HH:mm:ss SSS";
        DateTimeFormatter timeColonFormatter = DateTimeFormatter.ofPattern(timeColonPattern);
        System.out.println(currentPSTime.toOffsetDateTime().toString());
        System.out.println(timeColonFormatter.format(currentPSTime));
        
       
	}

}
