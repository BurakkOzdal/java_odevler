package odevler.hafta3.odev3.dataAccess;

import odevler.hafta3.odev3.entities.Category;

import java.util.List;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori: "+category.getName() + "JDBC ile kaydedildi");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Kategori: "+category.getName() + "JDBC ile kaydedildi");
    }

    @Override
    public void update(Category category) {
        System.out.println("Kategori: "+category.getName() + "JDBC ile kaydedildi");
    }

    @Override
    public List<Category> getAllCategories(List<Category> categories) {
        System.out.println("Kategoriler JDBC ile kaydedildi");
        return categories;
    }
}
