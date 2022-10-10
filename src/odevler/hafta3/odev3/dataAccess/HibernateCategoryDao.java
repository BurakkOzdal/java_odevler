package odevler.hafta3.odev3.dataAccess;

import odevler.hafta3.odev3.entities.Category;

import java.util.List;

public class HibernateCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori: "+category.getName() + "Hibernate ile kaydedildi");

    }

    @Override
    public void delete(Category category) {
        System.out.println("Kategori: "+category.getName() + "Hibernate ile silindi");
    }

    @Override
    public void update(Category category) {
        System.out.println("Kategori: "+category.getName() + "Hibernate ile güncellendi");
    }

    @Override
    public List<Category> getAllCategories(List<Category> categories) {
        System.out.println("Kategoriler Hibernate ile getirildi");
        return categories;
    }
}
