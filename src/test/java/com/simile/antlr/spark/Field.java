package com.simile.antlr.spark;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yitao
 * @Created 2022/06/08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Field {
    private List<String> originNames;
    private String name;
    private String value;

    public boolean isValueField() {
        return value != null;
    }

}
