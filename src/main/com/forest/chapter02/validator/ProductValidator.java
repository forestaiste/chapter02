package com.forest.chapter02.validator;

import java.util.ArrayList;
import java.util.List;

import com.forest.chapter02.form.ProductForm;

/**
 * Created by Forest on 4/26/2016.
 */
public class ProductValidator {
    public List<String> validate(ProductForm productForm) {
    List<String> errors = new ArrayList<String>();
    String name = productForm.getName();
    if (name == null || name.trim().isEmpty()) {
        errors.add("Product must have a name");
    }
    String price = productForm.getPrice();
    if (price == null || price.trim().isEmpty()) {
        errors.add("Product must have a price");
    } else {
        try {
            Float.parseFloat(price);
        } catch (NumberFormatException e) {
            errors.add("Invalid price value");
        }
    }
    return errors;
}
}
