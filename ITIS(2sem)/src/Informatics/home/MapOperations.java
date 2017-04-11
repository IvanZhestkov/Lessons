package Informatics.home;

import java.util.List;
import java.util.Map;

/**
 * Created by User on 04.04.2017.
 */
public interface MapOperations {
    Map<String, Integer> words(List<String> lst);
    Map<String, Integer> transform(Map<Integer, String> map);
}
