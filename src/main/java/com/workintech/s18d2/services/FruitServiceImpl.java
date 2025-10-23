package com.workintech.s18d2.services;

import com.workintech.s18d2.Fruit;
import com.workintech.s18d2.exceptions.PlantException;
import com.workintech.s18d2.repository.FruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name);
    }

    @Override
    public Fruit getById(Long id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new PlantException("Fruit not found with id: " + id));
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit delete(Long id) {
        Fruit existing = getById(id);
        fruitRepository.delete(existing);
        return existing;
    }
}
