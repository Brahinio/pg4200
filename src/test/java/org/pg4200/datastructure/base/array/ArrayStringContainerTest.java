package org.pg4200.datastructure.base.array;

import org.pg4200.datastructure.base.StringContainerWithIndex;
import org.pg4200.datastructure.base.StringContainerWithIndexTestTemplate;

/**
 * Created by arcuri82 on 14-Aug-17.
 */
public class ArrayStringContainerTest extends StringContainerWithIndexTestTemplate{

    @Override
    protected StringContainerWithIndex getNewInstance() {
        return new ArrayStringContainer(10);
    }
}