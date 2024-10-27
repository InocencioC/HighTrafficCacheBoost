package com.ino.cache.repository;

import com.ino.cache.entity.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Slf4j
public class ProductRepository {

        public List<Product> listAll() {
            log.info("c=ProductRepository, m=listAll");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            final Product product1 = Product.builder()
                    .sku("produto123")
                    .price(new BigDecimal("10.00"))
                    .description("Produto 1")
                    .build();

            final  Product product2 = Product.builder()
                    .sku("produto987")
                    .price(new BigDecimal("7.90"))
                    .description("Produto 2")
                    .build();

            List<Product> products = List.of(product1, product2);

            return products;
        }
}

