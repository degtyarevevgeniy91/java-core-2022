package Homeworks.hw2.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ram {
    private Type type;
    private String  producer;
    private int size;
}
