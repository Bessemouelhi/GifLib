package com.bessemouelhi.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : Bessem MOUELHI
 * @since : 15/08/2019, jeu.
 **/
@Controller
public class GifController {
    @RequestMapping("/")
    @ResponseBody
    public String listGifs() {
        return "List of Gifs";
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String getGif() {
        return "A Gif";
    }
}
