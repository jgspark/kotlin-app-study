package com.onejkspark.order.domain.product

import org.springframework.core.io.ClassPathResource
import java.io.File
import java.nio.file.Files

interface ProductService {
    fun findAll(): List<Product>
}

class ProductServiceImpl : ProductService {

    override fun findAll(): List<Product> {

        val resource: File = ClassPathResource("data.csv").file

        val text = String(Files.readAllBytes(resource.toPath()))

        return text.split("\n")
            .asSequence()
            .map { s ->
                Product(s.split(","))

            }
            .toList()
    }
}

