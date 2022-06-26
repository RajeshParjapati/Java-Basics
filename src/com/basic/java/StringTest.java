package com.basic.java;

public class StringTest {

	public static void main(String[] args) {
		String jsonString ="{\"expirationYear\":\"2024\",\"cvv2\":\"345\",\"walletId\":17851915,\"address\":{\"address1\":\"1000 N Alameda St\",\"address2\":\"\",\"city\":\"Los Angeles\",\"stateProv\":\"CA\",\"country\":\"US\",\"postalCode\":\"90012\"}";
		String maskedString = maskCVVInJson(jsonString);
		System.out.println(jsonString);
		System.out.println(maskedString);
		
		String jsonString2= "{\"expirationYear\":\"2024\",*\"cvv2\":\"567\"*,\"walletId\":17851915,\"address\":\\{\"address1\":\"1000 N Alameda St\",\"address2\":\"\",\"city\":\"Los Angeles\",\"stateProv\":\"CA\",\"country\":\"US\",\"postalCode\":\"90012\"}";
		String maskedString2 = maskCVVInJson(jsonString2);
		System.out.println(jsonString2);
		System.out.println(maskedString2);
	}
	
	public static String maskCVVInJson(String jsonData) {
		try {
			
			int indexOfCVV = jsonData.indexOf("\"cvv2\"");

			if (indexOfCVV != -1) {
				int startIndex = indexOfCVV + 8;
				// this should located the next " at the end of the actual cvv value
				int nextDoubleQuote = jsonData.indexOf("\"", startIndex);
				nextDoubleQuote++;
				StringBuilder sb = new StringBuilder();
				sb.append(jsonData.substring(0, indexOfCVV));
				sb.append("\"maskedCvv\":\"XXX\"");
				sb.append(jsonData.substring(nextDoubleQuote));
				jsonData = sb.toString();
			}
		} catch (Exception ex) {
			System.out.println(" unable to Mask CVV2 in json, ");
		}
		return jsonData;
	}

}
