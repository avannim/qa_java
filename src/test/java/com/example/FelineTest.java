package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FelineTest {

    @Test
    void testGetFamilyReturnCats(){
        Feline feline = new Feline();
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    void testEatMeatReturnList() throws Exception {
        Feline feline = new Feline();
        assertLinesMatch(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Spy
    Feline feline;

    @Test
    void testGetKittensReturnOneKitten(){
        assertEquals(feline.getKittens(), 1);
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

}