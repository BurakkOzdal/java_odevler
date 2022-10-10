package odevler.hafta3.odev3.business;

import odevler.hafta3.odev3.core.logging.Logger;
import odevler.hafta3.odev3.core.validator.CategoryValidator;
import odevler.hafta3.odev3.core.validator.InstructorValidator;
import odevler.hafta3.odev3.dataAccess.CategoryDao;
import odevler.hafta3.odev3.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category){
        if (CategoryValidator.isValid(category)){
            System.out.println("Kayıt Başarılı...");
            categoryDao.add(category);
            for (Logger logger:loggers){
                logger.log(category.getName());
            }
        }else {
            System.out.println("Bilgileri Kontrol ediniz...");
        }
    }
}
