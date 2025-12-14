package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CatTest {

    @Spy
    static Feline feline;

    @Test
    public void testGetSoundReturnMew() {
        Cat cat = new Cat(feline);
        String result = cat.getSound();
        System.out.println(result);
        assertEquals("Мяу", result);
    }

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> result = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), result);
    }
}