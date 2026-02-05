package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ParametrizedTest {

    @ParameterizedTest (name = "{index} переданное количество котят {0} ответ метода GetKittens = {1}" )
    @ValueSource (ints = {1, 10, 15})
    public void testGetKittensReturnKittensAmmount(int ints) {
        Feline feline = new Feline();
        assertEquals(feline.getKittens(ints), ints);
    }
    public static Stream<Arguments> sexForLion() {
        return Stream.of (
                Arguments.arguments("Самец", true),
                Arguments.arguments("Самка", false)
        );
    }

    @ParameterizedTest (name = "{index} пол льва {0} ответ метода doesHaveMane = {1}" )
    @MethodSource("sexForLion")
    public void testDoesHaveMane(String sex, boolean expect) throws Exception {
        Lion lion = new Lion(sex, new Feline());
        boolean result = lion.doesHaveMane();
        assertEquals(result, expect);
    }

}
