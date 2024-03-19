package com.mcw_tfc_aio.arcwolf.init;

import com.mcw_tfc_aio.arcwolf.storage.FurnitureStorageContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ContainerInit {

    public static final DeferredRegister<MenuType<?>> CONTAINERS;
    public static final RegistryObject<MenuType<FurnitureStorageContainer>> EXAMPLE_CHEST;



    private ContainerInit() {
    }

    static {

        CONTAINERS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, "mcw_tfc_aio");
        EXAMPLE_CHEST = CONTAINERS.register("example_chest", () -> {
            return IForgeMenuType.create(FurnitureStorageContainer::new);
        });
    }

}