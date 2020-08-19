package com.yuansheng.mybatisdemo.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "yuansheng.home")
public class PropertiesUtil {
    private String pcname;
    private String pcVersion;

    public String getPcname() {
        return pcname;
    }

    public void setPcname(String pcname) {
        this.pcname = pcname;
    }

    public String getPcVersion() {
        return pcVersion;
    }

    public void setPcVersion(String pcVersion) {
        this.pcVersion = pcVersion;
    }

    @Override
    public String toString() {
        return "PropertiesUtil{" +
                "pcname='" + pcname + '\'' +
                ", pcVersion='" + pcVersion + '\'' +
                '}';
    }
}
