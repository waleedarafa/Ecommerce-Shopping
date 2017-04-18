/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nitsoft.ecommerce.service;

import com.nitsoft.ecommerce.database.model.ProductAttribute;
import com.nitsoft.ecommerce.repository.ProductAttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author NHU LINH
 */
@Service
public class ProductAttributeService {
    @Autowired
    private ProductAttributeRepository productAttributeRepository;

    public Iterable<ProductAttribute> findAll() {
        return productAttributeRepository.findAll();
    }
}
