package com.BDmod;

import io.netty.buffer.ByteBuf;

import net.minecraft.entity.*;
import net.minecraft.entity.player.*;

public interface IPacketBD {

	public void readBytes(ByteBuf bytes);
	public void writeBytes(ByteBuf bytes);
	public void executeClient(EntityPlayer player);
    public void executeServer(EntityPlayer player);

}
