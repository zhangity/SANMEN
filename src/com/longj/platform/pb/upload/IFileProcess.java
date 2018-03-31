package com.longj.platform.pb.upload;

import org.wdk.core.bean.WDKContext;

public interface IFileProcess {

    
    public String processFile(WDKContext context, String wqlName);
}