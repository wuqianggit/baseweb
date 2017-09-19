package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * com.wq.spring.soundsystem
 *
 * 具体的CD播放器
 * 2017/9/17-16:30
 * 2017
 * Created by wuqiang on 2017/9/17.
 */
@Component
public class CDPlayer implements MediaPlayer{

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd=cd;
    }

    @Override public void play() {
        cd.play();
    }
}
