package org.howard.edu.midterm.question1;


/**
 * @param make the text encrypted
 * @return The encrypted text.
 */
public encrypt(String text) {
    StringBuilder evenChars = new StringBuilder();
    StringBuilder oddChars = new StringBuilder();

    // Remove whitespace and punctuation
    String sanitizedText = text.replaceAll("[^a-zA-Z0-9]", ""); 

    for (int i = 0; i < sanitizedText.length(); i++) {
        char ch = sanitizedText.charAt(i);
        if (i % 2 == 0) {
            evenChars.append(ch);
        } else {
            oddChars.append(ch);
        }
    }

    return evenChars.toString() + oddChars.toString();
}

}