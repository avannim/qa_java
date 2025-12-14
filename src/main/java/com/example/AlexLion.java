package com.example;

import java.util.List;

public class AlexLion extends Lion{
    boolean hasMane;
    private final Feline feline = new Feline();

    public AlexLion() throws Exception {
        super("Самец");
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
