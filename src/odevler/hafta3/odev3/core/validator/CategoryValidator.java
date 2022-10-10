package odevler.hafta3.odev3.core.validator;

import odevler.hafta3.odev3.entities.Category;

public class CategoryValidator {
    public static boolean isValid(Category category){
        return !category.getName().isEmpty();
    }
}
