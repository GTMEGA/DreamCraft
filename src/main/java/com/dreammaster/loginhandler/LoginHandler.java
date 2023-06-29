package com.dreammaster.loginhandler;

import com.dreammaster.config.CoreModConfig;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class LoginHandler {
    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GRAY + "====================================" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "Welcome to MEGA " + EnumChatFormatting.WHITE + CoreModConfig.ModPackVersion));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "Join the discord at https://discord.gg/c8hFwgCMh5" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.AQUA + "Check out the changelog channel!" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GRAY + "====================================" ));
    }
}
