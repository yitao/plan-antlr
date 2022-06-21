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
public class TableView {
    private String name;
    private String alias;
    private List<Field> fields;
}
