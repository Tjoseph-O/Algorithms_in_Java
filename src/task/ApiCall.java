package task;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.ArrayList;
import java.util.List;


public class ApiCall {

    private static List<Products> productsApi= new ArrayList<>();
    public static void main(String[] args) throws IOException, URISyntaxException {

        URL url = new URL("https://fakestoreapi.com/products");

        InputStream data = url.openStream();













//        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
//        connect.setRequestMethod("GET");
//        connect.connect();

//        InputStream connect = url.getInputStream();
//        System.out.println();

//        int gettingResponse = connect.getResponseCode();
//        System.out.println(gettingResponse);
    }
}
