# 7 Days of Code Challenge - Projeto Java da Alura

Este projeto foi desenvolvido como parte do desafio "7 Days of Code" de Java da Alura. O objetivo do projeto é aplicar diversos conceitos e métodos da linguagem Java para acessar a API do TMDB (The Movie Database) e gerar um arquivo HTML contendo informações sobre os filmes mais bem avaliados.

## Como funciona

O projeto consiste em um programa Java que utiliza a API do TMDB para obter informações sobre os filmes mais bem avaliados. Essas informações são então processadas e utilizadas para gerar um arquivo HTML que exibe detalhes como título, sinopse, gêneros, data de lançamento e nota de cada filme.

## Estrutura do Projeto

O projeto é dividido em três principais pacotes:

### 1. Main

O pacote `main` contém a classe principal `Main`, que é responsável por orquestrar a execução do programa. O arquivo HTML gerado é salvo como `index.html`.

### 2. Api

O pacote `api` contém a classe `ApiClient`, que lida com a comunicação com a API do TMDB. A chave de autenticação é armazenada na variável `apiKey`.

### 3. Util

O pacote `util` contém três classes:

- `Json`: Responsável por fazer o parsing da resposta JSON da API do TMDB e converter em uma lista de objetos `Movie`.
- `HTMLGenerator`: Responsável por construir o conteúdo HTML usando as informações dos filmes.
- `GeneroMapper`: Responsável por traduzir o id do gênero do filme para o respectivo gênero.

## Como executar

1. Clone o repositório para a sua máquina local:

```bash
git clone https://github.com/FelipeG-Almeida/7DaysOfCode_Java.git
```

Certifique-se de substituir a chave de API no código pela sua própria chave válida do TMDB. Após isso, execute a classe `Main` para gerar o arquivo HTML.

```java
public class Main {
    public static void main(String[] args) {
        // ... (código de inicialização)
    }
}
```

O projeto utiliza as seguintes dependências:

- **Java HttpClient** para fazer requisições à API do TMDB.
- **Jackson** para fazer o parse das respostas JSON.

Certifique-se de ter essas dependências instaladas ou configuradas corretamente em seu ambiente.
