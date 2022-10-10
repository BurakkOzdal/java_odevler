package odevler.hafta3.odev3.dataAccess;

import odevler.hafta3.odev3.entities.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
    List<Category> getAllCategories(List<Category> categories);
}
