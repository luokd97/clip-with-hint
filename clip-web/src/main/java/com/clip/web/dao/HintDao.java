package com.clip.web.dao;

import com.clip.web.entity.Hint;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HintDao {
    private static final Map<String, Hint> hintMap = new HashMap<>();

    private static int autoIncrementId = 0;

    static {
        Hint h1 = Hint.builder().name("apple").build();
        Hint h2 = Hint.builder().name("joke111").build();
        Hint h3 = Hint.builder().name("sad").build();
        Hint h4 = Hint.builder().name("lovely").build();

        addHint(h1);
        addHint(h2);
        addHint(h3);
        addHint(h4);
    }

    public static List<Hint> getHintList(){
        return new ArrayList<>(hintMap.values());
    }

    public static List<Hint> getHintListByIds(List<String> ids){
        List<Hint> hintList = new ArrayList<>();
        for (String id : ids) {
            Hint hint = hintMap.get(id);
            if (hint != null){
                hintList.add(hint);
            }
        }
        return hintList;
    }

    public static boolean addHint(Hint hint){
        String id = hint.getId();

        if (hintMap.containsKey(id)){
            return false;
        }

        if (!StringUtils.hasText(id)){
            id = String.valueOf(autoIncrementId++);
            hint.setId(id);
        }

        hintMap.put(id, hint);
        return true;
    }
}
