import com.sun.org.apache.regexp.internal.RE;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.awt.image.ReplicateScaleFilter;

import static io.restassured.RestAssured.given;

public class moveTest {


    @Test
    public void getTest() {
        RequestSpecification request = given().contentType(ContentType.JSON);
        Response response = request.get("http://localhost:8082//movie//getAll");
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void  postTest() {


        JSONObject requestParems = new JSONObject();

        String server = "http://localhost:8082/movie/add";
        RequestSpecification request = given().contentType(ContentType.JSON);

        requestParems.put("Title", "Outlaw King");
        requestParems.put("imdbId", "tt6679794");
        Response response = request.post(server);
        Response requestSpefication = request.post(server);
        Response requestSpeficaiton = request.post();
        Assert.assertEquals(201, response.getStatusCode());

    }
    @Test
    public void  deleteTest(){

        RequestSpecification request = given().contentType(ContentType.JSON);
        String  server = "http://localhost:8082/movie/1";
        Response response1 =  request.delete(server);

    }

    @Test
    public void getBytitleTest(){
        RequestSpecification request = given().contentType(ContentType.JSON);
       Response response  = request.get("http://localhost:8082/movie/get/Tag");
       Assert.assertEquals(200, response.getStatusCode());
    }

}

