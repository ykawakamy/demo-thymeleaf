package demo.service;

import java.util.Arrays;
import java.util.List;

public class AnimalServiceStub implements AnimalService {
    public List<String> getNames(){
        return Arrays.asList("イヌ", "ネコ", "リス");
    }

    public void add(String name) {
        throw new RuntimeException("スタブのため未実装");
    }
}
