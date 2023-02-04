package com.debmeetbanerjee.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService {
    @Override
    public int[] retreiveData() {
        return new int[] {11,22,33,44,55,66,77,88,99,1010};
    }
}
