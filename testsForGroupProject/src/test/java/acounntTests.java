import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Request;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.objectMapper;
import static io.restassured.RestAssured.responseSpecification;

public class acounntTests {

    @Test
    public void getTest() {
        RequestSpecification request = given().contentType(ContentType.JSON);
        Response response = request.get("http://localhost:8182/acounts/getAll");
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test
    public  void postTest() {

        JSONObject requestParems = new JSONObject();
        String server = "http://localhost:8182/";
        requestParems.put("firstName","Rachel");
        requestParems.put("LastName", "Lowe");
        /requestParems.put("Orders",  );






    }

}