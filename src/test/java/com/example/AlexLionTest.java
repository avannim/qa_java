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
class AlexLionTest {

    @Spy
    AlexLion alexLion;

    AlexLionTest() throws Exception {
    }

    @Test
    public void testGetKittensReturnZero() {
        int result = alexLion.getKittens();
        assertEquals(0, result, "AlexLion не может иметь котят");
    }

    @Test
    public void testGetFriendsReturnList() {
        List<String> result = alexLion.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), result, "У AlexLion должно быть 3 друга: Марти, Глория, Мелман" );
    }

    @Test
    public void testDoesHasManeReturnTrue() {
        boolean result = alexLion.doesHaveMane();
        assertEquals(true, result);
    }

    @Test
    public void testGetPlaceOfLivingReturnNewYorkZoo() {
        String result = alexLion.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", result);
    }

    @Test
    public void testGetFoodReturnListOfPredatorFood() throws Exception {
        List<String> result = alexLion.getFood();
        assertLinesMatch(List.of("Животные", "Птицы", "Рыба"), result);
    }
}