package com.bessemouelhi.giflib.repositories;

import com.bessemouelhi.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Bessem MOUELHI
 * @since : 20/08/2019, mar.
 **/
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Technology"),
            new Category(2, "People"),
            new Category(3, "Destruction")
    );

    public List<Category> all() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for (Category c : ALL_CATEGORIES) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
