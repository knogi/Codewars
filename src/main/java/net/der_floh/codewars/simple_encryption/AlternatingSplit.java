package net.der_floh.codewars.simple_encryption;

public class AlternatingSplit {

    public String encrypt(final String text, final int n) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        
        String sample = text;
        for (int i = 0; i < n; i++) {
            sample = encryptInternal(sample);
        }
        return sample;
    }

    private String encryptInternal(final String text) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                odd.append(text.charAt(i));
            } else {
                even.append(text.charAt(i));
            }
        }

        return even.toString() + odd.toString();
    }

    public String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.isEmpty()) {
            return encryptedText;
        }

        String sample = encryptedText;
        for (int i = 0; i < n; i++) {
            sample = decryptInternal(sample);
        }
        return sample;
    }

    private String decryptInternal(final String text) {
        int splitIndex = text.length() / 2;

        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            if (i < splitIndex) {
                result[i * 2 + 1] = text.charAt(i);
            } else {
                result[(i - splitIndex) * 2] = text.charAt(i);
            }
        }

        return new String(result);
    }
}
