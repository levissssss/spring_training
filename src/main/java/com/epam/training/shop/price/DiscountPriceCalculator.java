package com.epam.training.shop.price;

import com.epam.training.shop.model.Product;

import java.math.BigDecimal;

public class DiscountPriceCalculator {

    public BigDecimal price(Product product) {
        return product.getPrice().multiply(new BigDecimal("0.9"));
    }

}
