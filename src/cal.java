import  javax.ws.rs.*; 
import javax.ws.rs.core.*;

@Path("/cal/{value1}/{value2}")

public class cal {
@GET
@Produces(MediaType.TEXT_PLAIN)
	int add (int x,int y)
	{
		return x+y;
	}

}
