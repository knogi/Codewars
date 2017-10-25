package net.der_floh.codewars.playing_with_passphrases;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by knogl on 25.10.2017.
 */
public class PlaypassTest {

    private Playpass playpass;

    @Before
    public void setup() {
        playpass = new Playpass();
    }

    @Test
    public void playTest1() {
        assertThat(playpass.playPass("I LOVE YOU!!!", 1)).isEqualTo("!!!vPz fWpM J");
    }

    @Test
    public void playTest2() {
        assertThat(playpass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2)).isEqualTo("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO");
    }

    @Test
    public void playTest3() {
        assertThat(playpass.playPass("BORN IN 2015!", 1)).isEqualTo("!4897 Oj oSpC");
    }
}
