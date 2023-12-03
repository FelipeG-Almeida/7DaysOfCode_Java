package util;

import java.util.HashMap;
import java.util.Map;

public class GeneroMapper {
	public static String obterGenero(Integer id) {
		Map<Integer, String> generosMap = new HashMap<>();
		generosMap.put(28, "Ação");
		generosMap.put(12, "Aventura");
		generosMap.put(16, "Animação");
		generosMap.put(35, "Comédia");
		generosMap.put(80, "Crime");
		generosMap.put(99, "Documentário");
		generosMap.put(18, "Drama");
		generosMap.put(10751, "Família");
		generosMap.put(14, "Fantasia");
		generosMap.put(36, "História");
		generosMap.put(27, "Terror");
		generosMap.put(10402, "Música");
		generosMap.put(9648, "Mistério");
		generosMap.put(10749, "Romance");
		generosMap.put(878, "Ficção Científica");
		generosMap.put(10770, "Filme para TV");
		generosMap.put(53, "Suspense");
		generosMap.put(10752, "Guerra");
		generosMap.put(37, "Faroeste");

		if (id == 0) {
			return "";
		}

		return generosMap.get(id);
	}
}
