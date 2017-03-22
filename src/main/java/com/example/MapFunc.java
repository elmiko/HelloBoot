package com.example;

import java.io.Serializable;
import org.apache.spark.api.java.function.Function;
    
class MapFunc implements Function<Integer, Integer>, Serializable {
    public Integer call(Integer integer) {
        double x = Math.random() * 2 - 1;
        double y = Math.random() * 2 - 1;
        return (x * x + y * y < 1) ? 1 : 0;
    }
}
