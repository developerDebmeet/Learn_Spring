package com.debmeetbanerjee.learnspringframework.examples.c1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {

    @Autowired
    DataService dataService;

    public int findMax() {
        return Arrays.stream(dataService.retreiveData()).max().orElse(0);
    }

}
