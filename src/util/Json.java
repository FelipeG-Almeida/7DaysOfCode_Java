package util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Movie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Json {
	private Json() {
	}

	public static List<Movie> parseJsonResponse(String src) throws IOException {
		List<Movie> movies = new ArrayList<>();

		ObjectMapper objectMapper = new ObjectMapper();

		JsonNode jsonNode = objectMapper.readTree(src);

		for (JsonNode movieNode : jsonNode.get("results")) {
			String nome = movieNode.get("title").asText();
			String urlPoster = movieNode.get("poster_path").asText();
			String sinopse = movieNode.get("overview").asText();
			String estreia = movieNode.get("release_date").asText();
			int generoUm = movieNode.get("genre_ids").get(0).asInt();
			int generoDois = 0;
			if (movieNode.get("genre_ids").size() > 1) {
				generoDois = movieNode.get("genre_ids").get(1).asInt();
			}
			double nota = movieNode.get("vote_average").asDouble();

			movies.add(new Movie(nome, urlPoster, sinopse, estreia, generoUm, generoDois, nota));
		}


		return movies;
	}
}
