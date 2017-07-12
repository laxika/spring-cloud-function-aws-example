package com.morethanheroic.uppercase.service;

import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class UppercaseService {
    
    public String uppercase(final String input) {
        return input.toUpperCase(Locale.ENGLISH);
    }
}
