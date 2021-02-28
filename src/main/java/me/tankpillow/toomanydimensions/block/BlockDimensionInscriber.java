
package me.tankpillow.toomanydimensions.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import me.tankpillow.toomanydimensions.procedure.ProcedureDimensionInscriberOnBlockRightClicked;
import me.tankpillow.toomanydimensions.ElementsToomanydimensionsMod;

import java.util.Map;
import java.util.HashMap;

@ElementsToomanydimensionsMod.ModElement.Tag
public class BlockDimensionInscriber extends ElementsToomanydimensionsMod.ModElement {
	@GameRegistry.ObjectHolder("toomanydimensions:dimension_inscriber")
	public static final Block block = null;
	public BlockDimensionInscriber(ElementsToomanydimensionsMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("dimension_inscriber"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("toomanydimensions:dimension_inscriber", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("dimension_inscriber");
			setSoundType(SoundType.METAL);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction,
				float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				ProcedureDimensionInscriberOnBlockRightClicked.executeProcedure($_dependencies);
			}
			return true;
		}
	}
}
