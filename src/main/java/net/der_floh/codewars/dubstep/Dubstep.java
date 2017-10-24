package net.der_floh.codewars.dubstep;

/**
 * Created by knogl on 24.10.2017.
 */
public class Dubstep {

    public String songDecorder(String song) {
        String[] splitted = song.split("WUB");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < splitted.length; i++) {
            if (!splitted[i].isEmpty()) {
                sb.append(splitted[i]);
                if (i < splitted.length - 1) {
                    sb.append(" ");
                }
            }
        }

        return sb.toString();
    }
}
