package com.jsonreader;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ParseJSON{

	public static JSONParser parser;
	public static JSONObject jsonObject;

	public static void parseJSONfile() {
		parser = new JSONParser();
		try {
			Object object = parser.parse(new FileReader("data.json"));

			// convert Object to JSONObject
			jsonObject = (JSONObject) object;

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getData(String arrayname, String testcase, String data)

	{
		String jsondata = "";
		try {
			// Reading the array
			JSONArray arr = (JSONArray) jsonObject.get(arrayname);

			for (int i = 0; i <= arr.size() - 1; i++)

			{
				JSONObject item = (JSONObject) arr.get(i);

				String crnttestcase = (String) item.get("TestCase");

				if (crnttestcase.equalsIgnoreCase(testcase)) {

					jsondata = (String) item.get(data);

					System.out.println(jsondata);

					break;

				}

			}

		}

		catch (Exception e) {
			System.out.println("Unable to get the data for the field " + data);
		}
		return jsondata;

	}

}
