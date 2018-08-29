package com.company.client;

import com.company.restoran.Client;
import com.company.restoran.FastFood;

public class Student implements Client {
    @Override
    public float getMatch(FastFood fastFood) {
        return 0;
    }
}
