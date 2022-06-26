package com.basic.java.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SolutionTest {

	public static void main(String[] args) {
		String result = Result.getPhoneNumbers("India", "8884144564");
		System.out.println(result);
	}

}


class Result {
	
	public static String getPhoneNumbers(String country, String nubmer ) {
		
		String URI = "https://jsonmock.hackerrank.com/api/countries?name="+ country;
		StringBuffer content = null;
		try {
			URL url = new URL(URI);
			HttpURLConnection connection  = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			int status = connection.getResponseCode();
			System.out.println(status);
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			connection.disconnect();		
					
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return content.toString();
		
	}
	
}

