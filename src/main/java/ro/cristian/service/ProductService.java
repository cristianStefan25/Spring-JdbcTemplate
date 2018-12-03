/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.cristian.dao.ProductDao;
import ro.cristian.db.Product;

/**
 *
 * @author crist
 */
@Service
public class ProductService {

    @Autowired
    private ProductDao dao;

    public void adaugaZeceProdus() {
        for (int i = 1; i <= 10; i++) {
            Product p = new Product("Product " + i);
            dao.adaugaProdus(p);
        }
    }

}
