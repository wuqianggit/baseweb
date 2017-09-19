package spittr.persistence;

import spittr.domain.Spitter;

/**
 *
 * spittr.persistence
 *
 * 2017/9/19-21:08
 * 2017
 * Created by wuqiang on 2017/9/19.
 */
public interface SpitterRepository {
    void addSpitter(Spitter spitter);

    Spitter getSpitterById(Integer id);
}
