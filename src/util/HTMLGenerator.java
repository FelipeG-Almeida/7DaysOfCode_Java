package util;

import dto.Movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static util.GeneroMapper.obterGenero;

public class HTMLGenerator {
	public static String buildHtml(List<Movie> filmes) throws ParseException {
		StringBuilder htmlBuilder = new StringBuilder();
		SimpleDateFormat dataEntrada = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
		SimpleDateFormat dataSaia = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

		htmlBuilder.append("""
					<head>
						<meta charset="UTF-8">
						<link rel="stylesheet" href="main.css">
					</head>
				""");

		for (Movie filme : filmes) {
			Date estreia = dataEntrada.parse(filme.estreia());
			htmlBuilder.append("""
					                   <li>
					                       <img class="poster" src="https://image.tmdb.org/t/p/original/%s"/>
					                       <div class="content">
					                        <p class="titulo">%s</p>
					                        <p class="sinopse">Sinópse: %s</p>
					                        <small class="generos">Gêneros: %s, %s</small>
					                        <p class="estreia">Lançamento: %s</p>
					                        <p class="nota">Nota: %.1f/10</p>
					                       </div>
					                   </li>
					""".formatted(filme.urlPoster(),
					filme.nome(),
					filme.sinopse(),
					obterGenero(filme.generoUm()),
					obterGenero(filme.generoDois()),
					dataSaia.format(estreia),
					filme.nota()));
		}
		return htmlBuilder.toString();
	}
}
