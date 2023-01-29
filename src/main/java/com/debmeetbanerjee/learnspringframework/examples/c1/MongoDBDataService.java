package com.debmeetbanerjee.learnspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
    @Override
    public int[] retreiveData() {
        return new int[] {1,2,3,4,5,6,7,8,9,10};
    }
}
