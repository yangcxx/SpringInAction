package cn.cxy.spring.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/5/10 10:17 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

//@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    //cxy 构造函数式注入与注解不同？？？
    //@Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
