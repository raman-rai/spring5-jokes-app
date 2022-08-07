package raman.spring.jokesapp.service;

import guru.springframework.norris.chuck.*;

public class ChuckNorrisJokesService implements JokesService {
    @Override
    public String getJokes() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        return quotes.getRandomQuote();
    }
}
