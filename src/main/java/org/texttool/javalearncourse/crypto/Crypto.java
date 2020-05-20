package org.texttool.javalearncourse.crypto;

public interface Crypto {


    /**
     * Encrypts a text
     *
     * @param text orginal string
     * @return encryption text
     */
    String encrypty(String text);


    /**
     * Decrypts a text
     * @param text a decryption text
     * @return
     */
    String decrypt(String text);


}
