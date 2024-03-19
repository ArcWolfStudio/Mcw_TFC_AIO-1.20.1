package com.mcw_tfc_aio.arcwolf.init;

import com.mcw_tfc_aio.arcwolf.storage.ChairEntity;
import com.mcw_tfc_aio.arcwolf.storage.ChairRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(
        modid = "mcw_tfc_aio",
        bus = Bus.MOD
)
public class EntityInit {
    public static final DeferredRegister<EntityType<?>> Registry;
    public static final RegistryObject<EntityType<ChairEntity>> CHAIR;
    public EntityInit() {
    }

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String name, EntityType.Builder<T> builder) {
        return Registry.register(name, () -> {
            return builder.build(name);
        });
    }

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer((EntityType)CHAIR.get(), ChairRenderer::new);
    }

    public static void setup(IEventBus bus) {
        Registry.register(bus);
    }

    static {
        Registry = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "mcw_tfc_aio");
        CHAIR = register("chair", Builder.<ChairEntity>of((type, world) -> {
            return new ChairEntity(world);
        }, MobCategory.MISC).sized(0.0F, 0.0F).setCustomClientFactory((spawnEntity, world) -> {
            return new ChairEntity(world);
        }));
    }

}