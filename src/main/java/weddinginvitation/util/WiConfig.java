package weddinginvitation.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/**
 * 外部配置文件对应的类，spring-boot会按变量名字自动set值
 * @author zhongchunjie
 */
@ConfigurationProperties(prefix = "wi")
@PropertySource("classpath:config/wi-config.properties")
@Component
public class WiConfig {
	private String crossDomainUrl;
	public String getCrossDomainUrl() {
		return crossDomainUrl;
	}
	public void setCrossDomainUrl(String crossDomainUrl) {
		this.crossDomainUrl = crossDomainUrl;
	}
}
