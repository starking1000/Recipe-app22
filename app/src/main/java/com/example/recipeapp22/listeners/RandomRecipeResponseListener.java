package com.example.recipeapp22.listeners;

import com.example.recipeapp22.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch(RandomRecipeApiResponse response,String message);
    void didError(String message);
}
