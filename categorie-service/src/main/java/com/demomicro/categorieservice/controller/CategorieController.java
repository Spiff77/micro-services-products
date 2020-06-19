package com.demomicro.categorieservice.controller;

import com.demomicro.categorieservice.model.Categorie;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

public class CategorieController {

    @GetMapping("categories")
    public List<Categorie> getAll() {
        return Arrays.asList(
                new Categorie(1, "Categorie 1"),
                new Categorie(2, "Categorie 2"),
                new Categorie(3, "Categorie 3")
        );
    }

    @GetMapping("categories/{id}")
    public Categorie getAll(@PathParam("id") int id) {
                return new Categorie(id, "Categorie "+id);
    }
}
