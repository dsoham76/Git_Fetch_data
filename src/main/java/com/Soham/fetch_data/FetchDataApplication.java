package com.Soham.fetch_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class FetchDataApplication {

	public static void main(String[] args) throws IOException,InterruptedException {
		String url="https://api.chucknorris.io/jokes/random";
		//http request
		HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		HttpClient client=HttpClient.newBuilder().build();
		HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());





	}

}
