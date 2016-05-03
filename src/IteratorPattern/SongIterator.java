package IteratorPattern;

import java.util.Iterator;

/**
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public interface SongIterator {

    /**
     * Song Information iterator.
     * @return
     */
    Iterator<SongInfo> createIterator();
}
