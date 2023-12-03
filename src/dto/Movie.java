package dto;

public record Movie(String nome,
                    String urlPoster,
                    String sinopse,
                    String estreia,
                    int generoUm,
                    int generoDois,
                    double nota) {
}
