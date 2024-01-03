package com.mcw_tfc_aio.arcwolf.objects;


import com.mcw_tfc_aio.arcwolf.storage.StorageTileEntity;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.Container;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;



public class TallFurniture extends FurnitureObject implements EntityBlock {
    public static final DirectionProperty FACING;
    public static final EnumProperty<ConnectionStatus> CONNECTION;
    protected static final VoxelShape EW;
    protected static final VoxelShape NS;

    public TallFurniture(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH)).setValue(CONNECTION, TallFurniture.ConnectionStatus.BASE));
    }

    public VoxelShape getShape(BlockState state, BlockGetter blockReader, BlockPos pos, CollisionContext selectionContext) {
        switch ((Direction)state.getValue(FACING)) {
            case NORTH:
                return NS;
            case SOUTH:
                return NS;
            case WEST:
                return EW;
            case EAST:
            default:
                return EW;
        }
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState)state.setValue(FACING, rot.rotate((Direction)state.getValue(FACING)));
    }

    private BlockState TableState(BlockState state, LevelAccessor level, BlockPos pos) {
        boolean above = level.getBlockState(pos.above()).getBlock() == this && state.getValue(FACING) == level.getBlockState(pos.above()).getValue(FACING);
        boolean below = level.getBlockState(pos.below()).getBlock() == this && state.getValue(FACING) == level.getBlockState(pos.below()).getValue(FACING);
        ConnectionStatus connection = this.getConnectionStatus((Direction)state.getValue(FACING), above, below);
        return (BlockState)state.setValue(CONNECTION, connection);
    }

    private ConnectionStatus getConnectionStatus(Direction facing, boolean above, boolean below) {
        if (above && below) {
            return TallFurniture.ConnectionStatus.MIDDLE;
        } else if (above && !below) {
            return TallFurniture.ConnectionStatus.BOTTOM;
        } else {
            return !above && below ? TallFurniture.ConnectionStatus.TOP : TallFurniture.ConnectionStatus.BASE;
        }
    }

    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
        if (!statetwo.is(state.getBlock())) {
            this.TableState(state, level, pos);
        }

    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, CONNECTION});
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState)this.TableState(super.getStateForPlacement(context), context.getLevel(), context.getClickedPos()).setValue(FACING, context.getHorizontalDirection().getClockWise());
    }

    public void placeAt(Level level, BlockPos pos, int num) {
        level.setBlock(pos, this.defaultBlockState(), num);
    }

    @Nullable
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StorageTileEntity(pos, state);
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        if (item != this.asItem()) {
            if (!level.isClientSide()) {
                BlockEntity var10 = level.getBlockEntity(pos);
                if (var10 instanceof StorageTileEntity) {
                    StorageTileEntity blockEntity = (StorageTileEntity)var10;
                    player.openMenu(blockEntity);
                }

                return InteractionResult.SUCCESS;
            } else {
                return InteractionResult.SUCCESS;
            }
        } else {
            return InteractionResult.PASS;
        }
    }

    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState statetwo, boolean bool) {
        if (!state.is(statetwo.getBlock())) {
            BlockEntity blockentity = level.getBlockEntity(pos);
            if (blockentity instanceof Container) {
                Containers.dropContents(level, pos, (Container)blockentity);
                level.updateNeighbourForOutputSignal(pos, this);
            }

            super.onRemove(state, level, pos, statetwo, bool);
        }

    }

    public void tick(BlockState state, ServerLevel level, BlockPos pos, Random rand) {
        BlockEntity blockentity = level.getBlockEntity(pos);
        if (blockentity instanceof StorageTileEntity) {
            ((StorageTileEntity)blockentity).recheckOpen();
        }

    }

    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
        return this.TableState(state, level, pos);
    }

    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity livent, ItemStack stack) {
        if (stack.hasCustomHoverName()) {
            BlockEntity blockentity = level.getBlockEntity(pos);
            this.TableState(state, level, pos);
            if (blockentity instanceof StorageTileEntity) {
                ((StorageTileEntity)blockentity).setCustomName(stack.getHoverName());
                this.TableState(state, level, pos);
            }
        }

    }

    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    public int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(level.getBlockEntity(pos));
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
        CONNECTION = EnumProperty.create("connection", ConnectionStatus.class, new ConnectionStatus[]{TallFurniture.ConnectionStatus.BASE, TallFurniture.ConnectionStatus.TOP, TallFurniture.ConnectionStatus.MIDDLE, TallFurniture.ConnectionStatus.BOTTOM});
        EW = Shapes.or(Block.box(0.0, 0.0, 1.0, 16.0, 16.0, 15.0), new VoxelShape[0]);
        NS = Shapes.or(Block.box(1.0, 0.0, 0.0, 15.0, 16.0, 16.0), new VoxelShape[0]);
    }

    public static enum ConnectionStatus implements StringRepresentable {
        BASE("base"),
        TOP("top"),
        MIDDLE("middle"),
        BOTTOM("bottom");

        private final String name;

        private ConnectionStatus(String name) {
            this.name = name;
        }

        public String getSerializedName() {
            return this.name;
        }
    }
}