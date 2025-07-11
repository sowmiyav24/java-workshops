package com.vetias.java.workshop.basics.lamda;

@FunctionalInterface
interface Square {
    int findSquare(int x);
}

public class SquareTest {
    public void testSquare(){
        Square square = (int x) -> x * x;
        System.out.println(square.findSquare(6));
        // Uncomment the following line if you have Assert imported and available
        // Assert.assertEquals(36, square.findSquare(6));
    }
}


