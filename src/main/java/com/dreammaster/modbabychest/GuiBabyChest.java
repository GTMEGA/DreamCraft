package com.dreammaster.modbabychest;


import com.dreammaster.Tags;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiBabyChest extends GuiContainer
{
    public GuiBabyChest (InventoryPlayer pInventoryPlayer, TileEntityBabyChest pTileEntity) 
    {
        super(new ContainerBabyChest(pInventoryPlayer, pTileEntity));
        xSize = 184;
        ySize = 184;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float pPar1, int pPar2, int pPar3) 
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(new ResourceLocation(Tags.MODID, "textures/gui/babychestgui.png"));
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
}
