package com.tachyon.Abstracts;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
Container for messages, messageLists and server commands
JSON from, to
Uses Gson https://mvnrepository.com/artifact/com.google.code.gson/gson
*/
public abstract class AbstractMessageContainer {

    public String toJSON() {
        Gson gson = new GsonBuilder().create();
        String result = gson.toJson(this);
        return result;
    }
}
