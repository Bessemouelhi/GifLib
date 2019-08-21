package com.bessemouelhi.giflib.controller;

import com.bessemouelhi.giflib.model.Gif;
import com.bessemouelhi.giflib.repositories.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : Bessem MOUELHI
 * @since : 15/08/2019, jeu.
 **/
@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.all();
        modelMap.put("gifs", gifs);
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetail(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.getByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }

    @RequestMapping("/search")
    public String search (@RequestParam String q, ModelMap modelMap) {
        List<Gif> gifs = gifRepository.findByName(q);
        modelMap.put("gifs", gifs);
        return "home";
    }
}
