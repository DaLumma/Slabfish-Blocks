package com.epic312.slabfish_block;

import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

import static com.epic312.slabfish_block.SlabfishBlock.MODID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("slabfish_block")
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlabfishBlock
{
    public static final String MODID = "slabfish_block";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MODID);

    public SlabfishBlock() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        REGISTRY_HELPER.getDeferredItemRegister().register(eventBus);
        REGISTRY_HELPER.getDeferredBlockRegister().register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
