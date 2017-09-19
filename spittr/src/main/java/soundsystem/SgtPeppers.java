package soundsystem;

import org.springframework.stereotype.Component;

/**
 *
 * com.wq.spring.soundsystem
 * CD接口的实现类，具体的CD
 * 2017/9/17-16:23
 * 2017
 * Created by wuqiang on 2017/9/17.
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title="Sgt.Pepper's Lonely Heart Club Band";
    private String artist="The beatles";

    @Override public void play() {
        System.out.println("Playing "+this.title+" by "+this.artist);
    }
}
