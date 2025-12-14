package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FelineTest {

    @Spy
    Feline feline;

    @Test
    void testGetFamilyReturnCats(){
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    void testGetKittensReturnOneKitten(){
        assertEquals(feline.getKittens(), 1);
    }

    @Test
    void testEatMeatReturnList() throws Exception {
        assertLinesMatch(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }
}