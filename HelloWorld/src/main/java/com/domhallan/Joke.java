package com.domhallan;

public class Joke {
    private String joke;
    private String jokeResponse;

    public Joke(String joke) {
        this.joke = joke;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

  public String getJokeResponse() {
    return jokeResponse;
  }

  public void setJokeResponse(String jokeResponse) {
    this.jokeResponse = jokeResponse;
  }
}
