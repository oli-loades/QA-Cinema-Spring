import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Request;


import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class OrderTest {

    @Test
    public void getTest() {
        String url = " http://localhost:8182/order/getAll";

        RequestSpecification reqquest = given().contentType(ContentType.JSON);
        Response response = reqquest.get(url);
        Assert.assertEquals(200,response.getStatusCode());
    }

    public void postTest(){
        JSONObject requestParems = new JSONObject();
        String url = "http://localhost:8182/order/addAll";
        JSONArray  MovieArray = new JSONArray();

        Map<String,Object>  nestedObject = new HashMap<>();

        RequestSpecification request = given().contentType(ContentType.JSON);
        Response  response  = given().get();
    }

    public  void  deleateTest(){
         String url = "Localhvvvvvost://8182/Orders";
         String




    }









}
