
package me.tankpillow.toomanydimensions.world.biome;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;

import me.tankpillow.toomanydimensions.ElementsToomanydimensionsMod;

import java.util.Random;

@ElementsToomanydimensionsMod.ModElement.Tag
public class BiomeIronOreBiome extends ElementsToomanydimensionsMod.ModElement {
	@GameRegistry.ObjectHolder("toomanydimensions:iron_ore_biome")
	public static final BiomeGenCustom biome = null;
	public BiomeIronOreBiome(ElementsToomanydimensionsMod instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Iron Ore Biome").setRainfall(0.5F).setBaseHeight(0F).setHeightVariation(0.1F).setTemperature(0.5F));
			setRegistryName("iron_ore_biome");
			topBlock = Blocks.IRON_ORE.getDefaultState();
			fillerBlock = Blocks.IRON_ORE.getDefaultState();
			decorator.treesPerChunk = 3;
			decorator.flowersPerChunk = 4;
			decorator.grassPerChunk = 4;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
