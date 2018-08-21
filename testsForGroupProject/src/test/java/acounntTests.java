import cucumber.api.java.it.Ma;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpRequest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Request;

import java.util.HashMap;
import java.util.Map;

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

        JSONArray orderArray = new JSONArray();
        JSONArray JSONArray = new JSONArray();
        JSONArray  tickArray = new JSONArray();


        JSONObject requestParems = new JSONObject();
        RestAssured.baseURI = "http://localhost:8182/acounts";

        Map<String,Object> emptyAcount = new HashMap<>();
        Map<String,Object>  emptyOrder = new HashMap<>();


        Map<String,Object>  nestedOrderAsMap = new HashMap<>();
        Map<String,Object>  nestedMoiveAsMap = new HashMap<>();
        Map<String,Object>  nestedTicketAsMaps = new HashMap<>();

        nestedTicketAsMaps.put("id", "");

        nestedMoiveAsMap.put("id", 1);
        nestedMoiveAsMap.put("title", "Outlaw King");
        nestedMoiveAsMap.put("imdbID", "tt6679794");

        nestedOrderAsMap.put("id", 1);
        nestedOrderAsMap.put("order",nestedMoiveAsMap);
        //nestedOrderAsMap.put("");

        requestParems.put("firstName","Rachel");
        requestParems.put("LastName", "Lowe");



    }
    @Test
    public void  putTest(){


    }

    @Test
    public void deleateTest(){
        String url = "http://localhost:8182/acounts/delete";
        RequestSpecification request = given().contentType(ContentType.JSON);


    }



}