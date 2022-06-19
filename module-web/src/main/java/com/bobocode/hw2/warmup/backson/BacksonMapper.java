package com.bobocode.hw2.warmup.backson;

/*
     1. Implement a method readObject that accepts JSON string, and a type of the object and returns the mapped object
        Make sure it works for high-level string fields
     {
        "first_name": "Taras",
        "last_name": "Boychuk",
        "city": "Ivano-Frankivsk"
     }
     2. Mapper should support @PropertyName annotation that allows specifying a custom property name for class field
        in case if the field name in Class differs from related one in JSON string
*/
public class BacksonMapper {
    public static <T> T readObject(String jsonString, Class<T> clazz){
        throw new UnsupportedOperationException();
    }
}
