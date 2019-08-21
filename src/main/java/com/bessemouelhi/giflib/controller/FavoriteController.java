package com.bessemouelhi.giflib.controller;

import com.bessemouelhi.giflib.model.Gif;
import com.bessemouelhi.giflib.repositories.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author : Bessem MOUELHI
 * @since : 21/08/2019, mer.
 **/
@Controller
public class FavoriteController
{
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/favorites")
    public String listFavorite(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getFavorites();
        modelMap.put("gifs", gifs);
        return "favorites";
    }
}
