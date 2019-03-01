package com.monirulmask.spring5recipeapp.controllers;

import com.monirulmask.spring5recipeapp.domain.Category;
import com.monirulmask.spring5recipeapp.domain.UnitOfMeasure;
import com.monirulmask.spring5recipeapp.repositories.CategoryRepository;
import com.monirulmask.spring5recipeapp.repositories.UnitOfMeasureRepository;
import com.monirulmask.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by monir on 2/25/2019.
 */
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}