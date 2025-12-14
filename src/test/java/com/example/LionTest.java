package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Spy
    Lion lion = new Lion("Самец");

    LionTest() throws Exception {
    }

    @Test
    public void testGetKittensReturnOneKitten(){
        int result = lion.getKittens();
        assertEquals(1, result);
    }

    @Test
    public void testGetFoodReturnListOfPredatorFood() throws Exception {
        List<String> result = lion.getFood();
        assertLinesMatch(List.of("Животные", "Птицы", "Рыба"), result);
    }

    @Test
    public void testLionThrowExeption(){
        assertThrows(Exception.class, () -> new Lion("текст"));
    }
}