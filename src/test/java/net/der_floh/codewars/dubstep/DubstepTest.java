package net.der_floh.codewars.dubstep;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by knogl on 24.10.2017.
 */
public class DubstepTest {

    private Dubstep dubstep;

    @Before
    public void setup() {
        dubstep = new Dubstep();
    }

    @Test
    public void songDecoderTest1() {
        String sample = "WUBWUBIWUBAMWUBWUBX";
        String expected = "I AM X";

        songDecoderTestInternal(sample, expected);
    }

    @Test
    public void songDecoderTest2() {
        String sample = "WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB";
        String expected = "WE ARE THE CHAMPIONS MY FRIEND";

        songDecoderTestInternal(sample, expected);
    }

    private void songDecoderTestInternal(String sample, String expected) {
        assertThat(dubstep.songDecorder(sample)).isEqualTo(expected);
    }
}
