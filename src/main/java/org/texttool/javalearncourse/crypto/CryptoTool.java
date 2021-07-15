package org.texttool.javalearncourse.crypto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CryptoTool  {


    private Crypto cryptoAlgorithm;


    private ReaderTool text;


    public String encrypt() {
        return  cryptoAlgorithm.encrypty(text.getText());
    }

    public String descript() {
        return  cryptoAlgorithm.decrypt(text.getText());
    }

    @Autowired
    public void setCryptoAlgorithm(Crypto cryptoAlgorithm) {
        this.cryptoAlgorithm = cryptoAlgorithm;
    }

    @Autowired
    public void setText(ReaderTool text) {
        this.text = text;
    }
}
