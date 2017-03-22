package com.example;

import java.io.Serializable;
import org.apache.spark.api.java.function.Function2;

class ReduceFunc implements Function2<Integer, Integer, Integer>, Serializable {
    public Integer call(Integer integer, Integer integer2) {
        return integer + integer2;
    }
}
