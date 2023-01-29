package com.debmeetbanerjee.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    @Override
    public int[] retreiveData() {
        return new int[] {11,22,33,44,55,66,77,88,99,1010};
    }
}
