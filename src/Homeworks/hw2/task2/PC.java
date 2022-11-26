package Homeworks.hw2.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    private Monitor monitor;
    private Cpu cpu;
    private Ram ram;
}
