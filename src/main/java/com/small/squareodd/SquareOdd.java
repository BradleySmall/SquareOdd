package com.small.squareodd;


import java.util.stream.Collectors;

public class SquareOdd {
    public int convert(int input) {
       return Integer.parseInt(
               String.valueOf(input)
               .chars()
               .map(Character::getNumericValue)
               .boxed()
               .map(e->(e % 2 != 0) ? e * e : e)
               .map(Object::toString)
               .collect(Collectors.joining())
               );
    }
}
