package com.dreammaster.network;

import com.dreammaster.Tags;
import com.dreammaster.network.msg.CTTClientSyncMessage;
import eu.usrv.yamcore.network.PacketDispatcher;

public class CoreModDispatcher extends PacketDispatcher
{

    public CoreModDispatcher()
    {
        super(Tags.MOD_ID);
    }

    @Override
    public void registerPackets()
    {
        registerMessage(CTTClientSyncMessage.CTTClientSyncMessageHandler.class, CTTClientSyncMessage.class);
    }
}
