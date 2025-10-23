package com.workintech.s18d2.controller;

import com.workintech.s18d2.Fruit;
import com.workintech.s18d2.services.FruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/fruit")
public class FruitController {

    private final FruitService fruitService;

    @GetMapping
    public ResponseEntity<List<Fruit>> getAllAsc() {
        return ResponseEntity.ok(fruitService.getByPriceAsc());
    }

    @GetMapping("/desc")
    public ResponseEntity<List<Fruit>> getAllDesc() {
        return ResponseEntity.ok(fruitService.getByPriceDesc());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Fruit>> searchByName(@PathVariable String name) {
        return ResponseEntity.ok(fruitService.searchByName(name));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fruit> getById(@PathVariable Long id) {
        return ResponseEntity.ok(fruitService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Fruit> save(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(fruitService.save(fruit));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Fruit> delete(@PathVariable Long id) {
        return ResponseEntity.ok(fruitService.delete(id));
    }
}
