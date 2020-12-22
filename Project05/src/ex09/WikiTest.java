package ex09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class WikiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newUrls = "https://ko.wikipedia.org/wiki/ISO_3166-1";
		ArrayList<String> htmls = new ArrayList<>();
		
		URL url = null;
		try {
			url = new URL(newUrls);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(url.openStream(), "utf-8")
			);
			
			String line = null;
			while((line = br.readLine()) != null) {
				if(!line.trim().equals("")) {
					htmls.add(line.trim());
				}
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String html : htmls) {
			System.out.println(html);
		}
		
		
		
	}

}
