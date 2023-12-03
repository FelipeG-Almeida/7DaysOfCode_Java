import api.ApiClient;
import dto.Movie;

import java.io.File;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.util.List;

import static util.HTMLGenerator.buildHtml;
import static util.Json.parseJsonResponse;

public class Main {
	public static void main(String[] args) {


		try (PrintWriter writer = new PrintWriter(new File("index.html"))) {

			HttpResponse<String> response = ApiClient.GetMovies();
			List<Movie> movieList = parseJsonResponse(response.body());

			String html = buildHtml(movieList);
			writer.println(html);

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
}