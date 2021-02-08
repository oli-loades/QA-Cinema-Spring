import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import  io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;




import static io.restassured.RestAssured.given;

public class movieTimeTest {

    @Test
    public void  getTest(){
        RequestSpecification request =  given().contentType(ContentType.JSON);
        Response response = request.get("localhost:8082/time/getAll" );
        Assert.assertEquals(200,response.getStatusCode());
    }
}
