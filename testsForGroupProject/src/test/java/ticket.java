import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.given;


public class ticket {


    @Test
    public void getTest() {

        RequestSpecification request = given().contentType(ContentType.JSON);
        Response response = request.get("localhost:8082/ticket/getAll");
        Assert.assertEquals(200, response.getStatusCode());

    }

    @Test
    public void postTest() {

        JSONObject requestParems = new JSONObject();
        String url = "localhost:8082/ticket/add";
        RequestSpecification request = given().contentType(ContentType.JSON);
        requestParems.put("type", "child");
        requestParems.put("price", 1.25);
        Response response = request.post(url);
        Assert.assertEquals(201, response.getStatusCode());


    }

    @Test
    public void putTest() {
        String url = "localhost:8082/ticket/update/1";
        RequestSpecification request = given().contentType(ContentType.JSON);
        JSONObject requestParems = new JSONObject();
        requestParems.put("id", "1");
        requestParems.put("type", "adult");
        requestParems.put("price", 1.25);
        Response response = request.put(url);
        Assert.assertEquals(201, response.getStatusCode());

    }

    @Test
    public void deleateTest() {
        String url = "localhost:8082/edit/deleate/1";
        RequestSpecification request = given().contentType(ContentType.JSON);
        Response response = request.delete(url);
        Assert.assertEquals(204, response.getStatusCode());

    }

    @Test
    public void getByIdTest() {
        String url = "localhost:8082/ticket/get/1";
        RequestSpecification request = given().contentType(ContentType.JSON);
        Response response = request.get(url);
        Assert.assertEquals(200, response.getStatusCode());

    }

    @
}