package link.hooray.message.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName AliMsgProperties
 * @Description: TODO
 * @Author hooray
 * @Date 2020/8/5
 * @Version V1.0
 **/
@Component
@ConfigurationProperties(prefix = "ali.msg")
@Data
public class AliMsgProperties {
    private String accessKeyId;
    private String accessKeySecret;
}
