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

    @Mock
    Feline feline;

    @Test
    public void testGetKittensReturnZero() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        int result;
        result = alexLion.getKittens();
        assertEquals(0, result, "AlexLion не может иметь котят");
    }

    @Test
    public void testGetFriendsReturnList() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        List<String> result = alexLion.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), result, "У AlexLion должно быть 3 друга: Марти, Глория, Мелман" );
    }

    @Test
    public void testDoesHasManeReturnTrue() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        boolean result = alexLion.doesHaveMane();
        assertEquals(true, result);
    }

    @Test
    public void testGetPlaceOfLivingReturnNewYorkZoo() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        String result = alexLion.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", result);
    }

    @Test
    public void testGetFoodReturnListOfPredatorFood() throws Exception {
        AlexLion alexLion = new AlexLion(new Feline());
        List<String> result = alexLion.getFood();
        assertLinesMatch(List.of("Животные", "Птицы", "Рыба"), result);
    }
}