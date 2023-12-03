package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
	public static HttpResponse GetMovies() throws Exception {
		String apiKey = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0ZGZhMTE0NTIxMDYyMDJlYmIxODQ1MWU0ZTA0OTg0NiIsInN1YiI6IjY1NWNjMDlhZWE4NGM3MTA5NWEwZDA1NSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.9EJev8HvT7XuosUPZ66vhgeFtYoc65QGbsZjLUWoH8g";

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://api.themoviedb.org/3/movie/top_rated?language=pt-BR&page=1"))
				.header("Authorization", apiKey)
				.GET().build();

		HttpResponse<String> response =  HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		return response;
	}
}
