package com.niteshb.jokeapplication.controllers;

import com.niteshb.jokeapplication.models.Joke;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @RequestMapping("/")
    public String getJoke(Model model){
        Joke joke = (Joke) model;
        return joke.getJoke();
    }


}
