package org.deeplearning4j.rl4j.space;

import lombok.Getter;

import java.util.Random;

/**
 * @author rubenfiszel (ruben.fiszel@epfl.ch) on 7/8/16.
 *         <p>
 *         A discrete space of action. A discrete space is always isomorphic
 *         to a space of integer so we can parametrize directly by Integer.
 *         Benefit of using Integers directly is that you can use it as the
 *         id of the node assigned to that action in the outpout of a DQN.
 */
public class DiscreteSpace implements ActionSpace<Integer> {

    //size of the space also defined as the number of different actions
    @Getter
    final protected int size;
    final protected Random rd;

    public DiscreteSpace(int size) {
        this.size = size;
        rd = new Random();
    }

    public Integer randomAction() {
        return rd.nextInt(size);
    }

    public Object encode(Integer a) {
        return a;
    }

    @Override
    public int getSize() {
        return size;
    }

    public Integer noOp() {
        return 0;
    }

}
