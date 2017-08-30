package com.BDmod;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.*;
import net.minecraft.client.audio.*;
import net.minecraft.client.entity.*;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.achievement.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.model.*;
import net.minecraft.client.multiplayer.*;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.culling.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.client.settings.*;
import net.minecraft.command.*;
import net.minecraft.crash.*;
import net.minecraft.creativetab.*;
import net.minecraft.dispenser.*;
import net.minecraft.enchantment.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.*;
import net.minecraft.entity.effect.*;
import net.minecraft.entity.item.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.crafting.*;
import net.minecraft.nbt.*;
import net.minecraft.network.*;
import net.minecraft.network.rcon.*;
import net.minecraft.pathfinding.*;
import net.minecraft.potion.*;
import net.minecraft.profiler.*;
import net.minecraft.server.*;
import net.minecraft.server.dedicated.*;
import net.minecraft.server.gui.*;
import net.minecraft.server.integrated.*;
import net.minecraft.server.management.*;
import net.minecraft.src.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.village.*;
import net.minecraft.world.*;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.chunk.storage.*;
import net.minecraft.world.demo.*;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.layer.*;
import net.minecraft.world.gen.structure.*;
import net.minecraft.world.storage.*;
import net.minecraftforge.classloading.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.event.sound.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.event.entity.item.*;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.minecart.*;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.*;
import net.minecraftforge.event.world.*;
import net.minecraftforge.oredict.*;
import net.minecraftforge.transformers.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.common.network.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import io.netty.buffer.ByteBuf;

import cpw.mods.fml.common.network.FMLIndexedMessageToMessageCodec;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import cpw.mods.fml.relauncher.*;

@Mod(modid = BD.MODID, version = BD.VERSION)
public class BD implements IFuelHandler, IWorldGenerator{

	public static final String MODID = "BD";
    public static final String VERSION = "1.0";

	@SidedProxy(clientSide="com.BDmod.ClientProxyBD", serverSide="com.BD.CommonProxyBD")
    public static CommonProxyBD proxy;
   
	@Instance(MODID)
    public static BD instance;

	BD_boom1 BD_0 = new BD_boom1();
BD_explosive BD_1 = new BD_explosive();
BD_boomfood1 BD_2 = new BD_boomfood1();
BD_BDTab BD_3 = new BD_BDTab();
BD_boom2 BD_4 = new BD_boom2();
BD_boomfood2 BD_5 = new BD_boomfood2();
BD_boom3 BD_6 = new BD_boom3();
BD_boomfood3 BD_7 = new BD_boomfood3();
BD_boom4 BD_8 = new BD_boom4();
BD_boomfood4 BD_9 = new BD_boomfood4();
BD_boom5 BD_10 = new BD_boom5();
BD_boomfood5 BD_11 = new BD_boomfood5();
BD_superbigbangcake BD_12 = new BD_superbigbangcake();


@Override
public int getBurnTime(ItemStack fuel) {
if(BD_0.addFuel(fuel)!=0) return BD_0.addFuel(fuel);
if(BD_1.addFuel(fuel)!=0) return BD_1.addFuel(fuel);
if(BD_2.addFuel(fuel)!=0) return BD_2.addFuel(fuel);
if(BD_3.addFuel(fuel)!=0) return BD_3.addFuel(fuel);
if(BD_4.addFuel(fuel)!=0) return BD_4.addFuel(fuel);
if(BD_5.addFuel(fuel)!=0) return BD_5.addFuel(fuel);
if(BD_6.addFuel(fuel)!=0) return BD_6.addFuel(fuel);
if(BD_7.addFuel(fuel)!=0) return BD_7.addFuel(fuel);
if(BD_8.addFuel(fuel)!=0) return BD_8.addFuel(fuel);
if(BD_9.addFuel(fuel)!=0) return BD_9.addFuel(fuel);
if(BD_10.addFuel(fuel)!=0) return BD_10.addFuel(fuel);
if(BD_11.addFuel(fuel)!=0) return BD_11.addFuel(fuel);
if(BD_12.addFuel(fuel)!=0) return BD_12.addFuel(fuel);
return 0;
}

@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

chunkX = chunkX * 16;
chunkZ = chunkZ * 16;
if(world.provider.dimensionId==-1)BD_0.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_0.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_1.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_1.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_2.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_2.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_3.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_3.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_4.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_4.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_5.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_5.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_6.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_6.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_7.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_7.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_8.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_8.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_9.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_9.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_10.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_10.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_11.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_11.generateSurface(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==-1)BD_12.generateNether(world, random, chunkX, chunkZ);
if(world.provider.dimensionId==0)BD_12.generateSurface(world, random, chunkX, chunkZ);


}
@EventHandler
public void load(FMLInitializationEvent event) {

GameRegistry.registerFuelHandler(this);
GameRegistry.registerWorldGenerator(this, 1);
MinecraftForge.EVENT_BUS.register(new BD_GlobalEventsBD());
NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
BD_0.load();
BD_1.load();
BD_2.load();
BD_3.load();
BD_4.load();
BD_5.load();
BD_6.load();
BD_7.load();
BD_8.load();
BD_9.load();
BD_10.load();
BD_11.load();
BD_12.load();


}
@EventHandler
public void serverLoad(FMLServerStartingEvent event){
BD_0.serverLoad(event);
BD_1.serverLoad(event);
BD_2.serverLoad(event);
BD_3.serverLoad(event);
BD_4.serverLoad(event);
BD_5.serverLoad(event);
BD_6.serverLoad(event);
BD_7.serverLoad(event);
BD_8.serverLoad(event);
BD_9.serverLoad(event);
BD_10.serverLoad(event);
BD_11.serverLoad(event);
BD_12.serverLoad(event);
}
@EventHandler
public void preInit(FMLPreInitializationEvent event){
BD_0.instance = this.instance;
BD_1.instance = this.instance;
BD_2.instance = this.instance;
BD_3.instance = this.instance;
BD_4.instance = this.instance;
BD_5.instance = this.instance;
BD_6.instance = this.instance;
BD_7.instance = this.instance;
BD_8.instance = this.instance;
BD_9.instance = this.instance;
BD_10.instance = this.instance;
BD_11.instance = this.instance;
BD_12.instance = this.instance;
BD_0.preInit(event);
BD_1.preInit(event);
BD_2.preInit(event);
BD_3.preInit(event);
BD_4.preInit(event);
BD_5.preInit(event);
BD_6.preInit(event);
BD_7.preInit(event);
BD_8.preInit(event);
BD_9.preInit(event);
BD_10.preInit(event);
BD_11.preInit(event);
BD_12.preInit(event);
proxy.registerRenderers(this);
}
public static class GuiHandler implements IGuiHandler {
@Override public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
return null;}
@Override public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
return null;}
}


}
