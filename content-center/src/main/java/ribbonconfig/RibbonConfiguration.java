package ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 黄启佳
 * @description TODO
 * @Data 2020/10/14
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        //ctrl+alt+B：快速查看IRule的所有实现类
        return new RandomRule();
    }
}
