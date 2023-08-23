package Core;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.json.JSONObject;



@Path("Start")
public class API {
    JSONObject json;
    Helper helper;

  
    public API() {
        helper = new Helper();
    }

    //<editor-fold defaultstate="collapse" desc="Test ">
    @Path("Test")
    @GET
    @Produces(jakarta.ws.rs.core.MediaType.APPLICATION_JSON)
    public String test() {
     
        return "Obi is a boy";
     
    } //</editor-fold>
    
  //<editor-fold defaultstate="collapse" desc="Entrol ">
    @Path("enroll")
    @GET
    @Produces(jakarta.ws.rs.core.MediaType.APPLICATION_JSON)
    public String enroll( @FormParam("userID")int user_id, @FormParam("courseID")
                         int course_id, @FormParam("paymentID")String payment_id){
           
           json = new JSONObject();
           json.put("status","successful");
        return json.toString();
           
            
    } //</editor-fold>
   
    @PUT
    @Consumes(jakarta.ws.rs.core.MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
