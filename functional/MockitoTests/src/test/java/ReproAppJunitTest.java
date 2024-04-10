package test.java;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ReproAppJunitTest {

    class Some {}

    @Test
    public void reproduceCrash() {
        System.out.println("This is to trigger a reproduceCrash error!");
        Mockito.mock(Some.class);
    }

    public static void main(String[] args) {
        System.out.println("This is the main method as required!");
    }

}