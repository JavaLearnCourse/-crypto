package org.texttool.javalearncourse.crypto;

public interface Crypto {


    /**
     * Encrypts a text
     *
     * @param text plain string
     * @return encryption text
     */
    String encrypty(String text);


    /**
     * Decrypts a text
     * @param text a ecryption text
     * @return plain text
     */
    String decrypt(String text);


}
