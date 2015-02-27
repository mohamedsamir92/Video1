package SWE;
import  javax.ws.rs.*; 
import javax.ws.rs.core.*;
import java.net.URI;


@Path("/momo/{value1}/{value2}")
public class cal {
@GET
@Produces(MediaType.TEXT_PLAIN)
	public String add (@PathParam("value1") String x,@PathParam("value2") String  y)
	{
		return x+y;
	}

}
