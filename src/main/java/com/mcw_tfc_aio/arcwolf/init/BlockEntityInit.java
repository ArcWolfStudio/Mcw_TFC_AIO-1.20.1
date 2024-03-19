package com.mcw_tfc_aio.arcwolf.init;

import com.mcw_tfc_aio.arcwolf.storage.StorageTileEntity;
import java.util.function.Supplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType.Builder;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> REGISTER;
    public static final RegistryObject<BlockEntityType<StorageTileEntity>> FURNITURE_STORAGE;

    public BlockEntityInit() {
    }

    private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String name, BlockEntityType.BlockEntitySupplier<T> supplier, Supplier<Block[]> validBlocksSupplier) {
        return REGISTER.register(name, () -> {
            return Builder.of(supplier, validBlocksSupplier.get()).build(null);
        });
    }

    static {
        REGISTER = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "mcw_tfc_aio");
        FURNITURE_STORAGE = register("furniture_storage", StorageTileEntity::new, () -> {
            return new Block[]{FurnitureInit.ACACIA_DRAWER.get(), (Block)FurnitureInit.WILLOW_DRAWER.get()};
        });
    }
}
