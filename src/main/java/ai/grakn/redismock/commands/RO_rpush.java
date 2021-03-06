package ai.grakn.redismock.commands;

import ai.grakn.redismock.RedisBase;
import ai.grakn.redismock.Slice;

import java.util.LinkedList;
import java.util.List;

class RO_rpush extends RO_push {
    RO_rpush(RedisBase base, List<Slice> params) {
        super(base, params);
    }

    @Override
    void pusher(LinkedList<Slice> list, Slice slice) {
        list.addLast(slice);
    }

}
