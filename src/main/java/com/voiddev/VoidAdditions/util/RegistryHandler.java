package com.voiddev.VoidAdditions.util;

import com.voiddev.VoidAdditions.VoidAdditions;
import com.voiddev.VoidAdditions.blocks.BlockItemBase;
import com.voiddev.VoidAdditions.blocks.CryptoBlock;
import com.voiddev.VoidAdditions.blocks.VoidBlock;
import com.voiddev.VoidAdditions.items.ItemBase;
import com.voiddev.VoidAdditions.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister.create(ForgeRegistries.ITEMS, VoidAdditions.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister.create(ForgeRegistries.BLOCKS, VoidAdditions.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer", ItemBase::new);

    public static final RegistryObject<Item> CRYPTO_COIN = ITEMS.register("crypto_coin.json", ItemBase::new);

    public static final RegistryObject<Item> RAW_VOID = ITEMS.register("raw_void.json", ItemBase::new);

    // Tools
    public static final RegistryObject<SwordItem> VOID_SWORD = ITEMS.register("void_sword", () ->
            new SwordItem(ModItemTier.VOID, 4, -2.0F, new Item.Properties().group(VoidAdditions.TAB)));

    // Blocks

    public static final RegistryObject<Block> CRYPTO_BLOCK = BLOCKS.register("crypto_block", CryptoBlock::new);

    public static final RegistryObject<Block> VOID_BLOCK = BLOCKS.register("void_block", VoidBlock::new);


    // Block Items

    public static final RegistryObject<Item> CRYPTO_BLOCK_ITEM = ITEMS.register("crypto_block", () -> new BlockItemBase(CRYPTO_BLOCK.get()));

    public static final RegistryObject<Item> VOID_BLOCK_ITEM = ITEMS.register("void_block", () -> new BlockItemBase(VOID_BLOCK.get()));

}
