package net.der_floh.codewars.playing_with_passphrases;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by knogl on 25.10.2017.
 */
public class Playpass {

    public String playPass(String s, int n) {
        // your code

        int a = (int)'A';
        int z = (int)'Z';
        int zero = (int) '0';

        AtomicInteger counter = new AtomicInteger(0);

        String result = s.chars().mapToObj(character -> {
            if (Character.isLetter(character)) {
                character = ((character - a + n) % (z - a + 1)) + a;
                if(counter.get() % 2 == 1) {
                    character = Character.toLowerCase(character);
                }
            } else if (Character.isDigit(character)) {
                character = (character - zero - 9) * -1 + zero;
            }
            counter.getAndIncrement();
            return Character.toString((char)character);
        }).collect(Collectors.joining());

        return new StringBuilder(result).reverse().toString();
    }
}
