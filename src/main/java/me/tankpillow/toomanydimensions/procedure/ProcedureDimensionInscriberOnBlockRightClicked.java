package me.tankpillow.toomanydimensions.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import me.tankpillow.toomanydimensions.gui.GuiDimensionsInscriberGUI;
import me.tankpillow.toomanydimensions.ToomanydimensionsMod;
import me.tankpillow.toomanydimensions.ElementsToomanydimensionsMod;

import java.util.Map;

@ElementsToomanydimensionsMod.ModElement.Tag
public class ProcedureDimensionInscriberOnBlockRightClicked extends ElementsToomanydimensionsMod.ModElement {
	public ProcedureDimensionInscriberOnBlockRightClicked(ElementsToomanydimensionsMod instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DimensionInscriberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure DimensionInscriberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure DimensionInscriberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure DimensionInscriberOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure DimensionInscriberOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(ToomanydimensionsMod.instance, GuiDimensionsInscriberGUI.GUIID, world, x, y, z);
	}
}
