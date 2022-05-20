package com.simile.antlr;

import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

/**
 * @Author yitao
 * @Created 2022/04/07
 */
public class BaseExample {

    public String loadString(String classpath) {
        URL url = BaseExample.class.getClassLoader().getResource(classpath);
        try {
            return IOUtils.toString(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
