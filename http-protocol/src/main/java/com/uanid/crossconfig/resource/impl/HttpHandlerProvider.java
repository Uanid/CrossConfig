package com.uanid.crossconfig.resource.impl;

import com.uanid.crossconfig.resource.ProtocolHandler;
import com.uanid.crossconfig.resource.ProtocolHandlerProvider;
import com.uanid.crossconfig.resource.ProtocolType;

public class HttpHandlerProvider implements ProtocolHandlerProvider {
    private static final ProtocolType PROTOCOL_TYPE = new ProtocolType("HTTP", "1.1");

    @Override
    public ProtocolHandler getProtocolHandler() {
        return new HttpHandler(PROTOCOL_TYPE);
    }

    @Override
    public ProtocolType getProtocolHandlerReturnType() {
        return PROTOCOL_TYPE;
    }
}
