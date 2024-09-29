package com.buildlive.guesstheword.controller;

import com.buildlive.guesstheword.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/game")
public class GameController {



    @Autowired
    GameService gameService;

    @GetMapping("/home")
    public String showHomePage(Model model){
       String randomWord =  gameService.toString();
       model.addAttribute("randomWord",randomWord);
       return "game-home-page";
    }


}
