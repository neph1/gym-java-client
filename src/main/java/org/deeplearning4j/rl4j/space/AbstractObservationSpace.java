package org.deeplearning4j.rl4j.space;

import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * Created by rickard on 5/28/17.
 */
public abstract class AbstractObservationSpace<O> implements ObservationSpace<O>  {

    String name;
    int[] shape;
    INDArray low;
    INDArray high;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int[] getShape() {
        return shape;
    }

    @Override
    public INDArray getLow() {
        return low;
    }

    @Override
    public INDArray getHigh() {
        return high;
    }
}
