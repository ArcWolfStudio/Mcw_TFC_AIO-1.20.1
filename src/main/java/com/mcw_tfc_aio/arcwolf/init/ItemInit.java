package com.mcw_tfc_aio.arcwolf.init;


import com.mcw_tfc_aio.arcwolf.objects.CraftingItem;
import com.mcw_tfc_aio.arcwolf.objects.FuelItemBlock;
import com.mcw_tfc_aio.arcwolf.objects.ItemBlock;
import com.mcw_tfc_aio.arcwolf.objects.bridges.*;
import com.mcw_tfc_aio.arcwolf.objects.items.Hammer;
import com.mcw_tfc_aio.arcwolf.objects.items.Plier;
import com.mcw_tfc_aio.arcwolf.objects.items.RoofItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "mcw_tfc_aio");
    public static final RegistryObject<Item> ROOFING_HAMMER = ITEMS.register("roofing_hammer", () -> new Hammer(null));
    public static final RegistryObject<Item> RAIN_GUTTER = ITEMS.register("rain_gutter", () -> new RoofItem(null));
    public static final RegistryObject<Item> PLIERS = ITEMS.register("pliers", () -> new Plier(null));

    public static final RegistryObject<Item> ACACIA_PICKET_FENCE = ITEMS.register("fences/acacia_fences/acacia_picket_fence",() -> {
       return new FuelItemBlock((Block)FenceInit.ACACIA_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PICKET_FENCE = ITEMS.register("fences/ash_fences/ash_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PICKET_FENCE = ITEMS.register("fences/aspen_fences/aspen_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PICKET_FENCE = ITEMS.register("fences/birch_fences/birch_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PICKET_FENCE = ITEMS.register("fences/blackwood_fences/blackwood_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PICKET_FENCE = ITEMS.register("fences/chestnut_fences/chestnut_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PICKET_FENCE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PICKET_FENCE = ITEMS.register("fences/hickory_fences/hickory_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PICKET_FENCE = ITEMS.register("fences/kapok_fences/kapok_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_PICKET_FENCE = ITEMS.register("fences/mangrove_fences/mangrove_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MANGROVE_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PICKET_FENCE = ITEMS.register("fences/maple_fences/maple_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PICKET_FENCE = ITEMS.register("fences/oak_fences/oak_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PICKET_FENCE = ITEMS.register("fences/palm_fences/palm_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PICKET_FENCE = ITEMS.register("fences/pine_fences/pine_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PICKET_FENCE = ITEMS.register("fences/rosewood_fences/rosewood_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PICKET_FENCE = ITEMS.register("fences/sequoia_fences/sequoia_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PICKET_FENCE = ITEMS.register("fences/spruce_fences/spruce_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PICKET_FENCE = ITEMS.register("fences/sycamore_fences/sycamore_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PICKET_FENCE = ITEMS.register("fences/white_cedar_fences/white_cedar_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PICKET_FENCE = ITEMS.register("fences/willow_fences/willow_picket_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_PICKET_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_STOCKADE_FENCE = ITEMS.register("fences/acacia_fences/acacia_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_STOCKADE_FENCE = ITEMS.register("fences/ash_fences/ash_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_STOCKADE_FENCE = ITEMS.register("fences/aspen_fences/aspen_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_STOCKADE_FENCE = ITEMS.register("fences/birch_fences/birch_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_STOCKADE_FENCE = ITEMS.register("fences/blackwood_fences/blackwood_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_STOCKADE_FENCE = ITEMS.register("fences/chestnut_fences/chestnut_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_STOCKADE_FENCE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_STOCKADE_FENCE = ITEMS.register("fences/hickory_fences/hickory_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_STOCKADE_FENCE = ITEMS.register("fences/kapok_fences/kapok_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_STOCKADE_FENCE = ITEMS.register("fences/mangrove_fences/mangrove_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MANGROVE_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_STOCKADE_FENCE = ITEMS.register("fences/maple_fences/maple_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_STOCKADE_FENCE = ITEMS.register("fences/oak_fences/oak_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_STOCKADE_FENCE = ITEMS.register("fences/palm_fences/palm_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_STOCKADE_FENCE = ITEMS.register("fences/pine_fences/pine_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_STOCKADE_FENCE = ITEMS.register("fences/rosewood_fences/rosewood_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_STOCKADE_FENCE = ITEMS.register("fences/sequoia_fences/sequoia_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_STOCKADE_FENCE = ITEMS.register("fences/spruce_fences/spruce_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_STOCKADE_FENCE = ITEMS.register("fences/sycamore_fences/sycamore_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_STOCKADE_FENCE = ITEMS.register("fences/white_cedar_fences/white_cedar_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_STOCKADE_FENCE = ITEMS.register("fences/willow_fences/willow_stockade_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_STOCKADE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_HORSE_FENCE = ITEMS.register("fences/acacia_fences/acacia_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_HORSE_FENCE = ITEMS.register("fences/ash_fences/ash_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_HORSE_FENCE = ITEMS.register("fences/aspen_fences/aspen_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_HORSE_FENCE = ITEMS.register("fences/birch_fences/birch_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_HORSE_FENCE = ITEMS.register("fences/blackwood_fences/blackwood_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_HORSE_FENCE = ITEMS.register("fences/chestnut_fences/chestnut_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_HORSE_FENCE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_HORSE_FENCE = ITEMS.register("fences/hickory_fences/hickory_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_HORSE_FENCE = ITEMS.register("fences/kapok_fences/kapok_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_HORSE_FENCE = ITEMS.register("fences/mangrove_fences/mangrove_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MANGROVE_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_HORSE_FENCE = ITEMS.register("fences/maple_fences/maple_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_HORSE_FENCE = ITEMS.register("fences/oak_fences/oak_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_HORSE_FENCE = ITEMS.register("fences/palm_fences/palm_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_HORSE_FENCE = ITEMS.register("fences/pine_fences/pine_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_HORSE_FENCE = ITEMS.register("fences/rosewood_fences/rosewood_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_HORSE_FENCE = ITEMS.register("fences/sequoia_fences/sequoia_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_HORSE_FENCE = ITEMS.register("fences/spruce_fences/spruce_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_HORSE_FENCE = ITEMS.register("fences/sycamore_fences/sycamore_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_HORSE_FENCE = ITEMS.register("fences/white_cedar_fences/white_cedar_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_HORSE_FENCE = ITEMS.register("fences/willow_fences/willow_horse_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_HORSE_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_WIRED_FENCE = ITEMS.register("fences/acacia_fences/acacia_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_WIRED_FENCE = ITEMS.register("fences/ash_fences/ash_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_WIRED_FENCE = ITEMS.register("fences/aspen_fences/aspen_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_WIRED_FENCE = ITEMS.register("fences/birch_fences/birch_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_WIRED_FENCE = ITEMS.register("fences/blackwood_fences/blackwood_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_WIRED_FENCE = ITEMS.register("fences/chestnut_fences/chestnut_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_WIRED_FENCE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_WIRED_FENCE = ITEMS.register("fences/hickory_fences/hickory_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_WIRED_FENCE = ITEMS.register("fences/kapok_fences/kapok_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_WIRED_FENCE = ITEMS.register("fences/mangrove_fences/mangrove_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MANGROVE_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_WIRED_FENCE = ITEMS.register("fences/maple_fences/maple_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_WIRED_FENCE = ITEMS.register("fences/oak_fences/oak_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_WIRED_FENCE = ITEMS.register("fences/palm_fences/palm_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_WIRED_FENCE = ITEMS.register("fences/pine_fences/pine_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_WIRED_FENCE = ITEMS.register("fences/rosewood_fences/rosewood_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_WIRED_FENCE = ITEMS.register("fences/sequoia_fences/sequoia_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_WIRED_FENCE = ITEMS.register("fences/spruce_fences/spruce_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_WIRED_FENCE = ITEMS.register("fences/sycamore_fences/sycamore_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_WIRED_FENCE = ITEMS.register("fences/white_cedar_fences/white_cedar_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_WIRED_FENCE = ITEMS.register("fences/willow_fences/willow_wired_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_WIRED_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BAMBOO_FENCE = ITEMS.register("fences/other_fences/bamboo_fence",() -> {
        return new FuelItemBlock((Block)FenceInit.BAMBOO_FENCE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HEDGE = ITEMS.register("fences/other_fences/hedge",() -> {
        return new FuelItemBlock((Block)FenceInit.HEDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_HIGHLEY_GATE = ITEMS.register("fences/acacia_fences/acacia_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_HIGHLEY_GATE = ITEMS.register("fences/ash_fences/ash_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_HIGHLEY_GATE = ITEMS.register("fences/aspen_fences/aspen_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_HIGHLEY_GATE = ITEMS.register("fences/birch_fences/birch_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_HIGHLEY_GATE = ITEMS.register("fences/blackwood_fences/blackwood_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_HIGHLEY_GATE = ITEMS.register("fences/chestnut_fences/chestnut_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_HIGHLEY_GATE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_HIGHLEY_GATE = ITEMS.register("fences/hickory_fences/hickory_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_HIGHLEY_GATE = ITEMS.register("fences/kapok_fences/kapok_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_HIGHLEY_GATE = ITEMS.register("fences/mangrove_fences/mangrove_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.MANGROVE_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_HIGHLEY_GATE = ITEMS.register("fences/maple_fences/maple_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_HIGHLEY_GATE = ITEMS.register("fences/oak_fences/oak_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_HIGHLEY_GATE = ITEMS.register("fences/palm_fences/palm_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_HIGHLEY_GATE = ITEMS.register("fences/pine_fences/pine_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_HIGHLEY_GATE = ITEMS.register("fences/rosewood_fences/rosewood_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_HIGHLEY_GATE = ITEMS.register("fences/sequoia_fences/sequoia_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_HIGHLEY_GATE = ITEMS.register("fences/spruce_fences/spruce_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_HIGHLEY_GATE = ITEMS.register("fences/sycamore_fences/sycamore_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_HIGHLEY_GATE = ITEMS.register("fences/white_cedar_fences/white_cedar_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_HIGHLEY_GATE = ITEMS.register("fences/willow_fences/willow_highley_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_HIGHLEY_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PYRAMID_GATE = ITEMS.register("fences/acacia_fences/acacia_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ACACIA_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PYRAMID_GATE = ITEMS.register("fences/ash_fences/ash_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ASH_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PYRAMID_GATE = ITEMS.register("fences/aspen_fences/aspen_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ASPEN_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PYRAMID_GATE = ITEMS.register("fences/birch_fences/birch_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.BIRCH_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PYRAMID_GATE = ITEMS.register("fences/blackwood_fences/blackwood_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.BLACKWOOD_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PYRAMID_GATE = ITEMS.register("fences/chestnut_fences/chestnut_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.CHESTNUT_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PYRAMID_GATE = ITEMS.register("fences/douglas_fir_fences/douglas_fir_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.DOUGLAS_FIR_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PYRAMID_GATE = ITEMS.register("fences/hickory_fences/hickory_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.HICKORY_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PYRAMID_GATE = ITEMS.register("fences/kapok_fences/kapok_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.KAPOK_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_PYRAMID_GATE = ITEMS.register("fences/mangrove_fences/mangrove_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.MANGROVE_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PYRAMID_GATE = ITEMS.register("fences/maple_fences/maple_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.MAPLE_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PYRAMID_GATE = ITEMS.register("fences/oak_fences/oak_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.OAK_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PYRAMID_GATE = ITEMS.register("fences/palm_fences/palm_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.PALM_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PYRAMID_GATE = ITEMS.register("fences/pine_fences/pine_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.PINE_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PYRAMID_GATE = ITEMS.register("fences/rosewood_fences/rosewood_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.ROSEWOOD_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PYRAMID_GATE = ITEMS.register("fences/sequoia_fences/sequoia_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SEQUOIA_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PYRAMID_GATE = ITEMS.register("fences/spruce_fences/spruce_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SPRUCE_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PYRAMID_GATE = ITEMS.register("fences/sycamore_fences/sycamore_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.SYCAMORE_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PYRAMID_GATE = ITEMS.register("fences/white_cedar_fences/white_cedar_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.WHITE_CEDAR_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PYRAMID_GATE = ITEMS.register("fences/willow_fences/willow_pyramid_gate",() -> {
        return new FuelItemBlock((Block)FenceInit.WILLOW_PYRAMID_GATE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_ACACIA_BRIDGE = ITEMS.register("bridges/acacia_bridges/rope_acacia_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_ACACIA_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_ASH_BRIDGE = ITEMS.register("bridges/ash_bridges/rope_ash_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_ASH_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_ASPEN_BRIDGE = ITEMS.register("bridges/aspen_bridges/rope_aspen_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_ASPEN_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_BIRCH_BRIDGE = ITEMS.register("bridges/birch_bridges/rope_birch_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_BIRCH_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_BLACKWOOD_BRIDGE = ITEMS.register("bridges/blackwood_bridges/rope_blackwood_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_BLACKWOOD_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_CHESTNUT_BRIDGE = ITEMS.register("bridges/chestnut_bridges/rope_chestnut_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_CHESTNUT_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_DOUGLAS_FIR_BRIDGE = ITEMS.register("bridges/douglas_fir_bridges/rope_douglas_fir_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_DOUGLAS_FIR_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_HICKORY_BRIDGE = ITEMS.register("bridges/hickory_bridges/rope_hickory_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_HICKORY_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_KAPOK_BRIDGE = ITEMS.register("bridges/kapok_bridges/rope_kapok_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_KAPOK_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_MANGROVE_BRIDGE = ITEMS.register("bridges/mangrove_bridges/rope_mangrove_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_MANGROVE_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_MAPLE_BRIDGE = ITEMS.register("bridges/maple_bridges/rope_maple_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_MAPLE_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_OAK_BRIDGE = ITEMS.register("bridges/oak_bridges/rope_oak_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_OAK_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_PALM_BRIDGE = ITEMS.register("bridges/palm_bridges/rope_palm_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_PALM_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_PINE_BRIDGE = ITEMS.register("bridges/pine_bridges/rope_pine_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_PINE_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_ROSEWOOD_BRIDGE = ITEMS.register("bridges/rosewood_bridges/rope_rosewood_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_ROSEWOOD_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_SEQUOIA_BRIDGE = ITEMS.register("bridges/sequoia_bridges/rope_sequoia_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_SEQUOIA_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_SPRUCE_BRIDGE = ITEMS.register("bridges/spruce_bridges/rope_spruce_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_SPRUCE_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_SYCAMORE_BRIDGE = ITEMS.register("bridges/sycamore_bridges/rope_sycamore_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_SYCAMORE_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_WHITE_CEDAR_BRIDGE = ITEMS.register("bridges/white_cedar_bridges/rope_white_cedar_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_WHITE_CEDAR_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROPE_WILLOW_BRIDGE = ITEMS.register("bridges/willow_bridges/rope_willow_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROPE_WILLOW_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_BRIDGE_PIER = ITEMS.register("bridges/acacia_bridges/acacia_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_BRIDGE_PIER = ITEMS.register("bridges/ash_bridges/ash_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_BRIDGE_PIER = ITEMS.register("bridges/aspen_bridges/aspen_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_BRIDGE_PIER = ITEMS.register("bridges/birch_bridges/birch_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_BRIDGE_PIER = ITEMS.register("bridges/blackwood_bridges/blackwood_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_BRIDGE_PIER = ITEMS.register("bridges/chestnut_bridges/chestnut_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_BRIDGE_PIER = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_BRIDGE_PIER = ITEMS.register("bridges/hickory_bridges/hickory_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_BRIDGE_PIER = ITEMS.register("bridges/kapok_bridges/kapok_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_BRIDGE_PIER = ITEMS.register("bridges/mangrove_bridges/mangrove_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.MANGROVE_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_BRIDGE_PIER = ITEMS.register("bridges/maple_bridges/maple_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_BRIDGE_PIER = ITEMS.register("bridges/oak_bridges/oak_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_BRIDGE_PIER = ITEMS.register("bridges/palm_bridges/palm_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_BRIDGE_PIER = ITEMS.register("bridges/pine_bridges/pine_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_BRIDGE_PIER = ITEMS.register("bridges/rosewood_bridges/rosewood_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_BRIDGE_PIER = ITEMS.register("bridges/sequoia_bridges/sequoia_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_BRIDGE_PIER = ITEMS.register("bridges/spruce_bridges/spruce_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_BRIDGE_PIER = ITEMS.register("bridges/sycamore_bridges/sycamore_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_BRIDGE_PIER = ITEMS.register("bridges/white_cedar_bridges/white_cedar_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_BRIDGE_PIER = ITEMS.register("bridges/willow_bridges/willow_bridge_pier",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/acacia_bridges/acacia_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/ash_bridges/ash_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/aspen_bridges/aspen_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/birch_bridges/birch_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/blackwood_bridges/blackwood_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/chestnut_bridges/chestnut_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/hickory_bridges/hickory_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/kapok_bridges/kapok_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/mangrove_bridges/mangrove_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.MANGROVE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/maple_bridges/maple_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/oak_bridges/oak_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/palm_bridges/palm_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/pine_bridges/pine_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/rosewood_bridges/rosewood_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/sequoia_bridges/sequoia_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/spruce_bridges/spruce_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/sycamore_bridges/sycamore_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/white_cedar_bridges/white_cedar_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_LOG_BRIDGE_MIDDLE = ITEMS.register("bridges/willow_bridges/willow_log_bridge_middle",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_LOG_BRIDGE_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_LOG_BRIDGE_STAIR = ITEMS.register("bridges/acacia_bridges/acacia_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_LOG_BRIDGE_STAIR = ITEMS.register("bridges/ash_bridges/ash_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_LOG_BRIDGE_STAIR = ITEMS.register("bridges/aspen_bridges/aspen_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_LOG_BRIDGE_STAIR = ITEMS.register("bridges/birch_bridges/birch_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_LOG_BRIDGE_STAIR = ITEMS.register("bridges/blackwood_bridges/blackwood_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_LOG_BRIDGE_STAIR = ITEMS.register("bridges/chestnut_bridges/chestnut_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_LOG_BRIDGE_STAIR = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_LOG_BRIDGE_STAIR = ITEMS.register("bridges/hickory_bridges/hickory_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_LOG_BRIDGE_STAIR = ITEMS.register("bridges/kapok_bridges/kapok_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_LOG_BRIDGE_STAIR = ITEMS.register("bridges/mangrove_bridges/mangrove_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.MANGROVE_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_LOG_BRIDGE_STAIR = ITEMS.register("bridges/maple_bridges/maple_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_LOG_BRIDGE_STAIR = ITEMS.register("bridges/oak_bridges/oak_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_LOG_BRIDGE_STAIR = ITEMS.register("bridges/palm_bridges/palm_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_LOG_BRIDGE_STAIR = ITEMS.register("bridges/pine_bridges/pine_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_LOG_BRIDGE_STAIR = ITEMS.register("bridges/rosewood_bridges/rosewood_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_LOG_BRIDGE_STAIR = ITEMS.register("bridges/sequoia_bridges/sequoia_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_LOG_BRIDGE_STAIR = ITEMS.register("bridges/spruce_bridges/spruce_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_LOG_BRIDGE_STAIR = ITEMS.register("bridges/sycamore_bridges/sycamore_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_LOG_BRIDGE_STAIR = ITEMS.register("bridges/white_cedar_bridges/white_cedar_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_LOG_BRIDGE_STAIR = ITEMS.register("bridges/willow_bridges/willow_log_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_LOG_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/acacia_bridges/acacia_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/ash_bridges/ash_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/aspen_bridges/aspen_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/birch_bridges/birch_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/blackwood_bridges/blackwood_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/chestnut_bridges/chestnut_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/hickory_bridges/hickory_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/kapok_bridges/kapok_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/mangrove_bridges/mangrove_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.MANGROVE_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/maple_bridges/maple_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/oak_bridges/oak_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/palm_bridges/palm_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/pine_bridges/pine_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/rosewood_bridges/rosewood_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/sequoia_bridges/sequoia_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/spruce_bridges/spruce_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/sycamore_bridges/sycamore_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/white_cedar_bridges/white_cedar_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_ROPE_BRIDGE_STAIR = ITEMS.register("bridges/willow_bridges/willow_rope_bridge_stair",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_ROPE_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_RAIL_BRIDGE = ITEMS.register("bridges/acacia_bridges/acacia_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ACACIA_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_RAIL_BRIDGE = ITEMS.register("bridges/ash_bridges/ash_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASH_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_RAIL_BRIDGE = ITEMS.register("bridges/aspen_bridges/aspen_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ASPEN_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_RAIL_BRIDGE = ITEMS.register("bridges/birch_bridges/birch_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.BIRCH_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_RAIL_BRIDGE = ITEMS.register("bridges/blackwood_bridges/blackwood_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.BLACKWOOD_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_RAIL_BRIDGE = ITEMS.register("bridges/chestnut_bridges/chestnut_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.CHESTNUT_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_RAIL_BRIDGE = ITEMS.register("bridges/douglas_fir_bridges/douglas_fir_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.DOUGLAS_FIR_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_RAIL_BRIDGE = ITEMS.register("bridges/hickory_bridges/hickory_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.HICKORY_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_RAIL_BRIDGE = ITEMS.register("bridges/kapok_bridges/kapok_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.KAPOK_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_RAIL_BRIDGE = ITEMS.register("bridges/mangrove_bridges/mangrove_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.MANGROVE_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_RAIL_BRIDGE = ITEMS.register("bridges/maple_bridges/maple_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.MAPLE_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_RAIL_BRIDGE = ITEMS.register("bridges/oak_bridges/oak_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.OAK_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_RAIL_BRIDGE = ITEMS.register("bridges/palm_bridges/palm_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.PALM_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_RAIL_BRIDGE = ITEMS.register("bridges/pine_bridges/pine_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.PINE_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_RAIL_BRIDGE = ITEMS.register("bridges/rosewood_bridges/rosewood_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.ROSEWOOD_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_RAIL_BRIDGE = ITEMS.register("bridges/sequoia_bridges/sequoia_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.SEQUOIA_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_RAIL_BRIDGE = ITEMS.register("bridges/spruce_bridges/spruce_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.SPRUCE_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_RAIL_BRIDGE = ITEMS.register("bridges/sycamore_bridges/sycamore_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.SYCAMORE_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_RAIL_BRIDGE = ITEMS.register("bridges/white_cedar_bridges/white_cedar_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.WHITE_CEDAR_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_RAIL_BRIDGE = ITEMS.register("bridges/willow_bridges/willow_rail_bridge",() -> {
        return new FuelItemBlock((Block)BridgeInit.WILLOW_RAIL_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICK_BRIDGE = ITEMS.register("bridges/brick_bridges/brick_bridge", () -> {
        return new FuelItemBlock((Block)BridgeInit.BRICK_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICK_BRIDGE_PIER = ITEMS.register("bridges/brick_bridges/brick_bridge_pier", () -> {
        return new FuelItemBlock((Block)BridgeInit.BRICK_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICK_BRIDGE_STAIR = ITEMS.register("bridges/brick_bridges/brick_bridge_stair", () -> {
        return new FuelItemBlock((Block)BridgeInit.BRICK_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BAMBOO_BRIDGE = ITEMS.register("bridges/bamboo_bridges/bamboo_bridge", () -> {
        return new FuelItemBlock((Block)BridgeInit.BAMBOO_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DRY_BAMBOO_BRIDGE = ITEMS.register("bridges/bamboo_bridges/dry_bamboo_bridge", () -> {
        return new FuelItemBlock((Block)BridgeInit.DRY_BAMBOO_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BAMBOO_BRIDGE_PIER = ITEMS.register("bridges/bamboo_bridges/bamboo_bridge_pier", () -> {
        return new FuelItemBlock((Block)BridgeInit.BAMBOO_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DRY_BAMBOO_BRIDGE_PIER = ITEMS.register("bridges/bamboo_bridges/dry_bamboo_bridge_pier", () -> {
        return new FuelItemBlock((Block)BridgeInit.DRY_BAMBOO_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BAMBOO_BRIDGE_STAIR = ITEMS.register("bridges/bamboo_bridges/bamboo_bridge_stair", () -> {
        return new FuelItemBlock((Block)BridgeInit.BAMBOO_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DRY_BAMBOO_BRIDGE_STAIR = ITEMS.register("bridges/bamboo_bridges/dry_bamboo_bridge_stair", () -> {
        return new FuelItemBlock((Block)BridgeInit.DRY_BAMBOO_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> IRON_BRIDGE_PIER = ITEMS.register("bridges/iron_bridges/iron_bridge_pier", () -> {
        return new FuelItemBlock((Block)BridgeInit.IRON_BRIDGE_PIER.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> IRON_BRIDGE_STAIR = ITEMS.register("bridges/iron_bridges/iron_bridge_stair", () -> {
        return new FuelItemBlock((Block)BridgeInit.IRON_BRIDGE_STAIR.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> IRON_BRIDGE = ITEMS.register("bridges/iron_bridges/iron_bridge", () -> {
        return new FuelItemBlock((Block)BridgeInit.IRON_BRIDGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_ROOF = ITEMS.register("roofs/ash_roofs/ash_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_ROOF = ITEMS.register("roofs/birch_roofs/birch_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_ROOF = ITEMS.register("roofs/maple_roofs/maple_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_ROOF = ITEMS.register("roofs/oak_roofs/oak_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_ROOF = ITEMS.register("roofs/palm_roofs/palm_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_ROOF = ITEMS.register("roofs/pine_roofs/pine_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_ROOF = ITEMS.register("roofs/willow_roofs/willow_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_ATTIC_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_ATTIC_ROOF = ITEMS.register("roofs/ash_roofs/ash_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_ATTIC_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_ATTIC_ROOF = ITEMS.register("roofs/birch_roofs/birch_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_ATTIC_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_ATTIC_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_ATTIC_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_ATTIC_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_ATTIC_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_ATTIC_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_ATTIC_ROOF = ITEMS.register("roofs/maple_roofs/maple_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_ATTIC_ROOF = ITEMS.register("roofs/oak_roofs/oak_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_ATTIC_ROOF = ITEMS.register("roofs/palm_roofs/palm_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_ATTIC_ROOF = ITEMS.register("roofs/pine_roofs/pine_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_ATTIC_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_ATTIC_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_ATTIC_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_ATTIC_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_ATTIC_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_ATTIC_ROOF = ITEMS.register("roofs/willow_roofs/willow_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_TOP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_TOP_ROOF = ITEMS.register("roofs/ash_roofs/ash_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_TOP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_TOP_ROOF = ITEMS.register("roofs/birch_roofs/birch_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_TOP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_TOP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_TOP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_TOP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_TOP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_TOP_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_TOP_ROOF = ITEMS.register("roofs/maple_roofs/maple_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_TOP_ROOF = ITEMS.register("roofs/oak_roofs/oak_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_TOP_ROOF = ITEMS.register("roofs/palm_roofs/palm_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_TOP_ROOF = ITEMS.register("roofs/pine_roofs/pine_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_TOP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_TOP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_TOP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_TOP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_TOP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_TOP_ROOF = ITEMS.register("roofs/willow_roofs/willow_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_LOWER_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_LOWER_ROOF = ITEMS.register("roofs/ash_roofs/ash_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_LOWER_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_LOWER_ROOF = ITEMS.register("roofs/birch_roofs/birch_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_LOWER_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_LOWER_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_LOWER_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_LOWER_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_LOWER_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_LOWER_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_LOWER_ROOF = ITEMS.register("roofs/maple_roofs/maple_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_LOWER_ROOF = ITEMS.register("roofs/oak_roofs/oak_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_LOWER_ROOF = ITEMS.register("roofs/palm_roofs/palm_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_LOWER_ROOF = ITEMS.register("roofs/pine_roofs/pine_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_LOWER_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_LOWER_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_LOWER_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_LOWER_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_LOWER_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_LOWER_ROOF = ITEMS.register("roofs/willow_roofs/willow_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_STEEP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_STEEP_ROOF = ITEMS.register("roofs/ash_roofs/ash_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_STEEP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_STEEP_ROOF = ITEMS.register("roofs/birch_roofs/birch_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_STEEP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_STEEP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_STEEP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_STEEP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_STEEP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_STEEP_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_STEEP_ROOF = ITEMS.register("roofs/maple_roofs/maple_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_STEEP_ROOF = ITEMS.register("roofs/oak_roofs/oak_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_STEEP_ROOF = ITEMS.register("roofs/palm_roofs/palm_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_STEEP_ROOF = ITEMS.register("roofs/pine_roofs/pine_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_STEEP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_STEEP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_STEEP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_STEEP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_STEEP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_STEEP_ROOF = ITEMS.register("roofs/willow_roofs/willow_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_UPPER_LOWER_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_UPPER_LOWER_ROOF = ITEMS.register("roofs/ash_roofs/ash_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_UPPER_LOWER_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_UPPER_LOWER_ROOF = ITEMS.register("roofs/birch_roofs/birch_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_UPPER_LOWER_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_UPPER_LOWER_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_UPPER_LOWER_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_UPPER_LOWER_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_UPPER_LOWER_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_UPPER_LOWER_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_UPPER_LOWER_ROOF = ITEMS.register("roofs/maple_roofs/maple_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_UPPER_LOWER_ROOF = ITEMS.register("roofs/oak_roofs/oak_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_UPPER_LOWER_ROOF = ITEMS.register("roofs/palm_roofs/palm_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_UPPER_LOWER_ROOF = ITEMS.register("roofs/pine_roofs/pine_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_UPPER_LOWER_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_UPPER_LOWER_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_UPPER_LOWER_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_UPPER_LOWER_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_UPPER_LOWER_ROOF = ITEMS.register("roofs/willow_roofs/willow_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_UPPER_STEEP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_UPPER_STEEP_ROOF = ITEMS.register("roofs/ash_roofs/ash_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_UPPER_STEEP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_UPPER_STEEP_ROOF = ITEMS.register("roofs/birch_roofs/birch_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_UPPER_STEEP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_UPPER_STEEP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_UPPER_STEEP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_UPPER_STEEP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_UPPER_STEEP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_UPPER_STEEP_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_UPPER_STEEP_ROOF = ITEMS.register("roofs/maple_roofs/maple_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_UPPER_STEEP_ROOF = ITEMS.register("roofs/oak_roofs/oak_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_UPPER_STEEP_ROOF = ITEMS.register("roofs/palm_roofs/palm_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_UPPER_STEEP_ROOF = ITEMS.register("roofs/pine_roofs/pine_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_UPPER_STEEP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_UPPER_STEEP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_UPPER_STEEP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_UPPER_STEEP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_UPPER_STEEP_ROOF = ITEMS.register("roofs/willow_roofs/willow_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_PLANKS_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_ATTIC_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_TOP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_TOP_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_TOP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_TOP_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_TOP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_TOP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_TOP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_TOP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_TOP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_PLANKS_TOP_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_TOP_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_TOP_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_TOP_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_TOP_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_TOP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_TOP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_TOP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_TOP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_TOP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_TOP_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_LOWER_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_LOWER_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_LOWER_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_LOWER_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_LOWER_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_LOWER_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_LOWER_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_LOWER_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_LOWER_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_PLANKS_LOWER_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_LOWER_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_LOWER_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_LOWER_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_LOWER_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_LOWER_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_LOWER_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_LOWER_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_LOWER_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_LOWER_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_LOWER_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_STEEP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_STEEP_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_STEEP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_STEEP_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_STEEP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_STEEP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_STEEP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_STEEP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_STEEP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_PLANKS_STEEP_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_STEEP_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_STEEP_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_STEEP_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_STEEP_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_STEEP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_STEEP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_STEEP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_STEEP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_STEEP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_STEEP_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ACACIA_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/acacia_roofs/acacia_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ACACIA_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASH_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/ash_roofs/ash_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASH_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ASPEN_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/aspen_roofs/aspen_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ASPEN_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BIRCH_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/birch_roofs/birch_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BIRCH_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACKWOOD_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/blackwood_roofs/blackwood_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACKWOOD_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CHESTNUT_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/chestnut_roofs/chestnut_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CHESTNUT_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> DOUGLAS_FIR_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/douglas_fir_roofs/douglas_fir_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.DOUGLAS_FIR_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> HICKORY_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/hickory_roofs/hickory_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.HICKORY_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> KAPOK_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/kapok_roofs/kapok_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.KAPOK_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MANGROVE_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/mangrove_roofs/mangrove_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MANGROVE_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAPLE_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/maple_roofs/maple_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAPLE_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> OAK_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/oak_roofs/oak_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.OAK_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PALM_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/palm_roofs/palm_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PALM_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINE_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/pine_roofs/pine_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINE_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ROSEWOOD_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/rosewood_roofs/rosewood_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ROSEWOOD_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SEQUOIA_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/sequoia_roofs/sequoia_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SEQUOIA_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SPRUCE_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/spruce_roofs/spruce_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SPRUCE_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> SYCAMORE_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/sycamore_roofs/sycamore_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.SYCAMORE_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CEDAR_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_cedar_roofs/white_cedar_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CEDAR_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WILLOW_PLANKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/willow_roofs/willow_planks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WILLOW_PLANKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_ROOF = ITEMS.register("roofs/base_roofs/base_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_ATTIC_ROOF = ITEMS.register("roofs/base_roofs/base_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_TOP_ROOF = ITEMS.register("roofs/base_roofs/base_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_LOWER_ROOF = ITEMS.register("roofs/base_roofs/base_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_STEEP_ROOF = ITEMS.register("roofs/base_roofs/base_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_UPPER_LOWER_ROOF = ITEMS.register("roofs/base_roofs/base_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_UPPER_STEEP_ROOF = ITEMS.register("roofs/base_roofs/base_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_ROOF_BLOCK = ITEMS.register("roofs/base_roofs/base_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BASE_ROOF_SLAB = ITEMS.register("roofs/base_roofs/base_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.BASE_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_terracotta_roofs/white_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_gray_terracotta_roofs/light_gray_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/gray_terracotta_roofs/gray_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/black_terracotta_roofs/black_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/blue_terracotta_roofs/blue_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_blue_terracotta_roofs/light_blue_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/cyan_terracotta_roofs/cyan_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/lime_terracotta_roofs/lime_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/green_terracotta_roofs/green_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/yellow_terracotta_roofs/yellow_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/brown_terracotta_roofs/brown_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/orange_terracotta_roofs/orange_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/red_terracotta_roofs/red_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/magenta_terracotta_roofs/magenta_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/pink_terracotta_roofs/pink_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_ATTIC_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_TOP_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_LOWER_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_STEEP_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_UPPER_LOWER_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_TERRACOTTA_UPPER_STEEP_ROOF = ITEMS.register("roofs/purple_terracotta_roofs/purple_terracotta_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_TERRACOTTA_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_concrete_roofs/white_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_TOP_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_gray_concrete_roofs/light_gray_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_TOP_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/gray_concrete_roofs/gray_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_TOP_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/black_concrete_roofs/black_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/blue_concrete_roofs/blue_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLUE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_blue_concrete_roofs/light_blue_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_BLUE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_TOP_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/cyan_concrete_roofs/cyan_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.CYAN_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_TOP_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/lime_concrete_roofs/lime_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIME_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_TOP_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/green_concrete_roofs/green_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GREEN_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_TOP_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/yellow_concrete_roofs/yellow_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.YELLOW_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_TOP_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/brown_concrete_roofs/brown_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BROWN_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/orange_concrete_roofs/orange_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.ORANGE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_TOP_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/red_concrete_roofs/red_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.RED_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_TOP_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/magenta_concrete_roofs/magenta_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.MAGENTA_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_TOP_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/pink_concrete_roofs/pink_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PINK_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_ATTIC_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_TOP_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_LOWER_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_STEEP_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_UPPER_LOWER_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_CONCRETE_UPPER_STEEP_ROOF = ITEMS.register("roofs/purple_concrete_roofs/purple_concrete_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.PURPLE_CONCRETE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_ROOF = ITEMS.register("roofs/white_roofs/white_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_ATTIC_ROOF = ITEMS.register("roofs/white_roofs/white_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_TOP_ROOF = ITEMS.register("roofs/white_roofs/white_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_LOWER_ROOF = ITEMS.register("roofs/white_roofs/white_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_STEEP_ROOF = ITEMS.register("roofs/white_roofs/white_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_UPPER_LOWER_ROOF = ITEMS.register("roofs/white_roofs/white_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_UPPER_STEEP_ROOF = ITEMS.register("roofs/white_roofs/white_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_ROOF_BLOCK = ITEMS.register("roofs/white_roofs/white_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> WHITE_ROOF_SLAB = ITEMS.register("roofs/white_roofs/white_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.WHITE_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_ATTIC_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_TOP_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_LOWER_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_STEEP_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_UPPER_LOWER_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_UPPER_STEEP_ROOF = ITEMS.register("roofs/light_gray_roofs/light_gray_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_ROOF_BLOCK = ITEMS.register("roofs/light_gray_roofs/light_gray_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_ROOF_SLAB = ITEMS.register("roofs/light_gray_roofs/light_gray_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.LIGHT_GRAY_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_ROOF = ITEMS.register("roofs/gray_roofs/gray_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_ATTIC_ROOF = ITEMS.register("roofs/gray_roofs/gray_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_TOP_ROOF = ITEMS.register("roofs/gray_roofs/gray_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_LOWER_ROOF = ITEMS.register("roofs/gray_roofs/gray_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_STEEP_ROOF = ITEMS.register("roofs/gray_roofs/gray_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_UPPER_LOWER_ROOF = ITEMS.register("roofs/gray_roofs/gray_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_UPPER_STEEP_ROOF = ITEMS.register("roofs/gray_roofs/gray_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_ROOF_BLOCK = ITEMS.register("roofs/gray_roofs/gray_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_ROOF_SLAB = ITEMS.register("roofs/gray_roofs/gray_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.GRAY_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_ROOF = ITEMS.register("roofs/black_roofs/black_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_ATTIC_ROOF = ITEMS.register("roofs/black_roofs/black_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_TOP_ROOF = ITEMS.register("roofs/black_roofs/black_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_LOWER_ROOF = ITEMS.register("roofs/black_roofs/black_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_STEEP_ROOF = ITEMS.register("roofs/black_roofs/black_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_UPPER_LOWER_ROOF = ITEMS.register("roofs/black_roofs/black_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_UPPER_STEEP_ROOF = ITEMS.register("roofs/black_roofs/black_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_ROOF_BLOCK = ITEMS.register("roofs/black_roofs/black_roof_block",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_ROOF_BLOCK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_ROOF_SLAB = ITEMS.register("roofs/black_roofs/black_roof_slab",() -> {
        return new FuelItemBlock((Block)RoofInit.BLACK_ROOF_SLAB.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_ATTIC_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_TOP_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_LOWER_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_STEEP_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_UPPER_LOWER_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH_UPPER_STEEP_ROOF = ITEMS.register("roofs/thatch_roofs/thatch_upper_steep_roof",() -> {
        return new FuelItemBlock((Block) RoofInit.THATCH_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH2_ROOF = ITEMS.register("roofs/thatch2_roofs/thatch2_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH2_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH2_ATTIC_ROOF = ITEMS.register("roofs/thatch2_roofs/thatch2_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH2_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH2_TOP_ROOF = ITEMS.register("roofs/thatch2_roofs/thatch2_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH2_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH2_LOWER_ROOF = ITEMS.register("roofs/thatch2_roofs/thatch2_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH2_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH2_STEEP_ROOF = ITEMS.register("roofs/thatch2_roofs/thatch2_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH2_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH2_UPPER_LOWER_ROOF = ITEMS.register("roofs/thatch2_roofs/thatch2_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH2_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> THATCH2_UPPER_STEEP_ROOF = ITEMS.register("roofs/thatch2_roofs/thatch2_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.THATCH2_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_ROOF = ITEMS.register("roofs/brick_roofs/bricks_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_ATTIC_ROOF = ITEMS.register("roofs/brick_roofs/bricks_attic_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_ATTIC_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_TOP_ROOF = ITEMS.register("roofs/brick_roofs/bricks_top_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_TOP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_LOWER_ROOF = ITEMS.register("roofs/brick_roofs/bricks_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_STEEP_ROOF = ITEMS.register("roofs/brick_roofs/bricks_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_UPPER_LOWER_ROOF = ITEMS.register("roofs/brick_roofs/bricks_upper_lower_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_UPPER_LOWER_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BRICKS_UPPER_STEEP_ROOF = ITEMS.register("roofs/brick_roofs/bricks_upper_steep_roof",() -> {
        return new FuelItemBlock((Block)RoofInit.BRICKS_UPPER_STEEP_ROOF.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLACK_STRIPED_AWNING = ITEMS.register("roofs/awnings/black_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.BLACK_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BLUE_STRIPED_AWNING = ITEMS.register("roofs/awnings/blue_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.BLUE_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> BROWN_STRIPED_AWNING = ITEMS.register("roofs/awnings/brown_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.BROWN_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CYAN_STRIPED_AWNING = ITEMS.register("roofs/awnings/cyan_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.CYAN_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GRAY_STRIPED_AWNING = ITEMS.register("roofs/awnings/gray_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.GRAY_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GREEN_STRIPED_AWNING = ITEMS.register("roofs/awnings/green_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.GREEN_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_BLUE_STRIPED_AWNING = ITEMS.register("roofs/awnings/light_blue_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.LIGHT_BLUE_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIGHT_GRAY_STRIPED_AWNING = ITEMS.register("roofs/awnings/light_gray_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.LIGHT_GRAY_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> LIME_STRIPED_AWNING = ITEMS.register("roofs/awnings/lime_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.LIME_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> MAGENTA_STRIPED_AWNING = ITEMS.register("roofs/awnings/magenta_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.MAGENTA_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> ORANGE_STRIPED_AWNING = ITEMS.register("roofs/awnings/orange_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.ORANGE_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PINK_STRIPED_AWNING = ITEMS.register("roofs/awnings/pink_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.PINK_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> PURPLE_STRIPED_AWNING = ITEMS.register("roofs/awnings/purple_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.PURPLE_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> RED_STRIPED_AWNING = ITEMS.register("roofs/awnings/red_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.RED_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> YELLOW_STRIPED_AWNING = ITEMS.register("roofs/awnings/yellow_striped_awning",() -> {
        return new FuelItemBlock((Block)GutterInit.YELLOW_STRIPED_AWNING.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_BLACK = ITEMS.register("roofs/gutters/gutter_base_black",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_BLACK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_BLUE = ITEMS.register("roofs/gutters/gutter_base_blue",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_BLUE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_BROWN = ITEMS.register("roofs/gutters/gutter_base_brown",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_BROWN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_CYAN = ITEMS.register("roofs/gutters/gutter_base_cyan",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_CYAN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_GRAY = ITEMS.register("roofs/gutters/gutter_base_gray",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_GRAY.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_GREEN = ITEMS.register("roofs/gutters/gutter_base_green",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_GREEN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_LIGHT_BLUE = ITEMS.register("roofs/gutters/gutter_base_light_blue",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_LIGHT_BLUE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_LIGHT_GRAY = ITEMS.register("roofs/gutters/gutter_base_light_gray",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_LIGHT_GRAY.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_LIME = ITEMS.register("roofs/gutters/gutter_base_lime",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_LIME.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_MAGENTA = ITEMS.register("roofs/gutters/gutter_base_magenta",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_MAGENTA.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_ORANGE = ITEMS.register("roofs/gutters/gutter_base_orange",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_ORANGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_PINK = ITEMS.register("roofs/gutters/gutter_base_pink",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_PINK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_PURPLE = ITEMS.register("roofs/gutters/gutter_base_purple",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_PURPLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_RED = ITEMS.register("roofs/gutters/gutter_base_red",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_RED.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_YELLOW = ITEMS.register("roofs/gutters/gutter_base_yellow",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_YELLOW.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE_WHITE = ITEMS.register("roofs/gutters/gutter_base_white",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE_WHITE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_BASE = ITEMS.register("roofs/gutters/gutter_base",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_BASE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE = ITEMS.register("roofs/gutters/gutter_middle",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_BLACK = ITEMS.register("roofs/gutters/gutter_middle_black",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_BLACK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_BLUE = ITEMS.register("roofs/gutters/gutter_middle_blue",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_BLUE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_BROWN = ITEMS.register("roofs/gutters/gutter_middle_brown",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_BROWN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_CYAN = ITEMS.register("roofs/gutters/gutter_middle_cyan",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_CYAN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_GRAY = ITEMS.register("roofs/gutters/gutter_middle_gray",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_GRAY.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_GREEN = ITEMS.register("roofs/gutters/gutter_middle_green",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_GREEN.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_LIGHT_BLUE = ITEMS.register("roofs/gutters/gutter_middle_light_blue",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_LIGHT_BLUE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_LIGHT_GRAY = ITEMS.register("roofs/gutters/gutter_middle_light_gray",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_LIGHT_GRAY.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_LIME = ITEMS.register("roofs/gutters/gutter_middle_lime",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_LIME.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_MAGENTA = ITEMS.register("roofs/gutters/gutter_middle_magenta",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_MAGENTA.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_ORANGE = ITEMS.register("roofs/gutters/gutter_middle_orange",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_ORANGE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_PINK = ITEMS.register("roofs/gutters/gutter_middle_pink",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_PINK.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_PURPLE = ITEMS.register("roofs/gutters/gutter_middle_purple",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_PURPLE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_RED = ITEMS.register("roofs/gutters/gutter_middle_red",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_RED.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_YELLOW = ITEMS.register("roofs/gutters/gutter_middle_yellow",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_YELLOW.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> GUTTER_MIDDLE_WHITE = ITEMS.register("roofs/gutters/gutter_middle_white",() -> {
        return new FuelItemBlock((Block)GutterInit.GUTTER_MIDDLE_WHITE.get(), new Item.Properties());
    });
    public static final RegistryObject<Item> CABINET_DOOR = ITEMS.register("furniture/cabinet/cabinet_door", () -> new CraftingItem(new Item.Properties()));
    public static final RegistryObject<Item> CABINET_DRAWER = ITEMS.register("furniture/cabinet/cabinet_drawer", () -> new CraftingItem(new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WARDROBE = ITEMS.register("furniture/acacia_furniture/acacia_wardrobe", () -> new ItemBlock(FurnitureInit.ACACIA_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_MODERN_WARDROBE = ITEMS.register("furniture/acacia_furniture/acacia_modern_wardrobe", () -> new ItemBlock(FurnitureInit.ACACIA_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_DOUBLE_WARDROBE = ITEMS.register("furniture/acacia_furniture/acacia_double_wardrobe", () -> new ItemBlock(FurnitureInit.ACACIA_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BOOKSHELF = ITEMS.register("furniture/acacia_furniture/acacia_bookshelf", () -> new ItemBlock(FurnitureInit.ACACIA_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/acacia_furniture/acacia_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.ACACIA_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_DRAWER = ITEMS.register("furniture/acacia_furniture/acacia_drawer", () -> new ItemBlock(FurnitureInit.ACACIA_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_DOUBLE_DRAWER = ITEMS.register("furniture/acacia_furniture/acacia_double_drawer", () -> new ItemBlock(FurnitureInit.ACACIA_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BOOKSHELF_DRAWER = ITEMS.register("furniture/acacia_furniture/acacia_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.ACACIA_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/acacia_furniture/acacia_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.ACACIA_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_LARGE_DRAWER = ITEMS.register("furniture/acacia_furniture/acacia_large_drawer", () -> new ItemBlock(FurnitureInit.ACACIA_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/acacia_furniture/acacia_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.ACACIA_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_TRIPLE_DRAWER = ITEMS.register("furniture/acacia_furniture/acacia_triple_drawer", () -> new ItemBlock(FurnitureInit.ACACIA_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_DESK = ITEMS.register("furniture/acacia_furniture/acacia_desk", () -> new ItemBlock(FurnitureInit.ACACIA_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_COVERED_DESK = ITEMS.register("furniture/acacia_furniture/acacia_covered_desk", () -> new ItemBlock(FurnitureInit.ACACIA_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_MODERN_DESK = ITEMS.register("furniture/acacia_furniture/acacia_modern_desk", () -> new ItemBlock(FurnitureInit.ACACIA_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_TABLE = ITEMS.register("furniture/acacia_furniture/acacia_table", () -> new ItemBlock(FurnitureInit.ACACIA_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_END_TABLE = ITEMS.register("furniture/acacia_furniture/acacia_end_table", () -> new ItemBlock(FurnitureInit.ACACIA_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_COFFEE_TABLE = ITEMS.register("furniture/acacia_furniture/acacia_coffee_table", () -> new ItemBlock(FurnitureInit.ACACIA_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_GLASS_TABLE = ITEMS.register("furniture/acacia_furniture/acacia_glass_table", () -> new ItemBlock(FurnitureInit.ACACIA_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CHAIR = ITEMS.register("furniture/acacia_furniture/acacia_chair", () -> new ItemBlock(FurnitureInit.ACACIA_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_MODERN_CHAIR = ITEMS.register("furniture/acacia_furniture/acacia_modern_chair", () -> new ItemBlock(FurnitureInit.ACACIA_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_STRIPED_CHAIR = ITEMS.register("furniture/acacia_furniture/acacia_striped_chair", () -> new ItemBlock(FurnitureInit.ACACIA_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_STOOL_CHAIR = ITEMS.register("furniture/acacia_furniture/acacia_stool_chair", () -> new ItemBlock(FurnitureInit.ACACIA_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_COUNTER = ITEMS.register("furniture/acacia_furniture/acacia_counter", () -> new ItemBlock(FurnitureInit.ACACIA_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_DRAWER_COUNTER = ITEMS.register("furniture/acacia_furniture/acacia_drawer_counter", () -> new ItemBlock(FurnitureInit.ACACIA_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/acacia_furniture/acacia_double_drawer_counter", () -> new ItemBlock(FurnitureInit.ACACIA_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_CUPBOARD_COUNTER = ITEMS.register("furniture/acacia_furniture/acacia_cupboard_counter", () -> new ItemBlock(FurnitureInit.ACACIA_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_WARDROBE = ITEMS.register("furniture/acacia_furniture/stripped_acacia_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_MODERN_WARDROBE = ITEMS.register("furniture/acacia_furniture/stripped_acacia_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_DOUBLE_WARDROBE = ITEMS.register("furniture/acacia_furniture/stripped_acacia_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_BOOKSHELF = ITEMS.register("furniture/acacia_furniture/stripped_acacia_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/acacia_furniture/stripped_acacia_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_DRAWER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_DOUBLE_DRAWER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_BOOKSHELF_DRAWER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LARGE_DRAWER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_TRIPLE_DRAWER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_DESK = ITEMS.register("furniture/acacia_furniture/stripped_acacia_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_COVERED_DESK = ITEMS.register("furniture/acacia_furniture/stripped_acacia_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_MODERN_DESK = ITEMS.register("furniture/acacia_furniture/stripped_acacia_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_TABLE = ITEMS.register("furniture/acacia_furniture/stripped_acacia_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_END_TABLE = ITEMS.register("furniture/acacia_furniture/stripped_acacia_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_COFFEE_TABLE = ITEMS.register("furniture/acacia_furniture/stripped_acacia_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_GLASS_TABLE = ITEMS.register("furniture/acacia_furniture/stripped_acacia_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_CHAIR = ITEMS.register("furniture/acacia_furniture/stripped_acacia_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_MODERN_CHAIR = ITEMS.register("furniture/acacia_furniture/stripped_acacia_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_STRIPED_CHAIR = ITEMS.register("furniture/acacia_furniture/stripped_acacia_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_STOOL_CHAIR = ITEMS.register("furniture/acacia_furniture/stripped_acacia_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_COUNTER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_DRAWER_COUNTER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ACACIA_CUPBOARD_COUNTER = ITEMS.register("furniture/acacia_furniture/stripped_acacia_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ACACIA_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_WARDROBE = ITEMS.register("furniture/ash_furniture/ash_wardrobe", () -> new ItemBlock(FurnitureInit.ASH_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_MODERN_WARDROBE = ITEMS.register("furniture/ash_furniture/ash_modern_wardrobe", () -> new ItemBlock(FurnitureInit.ASH_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_DOUBLE_WARDROBE = ITEMS.register("furniture/ash_furniture/ash_double_wardrobe", () -> new ItemBlock(FurnitureInit.ASH_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_BOOKSHELF = ITEMS.register("furniture/ash_furniture/ash_bookshelf", () -> new ItemBlock(FurnitureInit.ASH_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/ash_furniture/ash_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.ASH_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_DRAWER = ITEMS.register("furniture/ash_furniture/ash_drawer", () -> new ItemBlock(FurnitureInit.ASH_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_DOUBLE_DRAWER = ITEMS.register("furniture/ash_furniture/ash_double_drawer", () -> new ItemBlock(FurnitureInit.ASH_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_BOOKSHELF_DRAWER = ITEMS.register("furniture/ash_furniture/ash_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.ASH_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/ash_furniture/ash_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.ASH_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_LARGE_DRAWER = ITEMS.register("furniture/ash_furniture/ash_large_drawer", () -> new ItemBlock(FurnitureInit.ASH_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/ash_furniture/ash_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.ASH_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_TRIPLE_DRAWER = ITEMS.register("furniture/ash_furniture/ash_triple_drawer", () -> new ItemBlock(FurnitureInit.ASH_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_DESK = ITEMS.register("furniture/ash_furniture/ash_desk", () -> new ItemBlock(FurnitureInit.ASH_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_COVERED_DESK = ITEMS.register("furniture/ash_furniture/ash_covered_desk", () -> new ItemBlock(FurnitureInit.ASH_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_MODERN_DESK = ITEMS.register("furniture/ash_furniture/ash_modern_desk", () -> new ItemBlock(FurnitureInit.ASH_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_TABLE = ITEMS.register("furniture/ash_furniture/ash_table", () -> new ItemBlock(FurnitureInit.ASH_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_END_TABLE = ITEMS.register("furniture/ash_furniture/ash_end_table", () -> new ItemBlock(FurnitureInit.ASH_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_COFFEE_TABLE = ITEMS.register("furniture/ash_furniture/ash_coffee_table", () -> new ItemBlock(FurnitureInit.ASH_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_GLASS_TABLE = ITEMS.register("furniture/ash_furniture/ash_glass_table", () -> new ItemBlock(FurnitureInit.ASH_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_CHAIR = ITEMS.register("furniture/ash_furniture/ash_chair", () -> new ItemBlock(FurnitureInit.ASH_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_MODERN_CHAIR = ITEMS.register("furniture/ash_furniture/ash_modern_chair", () -> new ItemBlock(FurnitureInit.ASH_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_STRIPED_CHAIR = ITEMS.register("furniture/ash_furniture/ash_striped_chair", () -> new ItemBlock(FurnitureInit.ASH_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_STOOL_CHAIR = ITEMS.register("furniture/ash_furniture/ash_stool_chair", () -> new ItemBlock(FurnitureInit.ASH_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_COUNTER = ITEMS.register("furniture/ash_furniture/ash_counter", () -> new ItemBlock(FurnitureInit.ASH_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_DRAWER_COUNTER = ITEMS.register("furniture/ash_furniture/ash_drawer_counter", () -> new ItemBlock(FurnitureInit.ASH_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/ash_furniture/ash_double_drawer_counter", () -> new ItemBlock(FurnitureInit.ASH_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASH_CUPBOARD_COUNTER = ITEMS.register("furniture/ash_furniture/ash_cupboard_counter", () -> new ItemBlock(FurnitureInit.ASH_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_WARDROBE = ITEMS.register("furniture/ash_furniture/stripped_ash_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_MODERN_WARDROBE = ITEMS.register("furniture/ash_furniture/stripped_ash_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_DOUBLE_WARDROBE = ITEMS.register("furniture/ash_furniture/stripped_ash_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_BOOKSHELF = ITEMS.register("furniture/ash_furniture/stripped_ash_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/ash_furniture/stripped_ash_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_DRAWER = ITEMS.register("furniture/ash_furniture/stripped_ash_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_DOUBLE_DRAWER = ITEMS.register("furniture/ash_furniture/stripped_ash_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_BOOKSHELF_DRAWER = ITEMS.register("furniture/ash_furniture/stripped_ash_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/ash_furniture/stripped_ash_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_LARGE_DRAWER = ITEMS.register("furniture/ash_furniture/stripped_ash_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/ash_furniture/stripped_ash_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_TRIPLE_DRAWER = ITEMS.register("furniture/ash_furniture/stripped_ash_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_DESK = ITEMS.register("furniture/ash_furniture/stripped_ash_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_COVERED_DESK = ITEMS.register("furniture/ash_furniture/stripped_ash_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_MODERN_DESK = ITEMS.register("furniture/ash_furniture/stripped_ash_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_TABLE = ITEMS.register("furniture/ash_furniture/stripped_ash_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_END_TABLE = ITEMS.register("furniture/ash_furniture/stripped_ash_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_COFFEE_TABLE = ITEMS.register("furniture/ash_furniture/stripped_ash_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_GLASS_TABLE = ITEMS.register("furniture/ash_furniture/stripped_ash_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_CHAIR = ITEMS.register("furniture/ash_furniture/stripped_ash_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_MODERN_CHAIR = ITEMS.register("furniture/ash_furniture/stripped_ash_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_STRIPED_CHAIR = ITEMS.register("furniture/ash_furniture/stripped_ash_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_STOOL_CHAIR = ITEMS.register("furniture/ash_furniture/stripped_ash_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_COUNTER = ITEMS.register("furniture/ash_furniture/stripped_ash_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_DRAWER_COUNTER = ITEMS.register("furniture/ash_furniture/stripped_ash_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/ash_furniture/stripped_ash_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASH_CUPBOARD_COUNTER = ITEMS.register("furniture/ash_furniture/stripped_ash_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ASH_CUPBOARD_COUNTER.get(), new Item.Properties()));


    public static final RegistryObject<Item> ASPEN_WARDROBE = ITEMS.register("furniture/aspen_furniture/aspen_wardrobe", () -> new ItemBlock(FurnitureInit.ASPEN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_MODERN_WARDROBE = ITEMS.register("furniture/aspen_furniture/aspen_modern_wardrobe", () -> new ItemBlock(FurnitureInit.ASPEN_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_DOUBLE_WARDROBE = ITEMS.register("furniture/aspen_furniture/aspen_double_wardrobe", () -> new ItemBlock(FurnitureInit.ASPEN_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_BOOKSHELF = ITEMS.register("furniture/aspen_furniture/aspen_bookshelf", () -> new ItemBlock(FurnitureInit.ASPEN_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/aspen_furniture/aspen_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.ASPEN_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_DRAWER = ITEMS.register("furniture/aspen_furniture/aspen_drawer", () -> new ItemBlock(FurnitureInit.ASPEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_DOUBLE_DRAWER = ITEMS.register("furniture/aspen_furniture/aspen_double_drawer", () -> new ItemBlock(FurnitureInit.ASPEN_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_BOOKSHELF_DRAWER = ITEMS.register("furniture/aspen_furniture/aspen_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.ASPEN_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/aspen_furniture/aspen_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.ASPEN_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_LARGE_DRAWER = ITEMS.register("furniture/aspen_furniture/aspen_large_drawer", () -> new ItemBlock(FurnitureInit.ASPEN_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/aspen_furniture/aspen_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.ASPEN_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_TRIPLE_DRAWER = ITEMS.register("furniture/aspen_furniture/aspen_triple_drawer", () -> new ItemBlock(FurnitureInit.ASPEN_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_DESK = ITEMS.register("furniture/aspen_furniture/aspen_desk", () -> new ItemBlock(FurnitureInit.ASPEN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_COVERED_DESK = ITEMS.register("furniture/aspen_furniture/aspen_covered_desk", () -> new ItemBlock(FurnitureInit.ASPEN_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_MODERN_DESK = ITEMS.register("furniture/aspen_furniture/aspen_modern_desk", () -> new ItemBlock(FurnitureInit.ASPEN_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_TABLE = ITEMS.register("furniture/aspen_furniture/aspen_table", () -> new ItemBlock(FurnitureInit.ASPEN_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_END_TABLE = ITEMS.register("furniture/aspen_furniture/aspen_end_table", () -> new ItemBlock(FurnitureInit.ASPEN_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_COFFEE_TABLE = ITEMS.register("furniture/aspen_furniture/aspen_coffee_table", () -> new ItemBlock(FurnitureInit.ASPEN_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_GLASS_TABLE = ITEMS.register("furniture/aspen_furniture/aspen_glass_table", () -> new ItemBlock(FurnitureInit.ASPEN_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_CHAIR = ITEMS.register("furniture/aspen_furniture/aspen_chair", () -> new ItemBlock(FurnitureInit.ASPEN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_MODERN_CHAIR = ITEMS.register("furniture/aspen_furniture/aspen_modern_chair", () -> new ItemBlock(FurnitureInit.ASPEN_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_STRIPED_CHAIR = ITEMS.register("furniture/aspen_furniture/aspen_striped_chair", () -> new ItemBlock(FurnitureInit.ASPEN_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_STOOL_CHAIR = ITEMS.register("furniture/aspen_furniture/aspen_stool_chair", () -> new ItemBlock(FurnitureInit.ASPEN_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_COUNTER = ITEMS.register("furniture/aspen_furniture/aspen_counter", () -> new ItemBlock(FurnitureInit.ASPEN_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_DRAWER_COUNTER = ITEMS.register("furniture/aspen_furniture/aspen_drawer_counter", () -> new ItemBlock(FurnitureInit.ASPEN_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/aspen_furniture/aspen_double_drawer_counter", () -> new ItemBlock(FurnitureInit.ASPEN_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_CUPBOARD_COUNTER = ITEMS.register("furniture/aspen_furniture/aspen_cupboard_counter", () -> new ItemBlock(FurnitureInit.ASPEN_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_WARDROBE = ITEMS.register("furniture/aspen_furniture/stripped_aspen_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_MODERN_WARDROBE = ITEMS.register("furniture/aspen_furniture/stripped_aspen_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_DOUBLE_WARDROBE = ITEMS.register("furniture/aspen_furniture/stripped_aspen_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_BOOKSHELF = ITEMS.register("furniture/aspen_furniture/stripped_aspen_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/aspen_furniture/stripped_aspen_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_DRAWER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_DOUBLE_DRAWER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_BOOKSHELF_DRAWER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_LARGE_DRAWER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_TRIPLE_DRAWER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_DESK = ITEMS.register("furniture/aspen_furniture/stripped_aspen_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_COVERED_DESK = ITEMS.register("furniture/aspen_furniture/stripped_aspen_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_MODERN_DESK = ITEMS.register("furniture/aspen_furniture/stripped_aspen_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_TABLE = ITEMS.register("furniture/aspen_furniture/stripped_aspen_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_END_TABLE = ITEMS.register("furniture/aspen_furniture/stripped_aspen_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_COFFEE_TABLE = ITEMS.register("furniture/aspen_furniture/stripped_aspen_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_GLASS_TABLE = ITEMS.register("furniture/aspen_furniture/stripped_aspen_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_CHAIR = ITEMS.register("furniture/aspen_furniture/stripped_aspen_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_MODERN_CHAIR = ITEMS.register("furniture/aspen_furniture/stripped_aspen_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_STRIPED_CHAIR = ITEMS.register("furniture/aspen_furniture/stripped_aspen_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_STOOL_CHAIR = ITEMS.register("furniture/aspen_furniture/stripped_aspen_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_COUNTER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_DRAWER_COUNTER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ASPEN_CUPBOARD_COUNTER = ITEMS.register("furniture/aspen_furniture/stripped_aspen_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ASPEN_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_WARDROBE = ITEMS.register("furniture/birch_furniture/birch_wardrobe", () -> new ItemBlock(FurnitureInit.BIRCH_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MODERN_WARDROBE = ITEMS.register("furniture/birch_furniture/birch_modern_wardrobe", () -> new ItemBlock(FurnitureInit.BIRCH_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_DOUBLE_WARDROBE = ITEMS.register("furniture/birch_furniture/birch_double_wardrobe", () -> new ItemBlock(FurnitureInit.BIRCH_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BOOKSHELF = ITEMS.register("furniture/birch_furniture/birch_bookshelf", () -> new ItemBlock(FurnitureInit.BIRCH_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/birch_furniture/birch_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.BIRCH_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_DRAWER = ITEMS.register("furniture/birch_furniture/birch_drawer", () -> new ItemBlock(FurnitureInit.BIRCH_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_DOUBLE_DRAWER = ITEMS.register("furniture/birch_furniture/birch_double_drawer", () -> new ItemBlock(FurnitureInit.BIRCH_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BOOKSHELF_DRAWER = ITEMS.register("furniture/birch_furniture/birch_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.BIRCH_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/birch_furniture/birch_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.BIRCH_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_LARGE_DRAWER = ITEMS.register("furniture/birch_furniture/birch_large_drawer", () -> new ItemBlock(FurnitureInit.BIRCH_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/birch_furniture/birch_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.BIRCH_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_TRIPLE_DRAWER = ITEMS.register("furniture/birch_furniture/birch_triple_drawer", () -> new ItemBlock(FurnitureInit.BIRCH_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_DESK = ITEMS.register("furniture/birch_furniture/birch_desk", () -> new ItemBlock(FurnitureInit.BIRCH_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_COVERED_DESK = ITEMS.register("furniture/birch_furniture/birch_covered_desk", () -> new ItemBlock(FurnitureInit.BIRCH_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MODERN_DESK = ITEMS.register("furniture/birch_furniture/birch_modern_desk", () -> new ItemBlock(FurnitureInit.BIRCH_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_TABLE = ITEMS.register("furniture/birch_furniture/birch_table", () -> new ItemBlock(FurnitureInit.BIRCH_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_END_TABLE = ITEMS.register("furniture/birch_furniture/birch_end_table", () -> new ItemBlock(FurnitureInit.BIRCH_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_COFFEE_TABLE = ITEMS.register("furniture/birch_furniture/birch_coffee_table", () -> new ItemBlock(FurnitureInit.BIRCH_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_GLASS_TABLE = ITEMS.register("furniture/birch_furniture/birch_glass_table", () -> new ItemBlock(FurnitureInit.BIRCH_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_CHAIR = ITEMS.register("furniture/birch_furniture/birch_chair", () -> new ItemBlock(FurnitureInit.BIRCH_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_MODERN_CHAIR = ITEMS.register("furniture/birch_furniture/birch_modern_chair", () -> new ItemBlock(FurnitureInit.BIRCH_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_STRIPED_CHAIR = ITEMS.register("furniture/birch_furniture/birch_striped_chair", () -> new ItemBlock(FurnitureInit.BIRCH_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_STOOL_CHAIR = ITEMS.register("furniture/birch_furniture/birch_stool_chair", () -> new ItemBlock(FurnitureInit.BIRCH_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_COUNTER = ITEMS.register("furniture/birch_furniture/birch_counter", () -> new ItemBlock(FurnitureInit.BIRCH_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_DRAWER_COUNTER = ITEMS.register("furniture/birch_furniture/birch_drawer_counter", () -> new ItemBlock(FurnitureInit.BIRCH_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/birch_furniture/birch_double_drawer_counter", () -> new ItemBlock(FurnitureInit.BIRCH_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_CUPBOARD_COUNTER = ITEMS.register("furniture/birch_furniture/birch_cupboard_counter", () -> new ItemBlock(FurnitureInit.BIRCH_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_WARDROBE = ITEMS.register("furniture/birch_furniture/stripped_birch_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_MODERN_WARDROBE = ITEMS.register("furniture/birch_furniture/stripped_birch_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_DOUBLE_WARDROBE = ITEMS.register("furniture/birch_furniture/stripped_birch_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_BOOKSHELF = ITEMS.register("furniture/birch_furniture/stripped_birch_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/birch_furniture/stripped_birch_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_DRAWER = ITEMS.register("furniture/birch_furniture/stripped_birch_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_DOUBLE_DRAWER = ITEMS.register("furniture/birch_furniture/stripped_birch_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_BOOKSHELF_DRAWER = ITEMS.register("furniture/birch_furniture/stripped_birch_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/birch_furniture/stripped_birch_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LARGE_DRAWER = ITEMS.register("furniture/birch_furniture/stripped_birch_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/birch_furniture/stripped_birch_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_TRIPLE_DRAWER = ITEMS.register("furniture/birch_furniture/stripped_birch_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_DESK = ITEMS.register("furniture/birch_furniture/stripped_birch_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_COVERED_DESK = ITEMS.register("furniture/birch_furniture/stripped_birch_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_MODERN_DESK = ITEMS.register("furniture/birch_furniture/stripped_birch_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_TABLE = ITEMS.register("furniture/birch_furniture/stripped_birch_table", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_END_TABLE = ITEMS.register("furniture/birch_furniture/stripped_birch_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_COFFEE_TABLE = ITEMS.register("furniture/birch_furniture/stripped_birch_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_GLASS_TABLE = ITEMS.register("furniture/birch_furniture/stripped_birch_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_CHAIR = ITEMS.register("furniture/birch_furniture/stripped_birch_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_MODERN_CHAIR = ITEMS.register("furniture/birch_furniture/stripped_birch_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_STRIPED_CHAIR = ITEMS.register("furniture/birch_furniture/stripped_birch_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_STOOL_CHAIR = ITEMS.register("furniture/birch_furniture/stripped_birch_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_COUNTER = ITEMS.register("furniture/birch_furniture/stripped_birch_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_DRAWER_COUNTER = ITEMS.register("furniture/birch_furniture/stripped_birch_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/birch_furniture/stripped_birch_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BIRCH_CUPBOARD_COUNTER = ITEMS.register("furniture/birch_furniture/stripped_birch_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_BIRCH_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> BLACKWOOD_WARDROBE = ITEMS.register("furniture/blackwood_furniture/blackwood_wardrobe", () -> new ItemBlock(FurnitureInit.BLACKWOOD_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_MODERN_WARDROBE = ITEMS.register("furniture/blackwood_furniture/blackwood_modern_wardrobe", () -> new ItemBlock(FurnitureInit.BLACKWOOD_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_DOUBLE_WARDROBE = ITEMS.register("furniture/blackwood_furniture/blackwood_double_wardrobe", () -> new ItemBlock(FurnitureInit.BLACKWOOD_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_BOOKSHELF = ITEMS.register("furniture/blackwood_furniture/blackwood_bookshelf", () -> new ItemBlock(FurnitureInit.BLACKWOOD_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/blackwood_furniture/blackwood_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.BLACKWOOD_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_DRAWER = ITEMS.register("furniture/blackwood_furniture/blackwood_drawer", () -> new ItemBlock(FurnitureInit.BLACKWOOD_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_DOUBLE_DRAWER = ITEMS.register("furniture/blackwood_furniture/blackwood_double_drawer", () -> new ItemBlock(FurnitureInit.BLACKWOOD_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_BOOKSHELF_DRAWER = ITEMS.register("furniture/blackwood_furniture/blackwood_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.BLACKWOOD_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/blackwood_furniture/blackwood_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.BLACKWOOD_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_LARGE_DRAWER = ITEMS.register("furniture/blackwood_furniture/blackwood_large_drawer", () -> new ItemBlock(FurnitureInit.BLACKWOOD_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/blackwood_furniture/blackwood_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.BLACKWOOD_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_TRIPLE_DRAWER = ITEMS.register("furniture/blackwood_furniture/blackwood_triple_drawer", () -> new ItemBlock(FurnitureInit.BLACKWOOD_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_DESK = ITEMS.register("furniture/blackwood_furniture/blackwood_desk", () -> new ItemBlock(FurnitureInit.BLACKWOOD_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_COVERED_DESK = ITEMS.register("furniture/blackwood_furniture/blackwood_covered_desk", () -> new ItemBlock(FurnitureInit.BLACKWOOD_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_MODERN_DESK = ITEMS.register("furniture/blackwood_furniture/blackwood_modern_desk", () -> new ItemBlock(FurnitureInit.BLACKWOOD_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_TABLE = ITEMS.register("furniture/blackwood_furniture/blackwood_table", () -> new ItemBlock(FurnitureInit.BLACKWOOD_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_END_TABLE = ITEMS.register("furniture/blackwood_furniture/blackwood_end_table", () -> new ItemBlock(FurnitureInit.BLACKWOOD_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_COFFEE_TABLE = ITEMS.register("furniture/blackwood_furniture/blackwood_coffee_table", () -> new ItemBlock(FurnitureInit.BLACKWOOD_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_GLASS_TABLE = ITEMS.register("furniture/blackwood_furniture/blackwood_glass_table", () -> new ItemBlock(FurnitureInit.BLACKWOOD_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_CHAIR = ITEMS.register("furniture/blackwood_furniture/blackwood_chair", () -> new ItemBlock(FurnitureInit.BLACKWOOD_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_MODERN_CHAIR = ITEMS.register("furniture/blackwood_furniture/blackwood_modern_chair", () -> new ItemBlock(FurnitureInit.BLACKWOOD_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_STRIPED_CHAIR = ITEMS.register("furniture/blackwood_furniture/blackwood_striped_chair", () -> new ItemBlock(FurnitureInit.BLACKWOOD_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_STOOL_CHAIR = ITEMS.register("furniture/blackwood_furniture/blackwood_stool_chair", () -> new ItemBlock(FurnitureInit.BLACKWOOD_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_COUNTER = ITEMS.register("furniture/blackwood_furniture/blackwood_counter", () -> new ItemBlock(FurnitureInit.BLACKWOOD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_DRAWER_COUNTER = ITEMS.register("furniture/blackwood_furniture/blackwood_drawer_counter", () -> new ItemBlock(FurnitureInit.BLACKWOOD_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/blackwood_furniture/blackwood_double_drawer_counter", () -> new ItemBlock(FurnitureInit.BLACKWOOD_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACKWOOD_CUPBOARD_COUNTER = ITEMS.register("furniture/blackwood_furniture/blackwood_cupboard_counter", () -> new ItemBlock(FurnitureInit.BLACKWOOD_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_WARDROBE = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_MODERN_WARDROBE = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_DOUBLE_WARDROBE = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_BOOKSHELF = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_DRAWER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_DOUBLE_DRAWER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_BOOKSHELF_DRAWER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_LARGE_DRAWER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_TRIPLE_DRAWER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_DESK = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_COVERED_DESK = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_MODERN_DESK = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_TABLE = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_table", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_END_TABLE = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_COFFEE_TABLE = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_GLASS_TABLE = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_CHAIR = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_MODERN_CHAIR = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_STRIPED_CHAIR = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_STOOL_CHAIR = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_COUNTER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_DRAWER_COUNTER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACKWOOD_CUPBOARD_COUNTER = ITEMS.register("furniture/blackwood_furniture/stripped_blackwood_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_BLACKWOOD_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> CHESTNUT_WARDROBE = ITEMS.register("furniture/chestnut_furniture/chestnut_wardrobe", () -> new ItemBlock(FurnitureInit.CHESTNUT_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_MODERN_WARDROBE = ITEMS.register("furniture/chestnut_furniture/chestnut_modern_wardrobe", () -> new ItemBlock(FurnitureInit.CHESTNUT_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_DOUBLE_WARDROBE = ITEMS.register("furniture/chestnut_furniture/chestnut_double_wardrobe", () -> new ItemBlock(FurnitureInit.CHESTNUT_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_BOOKSHELF = ITEMS.register("furniture/chestnut_furniture/chestnut_bookshelf", () -> new ItemBlock(FurnitureInit.CHESTNUT_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/chestnut_furniture/chestnut_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.CHESTNUT_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_DRAWER = ITEMS.register("furniture/chestnut_furniture/chestnut_drawer", () -> new ItemBlock(FurnitureInit.CHESTNUT_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_DOUBLE_DRAWER = ITEMS.register("furniture/chestnut_furniture/chestnut_double_drawer", () -> new ItemBlock(FurnitureInit.CHESTNUT_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_BOOKSHELF_DRAWER = ITEMS.register("furniture/chestnut_furniture/chestnut_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.CHESTNUT_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/chestnut_furniture/chestnut_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.CHESTNUT_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_LARGE_DRAWER = ITEMS.register("furniture/chestnut_furniture/chestnut_large_drawer", () -> new ItemBlock(FurnitureInit.CHESTNUT_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/chestnut_furniture/chestnut_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.CHESTNUT_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_TRIPLE_DRAWER = ITEMS.register("furniture/chestnut_furniture/chestnut_triple_drawer", () -> new ItemBlock(FurnitureInit.CHESTNUT_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_DESK = ITEMS.register("furniture/chestnut_furniture/chestnut_desk", () -> new ItemBlock(FurnitureInit.CHESTNUT_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_COVERED_DESK = ITEMS.register("furniture/chestnut_furniture/chestnut_covered_desk", () -> new ItemBlock(FurnitureInit.CHESTNUT_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_MODERN_DESK = ITEMS.register("furniture/chestnut_furniture/chestnut_modern_desk", () -> new ItemBlock(FurnitureInit.CHESTNUT_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_TABLE = ITEMS.register("furniture/chestnut_furniture/chestnut_table", () -> new ItemBlock(FurnitureInit.CHESTNUT_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_END_TABLE = ITEMS.register("furniture/chestnut_furniture/chestnut_end_table", () -> new ItemBlock(FurnitureInit.CHESTNUT_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_COFFEE_TABLE = ITEMS.register("furniture/chestnut_furniture/chestnut_coffee_table", () -> new ItemBlock(FurnitureInit.CHESTNUT_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_GLASS_TABLE = ITEMS.register("furniture/chestnut_furniture/chestnut_glass_table", () -> new ItemBlock(FurnitureInit.CHESTNUT_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_CHAIR = ITEMS.register("furniture/chestnut_furniture/chestnut_chair", () -> new ItemBlock(FurnitureInit.CHESTNUT_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_MODERN_CHAIR = ITEMS.register("furniture/chestnut_furniture/chestnut_modern_chair", () -> new ItemBlock(FurnitureInit.CHESTNUT_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_STRIPED_CHAIR = ITEMS.register("furniture/chestnut_furniture/chestnut_striped_chair", () -> new ItemBlock(FurnitureInit.CHESTNUT_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_STOOL_CHAIR = ITEMS.register("furniture/chestnut_furniture/chestnut_stool_chair", () -> new ItemBlock(FurnitureInit.CHESTNUT_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_COUNTER = ITEMS.register("furniture/chestnut_furniture/chestnut_counter", () -> new ItemBlock(FurnitureInit.CHESTNUT_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_DRAWER_COUNTER = ITEMS.register("furniture/chestnut_furniture/chestnut_drawer_counter", () -> new ItemBlock(FurnitureInit.CHESTNUT_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/chestnut_furniture/chestnut_double_drawer_counter", () -> new ItemBlock(FurnitureInit.CHESTNUT_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHESTNUT_CUPBOARD_COUNTER = ITEMS.register("furniture/chestnut_furniture/chestnut_cupboard_counter", () -> new ItemBlock(FurnitureInit.CHESTNUT_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_WARDROBE = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_MODERN_WARDROBE = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_DOUBLE_WARDROBE = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_BOOKSHELF = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_DRAWER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_DOUBLE_DRAWER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_BOOKSHELF_DRAWER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_LARGE_DRAWER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_TRIPLE_DRAWER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_DESK = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_COVERED_DESK = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_MODERN_DESK = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_TABLE = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_table", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_END_TABLE = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_COFFEE_TABLE = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_GLASS_TABLE = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_CHAIR = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_MODERN_CHAIR = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_STRIPED_CHAIR = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_STOOL_CHAIR = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_COUNTER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_DRAWER_COUNTER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CHESTNUT_CUPBOARD_COUNTER = ITEMS.register("furniture/chestnut_furniture/stripped_chestnut_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_CHESTNUT_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> DOUGLAS_FIR_WARDROBE = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_wardrobe", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_MODERN_WARDROBE = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_modern_wardrobe", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_DOUBLE_WARDROBE = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_double_wardrobe", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_BOOKSHELF = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_bookshelf", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_drawer", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_DOUBLE_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_double_drawer", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_BOOKSHELF_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_LARGE_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_large_drawer", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_TRIPLE_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_triple_drawer", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_DESK = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_desk", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_COVERED_DESK = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_covered_desk", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_MODERN_DESK = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_modern_desk", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_TABLE = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_table", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_END_TABLE = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_end_table", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_COFFEE_TABLE = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_coffee_table", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_GLASS_TABLE = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_glass_table", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_CHAIR = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_chair", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_MODERN_CHAIR = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_modern_chair", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_STRIPED_CHAIR = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_striped_chair", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_STOOL_CHAIR = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_stool_chair", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_COUNTER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_counter", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_DRAWER_COUNTER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_drawer_counter", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_double_drawer_counter", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DOUGLAS_FIR_CUPBOARD_COUNTER = ITEMS.register("furniture/douglas_fir_furniture/douglas_fir_cupboard_counter", () -> new ItemBlock(FurnitureInit.DOUGLAS_FIR_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_WARDROBE = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_MODERN_WARDROBE = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_DOUBLE_WARDROBE = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_BOOKSHELF = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_DOUBLE_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_BOOKSHELF_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_LARGE_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_TRIPLE_DRAWER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_DESK = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_COVERED_DESK = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_MODERN_DESK = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_TABLE = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_table", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_END_TABLE = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_COFFEE_TABLE = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_GLASS_TABLE = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_CHAIR = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_MODERN_CHAIR = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_STRIPED_CHAIR = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_STOOL_CHAIR = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_COUNTER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_DRAWER_COUNTER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DOUGLAS_FIR_CUPBOARD_COUNTER = ITEMS.register("furniture/douglas_fir_furniture/stripped_douglas_fir_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_DOUGLAS_FIR_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> HICKORY_WARDROBE = ITEMS.register("furniture/hickory_furniture/hickory_wardrobe", () -> new ItemBlock(FurnitureInit.HICKORY_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_MODERN_WARDROBE = ITEMS.register("furniture/hickory_furniture/hickory_modern_wardrobe", () -> new ItemBlock(FurnitureInit.HICKORY_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_DOUBLE_WARDROBE = ITEMS.register("furniture/hickory_furniture/hickory_double_wardrobe", () -> new ItemBlock(FurnitureInit.HICKORY_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_BOOKSHELF = ITEMS.register("furniture/hickory_furniture/hickory_bookshelf", () -> new ItemBlock(FurnitureInit.HICKORY_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/hickory_furniture/hickory_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.HICKORY_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_DRAWER = ITEMS.register("furniture/hickory_furniture/hickory_drawer", () -> new ItemBlock(FurnitureInit.HICKORY_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_DOUBLE_DRAWER = ITEMS.register("furniture/hickory_furniture/hickory_double_drawer", () -> new ItemBlock(FurnitureInit.HICKORY_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_BOOKSHELF_DRAWER = ITEMS.register("furniture/hickory_furniture/hickory_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.HICKORY_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/hickory_furniture/hickory_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.HICKORY_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_LARGE_DRAWER = ITEMS.register("furniture/hickory_furniture/hickory_large_drawer", () -> new ItemBlock(FurnitureInit.HICKORY_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/hickory_furniture/hickory_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.HICKORY_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_TRIPLE_DRAWER = ITEMS.register("furniture/hickory_furniture/hickory_triple_drawer", () -> new ItemBlock(FurnitureInit.HICKORY_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_DESK = ITEMS.register("furniture/hickory_furniture/hickory_desk", () -> new ItemBlock(FurnitureInit.HICKORY_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_COVERED_DESK = ITEMS.register("furniture/hickory_furniture/hickory_covered_desk", () -> new ItemBlock(FurnitureInit.HICKORY_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_MODERN_DESK = ITEMS.register("furniture/hickory_furniture/hickory_modern_desk", () -> new ItemBlock(FurnitureInit.HICKORY_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_TABLE = ITEMS.register("furniture/hickory_furniture/hickory_table", () -> new ItemBlock(FurnitureInit.HICKORY_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_END_TABLE = ITEMS.register("furniture/hickory_furniture/hickory_end_table", () -> new ItemBlock(FurnitureInit.HICKORY_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_COFFEE_TABLE = ITEMS.register("furniture/hickory_furniture/hickory_coffee_table", () -> new ItemBlock(FurnitureInit.HICKORY_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_GLASS_TABLE = ITEMS.register("furniture/hickory_furniture/hickory_glass_table", () -> new ItemBlock(FurnitureInit.HICKORY_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_CHAIR = ITEMS.register("furniture/hickory_furniture/hickory_chair", () -> new ItemBlock(FurnitureInit.HICKORY_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_MODERN_CHAIR = ITEMS.register("furniture/hickory_furniture/hickory_modern_chair", () -> new ItemBlock(FurnitureInit.HICKORY_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_STRIPED_CHAIR = ITEMS.register("furniture/hickory_furniture/hickory_striped_chair", () -> new ItemBlock(FurnitureInit.HICKORY_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_STOOL_CHAIR = ITEMS.register("furniture/hickory_furniture/hickory_stool_chair", () -> new ItemBlock(FurnitureInit.HICKORY_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_COUNTER = ITEMS.register("furniture/hickory_furniture/hickory_counter", () -> new ItemBlock(FurnitureInit.HICKORY_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_DRAWER_COUNTER = ITEMS.register("furniture/hickory_furniture/hickory_drawer_counter", () -> new ItemBlock(FurnitureInit.HICKORY_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/hickory_furniture/hickory_double_drawer_counter", () -> new ItemBlock(FurnitureInit.HICKORY_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_CUPBOARD_COUNTER = ITEMS.register("furniture/hickory_furniture/hickory_cupboard_counter", () -> new ItemBlock(FurnitureInit.HICKORY_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_WARDROBE = ITEMS.register("furniture/hickory_furniture/stripped_hickory_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_MODERN_WARDROBE = ITEMS.register("furniture/hickory_furniture/stripped_hickory_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_DOUBLE_WARDROBE = ITEMS.register("furniture/hickory_furniture/stripped_hickory_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_BOOKSHELF = ITEMS.register("furniture/hickory_furniture/stripped_hickory_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/hickory_furniture/stripped_hickory_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_DRAWER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_DOUBLE_DRAWER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_BOOKSHELF_DRAWER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_LARGE_DRAWER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_TRIPLE_DRAWER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_DESK = ITEMS.register("furniture/hickory_furniture/stripped_hickory_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_COVERED_DESK = ITEMS.register("furniture/hickory_furniture/stripped_hickory_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_MODERN_DESK = ITEMS.register("furniture/hickory_furniture/stripped_hickory_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_TABLE = ITEMS.register("furniture/hickory_furniture/stripped_hickory_table", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_END_TABLE = ITEMS.register("furniture/hickory_furniture/stripped_hickory_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_COFFEE_TABLE = ITEMS.register("furniture/hickory_furniture/stripped_hickory_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_GLASS_TABLE = ITEMS.register("furniture/hickory_furniture/stripped_hickory_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_CHAIR = ITEMS.register("furniture/hickory_furniture/stripped_hickory_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_MODERN_CHAIR = ITEMS.register("furniture/hickory_furniture/stripped_hickory_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_STRIPED_CHAIR = ITEMS.register("furniture/hickory_furniture/stripped_hickory_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_STOOL_CHAIR = ITEMS.register("furniture/hickory_furniture/stripped_hickory_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_COUNTER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_DRAWER_COUNTER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_HICKORY_CUPBOARD_COUNTER = ITEMS.register("furniture/hickory_furniture/stripped_hickory_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_HICKORY_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> KAPOK_WARDROBE = ITEMS.register("furniture/kapok_furniture/kapok_wardrobe", () -> new ItemBlock(FurnitureInit.KAPOK_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_MODERN_WARDROBE = ITEMS.register("furniture/kapok_furniture/kapok_modern_wardrobe", () -> new ItemBlock(FurnitureInit.KAPOK_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_DOUBLE_WARDROBE = ITEMS.register("furniture/kapok_furniture/kapok_double_wardrobe", () -> new ItemBlock(FurnitureInit.KAPOK_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_BOOKSHELF = ITEMS.register("furniture/kapok_furniture/kapok_bookshelf", () -> new ItemBlock(FurnitureInit.KAPOK_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/kapok_furniture/kapok_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.KAPOK_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_DRAWER = ITEMS.register("furniture/kapok_furniture/kapok_drawer", () -> new ItemBlock(FurnitureInit.KAPOK_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_DOUBLE_DRAWER = ITEMS.register("furniture/kapok_furniture/kapok_double_drawer", () -> new ItemBlock(FurnitureInit.KAPOK_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_BOOKSHELF_DRAWER = ITEMS.register("furniture/kapok_furniture/kapok_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.KAPOK_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/kapok_furniture/kapok_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.KAPOK_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_LARGE_DRAWER = ITEMS.register("furniture/kapok_furniture/kapok_large_drawer", () -> new ItemBlock(FurnitureInit.KAPOK_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/kapok_furniture/kapok_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.KAPOK_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_TRIPLE_DRAWER = ITEMS.register("furniture/kapok_furniture/kapok_triple_drawer", () -> new ItemBlock(FurnitureInit.KAPOK_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_DESK = ITEMS.register("furniture/kapok_furniture/kapok_desk", () -> new ItemBlock(FurnitureInit.KAPOK_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_COVERED_DESK = ITEMS.register("furniture/kapok_furniture/kapok_covered_desk", () -> new ItemBlock(FurnitureInit.KAPOK_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_MODERN_DESK = ITEMS.register("furniture/kapok_furniture/kapok_modern_desk", () -> new ItemBlock(FurnitureInit.KAPOK_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_TABLE = ITEMS.register("furniture/kapok_furniture/kapok_table", () -> new ItemBlock(FurnitureInit.KAPOK_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_END_TABLE = ITEMS.register("furniture/kapok_furniture/kapok_end_table", () -> new ItemBlock(FurnitureInit.KAPOK_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_COFFEE_TABLE = ITEMS.register("furniture/kapok_furniture/kapok_coffee_table", () -> new ItemBlock(FurnitureInit.KAPOK_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_GLASS_TABLE = ITEMS.register("furniture/kapok_furniture/kapok_glass_table", () -> new ItemBlock(FurnitureInit.KAPOK_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_CHAIR = ITEMS.register("furniture/kapok_furniture/kapok_chair", () -> new ItemBlock(FurnitureInit.KAPOK_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_MODERN_CHAIR = ITEMS.register("furniture/kapok_furniture/kapok_modern_chair", () -> new ItemBlock(FurnitureInit.KAPOK_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_STRIPED_CHAIR = ITEMS.register("furniture/kapok_furniture/kapok_striped_chair", () -> new ItemBlock(FurnitureInit.KAPOK_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_STOOL_CHAIR = ITEMS.register("furniture/kapok_furniture/kapok_stool_chair", () -> new ItemBlock(FurnitureInit.KAPOK_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_COUNTER = ITEMS.register("furniture/kapok_furniture/kapok_counter", () -> new ItemBlock(FurnitureInit.KAPOK_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_DRAWER_COUNTER = ITEMS.register("furniture/kapok_furniture/kapok_drawer_counter", () -> new ItemBlock(FurnitureInit.KAPOK_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/kapok_furniture/kapok_double_drawer_counter", () -> new ItemBlock(FurnitureInit.KAPOK_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_CUPBOARD_COUNTER = ITEMS.register("furniture/kapok_furniture/kapok_cupboard_counter", () -> new ItemBlock(FurnitureInit.KAPOK_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_WARDROBE = ITEMS.register("furniture/kapok_furniture/stripped_kapok_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_MODERN_WARDROBE = ITEMS.register("furniture/kapok_furniture/stripped_kapok_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_DOUBLE_WARDROBE = ITEMS.register("furniture/kapok_furniture/stripped_kapok_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_BOOKSHELF = ITEMS.register("furniture/kapok_furniture/stripped_kapok_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/kapok_furniture/stripped_kapok_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_DRAWER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_DOUBLE_DRAWER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_BOOKSHELF_DRAWER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_LARGE_DRAWER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_TRIPLE_DRAWER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_DESK = ITEMS.register("furniture/kapok_furniture/stripped_kapok_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_COVERED_DESK = ITEMS.register("furniture/kapok_furniture/stripped_kapok_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_MODERN_DESK = ITEMS.register("furniture/kapok_furniture/stripped_kapok_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_TABLE = ITEMS.register("furniture/kapok_furniture/stripped_kapok_table", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_END_TABLE = ITEMS.register("furniture/kapok_furniture/stripped_kapok_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_COFFEE_TABLE = ITEMS.register("furniture/kapok_furniture/stripped_kapok_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_GLASS_TABLE = ITEMS.register("furniture/kapok_furniture/stripped_kapok_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_CHAIR = ITEMS.register("furniture/kapok_furniture/stripped_kapok_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_MODERN_CHAIR = ITEMS.register("furniture/kapok_furniture/stripped_kapok_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_STRIPED_CHAIR = ITEMS.register("furniture/kapok_furniture/stripped_kapok_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_STOOL_CHAIR = ITEMS.register("furniture/kapok_furniture/stripped_kapok_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_COUNTER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_DRAWER_COUNTER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_CUPBOARD_COUNTER = ITEMS.register("furniture/kapok_furniture/stripped_kapok_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_KAPOK_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> MANGROVE_WARDROBE = ITEMS.register("furniture/mangrove_furniture/mangrove_wardrobe", () -> new ItemBlock(FurnitureInit.MANGROVE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_MODERN_WARDROBE = ITEMS.register("furniture/mangrove_furniture/mangrove_modern_wardrobe", () -> new ItemBlock(FurnitureInit.MANGROVE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DOUBLE_WARDROBE = ITEMS.register("furniture/mangrove_furniture/mangrove_double_wardrobe", () -> new ItemBlock(FurnitureInit.MANGROVE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BOOKSHELF = ITEMS.register("furniture/mangrove_furniture/mangrove_bookshelf", () -> new ItemBlock(FurnitureInit.MANGROVE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/mangrove_furniture/mangrove_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.MANGROVE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DRAWER = ITEMS.register("furniture/mangrove_furniture/mangrove_drawer", () -> new ItemBlock(FurnitureInit.MANGROVE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DOUBLE_DRAWER = ITEMS.register("furniture/mangrove_furniture/mangrove_double_drawer", () -> new ItemBlock(FurnitureInit.MANGROVE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BOOKSHELF_DRAWER = ITEMS.register("furniture/mangrove_furniture/mangrove_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.MANGROVE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/mangrove_furniture/mangrove_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.MANGROVE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_LARGE_DRAWER = ITEMS.register("furniture/mangrove_furniture/mangrove_large_drawer", () -> new ItemBlock(FurnitureInit.MANGROVE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/mangrove_furniture/mangrove_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.MANGROVE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_TRIPLE_DRAWER = ITEMS.register("furniture/mangrove_furniture/mangrove_triple_drawer", () -> new ItemBlock(FurnitureInit.MANGROVE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DESK = ITEMS.register("furniture/mangrove_furniture/mangrove_desk", () -> new ItemBlock(FurnitureInit.MANGROVE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_COVERED_DESK = ITEMS.register("furniture/mangrove_furniture/mangrove_covered_desk", () -> new ItemBlock(FurnitureInit.MANGROVE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_MODERN_DESK = ITEMS.register("furniture/mangrove_furniture/mangrove_modern_desk", () -> new ItemBlock(FurnitureInit.MANGROVE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_TABLE = ITEMS.register("furniture/mangrove_furniture/mangrove_table", () -> new ItemBlock(FurnitureInit.MANGROVE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_END_TABLE = ITEMS.register("furniture/mangrove_furniture/mangrove_end_table", () -> new ItemBlock(FurnitureInit.MANGROVE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_COFFEE_TABLE = ITEMS.register("furniture/mangrove_furniture/mangrove_coffee_table", () -> new ItemBlock(FurnitureInit.MANGROVE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_GLASS_TABLE = ITEMS.register("furniture/mangrove_furniture/mangrove_glass_table", () -> new ItemBlock(FurnitureInit.MANGROVE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CHAIR = ITEMS.register("furniture/mangrove_furniture/mangrove_chair", () -> new ItemBlock(FurnitureInit.MANGROVE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_MODERN_CHAIR = ITEMS.register("furniture/mangrove_furniture/mangrove_modern_chair", () -> new ItemBlock(FurnitureInit.MANGROVE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_STRIPED_CHAIR = ITEMS.register("furniture/mangrove_furniture/mangrove_striped_chair", () -> new ItemBlock(FurnitureInit.MANGROVE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_STOOL_CHAIR = ITEMS.register("furniture/mangrove_furniture/mangrove_stool_chair", () -> new ItemBlock(FurnitureInit.MANGROVE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_COUNTER = ITEMS.register("furniture/mangrove_furniture/mangrove_counter", () -> new ItemBlock(FurnitureInit.MANGROVE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DRAWER_COUNTER = ITEMS.register("furniture/mangrove_furniture/mangrove_drawer_counter", () -> new ItemBlock(FurnitureInit.MANGROVE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/mangrove_furniture/mangrove_double_drawer_counter", () -> new ItemBlock(FurnitureInit.MANGROVE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_CUPBOARD_COUNTER = ITEMS.register("furniture/mangrove_furniture/mangrove_cupboard_counter", () -> new ItemBlock(FurnitureInit.MANGROVE_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_WARDROBE = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_MODERN_WARDROBE = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_DOUBLE_WARDROBE = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_BOOKSHELF = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_DRAWER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_DOUBLE_DRAWER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_BOOKSHELF_DRAWER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LARGE_DRAWER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_TRIPLE_DRAWER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_DESK = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_COVERED_DESK = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_MODERN_DESK = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_TABLE = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_table", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_END_TABLE = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_COFFEE_TABLE = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_GLASS_TABLE = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_CHAIR = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_MODERN_CHAIR = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_STRIPED_CHAIR = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_STOOL_CHAIR = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_COUNTER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_DRAWER_COUNTER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_CUPBOARD_COUNTER = ITEMS.register("furniture/mangrove_furniture/stripped_mangrove_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_MANGROVE_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> MAPLE_WARDROBE = ITEMS.register("furniture/maple_furniture/maple_wardrobe", () -> new ItemBlock(FurnitureInit.MAPLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_MODERN_WARDROBE = ITEMS.register("furniture/maple_furniture/maple_modern_wardrobe", () -> new ItemBlock(FurnitureInit.MAPLE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_DOUBLE_WARDROBE = ITEMS.register("furniture/maple_furniture/maple_double_wardrobe", () -> new ItemBlock(FurnitureInit.MAPLE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_BOOKSHELF = ITEMS.register("furniture/maple_furniture/maple_bookshelf", () -> new ItemBlock(FurnitureInit.MAPLE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/maple_furniture/maple_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.MAPLE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_DRAWER = ITEMS.register("furniture/maple_furniture/maple_drawer", () -> new ItemBlock(FurnitureInit.MAPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_DOUBLE_DRAWER = ITEMS.register("furniture/maple_furniture/maple_double_drawer", () -> new ItemBlock(FurnitureInit.MAPLE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_BOOKSHELF_DRAWER = ITEMS.register("furniture/maple_furniture/maple_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.MAPLE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/maple_furniture/maple_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.MAPLE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_LARGE_DRAWER = ITEMS.register("furniture/maple_furniture/maple_large_drawer", () -> new ItemBlock(FurnitureInit.MAPLE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/maple_furniture/maple_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.MAPLE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_TRIPLE_DRAWER = ITEMS.register("furniture/maple_furniture/maple_triple_drawer", () -> new ItemBlock(FurnitureInit.MAPLE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_DESK = ITEMS.register("furniture/maple_furniture/maple_desk", () -> new ItemBlock(FurnitureInit.MAPLE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_COVERED_DESK = ITEMS.register("furniture/maple_furniture/maple_covered_desk", () -> new ItemBlock(FurnitureInit.MAPLE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_MODERN_DESK = ITEMS.register("furniture/maple_furniture/maple_modern_desk", () -> new ItemBlock(FurnitureInit.MAPLE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_TABLE = ITEMS.register("furniture/maple_furniture/maple_table", () -> new ItemBlock(FurnitureInit.MAPLE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_END_TABLE = ITEMS.register("furniture/maple_furniture/maple_end_table", () -> new ItemBlock(FurnitureInit.MAPLE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_COFFEE_TABLE = ITEMS.register("furniture/maple_furniture/maple_coffee_table", () -> new ItemBlock(FurnitureInit.MAPLE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_GLASS_TABLE = ITEMS.register("furniture/maple_furniture/maple_glass_table", () -> new ItemBlock(FurnitureInit.MAPLE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_CHAIR = ITEMS.register("furniture/maple_furniture/maple_chair", () -> new ItemBlock(FurnitureInit.MAPLE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_MODERN_CHAIR = ITEMS.register("furniture/maple_furniture/maple_modern_chair", () -> new ItemBlock(FurnitureInit.MAPLE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_STRIPED_CHAIR = ITEMS.register("furniture/maple_furniture/maple_striped_chair", () -> new ItemBlock(FurnitureInit.MAPLE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_STOOL_CHAIR = ITEMS.register("furniture/maple_furniture/maple_stool_chair", () -> new ItemBlock(FurnitureInit.MAPLE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_COUNTER = ITEMS.register("furniture/maple_furniture/maple_counter", () -> new ItemBlock(FurnitureInit.MAPLE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_DRAWER_COUNTER = ITEMS.register("furniture/maple_furniture/maple_drawer_counter", () -> new ItemBlock(FurnitureInit.MAPLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/maple_furniture/maple_double_drawer_counter", () -> new ItemBlock(FurnitureInit.MAPLE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_CUPBOARD_COUNTER = ITEMS.register("furniture/maple_furniture/maple_cupboard_counter", () -> new ItemBlock(FurnitureInit.MAPLE_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_WARDROBE = ITEMS.register("furniture/maple_furniture/stripped_maple_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_MODERN_WARDROBE = ITEMS.register("furniture/maple_furniture/stripped_maple_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_DOUBLE_WARDROBE = ITEMS.register("furniture/maple_furniture/stripped_maple_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_BOOKSHELF = ITEMS.register("furniture/maple_furniture/stripped_maple_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/maple_furniture/stripped_maple_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_DRAWER = ITEMS.register("furniture/maple_furniture/stripped_maple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_DOUBLE_DRAWER = ITEMS.register("furniture/maple_furniture/stripped_maple_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_BOOKSHELF_DRAWER = ITEMS.register("furniture/maple_furniture/stripped_maple_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/maple_furniture/stripped_maple_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_LARGE_DRAWER = ITEMS.register("furniture/maple_furniture/stripped_maple_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/maple_furniture/stripped_maple_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_TRIPLE_DRAWER = ITEMS.register("furniture/maple_furniture/stripped_maple_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_DESK = ITEMS.register("furniture/maple_furniture/stripped_maple_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_COVERED_DESK = ITEMS.register("furniture/maple_furniture/stripped_maple_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_MODERN_DESK = ITEMS.register("furniture/maple_furniture/stripped_maple_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_TABLE = ITEMS.register("furniture/maple_furniture/stripped_maple_table", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_END_TABLE = ITEMS.register("furniture/maple_furniture/stripped_maple_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_COFFEE_TABLE = ITEMS.register("furniture/maple_furniture/stripped_maple_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_GLASS_TABLE = ITEMS.register("furniture/maple_furniture/stripped_maple_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_CHAIR = ITEMS.register("furniture/maple_furniture/stripped_maple_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_MODERN_CHAIR = ITEMS.register("furniture/maple_furniture/stripped_maple_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_STRIPED_CHAIR = ITEMS.register("furniture/maple_furniture/stripped_maple_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_STOOL_CHAIR = ITEMS.register("furniture/maple_furniture/stripped_maple_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_COUNTER = ITEMS.register("furniture/maple_furniture/stripped_maple_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_DRAWER_COUNTER = ITEMS.register("furniture/maple_furniture/stripped_maple_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/maple_furniture/stripped_maple_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_MAPLE_CUPBOARD_COUNTER = ITEMS.register("furniture/maple_furniture/stripped_maple_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_MAPLE_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> PALM_WARDROBE = ITEMS.register("furniture/palm_furniture/palm_wardrobe", () -> new ItemBlock(FurnitureInit.PALM_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_MODERN_WARDROBE = ITEMS.register("furniture/palm_furniture/palm_modern_wardrobe", () -> new ItemBlock(FurnitureInit.PALM_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_DOUBLE_WARDROBE = ITEMS.register("furniture/palm_furniture/palm_double_wardrobe", () -> new ItemBlock(FurnitureInit.PALM_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_BOOKSHELF = ITEMS.register("furniture/palm_furniture/palm_bookshelf", () -> new ItemBlock(FurnitureInit.PALM_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/palm_furniture/palm_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.PALM_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_DRAWER = ITEMS.register("furniture/palm_furniture/palm_drawer", () -> new ItemBlock(FurnitureInit.PALM_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_DOUBLE_DRAWER = ITEMS.register("furniture/palm_furniture/palm_double_drawer", () -> new ItemBlock(FurnitureInit.PALM_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_BOOKSHELF_DRAWER = ITEMS.register("furniture/palm_furniture/palm_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.PALM_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/palm_furniture/palm_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.PALM_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_LARGE_DRAWER = ITEMS.register("furniture/palm_furniture/palm_large_drawer", () -> new ItemBlock(FurnitureInit.PALM_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/palm_furniture/palm_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.PALM_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_TRIPLE_DRAWER = ITEMS.register("furniture/palm_furniture/palm_triple_drawer", () -> new ItemBlock(FurnitureInit.PALM_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_DESK = ITEMS.register("furniture/palm_furniture/palm_desk", () -> new ItemBlock(FurnitureInit.PALM_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_COVERED_DESK = ITEMS.register("furniture/palm_furniture/palm_covered_desk", () -> new ItemBlock(FurnitureInit.PALM_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_MODERN_DESK = ITEMS.register("furniture/palm_furniture/palm_modern_desk", () -> new ItemBlock(FurnitureInit.PALM_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_TABLE = ITEMS.register("furniture/palm_furniture/palm_table", () -> new ItemBlock(FurnitureInit.PALM_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_END_TABLE = ITEMS.register("furniture/palm_furniture/palm_end_table", () -> new ItemBlock(FurnitureInit.PALM_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_COFFEE_TABLE = ITEMS.register("furniture/palm_furniture/palm_coffee_table", () -> new ItemBlock(FurnitureInit.PALM_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_GLASS_TABLE = ITEMS.register("furniture/palm_furniture/palm_glass_table", () -> new ItemBlock(FurnitureInit.PALM_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_CHAIR = ITEMS.register("furniture/palm_furniture/palm_chair", () -> new ItemBlock(FurnitureInit.PALM_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_MODERN_CHAIR = ITEMS.register("furniture/palm_furniture/palm_modern_chair", () -> new ItemBlock(FurnitureInit.PALM_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_STRIPED_CHAIR = ITEMS.register("furniture/palm_furniture/palm_striped_chair", () -> new ItemBlock(FurnitureInit.PALM_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_STOOL_CHAIR = ITEMS.register("furniture/palm_furniture/palm_stool_chair", () -> new ItemBlock(FurnitureInit.PALM_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_COUNTER = ITEMS.register("furniture/palm_furniture/palm_counter", () -> new ItemBlock(FurnitureInit.PALM_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_DRAWER_COUNTER = ITEMS.register("furniture/palm_furniture/palm_drawer_counter", () -> new ItemBlock(FurnitureInit.PALM_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/palm_furniture/palm_double_drawer_counter", () -> new ItemBlock(FurnitureInit.PALM_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_CUPBOARD_COUNTER = ITEMS.register("furniture/palm_furniture/palm_cupboard_counter", () -> new ItemBlock(FurnitureInit.PALM_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_WARDROBE = ITEMS.register("furniture/palm_furniture/stripped_palm_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_MODERN_WARDROBE = ITEMS.register("furniture/palm_furniture/stripped_palm_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_DOUBLE_WARDROBE = ITEMS.register("furniture/palm_furniture/stripped_palm_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_BOOKSHELF = ITEMS.register("furniture/palm_furniture/stripped_palm_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/palm_furniture/stripped_palm_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_DRAWER = ITEMS.register("furniture/palm_furniture/stripped_palm_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_DOUBLE_DRAWER = ITEMS.register("furniture/palm_furniture/stripped_palm_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_BOOKSHELF_DRAWER = ITEMS.register("furniture/palm_furniture/stripped_palm_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/palm_furniture/stripped_palm_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_LARGE_DRAWER = ITEMS.register("furniture/palm_furniture/stripped_palm_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/palm_furniture/stripped_palm_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_TRIPLE_DRAWER = ITEMS.register("furniture/palm_furniture/stripped_palm_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_DESK = ITEMS.register("furniture/palm_furniture/stripped_palm_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_COVERED_DESK = ITEMS.register("furniture/palm_furniture/stripped_palm_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_MODERN_DESK = ITEMS.register("furniture/palm_furniture/stripped_palm_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_TABLE = ITEMS.register("furniture/palm_furniture/stripped_palm_table", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_END_TABLE = ITEMS.register("furniture/palm_furniture/stripped_palm_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_COFFEE_TABLE = ITEMS.register("furniture/palm_furniture/stripped_palm_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_GLASS_TABLE = ITEMS.register("furniture/palm_furniture/stripped_palm_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_CHAIR = ITEMS.register("furniture/palm_furniture/stripped_palm_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_MODERN_CHAIR = ITEMS.register("furniture/palm_furniture/stripped_palm_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_STRIPED_CHAIR = ITEMS.register("furniture/palm_furniture/stripped_palm_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_STOOL_CHAIR = ITEMS.register("furniture/palm_furniture/stripped_palm_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_COUNTER = ITEMS.register("furniture/palm_furniture/stripped_palm_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_DRAWER_COUNTER = ITEMS.register("furniture/palm_furniture/stripped_palm_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/palm_furniture/stripped_palm_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PALM_CUPBOARD_COUNTER = ITEMS.register("furniture/palm_furniture/stripped_palm_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_PALM_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_WARDROBE = ITEMS.register("furniture/pine_furniture/pine_wardrobe", () -> new ItemBlock(FurnitureInit.PINE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_MODERN_WARDROBE = ITEMS.register("furniture/pine_furniture/pine_modern_wardrobe", () -> new ItemBlock(FurnitureInit.PINE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_DOUBLE_WARDROBE = ITEMS.register("furniture/pine_furniture/pine_double_wardrobe", () -> new ItemBlock(FurnitureInit.PINE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_BOOKSHELF = ITEMS.register("furniture/pine_furniture/pine_bookshelf", () -> new ItemBlock(FurnitureInit.PINE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/pine_furniture/pine_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.PINE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_DRAWER = ITEMS.register("furniture/pine_furniture/pine_drawer", () -> new ItemBlock(FurnitureInit.PINE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_DOUBLE_DRAWER = ITEMS.register("furniture/pine_furniture/pine_double_drawer", () -> new ItemBlock(FurnitureInit.PINE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_BOOKSHELF_DRAWER = ITEMS.register("furniture/pine_furniture/pine_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.PINE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/pine_furniture/pine_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.PINE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_LARGE_DRAWER = ITEMS.register("furniture/pine_furniture/pine_large_drawer", () -> new ItemBlock(FurnitureInit.PINE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/pine_furniture/pine_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.PINE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_TRIPLE_DRAWER = ITEMS.register("furniture/pine_furniture/pine_triple_drawer", () -> new ItemBlock(FurnitureInit.PINE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_DESK = ITEMS.register("furniture/pine_furniture/pine_desk", () -> new ItemBlock(FurnitureInit.PINE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_COVERED_DESK = ITEMS.register("furniture/pine_furniture/pine_covered_desk", () -> new ItemBlock(FurnitureInit.PINE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_MODERN_DESK = ITEMS.register("furniture/pine_furniture/pine_modern_desk", () -> new ItemBlock(FurnitureInit.PINE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_TABLE = ITEMS.register("furniture/pine_furniture/pine_table", () -> new ItemBlock(FurnitureInit.PINE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_END_TABLE = ITEMS.register("furniture/pine_furniture/pine_end_table", () -> new ItemBlock(FurnitureInit.PINE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_COFFEE_TABLE = ITEMS.register("furniture/pine_furniture/pine_coffee_table", () -> new ItemBlock(FurnitureInit.PINE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_GLASS_TABLE = ITEMS.register("furniture/pine_furniture/pine_glass_table", () -> new ItemBlock(FurnitureInit.PINE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_CHAIR = ITEMS.register("furniture/pine_furniture/pine_chair", () -> new ItemBlock(FurnitureInit.PINE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_MODERN_CHAIR = ITEMS.register("furniture/pine_furniture/pine_modern_chair", () -> new ItemBlock(FurnitureInit.PINE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_STRIPED_CHAIR = ITEMS.register("furniture/pine_furniture/pine_striped_chair", () -> new ItemBlock(FurnitureInit.PINE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_STOOL_CHAIR = ITEMS.register("furniture/pine_furniture/pine_stool_chair", () -> new ItemBlock(FurnitureInit.PINE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_COUNTER = ITEMS.register("furniture/pine_furniture/pine_counter", () -> new ItemBlock(FurnitureInit.PINE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_DRAWER_COUNTER = ITEMS.register("furniture/pine_furniture/pine_drawer_counter", () -> new ItemBlock(FurnitureInit.PINE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/pine_furniture/pine_double_drawer_counter", () -> new ItemBlock(FurnitureInit.PINE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_CUPBOARD_COUNTER = ITEMS.register("furniture/pine_furniture/pine_cupboard_counter", () -> new ItemBlock(FurnitureInit.PINE_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_WARDROBE = ITEMS.register("furniture/pine_furniture/stripped_pine_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_MODERN_WARDROBE = ITEMS.register("furniture/pine_furniture/stripped_pine_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_DOUBLE_WARDROBE = ITEMS.register("furniture/pine_furniture/stripped_pine_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_BOOKSHELF = ITEMS.register("furniture/pine_furniture/stripped_pine_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/pine_furniture/stripped_pine_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_DRAWER = ITEMS.register("furniture/pine_furniture/stripped_pine_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_DOUBLE_DRAWER = ITEMS.register("furniture/pine_furniture/stripped_pine_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_BOOKSHELF_DRAWER = ITEMS.register("furniture/pine_furniture/stripped_pine_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/pine_furniture/stripped_pine_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_LARGE_DRAWER = ITEMS.register("furniture/pine_furniture/stripped_pine_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/pine_furniture/stripped_pine_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_TRIPLE_DRAWER = ITEMS.register("furniture/pine_furniture/stripped_pine_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_DESK = ITEMS.register("furniture/pine_furniture/stripped_pine_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_COVERED_DESK = ITEMS.register("furniture/pine_furniture/stripped_pine_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_MODERN_DESK = ITEMS.register("furniture/pine_furniture/stripped_pine_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_TABLE = ITEMS.register("furniture/pine_furniture/stripped_pine_table", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_END_TABLE = ITEMS.register("furniture/pine_furniture/stripped_pine_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_COFFEE_TABLE = ITEMS.register("furniture/pine_furniture/stripped_pine_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_GLASS_TABLE = ITEMS.register("furniture/pine_furniture/stripped_pine_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_CHAIR = ITEMS.register("furniture/pine_furniture/stripped_pine_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_MODERN_CHAIR = ITEMS.register("furniture/pine_furniture/stripped_pine_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_STRIPED_CHAIR = ITEMS.register("furniture/pine_furniture/stripped_pine_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_STOOL_CHAIR = ITEMS.register("furniture/pine_furniture/stripped_pine_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_COUNTER = ITEMS.register("furniture/pine_furniture/stripped_pine_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_DRAWER_COUNTER = ITEMS.register("furniture/pine_furniture/stripped_pine_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/pine_furniture/stripped_pine_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_PINE_CUPBOARD_COUNTER = ITEMS.register("furniture/pine_furniture/stripped_pine_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_PINE_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> ROSEWOOD_WARDROBE = ITEMS.register("furniture/rosewood_furniture/rosewood_wardrobe", () -> new ItemBlock(FurnitureInit.ROSEWOOD_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_MODERN_WARDROBE = ITEMS.register("furniture/rosewood_furniture/rosewood_modern_wardrobe", () -> new ItemBlock(FurnitureInit.ROSEWOOD_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_DOUBLE_WARDROBE = ITEMS.register("furniture/rosewood_furniture/rosewood_double_wardrobe", () -> new ItemBlock(FurnitureInit.ROSEWOOD_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_BOOKSHELF = ITEMS.register("furniture/rosewood_furniture/rosewood_bookshelf", () -> new ItemBlock(FurnitureInit.ROSEWOOD_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/rosewood_furniture/rosewood_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.ROSEWOOD_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_DRAWER = ITEMS.register("furniture/rosewood_furniture/rosewood_drawer", () -> new ItemBlock(FurnitureInit.ROSEWOOD_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_DOUBLE_DRAWER = ITEMS.register("furniture/rosewood_furniture/rosewood_double_drawer", () -> new ItemBlock(FurnitureInit.ROSEWOOD_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_BOOKSHELF_DRAWER = ITEMS.register("furniture/rosewood_furniture/rosewood_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.ROSEWOOD_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/rosewood_furniture/rosewood_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.ROSEWOOD_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_LARGE_DRAWER = ITEMS.register("furniture/rosewood_furniture/rosewood_large_drawer", () -> new ItemBlock(FurnitureInit.ROSEWOOD_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/rosewood_furniture/rosewood_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.ROSEWOOD_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_TRIPLE_DRAWER = ITEMS.register("furniture/rosewood_furniture/rosewood_triple_drawer", () -> new ItemBlock(FurnitureInit.ROSEWOOD_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_DESK = ITEMS.register("furniture/rosewood_furniture/rosewood_desk", () -> new ItemBlock(FurnitureInit.ROSEWOOD_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_COVERED_DESK = ITEMS.register("furniture/rosewood_furniture/rosewood_covered_desk", () -> new ItemBlock(FurnitureInit.ROSEWOOD_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_MODERN_DESK = ITEMS.register("furniture/rosewood_furniture/rosewood_modern_desk", () -> new ItemBlock(FurnitureInit.ROSEWOOD_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_TABLE = ITEMS.register("furniture/rosewood_furniture/rosewood_table", () -> new ItemBlock(FurnitureInit.ROSEWOOD_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_END_TABLE = ITEMS.register("furniture/rosewood_furniture/rosewood_end_table", () -> new ItemBlock(FurnitureInit.ROSEWOOD_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_COFFEE_TABLE = ITEMS.register("furniture/rosewood_furniture/rosewood_coffee_table", () -> new ItemBlock(FurnitureInit.ROSEWOOD_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_GLASS_TABLE = ITEMS.register("furniture/rosewood_furniture/rosewood_glass_table", () -> new ItemBlock(FurnitureInit.ROSEWOOD_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_CHAIR = ITEMS.register("furniture/rosewood_furniture/rosewood_chair", () -> new ItemBlock(FurnitureInit.ROSEWOOD_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_MODERN_CHAIR = ITEMS.register("furniture/rosewood_furniture/rosewood_modern_chair", () -> new ItemBlock(FurnitureInit.ROSEWOOD_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_STRIPED_CHAIR = ITEMS.register("furniture/rosewood_furniture/rosewood_striped_chair", () -> new ItemBlock(FurnitureInit.ROSEWOOD_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_STOOL_CHAIR = ITEMS.register("furniture/rosewood_furniture/rosewood_stool_chair", () -> new ItemBlock(FurnitureInit.ROSEWOOD_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_COUNTER = ITEMS.register("furniture/rosewood_furniture/rosewood_counter", () -> new ItemBlock(FurnitureInit.ROSEWOOD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_DRAWER_COUNTER = ITEMS.register("furniture/rosewood_furniture/rosewood_drawer_counter", () -> new ItemBlock(FurnitureInit.ROSEWOOD_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/rosewood_furniture/rosewood_double_drawer_counter", () -> new ItemBlock(FurnitureInit.ROSEWOOD_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEWOOD_CUPBOARD_COUNTER = ITEMS.register("furniture/rosewood_furniture/rosewood_cupboard_counter", () -> new ItemBlock(FurnitureInit.ROSEWOOD_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_WARDROBE = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_MODERN_WARDROBE = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_DOUBLE_WARDROBE = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_BOOKSHELF = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_DRAWER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_DOUBLE_DRAWER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_BOOKSHELF_DRAWER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_LARGE_DRAWER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_TRIPLE_DRAWER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_DESK = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_COVERED_DESK = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_MODERN_DESK = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_TABLE = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_END_TABLE = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_COFFEE_TABLE = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_GLASS_TABLE = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_CHAIR = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_MODERN_CHAIR = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_STRIPED_CHAIR = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_STOOL_CHAIR = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_COUNTER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_DRAWER_COUNTER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ROSEWOOD_CUPBOARD_COUNTER = ITEMS.register("furniture/rosewood_furniture/stripped_rosewood_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_ROSEWOOD_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> SEQUOIA_WARDROBE = ITEMS.register("furniture/sequoia_furniture/sequoia_wardrobe", () -> new ItemBlock(FurnitureInit.SEQUOIA_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_MODERN_WARDROBE = ITEMS.register("furniture/sequoia_furniture/sequoia_modern_wardrobe", () -> new ItemBlock(FurnitureInit.SEQUOIA_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_DOUBLE_WARDROBE = ITEMS.register("furniture/sequoia_furniture/sequoia_double_wardrobe", () -> new ItemBlock(FurnitureInit.SEQUOIA_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_BOOKSHELF = ITEMS.register("furniture/sequoia_furniture/sequoia_bookshelf", () -> new ItemBlock(FurnitureInit.SEQUOIA_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/sequoia_furniture/sequoia_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.SEQUOIA_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_DRAWER = ITEMS.register("furniture/sequoia_furniture/sequoia_drawer", () -> new ItemBlock(FurnitureInit.SEQUOIA_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_DOUBLE_DRAWER = ITEMS.register("furniture/sequoia_furniture/sequoia_double_drawer", () -> new ItemBlock(FurnitureInit.SEQUOIA_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_BOOKSHELF_DRAWER = ITEMS.register("furniture/sequoia_furniture/sequoia_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.SEQUOIA_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/sequoia_furniture/sequoia_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.SEQUOIA_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_LARGE_DRAWER = ITEMS.register("furniture/sequoia_furniture/sequoia_large_drawer", () -> new ItemBlock(FurnitureInit.SEQUOIA_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/sequoia_furniture/sequoia_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.SEQUOIA_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_TRIPLE_DRAWER = ITEMS.register("furniture/sequoia_furniture/sequoia_triple_drawer", () -> new ItemBlock(FurnitureInit.SEQUOIA_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_DESK = ITEMS.register("furniture/sequoia_furniture/sequoia_desk", () -> new ItemBlock(FurnitureInit.SEQUOIA_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_COVERED_DESK = ITEMS.register("furniture/sequoia_furniture/sequoia_covered_desk", () -> new ItemBlock(FurnitureInit.SEQUOIA_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_MODERN_DESK = ITEMS.register("furniture/sequoia_furniture/sequoia_modern_desk", () -> new ItemBlock(FurnitureInit.SEQUOIA_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_TABLE = ITEMS.register("furniture/sequoia_furniture/sequoia_table", () -> new ItemBlock(FurnitureInit.SEQUOIA_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_END_TABLE = ITEMS.register("furniture/sequoia_furniture/sequoia_end_table", () -> new ItemBlock(FurnitureInit.SEQUOIA_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_COFFEE_TABLE = ITEMS.register("furniture/sequoia_furniture/sequoia_coffee_table", () -> new ItemBlock(FurnitureInit.SEQUOIA_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_GLASS_TABLE = ITEMS.register("furniture/sequoia_furniture/sequoia_glass_table", () -> new ItemBlock(FurnitureInit.SEQUOIA_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_CHAIR = ITEMS.register("furniture/sequoia_furniture/sequoia_chair", () -> new ItemBlock(FurnitureInit.SEQUOIA_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_MODERN_CHAIR = ITEMS.register("furniture/sequoia_furniture/sequoia_modern_chair", () -> new ItemBlock(FurnitureInit.SEQUOIA_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_STRIPED_CHAIR = ITEMS.register("furniture/sequoia_furniture/sequoia_striped_chair", () -> new ItemBlock(FurnitureInit.SEQUOIA_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_STOOL_CHAIR = ITEMS.register("furniture/sequoia_furniture/sequoia_stool_chair", () -> new ItemBlock(FurnitureInit.SEQUOIA_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_COUNTER = ITEMS.register("furniture/sequoia_furniture/sequoia_counter", () -> new ItemBlock(FurnitureInit.SEQUOIA_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_DRAWER_COUNTER = ITEMS.register("furniture/sequoia_furniture/sequoia_drawer_counter", () -> new ItemBlock(FurnitureInit.SEQUOIA_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/sequoia_furniture/sequoia_double_drawer_counter", () -> new ItemBlock(FurnitureInit.SEQUOIA_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEQUOIA_CUPBOARD_COUNTER = ITEMS.register("furniture/sequoia_furniture/sequoia_cupboard_counter", () -> new ItemBlock(FurnitureInit.SEQUOIA_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_WARDROBE = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_MODERN_WARDROBE = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_DOUBLE_WARDROBE = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_BOOKSHELF = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_DRAWER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_DOUBLE_DRAWER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_BOOKSHELF_DRAWER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_LARGE_DRAWER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_TRIPLE_DRAWER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_DESK = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_COVERED_DESK = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_MODERN_DESK = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_TABLE = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_END_TABLE = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_COFFEE_TABLE = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_GLASS_TABLE = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_CHAIR = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_MODERN_CHAIR = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_STRIPED_CHAIR = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_STOOL_CHAIR = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_COUNTER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_DRAWER_COUNTER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SEQUOIA_CUPBOARD_COUNTER = ITEMS.register("furniture/sequoia_furniture/stripped_sequoia_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SEQUOIA_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_WARDROBE = ITEMS.register("furniture/spruce_furniture/spruce_wardrobe", () -> new ItemBlock(FurnitureInit.SPRUCE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_MODERN_WARDROBE = ITEMS.register("furniture/spruce_furniture/spruce_modern_wardrobe", () -> new ItemBlock(FurnitureInit.SPRUCE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DOUBLE_WARDROBE = ITEMS.register("furniture/spruce_furniture/spruce_double_wardrobe", () -> new ItemBlock(FurnitureInit.SPRUCE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BOOKSHELF = ITEMS.register("furniture/spruce_furniture/spruce_bookshelf", () -> new ItemBlock(FurnitureInit.SPRUCE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/spruce_furniture/spruce_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.SPRUCE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DRAWER = ITEMS.register("furniture/spruce_furniture/spruce_drawer", () -> new ItemBlock(FurnitureInit.SPRUCE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DOUBLE_DRAWER = ITEMS.register("furniture/spruce_furniture/spruce_double_drawer", () -> new ItemBlock(FurnitureInit.SPRUCE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_BOOKSHELF_DRAWER = ITEMS.register("furniture/spruce_furniture/spruce_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.SPRUCE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/spruce_furniture/spruce_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.SPRUCE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_LARGE_DRAWER = ITEMS.register("furniture/spruce_furniture/spruce_large_drawer", () -> new ItemBlock(FurnitureInit.SPRUCE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/spruce_furniture/spruce_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.SPRUCE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_TRIPLE_DRAWER = ITEMS.register("furniture/spruce_furniture/spruce_triple_drawer", () -> new ItemBlock(FurnitureInit.SPRUCE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DESK = ITEMS.register("furniture/spruce_furniture/spruce_desk", () -> new ItemBlock(FurnitureInit.SPRUCE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_COVERED_DESK = ITEMS.register("furniture/spruce_furniture/spruce_covered_desk", () -> new ItemBlock(FurnitureInit.SPRUCE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_MODERN_DESK = ITEMS.register("furniture/spruce_furniture/spruce_modern_desk", () -> new ItemBlock(FurnitureInit.SPRUCE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_TABLE = ITEMS.register("furniture/spruce_furniture/spruce_table", () -> new ItemBlock(FurnitureInit.SPRUCE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_END_TABLE = ITEMS.register("furniture/spruce_furniture/spruce_end_table", () -> new ItemBlock(FurnitureInit.SPRUCE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_COFFEE_TABLE = ITEMS.register("furniture/spruce_furniture/spruce_coffee_table", () -> new ItemBlock(FurnitureInit.SPRUCE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_GLASS_TABLE = ITEMS.register("furniture/spruce_furniture/spruce_glass_table", () -> new ItemBlock(FurnitureInit.SPRUCE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_CHAIR = ITEMS.register("furniture/spruce_furniture/spruce_chair", () -> new ItemBlock(FurnitureInit.SPRUCE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_MODERN_CHAIR = ITEMS.register("furniture/spruce_furniture/spruce_modern_chair", () -> new ItemBlock(FurnitureInit.SPRUCE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_STRIPED_CHAIR = ITEMS.register("furniture/spruce_furniture/spruce_striped_chair", () -> new ItemBlock(FurnitureInit.SPRUCE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_STOOL_CHAIR = ITEMS.register("furniture/spruce_furniture/spruce_stool_chair", () -> new ItemBlock(FurnitureInit.SPRUCE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_COUNTER = ITEMS.register("furniture/spruce_furniture/spruce_counter", () -> new ItemBlock(FurnitureInit.SPRUCE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DRAWER_COUNTER = ITEMS.register("furniture/spruce_furniture/spruce_drawer_counter", () -> new ItemBlock(FurnitureInit.SPRUCE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/spruce_furniture/spruce_double_drawer_counter", () -> new ItemBlock(FurnitureInit.SPRUCE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_CUPBOARD_COUNTER = ITEMS.register("furniture/spruce_furniture/spruce_cupboard_counter", () -> new ItemBlock(FurnitureInit.SPRUCE_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_WARDROBE = ITEMS.register("furniture/spruce_furniture/stripped_spruce_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_MODERN_WARDROBE = ITEMS.register("furniture/spruce_furniture/stripped_spruce_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_DOUBLE_WARDROBE = ITEMS.register("furniture/spruce_furniture/stripped_spruce_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_BOOKSHELF = ITEMS.register("furniture/spruce_furniture/stripped_spruce_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/spruce_furniture/stripped_spruce_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_DRAWER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_DOUBLE_DRAWER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_BOOKSHELF_DRAWER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LARGE_DRAWER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_TRIPLE_DRAWER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_DESK = ITEMS.register("furniture/spruce_furniture/stripped_spruce_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_COVERED_DESK = ITEMS.register("furniture/spruce_furniture/stripped_spruce_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_MODERN_DESK = ITEMS.register("furniture/spruce_furniture/stripped_spruce_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_TABLE = ITEMS.register("furniture/spruce_furniture/stripped_spruce_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_END_TABLE = ITEMS.register("furniture/spruce_furniture/stripped_spruce_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_COFFEE_TABLE = ITEMS.register("furniture/spruce_furniture/stripped_spruce_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_GLASS_TABLE = ITEMS.register("furniture/spruce_furniture/stripped_spruce_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_CHAIR = ITEMS.register("furniture/spruce_furniture/stripped_spruce_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_MODERN_CHAIR = ITEMS.register("furniture/spruce_furniture/stripped_spruce_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_STRIPED_CHAIR = ITEMS.register("furniture/spruce_furniture/stripped_spruce_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_STOOL_CHAIR = ITEMS.register("furniture/spruce_furniture/stripped_spruce_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_COUNTER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_DRAWER_COUNTER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_CUPBOARD_COUNTER = ITEMS.register("furniture/spruce_furniture/stripped_spruce_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SPRUCE_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> SYCAMORE_WARDROBE = ITEMS.register("furniture/sycamore_furniture/sycamore_wardrobe", () -> new ItemBlock(FurnitureInit.SYCAMORE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_MODERN_WARDROBE = ITEMS.register("furniture/sycamore_furniture/sycamore_modern_wardrobe", () -> new ItemBlock(FurnitureInit.SYCAMORE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_DOUBLE_WARDROBE = ITEMS.register("furniture/sycamore_furniture/sycamore_double_wardrobe", () -> new ItemBlock(FurnitureInit.SYCAMORE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_BOOKSHELF = ITEMS.register("furniture/sycamore_furniture/sycamore_bookshelf", () -> new ItemBlock(FurnitureInit.SYCAMORE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/sycamore_furniture/sycamore_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.SYCAMORE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_DRAWER = ITEMS.register("furniture/sycamore_furniture/sycamore_drawer", () -> new ItemBlock(FurnitureInit.SYCAMORE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_DOUBLE_DRAWER = ITEMS.register("furniture/sycamore_furniture/sycamore_double_drawer", () -> new ItemBlock(FurnitureInit.SYCAMORE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_BOOKSHELF_DRAWER = ITEMS.register("furniture/sycamore_furniture/sycamore_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.SYCAMORE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/sycamore_furniture/sycamore_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.SYCAMORE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_LARGE_DRAWER = ITEMS.register("furniture/sycamore_furniture/sycamore_large_drawer", () -> new ItemBlock(FurnitureInit.SYCAMORE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/sycamore_furniture/sycamore_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.SYCAMORE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_TRIPLE_DRAWER = ITEMS.register("furniture/sycamore_furniture/sycamore_triple_drawer", () -> new ItemBlock(FurnitureInit.SYCAMORE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_DESK = ITEMS.register("furniture/sycamore_furniture/sycamore_desk", () -> new ItemBlock(FurnitureInit.SYCAMORE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_COVERED_DESK = ITEMS.register("furniture/sycamore_furniture/sycamore_covered_desk", () -> new ItemBlock(FurnitureInit.SYCAMORE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_MODERN_DESK = ITEMS.register("furniture/sycamore_furniture/sycamore_modern_desk", () -> new ItemBlock(FurnitureInit.SYCAMORE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_TABLE = ITEMS.register("furniture/sycamore_furniture/sycamore_table", () -> new ItemBlock(FurnitureInit.SYCAMORE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_END_TABLE = ITEMS.register("furniture/sycamore_furniture/sycamore_end_table", () -> new ItemBlock(FurnitureInit.SYCAMORE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_COFFEE_TABLE = ITEMS.register("furniture/sycamore_furniture/sycamore_coffee_table", () -> new ItemBlock(FurnitureInit.SYCAMORE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_GLASS_TABLE = ITEMS.register("furniture/sycamore_furniture/sycamore_glass_table", () -> new ItemBlock(FurnitureInit.SYCAMORE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_CHAIR = ITEMS.register("furniture/sycamore_furniture/sycamore_chair", () -> new ItemBlock(FurnitureInit.SYCAMORE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_MODERN_CHAIR = ITEMS.register("furniture/sycamore_furniture/sycamore_modern_chair", () -> new ItemBlock(FurnitureInit.SYCAMORE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_STRIPED_CHAIR = ITEMS.register("furniture/sycamore_furniture/sycamore_striped_chair", () -> new ItemBlock(FurnitureInit.SYCAMORE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_STOOL_CHAIR = ITEMS.register("furniture/sycamore_furniture/sycamore_stool_chair", () -> new ItemBlock(FurnitureInit.SYCAMORE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_COUNTER = ITEMS.register("furniture/sycamore_furniture/sycamore_counter", () -> new ItemBlock(FurnitureInit.SYCAMORE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_DRAWER_COUNTER = ITEMS.register("furniture/sycamore_furniture/sycamore_drawer_counter", () -> new ItemBlock(FurnitureInit.SYCAMORE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/sycamore_furniture/sycamore_double_drawer_counter", () -> new ItemBlock(FurnitureInit.SYCAMORE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_CUPBOARD_COUNTER = ITEMS.register("furniture/sycamore_furniture/sycamore_cupboard_counter", () -> new ItemBlock(FurnitureInit.SYCAMORE_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_WARDROBE = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_MODERN_WARDROBE = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_DOUBLE_WARDROBE = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_BOOKSHELF = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_DRAWER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_DOUBLE_DRAWER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_BOOKSHELF_DRAWER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_LARGE_DRAWER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_TRIPLE_DRAWER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_DESK = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_COVERED_DESK = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_MODERN_DESK = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_TABLE = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_END_TABLE = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_COFFEE_TABLE = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_GLASS_TABLE = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_CHAIR = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_MODERN_CHAIR = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_STRIPED_CHAIR = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_STOOL_CHAIR = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_COUNTER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_DRAWER_COUNTER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_CUPBOARD_COUNTER = ITEMS.register("furniture/sycamore_furniture/stripped_sycamore_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_SYCAMORE_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> WHITE_CEDAR_WARDROBE = ITEMS.register("furniture/white_cedar_furniture/white_cedar_wardrobe", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_MODERN_WARDROBE = ITEMS.register("furniture/white_cedar_furniture/white_cedar_modern_wardrobe", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_DOUBLE_WARDROBE = ITEMS.register("furniture/white_cedar_furniture/white_cedar_double_wardrobe", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_BOOKSHELF = ITEMS.register("furniture/white_cedar_furniture/white_cedar_bookshelf", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/white_cedar_furniture/white_cedar_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_DRAWER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_drawer", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_DOUBLE_DRAWER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_double_drawer", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_BOOKSHELF_DRAWER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_LARGE_DRAWER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_large_drawer", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_TRIPLE_DRAWER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_triple_drawer", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_DESK = ITEMS.register("furniture/white_cedar_furniture/white_cedar_desk", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_COVERED_DESK = ITEMS.register("furniture/white_cedar_furniture/white_cedar_covered_desk", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_MODERN_DESK = ITEMS.register("furniture/white_cedar_furniture/white_cedar_modern_desk", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_TABLE = ITEMS.register("furniture/white_cedar_furniture/white_cedar_table", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_END_TABLE = ITEMS.register("furniture/white_cedar_furniture/white_cedar_end_table", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_COFFEE_TABLE = ITEMS.register("furniture/white_cedar_furniture/white_cedar_coffee_table", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_GLASS_TABLE = ITEMS.register("furniture/white_cedar_furniture/white_cedar_glass_table", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_CHAIR = ITEMS.register("furniture/white_cedar_furniture/white_cedar_chair", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_MODERN_CHAIR = ITEMS.register("furniture/white_cedar_furniture/white_cedar_modern_chair", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_STRIPED_CHAIR = ITEMS.register("furniture/white_cedar_furniture/white_cedar_striped_chair", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_STOOL_CHAIR = ITEMS.register("furniture/white_cedar_furniture/white_cedar_stool_chair", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_COUNTER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_counter", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_DRAWER_COUNTER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_drawer_counter", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_double_drawer_counter", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CEDAR_CUPBOARD_COUNTER = ITEMS.register("furniture/white_cedar_furniture/white_cedar_cupboard_counter", () -> new ItemBlock(FurnitureInit.WHITE_CEDAR_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_WARDROBE = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_MODERN_WARDROBE = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_DOUBLE_WARDROBE = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_BOOKSHELF = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_DRAWER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_DOUBLE_DRAWER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_BOOKSHELF_DRAWER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_LARGE_DRAWER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_TRIPLE_DRAWER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_DESK = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_COVERED_DESK = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_MODERN_DESK = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_TABLE = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_table", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_END_TABLE = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_COFFEE_TABLE = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_GLASS_TABLE = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_CHAIR = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_MODERN_CHAIR = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_STRIPED_CHAIR = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_STOOL_CHAIR = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_COUNTER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_DRAWER_COUNTER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WHITE_CEDAR_CUPBOARD_COUNTER = ITEMS.register("furniture/white_cedar_furniture/stripped_white_cedar_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_WHITE_CEDAR_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> WILLOW_WARDROBE = ITEMS.register("furniture/willow_furniture/willow_wardrobe", () -> new ItemBlock(FurnitureInit.WILLOW_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_MODERN_WARDROBE = ITEMS.register("furniture/willow_furniture/willow_modern_wardrobe", () -> new ItemBlock(FurnitureInit.WILLOW_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_DOUBLE_WARDROBE = ITEMS.register("furniture/willow_furniture/willow_double_wardrobe", () -> new ItemBlock(FurnitureInit.WILLOW_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_BOOKSHELF = ITEMS.register("furniture/willow_furniture/willow_bookshelf", () -> new ItemBlock(FurnitureInit.WILLOW_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/willow_furniture/willow_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.WILLOW_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_DRAWER = ITEMS.register("furniture/willow_furniture/willow_drawer", () -> new ItemBlock(FurnitureInit.WILLOW_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_DOUBLE_DRAWER = ITEMS.register("furniture/willow_furniture/willow_double_drawer", () -> new ItemBlock(FurnitureInit.WILLOW_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_BOOKSHELF_DRAWER = ITEMS.register("furniture/willow_furniture/willow_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.WILLOW_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/willow_furniture/willow_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.WILLOW_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_LARGE_DRAWER = ITEMS.register("furniture/willow_furniture/willow_large_drawer", () -> new ItemBlock(FurnitureInit.WILLOW_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/willow_furniture/willow_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.WILLOW_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_TRIPLE_DRAWER = ITEMS.register("furniture/willow_furniture/willow_triple_drawer", () -> new ItemBlock(FurnitureInit.WILLOW_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_DESK = ITEMS.register("furniture/willow_furniture/willow_desk", () -> new ItemBlock(FurnitureInit.WILLOW_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_COVERED_DESK = ITEMS.register("furniture/willow_furniture/willow_covered_desk", () -> new ItemBlock(FurnitureInit.WILLOW_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_MODERN_DESK = ITEMS.register("furniture/willow_furniture/willow_modern_desk", () -> new ItemBlock(FurnitureInit.WILLOW_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_TABLE = ITEMS.register("furniture/willow_furniture/willow_table", () -> new ItemBlock(FurnitureInit.WILLOW_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_END_TABLE = ITEMS.register("furniture/willow_furniture/willow_end_table", () -> new ItemBlock(FurnitureInit.WILLOW_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_COFFEE_TABLE = ITEMS.register("furniture/willow_furniture/willow_coffee_table", () -> new ItemBlock(FurnitureInit.WILLOW_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_GLASS_TABLE = ITEMS.register("furniture/willow_furniture/willow_glass_table", () -> new ItemBlock(FurnitureInit.WILLOW_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_CHAIR = ITEMS.register("furniture/willow_furniture/willow_chair", () -> new ItemBlock(FurnitureInit.WILLOW_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_MODERN_CHAIR = ITEMS.register("furniture/willow_furniture/willow_modern_chair", () -> new ItemBlock(FurnitureInit.WILLOW_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_STRIPED_CHAIR = ITEMS.register("furniture/willow_furniture/willow_striped_chair", () -> new ItemBlock(FurnitureInit.WILLOW_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_STOOL_CHAIR = ITEMS.register("furniture/willow_furniture/willow_stool_chair", () -> new ItemBlock(FurnitureInit.WILLOW_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_COUNTER = ITEMS.register("furniture/willow_furniture/willow_counter", () -> new ItemBlock(FurnitureInit.WILLOW_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_DRAWER_COUNTER = ITEMS.register("furniture/willow_furniture/willow_drawer_counter", () -> new ItemBlock(FurnitureInit.WILLOW_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/willow_furniture/willow_double_drawer_counter", () -> new ItemBlock(FurnitureInit.WILLOW_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_CUPBOARD_COUNTER = ITEMS.register("furniture/willow_furniture/willow_cupboard_counter", () -> new ItemBlock(FurnitureInit.WILLOW_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_WARDROBE = ITEMS.register("furniture/willow_furniture/stripped_willow_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_MODERN_WARDROBE = ITEMS.register("furniture/willow_furniture/stripped_willow_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_DOUBLE_WARDROBE = ITEMS.register("furniture/willow_furniture/stripped_willow_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_BOOKSHELF = ITEMS.register("furniture/willow_furniture/stripped_willow_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/willow_furniture/stripped_willow_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_DRAWER = ITEMS.register("furniture/willow_furniture/stripped_willow_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_DOUBLE_DRAWER = ITEMS.register("furniture/willow_furniture/stripped_willow_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_BOOKSHELF_DRAWER = ITEMS.register("furniture/willow_furniture/stripped_willow_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/willow_furniture/stripped_willow_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_LARGE_DRAWER = ITEMS.register("furniture/willow_furniture/stripped_willow_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/willow_furniture/stripped_willow_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_TRIPLE_DRAWER = ITEMS.register("furniture/willow_furniture/stripped_willow_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_DESK = ITEMS.register("furniture/willow_furniture/stripped_willow_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_COVERED_DESK = ITEMS.register("furniture/willow_furniture/stripped_willow_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_MODERN_DESK = ITEMS.register("furniture/willow_furniture/stripped_willow_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_TABLE = ITEMS.register("furniture/willow_furniture/stripped_willow_table", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_END_TABLE = ITEMS.register("furniture/willow_furniture/stripped_willow_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_COFFEE_TABLE = ITEMS.register("furniture/willow_furniture/stripped_willow_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_GLASS_TABLE = ITEMS.register("furniture/willow_furniture/stripped_willow_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_CHAIR = ITEMS.register("furniture/willow_furniture/stripped_willow_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_MODERN_CHAIR = ITEMS.register("furniture/willow_furniture/stripped_willow_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_STRIPED_CHAIR = ITEMS.register("furniture/willow_furniture/stripped_willow_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_STOOL_CHAIR = ITEMS.register("furniture/willow_furniture/stripped_willow_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_COUNTER = ITEMS.register("furniture/willow_furniture/stripped_willow_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_DRAWER_COUNTER = ITEMS.register("furniture/willow_furniture/stripped_willow_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/willow_furniture/stripped_willow_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WILLOW_CUPBOARD_COUNTER = ITEMS.register("furniture/willow_furniture/stripped_willow_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_WILLOW_CUPBOARD_COUNTER.get(), new Item.Properties()));

    public static final RegistryObject<Item> OAK_WARDROBE = ITEMS.register("furniture/oak_furniture/oak_wardrobe", () -> new ItemBlock(FurnitureInit.OAK_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MODERN_WARDROBE = ITEMS.register("furniture/oak_furniture/oak_modern_wardrobe", () -> new ItemBlock(FurnitureInit.OAK_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DOUBLE_WARDROBE = ITEMS.register("furniture/oak_furniture/oak_double_wardrobe", () -> new ItemBlock(FurnitureInit.OAK_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BOOKSHELF = ITEMS.register("furniture/oak_furniture/oak_bookshelf", () -> new ItemBlock(FurnitureInit.OAK_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/oak_furniture/oak_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.OAK_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DRAWER = ITEMS.register("furniture/oak_furniture/oak_drawer", () -> new ItemBlock(FurnitureInit.OAK_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DOUBLE_DRAWER = ITEMS.register("furniture/oak_furniture/oak_double_drawer", () -> new ItemBlock(FurnitureInit.OAK_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_BOOKSHELF_DRAWER = ITEMS.register("furniture/oak_furniture/oak_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.OAK_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/oak_furniture/oak_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.OAK_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_LARGE_DRAWER = ITEMS.register("furniture/oak_furniture/oak_large_drawer", () -> new ItemBlock(FurnitureInit.OAK_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/oak_furniture/oak_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.OAK_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_TRIPLE_DRAWER = ITEMS.register("furniture/oak_furniture/oak_triple_drawer", () -> new ItemBlock(FurnitureInit.OAK_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DESK = ITEMS.register("furniture/oak_furniture/oak_desk", () -> new ItemBlock(FurnitureInit.OAK_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_COVERED_DESK = ITEMS.register("furniture/oak_furniture/oak_covered_desk", () -> new ItemBlock(FurnitureInit.OAK_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MODERN_DESK = ITEMS.register("furniture/oak_furniture/oak_modern_desk", () -> new ItemBlock(FurnitureInit.OAK_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_TABLE = ITEMS.register("furniture/oak_furniture/oak_table", () -> new ItemBlock(FurnitureInit.OAK_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_END_TABLE = ITEMS.register("furniture/oak_furniture/oak_end_table", () -> new ItemBlock(FurnitureInit.OAK_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_COFFEE_TABLE = ITEMS.register("furniture/oak_furniture/oak_coffee_table", () -> new ItemBlock(FurnitureInit.OAK_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_GLASS_TABLE = ITEMS.register("furniture/oak_furniture/oak_glass_table", () -> new ItemBlock(FurnitureInit.OAK_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CHAIR = ITEMS.register("furniture/oak_furniture/oak_chair", () -> new ItemBlock(FurnitureInit.OAK_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_MODERN_CHAIR = ITEMS.register("furniture/oak_furniture/oak_modern_chair", () -> new ItemBlock(FurnitureInit.OAK_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_STRIPED_CHAIR = ITEMS.register("furniture/oak_furniture/oak_striped_chair", () -> new ItemBlock(FurnitureInit.OAK_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_STOOL_CHAIR = ITEMS.register("furniture/oak_furniture/oak_stool_chair", () -> new ItemBlock(FurnitureInit.OAK_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_COUNTER = ITEMS.register("furniture/oak_furniture/oak_counter", () -> new ItemBlock(FurnitureInit.OAK_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DRAWER_COUNTER = ITEMS.register("furniture/oak_furniture/oak_drawer_counter", () -> new ItemBlock(FurnitureInit.OAK_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/oak_furniture/oak_double_drawer_counter", () -> new ItemBlock(FurnitureInit.OAK_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_CUPBOARD_COUNTER = ITEMS.register("furniture/oak_furniture/oak_cupboard_counter", () -> new ItemBlock(FurnitureInit.OAK_CUPBOARD_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_WARDROBE = ITEMS.register("furniture/oak_furniture/stripped_oak_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_MODERN_WARDROBE = ITEMS.register("furniture/oak_furniture/stripped_oak_modern_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_MODERN_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_DOUBLE_WARDROBE = ITEMS.register("furniture/oak_furniture/stripped_oak_double_wardrobe", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_DOUBLE_WARDROBE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_BOOKSHELF = ITEMS.register("furniture/oak_furniture/stripped_oak_bookshelf", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_BOOKSHELF.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_BOOKSHELF_CUPBOARD = ITEMS.register("furniture/oak_furniture/stripped_oak_bookshelf_cupboard", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_BOOKSHELF_CUPBOARD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_DRAWER = ITEMS.register("furniture/oak_furniture/stripped_oak_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_DOUBLE_DRAWER = ITEMS.register("furniture/oak_furniture/stripped_oak_double_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_DOUBLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_BOOKSHELF_DRAWER = ITEMS.register("furniture/oak_furniture/stripped_oak_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_LOWER_BOOKSHELF_DRAWER = ITEMS.register("furniture/oak_furniture/stripped_oak_lower_bookshelf_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_LOWER_BOOKSHELF_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_LARGE_DRAWER = ITEMS.register("furniture/oak_furniture/stripped_oak_large_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_LARGE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_LOWER_TRIPLE_DRAWER = ITEMS.register("furniture/oak_furniture/stripped_oak_lower_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_LOWER_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_TRIPLE_DRAWER = ITEMS.register("furniture/oak_furniture/stripped_oak_triple_drawer", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_TRIPLE_DRAWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_DESK = ITEMS.register("furniture/oak_furniture/stripped_oak_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_COVERED_DESK = ITEMS.register("furniture/oak_furniture/stripped_oak_covered_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_COVERED_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_MODERN_DESK = ITEMS.register("furniture/oak_furniture/stripped_oak_modern_desk", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_MODERN_DESK.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_TABLE = ITEMS.register("furniture/oak_furniture/stripped_oak_table", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_END_TABLE = ITEMS.register("furniture/oak_furniture/stripped_oak_end_table", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_END_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_COFFEE_TABLE = ITEMS.register("furniture/oak_furniture/stripped_oak_coffee_table", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_COFFEE_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_GLASS_TABLE = ITEMS.register("furniture/oak_furniture/stripped_oak_glass_table", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_GLASS_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_CHAIR = ITEMS.register("furniture/oak_furniture/stripped_oak_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_MODERN_CHAIR = ITEMS.register("furniture/oak_furniture/stripped_oak_modern_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_MODERN_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_STRIPED_CHAIR = ITEMS.register("furniture/oak_furniture/stripped_oak_striped_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_STRIPED_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_STOOL_CHAIR = ITEMS.register("furniture/oak_furniture/stripped_oak_stool_chair", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_STOOL_CHAIR.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_COUNTER = ITEMS.register("furniture/oak_furniture/stripped_oak_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_DRAWER_COUNTER = ITEMS.register("furniture/oak_furniture/stripped_oak_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_DOUBLE_DRAWER_COUNTER = ITEMS.register("furniture/oak_furniture/stripped_oak_double_drawer_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_DOUBLE_DRAWER_COUNTER.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_OAK_CUPBOARD_COUNTER = ITEMS.register("furniture/oak_furniture/stripped_oak_cupboard_counter", () -> new ItemBlock(FurnitureInit.STRIPPED_OAK_CUPBOARD_COUNTER.get(), new Item.Properties()));



    public ItemInit() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}