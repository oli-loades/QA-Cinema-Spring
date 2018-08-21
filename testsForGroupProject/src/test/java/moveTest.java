import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



import static io.restassured.RestAssured.given;

public class moveTest {
    JSONObject  requestParems;
    RequestSpecification request
    @Before
    public void  setUp()
    {
        requestParems = new JSONObject();
        request  = given().contentType(ContentType.JSON);
    }
    @Test
    public void getTest() {
        RequestSpecification request = given().contentType(ContentType.JSON);
        Response response = request.get("http://localhost:8082/movie/getAll");
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void  postTest(){


        String  server =  "http://localhost:8082/movie/";

        requestParems.put("Title", "Outlaw King");
        requestParems.put("imdbId",  "tt6679794");

        Response response =  request.post(server);
        Assert.assertEquals(201, response.getStatusCode());
    }

    @Test
    public void  putTest(){
        String  server = "http://localhost:8082/movie/";
        requestParems.put();s



    }

}

