package com.github.speedrunshowdown;

import java.util.HashMap;

import org.bukkit.Material;

public class Constants {
	public static final int ENDER_DRAGON_SUDDEN_DEATH_HEALTH = 50;

    public static final Material[] ITEMS = {
		Material.STONE,
		Material.GRANITE,
		Material.POLISHED_GRANITE,
		Material.DIORITE,
		Material.POLISHED_DIORITE,
		Material.ANDESITE,
		Material.POLISHED_ANDESITE,
		Material.GRASS_BLOCK,
		Material.DIRT,
		Material.COARSE_DIRT,
		Material.PODZOL,
		Material.CRIMSON_NYLIUM,
		Material.WARPED_NYLIUM,
		Material.COBBLESTONE,
		Material.OAK_PLANKS,
		Material.SPRUCE_PLANKS,
		Material.BIRCH_PLANKS,
		Material.JUNGLE_PLANKS,
		Material.ACACIA_PLANKS,
		Material.DARK_OAK_PLANKS,
		Material.CRIMSON_PLANKS,
		Material.WARPED_PLANKS,
		Material.OAK_SAPLING,
		Material.SPRUCE_SAPLING,
		Material.BIRCH_SAPLING,
		Material.JUNGLE_SAPLING,
		Material.ACACIA_SAPLING,
		Material.DARK_OAK_SAPLING,
		// Material.BEDROCK,
		Material.SAND,
		Material.RED_SAND,
		Material.GRAVEL,
		Material.GOLD_ORE,
		Material.IRON_ORE,
		Material.COAL_ORE,
		Material.NETHER_GOLD_ORE,
		Material.OAK_LOG,
		Material.SPRUCE_LOG,
		Material.BIRCH_LOG,
		Material.JUNGLE_LOG,
		Material.ACACIA_LOG,
		Material.DARK_OAK_LOG,
		Material.CRIMSON_STEM,
		Material.WARPED_STEM,
		Material.STRIPPED_OAK_LOG,
		Material.STRIPPED_SPRUCE_LOG,
		Material.STRIPPED_BIRCH_LOG,
		Material.STRIPPED_JUNGLE_LOG,
		Material.STRIPPED_ACACIA_LOG,
		Material.STRIPPED_DARK_OAK_LOG,
		Material.STRIPPED_CRIMSON_STEM,
		Material.STRIPPED_WARPED_STEM,
		Material.STRIPPED_OAK_WOOD,
		Material.STRIPPED_SPRUCE_WOOD,
		Material.STRIPPED_BIRCH_WOOD,
		Material.STRIPPED_JUNGLE_WOOD,
		Material.STRIPPED_ACACIA_WOOD,
		Material.STRIPPED_DARK_OAK_WOOD,
		Material.STRIPPED_CRIMSON_HYPHAE,
		Material.STRIPPED_WARPED_HYPHAE,
		Material.OAK_WOOD,
		Material.SPRUCE_WOOD,
		Material.BIRCH_WOOD,
		Material.JUNGLE_WOOD,
		Material.ACACIA_WOOD,
		Material.DARK_OAK_WOOD,
		Material.CRIMSON_HYPHAE,
		Material.WARPED_HYPHAE,
		Material.OAK_LEAVES,
		Material.SPRUCE_LEAVES,
		Material.BIRCH_LEAVES,
		Material.JUNGLE_LEAVES,
		Material.ACACIA_LEAVES,
		Material.DARK_OAK_LEAVES,
		Material.SPONGE,
		Material.WET_SPONGE,
		Material.GLASS,
		Material.LAPIS_ORE,
		Material.LAPIS_BLOCK,
		Material.DISPENSER,
		Material.SANDSTONE,
		Material.CHISELED_SANDSTONE,
		Material.CUT_SANDSTONE,
		Material.NOTE_BLOCK,
		Material.POWERED_RAIL,
		Material.DETECTOR_RAIL,
		Material.STICKY_PISTON,
		Material.COBWEB,
		Material.GRASS,
		Material.FERN,
		Material.DEAD_BUSH,
		Material.SEAGRASS,
		Material.SEA_PICKLE,
		Material.PISTON,
		Material.WHITE_WOOL,
		Material.ORANGE_WOOL,
		Material.MAGENTA_WOOL,
		Material.LIGHT_BLUE_WOOL,
		Material.YELLOW_WOOL,
		Material.LIME_WOOL,
		Material.PINK_WOOL,
		Material.GRAY_WOOL,
		Material.LIGHT_GRAY_WOOL,
		Material.CYAN_WOOL,
		Material.PURPLE_WOOL,
		Material.BLUE_WOOL,
		Material.BROWN_WOOL,
		Material.GREEN_WOOL,
		Material.RED_WOOL,
		Material.BLACK_WOOL,
		Material.DANDELION,
		Material.POPPY,
		Material.BLUE_ORCHID,
		Material.ALLIUM,
		Material.AZURE_BLUET,
		Material.RED_TULIP,
		Material.ORANGE_TULIP,
		Material.WHITE_TULIP,
		Material.PINK_TULIP,
		Material.OXEYE_DAISY,
		Material.CORNFLOWER,
		Material.LILY_OF_THE_VALLEY,
		Material.WITHER_ROSE,
		Material.BROWN_MUSHROOM,
		Material.RED_MUSHROOM,
		Material.CRIMSON_FUNGUS,
		Material.WARPED_FUNGUS,
		Material.CRIMSON_ROOTS,
		Material.WARPED_ROOTS,
		Material.NETHER_SPROUTS,
		Material.WEEPING_VINES,
		Material.TWISTING_VINES,
		Material.SUGAR_CANE,
		Material.KELP,
		Material.BAMBOO,
		Material.GOLD_BLOCK,
		Material.IRON_BLOCK,
		Material.OAK_SLAB,
		Material.SPRUCE_SLAB,
		Material.BIRCH_SLAB,
		Material.JUNGLE_SLAB,
		Material.ACACIA_SLAB,
		Material.DARK_OAK_SLAB,
		Material.CRIMSON_SLAB,
		Material.WARPED_SLAB,
		Material.STONE_SLAB,
		Material.SMOOTH_STONE_SLAB,
		Material.SANDSTONE_SLAB,
		Material.CUT_SANDSTONE_SLAB,
		Material.PETRIFIED_OAK_SLAB,
		Material.COBBLESTONE_SLAB,
		Material.BRICK_SLAB,
		Material.STONE_BRICK_SLAB,
		Material.NETHER_BRICK_SLAB,
		Material.QUARTZ_SLAB,
		Material.RED_SANDSTONE_SLAB,
		Material.CUT_RED_SANDSTONE_SLAB,
		Material.PURPUR_SLAB,
		Material.PRISMARINE_SLAB,
		Material.PRISMARINE_BRICK_SLAB,
		Material.DARK_PRISMARINE_SLAB,
		Material.SMOOTH_QUARTZ,
		Material.SMOOTH_RED_SANDSTONE,
		Material.SMOOTH_SANDSTONE,
		Material.SMOOTH_STONE,
		Material.BRICKS,
		Material.TNT,
		Material.BOOKSHELF,
		Material.MOSSY_COBBLESTONE,
		Material.OBSIDIAN,
		Material.TORCH,
		Material.END_ROD,
		Material.CHORUS_PLANT,
		Material.CHORUS_FLOWER,
		Material.PURPUR_BLOCK,
		Material.PURPUR_PILLAR,
		Material.PURPUR_STAIRS,
		// Material.SPAWNER,
		Material.OAK_STAIRS,
		Material.CHEST,
		Material.DIAMOND_ORE,
		Material.DIAMOND_BLOCK,
		Material.CRAFTING_TABLE,
		Material.FARMLAND,
		Material.FURNACE,
		Material.LADDER,
		Material.RAIL,
		Material.COBBLESTONE_STAIRS,
		Material.LEVER,
		Material.STONE_PRESSURE_PLATE,
		Material.OAK_PRESSURE_PLATE,
		Material.SPRUCE_PRESSURE_PLATE,
		Material.BIRCH_PRESSURE_PLATE,
		Material.JUNGLE_PRESSURE_PLATE,
		Material.ACACIA_PRESSURE_PLATE,
		Material.DARK_OAK_PRESSURE_PLATE,
		Material.CRIMSON_PRESSURE_PLATE,
		Material.WARPED_PRESSURE_PLATE,
		Material.POLISHED_BLACKSTONE_PRESSURE_PLATE,
		Material.REDSTONE_ORE,
		Material.REDSTONE_TORCH,
		Material.SNOW,
		Material.ICE,
		Material.SNOW_BLOCK,
		Material.CACTUS,
		Material.CLAY,
		Material.JUKEBOX,
		Material.OAK_FENCE,
		Material.SPRUCE_FENCE,
		Material.BIRCH_FENCE,
		Material.JUNGLE_FENCE,
		Material.ACACIA_FENCE,
		Material.DARK_OAK_FENCE,
		Material.CRIMSON_FENCE,
		Material.WARPED_FENCE,
		Material.PUMPKIN,
		Material.CARVED_PUMPKIN,
		Material.NETHERRACK,
		Material.SOUL_SAND,
		Material.SOUL_SOIL,
		Material.BASALT,
		Material.POLISHED_BASALT,
		Material.SOUL_TORCH,
		Material.GLOWSTONE,
		Material.JACK_O_LANTERN,
		Material.OAK_TRAPDOOR,
		Material.SPRUCE_TRAPDOOR,
		Material.BIRCH_TRAPDOOR,
		Material.JUNGLE_TRAPDOOR,
		Material.ACACIA_TRAPDOOR,
		Material.DARK_OAK_TRAPDOOR,
		Material.CRIMSON_TRAPDOOR,
		Material.WARPED_TRAPDOOR,
		// Material.INFESTED_STONE,
		// Material.INFESTED_COBBLESTONE,
		// Material.INFESTED_STONE_BRICKS,
		// Material.INFESTED_MOSSY_STONE_BRICKS,
		// Material.INFESTED_CRACKED_STONE_BRICKS,
		// Material.INFESTED_CHISELED_STONE_BRICKS,
		Material.STONE_BRICKS,
		Material.MOSSY_STONE_BRICKS,
		Material.CRACKED_STONE_BRICKS,
		Material.CHISELED_STONE_BRICKS,
		Material.BROWN_MUSHROOM_BLOCK,
		Material.RED_MUSHROOM_BLOCK,
		Material.MUSHROOM_STEM,
		Material.IRON_BARS,
		Material.CHAIN,
		Material.GLASS_PANE,
		Material.MELON,
		Material.VINE,
		Material.OAK_FENCE_GATE,
		Material.SPRUCE_FENCE_GATE,
		Material.BIRCH_FENCE_GATE,
		Material.JUNGLE_FENCE_GATE,
		Material.ACACIA_FENCE_GATE,
		Material.DARK_OAK_FENCE_GATE,
		Material.CRIMSON_FENCE_GATE,
		Material.WARPED_FENCE_GATE,
		Material.BRICK_STAIRS,
		Material.STONE_BRICK_STAIRS,
		Material.MYCELIUM,
		Material.LILY_PAD,
		Material.NETHER_BRICKS,
		Material.CRACKED_NETHER_BRICKS,
		Material.CHISELED_NETHER_BRICKS,
		Material.NETHER_BRICK_FENCE,
		Material.NETHER_BRICK_STAIRS,
		Material.ENCHANTING_TABLE,
		// Material.END_PORTAL_FRAME,
		Material.END_STONE,
		Material.END_STONE_BRICKS,
		Material.DRAGON_EGG,
		Material.REDSTONE_LAMP,
		Material.SANDSTONE_STAIRS,
		Material.EMERALD_ORE,
		Material.ENDER_CHEST,
		Material.TRIPWIRE_HOOK,
		Material.EMERALD_BLOCK,
		Material.SPRUCE_STAIRS,
		Material.BIRCH_STAIRS,
		Material.JUNGLE_STAIRS,
		Material.CRIMSON_STAIRS,
		Material.WARPED_STAIRS,
		// Material.COMMAND_BLOCK,
		Material.BEACON,
		Material.COBBLESTONE_WALL,
		Material.MOSSY_COBBLESTONE_WALL,
		Material.BRICK_WALL,
		Material.PRISMARINE_WALL,
		Material.RED_SANDSTONE_WALL,
		Material.MOSSY_STONE_BRICK_WALL,
		Material.GRANITE_WALL,
		Material.STONE_BRICK_WALL,
		Material.NETHER_BRICK_WALL,
		Material.ANDESITE_WALL,
		Material.RED_NETHER_BRICK_WALL,
		Material.SANDSTONE_WALL,
		Material.END_STONE_BRICK_WALL,
		Material.DIORITE_WALL,
		Material.BLACKSTONE_WALL,
		Material.POLISHED_BLACKSTONE_WALL,
		Material.POLISHED_BLACKSTONE_BRICK_WALL,
		Material.STONE_BUTTON,
		Material.OAK_BUTTON,
		Material.SPRUCE_BUTTON,
		Material.BIRCH_BUTTON,
		Material.JUNGLE_BUTTON,
		Material.ACACIA_BUTTON,
		Material.DARK_OAK_BUTTON,
		Material.CRIMSON_BUTTON,
		Material.WARPED_BUTTON,
		Material.POLISHED_BLACKSTONE_BUTTON,
		Material.ANVIL,
		Material.CHIPPED_ANVIL,
		Material.DAMAGED_ANVIL,
		Material.TRAPPED_CHEST,
		Material.LIGHT_WEIGHTED_PRESSURE_PLATE,
		Material.HEAVY_WEIGHTED_PRESSURE_PLATE,
		Material.DAYLIGHT_DETECTOR,
		Material.REDSTONE_BLOCK,
		Material.NETHER_QUARTZ_ORE,
		Material.HOPPER,
		Material.CHISELED_QUARTZ_BLOCK,
		Material.QUARTZ_BLOCK,
		Material.QUARTZ_BRICKS,
		Material.QUARTZ_PILLAR,
		Material.QUARTZ_STAIRS,
		Material.ACTIVATOR_RAIL,
		Material.DROPPER,
		Material.WHITE_TERRACOTTA,
		Material.ORANGE_TERRACOTTA,
		Material.MAGENTA_TERRACOTTA,
		Material.LIGHT_BLUE_TERRACOTTA,
		Material.YELLOW_TERRACOTTA,
		Material.LIME_TERRACOTTA,
		Material.PINK_TERRACOTTA,
		Material.GRAY_TERRACOTTA,
		Material.LIGHT_GRAY_TERRACOTTA,
		Material.CYAN_TERRACOTTA,
		Material.PURPLE_TERRACOTTA,
		Material.BLUE_TERRACOTTA,
		Material.BROWN_TERRACOTTA,
		Material.GREEN_TERRACOTTA,
		Material.RED_TERRACOTTA,
		Material.BLACK_TERRACOTTA,
		// Material.BARRIER,
		Material.IRON_TRAPDOOR,
		Material.HAY_BLOCK,
		Material.WHITE_CARPET,
		Material.ORANGE_CARPET,
		Material.MAGENTA_CARPET,
		Material.LIGHT_BLUE_CARPET,
		Material.YELLOW_CARPET,
		Material.LIME_CARPET,
		Material.PINK_CARPET,
		Material.GRAY_CARPET,
		Material.LIGHT_GRAY_CARPET,
		Material.CYAN_CARPET,
		Material.PURPLE_CARPET,
		Material.BLUE_CARPET,
		Material.BROWN_CARPET,
		Material.GREEN_CARPET,
		Material.RED_CARPET,
		Material.BLACK_CARPET,
		Material.TERRACOTTA,
		Material.COAL_BLOCK,
		Material.PACKED_ICE,
		Material.ACACIA_STAIRS,
		Material.DARK_OAK_STAIRS,
		Material.SLIME_BLOCK,
		Material.SUNFLOWER,
		Material.LILAC,
		Material.ROSE_BUSH,
		Material.PEONY,
		Material.TALL_GRASS,
		Material.LARGE_FERN,
		Material.WHITE_STAINED_GLASS,
		Material.ORANGE_STAINED_GLASS,
		Material.MAGENTA_STAINED_GLASS,
		Material.LIGHT_BLUE_STAINED_GLASS,
		Material.YELLOW_STAINED_GLASS,
		Material.LIME_STAINED_GLASS,
		Material.PINK_STAINED_GLASS,
		Material.GRAY_STAINED_GLASS,
		Material.LIGHT_GRAY_STAINED_GLASS,
		Material.CYAN_STAINED_GLASS,
		Material.PURPLE_STAINED_GLASS,
		Material.BLUE_STAINED_GLASS,
		Material.BROWN_STAINED_GLASS,
		Material.GREEN_STAINED_GLASS,
		Material.RED_STAINED_GLASS,
		Material.BLACK_STAINED_GLASS,
		Material.WHITE_STAINED_GLASS_PANE,
		Material.ORANGE_STAINED_GLASS_PANE,
		Material.MAGENTA_STAINED_GLASS_PANE,
		Material.LIGHT_BLUE_STAINED_GLASS_PANE,
		Material.YELLOW_STAINED_GLASS_PANE,
		Material.LIME_STAINED_GLASS_PANE,
		Material.PINK_STAINED_GLASS_PANE,
		Material.GRAY_STAINED_GLASS_PANE,
		Material.LIGHT_GRAY_STAINED_GLASS_PANE,
		Material.CYAN_STAINED_GLASS_PANE,
		Material.PURPLE_STAINED_GLASS_PANE,
		Material.BLUE_STAINED_GLASS_PANE,
		Material.BROWN_STAINED_GLASS_PANE,
		Material.GREEN_STAINED_GLASS_PANE,
		Material.RED_STAINED_GLASS_PANE,
		Material.BLACK_STAINED_GLASS_PANE,
		Material.PRISMARINE,
		Material.PRISMARINE_BRICKS,
		Material.DARK_PRISMARINE,
		Material.PRISMARINE_STAIRS,
		Material.PRISMARINE_BRICK_STAIRS,
		Material.DARK_PRISMARINE_STAIRS,
		Material.SEA_LANTERN,
		Material.RED_SANDSTONE,
		Material.CHISELED_RED_SANDSTONE,
		Material.CUT_RED_SANDSTONE,
		Material.RED_SANDSTONE_STAIRS,
		// Material.REPEATING_COMMAND_BLOCK,
		// Material.CHAIN_COMMAND_BLOCK,
		Material.MAGMA_BLOCK,
		Material.NETHER_WART_BLOCK,
		Material.WARPED_WART_BLOCK,
		Material.RED_NETHER_BRICKS,
		Material.BONE_BLOCK,
		// Material.STRUCTURE_VOID,
		Material.OBSERVER,
		Material.SHULKER_BOX,
		Material.WHITE_SHULKER_BOX,
		Material.ORANGE_SHULKER_BOX,
		Material.MAGENTA_SHULKER_BOX,
		Material.LIGHT_BLUE_SHULKER_BOX,
		Material.YELLOW_SHULKER_BOX,
		Material.LIME_SHULKER_BOX,
		Material.PINK_SHULKER_BOX,
		Material.GRAY_SHULKER_BOX,
		Material.LIGHT_GRAY_SHULKER_BOX,
		Material.CYAN_SHULKER_BOX,
		Material.PURPLE_SHULKER_BOX,
		Material.BLUE_SHULKER_BOX,
		Material.BROWN_SHULKER_BOX,
		Material.GREEN_SHULKER_BOX,
		Material.RED_SHULKER_BOX,
		Material.BLACK_SHULKER_BOX,
		Material.WHITE_GLAZED_TERRACOTTA,
		Material.ORANGE_GLAZED_TERRACOTTA,
		Material.MAGENTA_GLAZED_TERRACOTTA,
		Material.LIGHT_BLUE_GLAZED_TERRACOTTA,
		Material.YELLOW_GLAZED_TERRACOTTA,
		Material.LIME_GLAZED_TERRACOTTA,
		Material.PINK_GLAZED_TERRACOTTA,
		Material.GRAY_GLAZED_TERRACOTTA,
		Material.LIGHT_GRAY_GLAZED_TERRACOTTA,
		Material.CYAN_GLAZED_TERRACOTTA,
		Material.PURPLE_GLAZED_TERRACOTTA,
		Material.BLUE_GLAZED_TERRACOTTA,
		Material.BROWN_GLAZED_TERRACOTTA,
		Material.GREEN_GLAZED_TERRACOTTA,
		Material.RED_GLAZED_TERRACOTTA,
		Material.BLACK_GLAZED_TERRACOTTA,
		Material.WHITE_CONCRETE,
		Material.ORANGE_CONCRETE,
		Material.MAGENTA_CONCRETE,
		Material.LIGHT_BLUE_CONCRETE,
		Material.YELLOW_CONCRETE,
		Material.LIME_CONCRETE,
		Material.PINK_CONCRETE,
		Material.GRAY_CONCRETE,
		Material.LIGHT_GRAY_CONCRETE,
		Material.CYAN_CONCRETE,
		Material.PURPLE_CONCRETE,
		Material.BLUE_CONCRETE,
		Material.BROWN_CONCRETE,
		Material.GREEN_CONCRETE,
		Material.RED_CONCRETE,
		Material.BLACK_CONCRETE,
		Material.WHITE_CONCRETE_POWDER,
		Material.ORANGE_CONCRETE_POWDER,
		Material.MAGENTA_CONCRETE_POWDER,
		Material.LIGHT_BLUE_CONCRETE_POWDER,
		Material.YELLOW_CONCRETE_POWDER,
		Material.LIME_CONCRETE_POWDER,
		Material.PINK_CONCRETE_POWDER,
		Material.GRAY_CONCRETE_POWDER,
		Material.LIGHT_GRAY_CONCRETE_POWDER,
		Material.CYAN_CONCRETE_POWDER,
		Material.PURPLE_CONCRETE_POWDER,
		Material.BLUE_CONCRETE_POWDER,
		Material.BROWN_CONCRETE_POWDER,
		Material.GREEN_CONCRETE_POWDER,
		Material.RED_CONCRETE_POWDER,
		Material.BLACK_CONCRETE_POWDER,
		Material.TURTLE_EGG,
		Material.DEAD_TUBE_CORAL_BLOCK,
		Material.DEAD_BRAIN_CORAL_BLOCK,
		Material.DEAD_BUBBLE_CORAL_BLOCK,
		Material.DEAD_FIRE_CORAL_BLOCK,
		Material.DEAD_HORN_CORAL_BLOCK,
		Material.TUBE_CORAL_BLOCK,
		Material.BRAIN_CORAL_BLOCK,
		Material.BUBBLE_CORAL_BLOCK,
		Material.FIRE_CORAL_BLOCK,
		Material.HORN_CORAL_BLOCK,
		Material.TUBE_CORAL,
		Material.BRAIN_CORAL,
		Material.BUBBLE_CORAL,
		Material.FIRE_CORAL,
		Material.HORN_CORAL,
		Material.DEAD_BRAIN_CORAL,
		Material.DEAD_BUBBLE_CORAL,
		Material.DEAD_FIRE_CORAL,
		Material.DEAD_HORN_CORAL,
		Material.DEAD_TUBE_CORAL,
		Material.TUBE_CORAL_FAN,
		Material.BRAIN_CORAL_FAN,
		Material.BUBBLE_CORAL_FAN,
		Material.FIRE_CORAL_FAN,
		Material.HORN_CORAL_FAN,
		Material.DEAD_TUBE_CORAL_FAN,
		Material.DEAD_BRAIN_CORAL_FAN,
		Material.DEAD_BUBBLE_CORAL_FAN,
		Material.DEAD_FIRE_CORAL_FAN,
		Material.DEAD_HORN_CORAL_FAN,
		Material.BLUE_ICE,
		Material.CONDUIT,
		Material.POLISHED_GRANITE_STAIRS,
		Material.SMOOTH_RED_SANDSTONE_STAIRS,
		Material.MOSSY_STONE_BRICK_STAIRS,
		Material.POLISHED_DIORITE_STAIRS,
		Material.MOSSY_COBBLESTONE_STAIRS,
		Material.END_STONE_BRICK_STAIRS,
		Material.STONE_STAIRS,
		Material.SMOOTH_SANDSTONE_STAIRS,
		Material.SMOOTH_QUARTZ_STAIRS,
		Material.GRANITE_STAIRS,
		Material.ANDESITE_STAIRS,
		Material.RED_NETHER_BRICK_STAIRS,
		Material.POLISHED_ANDESITE_STAIRS,
		Material.DIORITE_STAIRS,
		Material.POLISHED_GRANITE_SLAB,
		Material.SMOOTH_RED_SANDSTONE_SLAB,
		Material.MOSSY_STONE_BRICK_SLAB,
		Material.POLISHED_DIORITE_SLAB,
		Material.MOSSY_COBBLESTONE_SLAB,
		Material.END_STONE_BRICK_SLAB,
		Material.SMOOTH_SANDSTONE_SLAB,
		Material.SMOOTH_QUARTZ_SLAB,
		Material.GRANITE_SLAB,
		Material.ANDESITE_SLAB,
		Material.RED_NETHER_BRICK_SLAB,
		Material.POLISHED_ANDESITE_SLAB,
		Material.DIORITE_SLAB,
		Material.SCAFFOLDING,
		Material.IRON_DOOR,
		Material.OAK_DOOR,
		Material.SPRUCE_DOOR,
		Material.BIRCH_DOOR,
		Material.JUNGLE_DOOR,
		Material.ACACIA_DOOR,
		Material.DARK_OAK_DOOR,
		Material.CRIMSON_DOOR,
		Material.WARPED_DOOR,
		Material.REPEATER,
		Material.COMPARATOR,
		// Material.STRUCTURE_BLOCK,
		// Material.JIGSAW,
		Material.TURTLE_HELMET,
		Material.SCUTE,
		Material.IRON_SHOVEL,
		Material.IRON_PICKAXE,
		Material.IRON_AXE,
		Material.FLINT_AND_STEEL,
		Material.APPLE,
		Material.BOW,
		Material.ARROW,
		Material.COAL,
		Material.CHARCOAL,
		Material.DIAMOND,
		Material.IRON_INGOT,
		Material.GOLD_INGOT,
		Material.NETHERITE_INGOT,
		Material.NETHERITE_SCRAP,
		Material.IRON_SWORD,
		Material.WOODEN_SWORD,
		Material.WOODEN_SHOVEL,
		Material.WOODEN_PICKAXE,
		Material.WOODEN_AXE,
		Material.STONE_SWORD,
		Material.STONE_SHOVEL,
		Material.STONE_PICKAXE,
		Material.STONE_AXE,
		Material.DIAMOND_SWORD,
		Material.DIAMOND_SHOVEL,
		Material.DIAMOND_PICKAXE,
		Material.DIAMOND_AXE,
		Material.STICK,
		Material.BOWL,
		Material.MUSHROOM_STEW,
		Material.GOLDEN_SWORD,
		Material.GOLDEN_SHOVEL,
		Material.GOLDEN_PICKAXE,
		Material.GOLDEN_AXE,
		Material.NETHERITE_SWORD,
		Material.NETHERITE_SHOVEL,
		Material.NETHERITE_PICKAXE,
		Material.NETHERITE_AXE,
		Material.STRING,
		Material.FEATHER,
		Material.GUNPOWDER,
		Material.WOODEN_HOE,
		Material.STONE_HOE,
		Material.IRON_HOE,
		Material.DIAMOND_HOE,
		Material.GOLDEN_HOE,
		Material.NETHERITE_HOE,
		Material.WHEAT_SEEDS,
		Material.WHEAT,
		Material.BREAD,
		Material.LEATHER_HELMET,
		Material.LEATHER_CHESTPLATE,
		Material.LEATHER_LEGGINGS,
		Material.LEATHER_BOOTS,
		Material.CHAINMAIL_HELMET,
		Material.CHAINMAIL_CHESTPLATE,
		Material.CHAINMAIL_LEGGINGS,
		Material.CHAINMAIL_BOOTS,
		Material.IRON_HELMET,
		Material.IRON_CHESTPLATE,
		Material.IRON_LEGGINGS,
		Material.IRON_BOOTS,
		Material.DIAMOND_HELMET,
		Material.DIAMOND_CHESTPLATE,
		Material.DIAMOND_LEGGINGS,
		Material.DIAMOND_BOOTS,
		Material.GOLDEN_HELMET,
		Material.GOLDEN_CHESTPLATE,
		Material.GOLDEN_LEGGINGS,
		Material.GOLDEN_BOOTS,
		Material.NETHERITE_HELMET,
		Material.NETHERITE_CHESTPLATE,
		Material.NETHERITE_LEGGINGS,
		Material.NETHERITE_BOOTS,
		Material.FLINT,
		Material.PORKCHOP,
		Material.COOKED_PORKCHOP,
		Material.PAINTING,
		Material.GOLDEN_APPLE,
		Material.ENCHANTED_GOLDEN_APPLE,
		Material.OAK_SIGN,
		Material.SPRUCE_SIGN,
		Material.BIRCH_SIGN,
		Material.JUNGLE_SIGN,
		Material.ACACIA_SIGN,
		Material.DARK_OAK_SIGN,
		Material.CRIMSON_SIGN,
		Material.WARPED_SIGN,
		Material.BUCKET,
		Material.WATER_BUCKET,
		Material.LAVA_BUCKET,
		Material.MINECART,
		Material.SADDLE,
		Material.REDSTONE,
		Material.SNOWBALL,
		Material.OAK_BOAT,
		Material.LEATHER,
		Material.MILK_BUCKET,
		Material.PUFFERFISH_BUCKET,
		Material.SALMON_BUCKET,
		Material.COD_BUCKET,
		Material.TROPICAL_FISH_BUCKET,
		Material.BRICK,
		Material.CLAY_BALL,
		Material.DRIED_KELP_BLOCK,
		Material.PAPER,
		Material.BOOK,
		Material.SLIME_BALL,
		Material.CHEST_MINECART,
		Material.FURNACE_MINECART,
		Material.EGG,
		Material.COMPASS,
		Material.FISHING_ROD,
		Material.CLOCK,
		Material.GLOWSTONE_DUST,
		Material.COD,
		Material.SALMON,
		Material.TROPICAL_FISH,
		Material.PUFFERFISH,
		Material.COOKED_COD,
		Material.COOKED_SALMON,
		Material.INK_SAC,
		Material.RED_DYE,
		Material.GREEN_DYE,
		Material.COCOA_BEANS,
		Material.LAPIS_LAZULI,
		Material.PURPLE_DYE,
		Material.CYAN_DYE,
		Material.LIGHT_GRAY_DYE,
		Material.GRAY_DYE,
		Material.PINK_DYE,
		Material.LIME_DYE,
		Material.YELLOW_DYE,
		Material.LIGHT_BLUE_DYE,
		Material.MAGENTA_DYE,
		Material.ORANGE_DYE,
		Material.BONE_MEAL,
		Material.BLUE_DYE,
		Material.BROWN_DYE,
		Material.BLACK_DYE,
		Material.WHITE_DYE,
		Material.BONE,
		Material.SUGAR,
		Material.CAKE,
		Material.WHITE_BED,
		Material.ORANGE_BED,
		Material.MAGENTA_BED,
		Material.LIGHT_BLUE_BED,
		Material.YELLOW_BED,
		Material.LIME_BED,
		Material.PINK_BED,
		Material.GRAY_BED,
		Material.LIGHT_GRAY_BED,
		Material.CYAN_BED,
		Material.PURPLE_BED,
		Material.BLUE_BED,
		Material.BROWN_BED,
		Material.GREEN_BED,
		Material.RED_BED,
		Material.BLACK_BED,
		Material.COOKIE,
		Material.FILLED_MAP,
		Material.SHEARS,
		Material.MELON_SLICE,
		Material.DRIED_KELP,
		Material.PUMPKIN_SEEDS,
		Material.MELON_SEEDS,
		Material.BEEF,
		Material.COOKED_BEEF,
		Material.CHICKEN,
		Material.COOKED_CHICKEN,
		Material.ROTTEN_FLESH,
		Material.ENDER_PEARL,
		Material.BLAZE_ROD,
		Material.GHAST_TEAR,
		Material.GOLD_NUGGET,
		Material.NETHER_WART,
		Material.POTION,
		Material.GLASS_BOTTLE,
		Material.SPIDER_EYE,
		Material.FERMENTED_SPIDER_EYE,
		Material.BLAZE_POWDER,
		Material.MAGMA_CREAM,
		Material.BREWING_STAND,
		Material.CAULDRON,
		Material.ENDER_EYE,
		Material.GLISTERING_MELON_SLICE,
		Material.BAT_SPAWN_EGG,
		Material.BEE_SPAWN_EGG,
		Material.BLAZE_SPAWN_EGG,
		Material.CAT_SPAWN_EGG,
		Material.CAVE_SPIDER_SPAWN_EGG,
		Material.CHICKEN_SPAWN_EGG,
		Material.COD_SPAWN_EGG,
		Material.COW_SPAWN_EGG,
		Material.CREEPER_SPAWN_EGG,
		Material.DOLPHIN_SPAWN_EGG,
		Material.DONKEY_SPAWN_EGG,
		Material.DROWNED_SPAWN_EGG,
		Material.ELDER_GUARDIAN_SPAWN_EGG,
		Material.ENDERMAN_SPAWN_EGG,
		Material.ENDERMITE_SPAWN_EGG,
		Material.EVOKER_SPAWN_EGG,
		Material.FOX_SPAWN_EGG,
		Material.GHAST_SPAWN_EGG,
		Material.GUARDIAN_SPAWN_EGG,
		Material.HOGLIN_SPAWN_EGG,
		Material.HORSE_SPAWN_EGG,
		Material.HUSK_SPAWN_EGG,
		Material.LLAMA_SPAWN_EGG,
		Material.MAGMA_CUBE_SPAWN_EGG,
		Material.MOOSHROOM_SPAWN_EGG,
		Material.MULE_SPAWN_EGG,
		Material.OCELOT_SPAWN_EGG,
		Material.PANDA_SPAWN_EGG,
		Material.PARROT_SPAWN_EGG,
		Material.PHANTOM_SPAWN_EGG,
		Material.PIG_SPAWN_EGG,
		Material.PIGLIN_SPAWN_EGG,
		Material.PILLAGER_SPAWN_EGG,
		Material.POLAR_BEAR_SPAWN_EGG,
		Material.PUFFERFISH_SPAWN_EGG,
		Material.RABBIT_SPAWN_EGG,
		Material.RAVAGER_SPAWN_EGG,
		Material.SALMON_SPAWN_EGG,
		Material.SHEEP_SPAWN_EGG,
		Material.SHULKER_SPAWN_EGG,
		Material.SILVERFISH_SPAWN_EGG,
		Material.SKELETON_SPAWN_EGG,
		Material.SKELETON_HORSE_SPAWN_EGG,
		Material.SLIME_SPAWN_EGG,
		Material.SPIDER_SPAWN_EGG,
		Material.SQUID_SPAWN_EGG,
		Material.STRAY_SPAWN_EGG,
		Material.STRIDER_SPAWN_EGG,
		Material.TRADER_LLAMA_SPAWN_EGG,
		Material.TROPICAL_FISH_SPAWN_EGG,
		Material.TURTLE_SPAWN_EGG,
		Material.VEX_SPAWN_EGG,
		Material.VILLAGER_SPAWN_EGG,
		Material.VINDICATOR_SPAWN_EGG,
		Material.WANDERING_TRADER_SPAWN_EGG,
		Material.WITCH_SPAWN_EGG,
		Material.WITHER_SKELETON_SPAWN_EGG,
		Material.WOLF_SPAWN_EGG,
		Material.ZOGLIN_SPAWN_EGG,
		Material.ZOMBIE_SPAWN_EGG,
		Material.ZOMBIE_HORSE_SPAWN_EGG,
		Material.ZOMBIE_VILLAGER_SPAWN_EGG,
		Material.ZOMBIFIED_PIGLIN_SPAWN_EGG,
		Material.EXPERIENCE_BOTTLE,
		Material.FIRE_CHARGE,
		Material.WRITABLE_BOOK,
		Material.WRITTEN_BOOK,
		Material.EMERALD,
		Material.ITEM_FRAME,
		Material.FLOWER_POT,
		Material.CARROT,
		Material.POTATO,
		Material.BAKED_POTATO,
		Material.POISONOUS_POTATO,
		Material.MAP,
		Material.GOLDEN_CARROT,
		Material.SKELETON_SKULL,
		Material.WITHER_SKELETON_SKULL,
		Material.PLAYER_HEAD,
		Material.ZOMBIE_HEAD,
		Material.CREEPER_HEAD,
		Material.DRAGON_HEAD,
		Material.CARROT_ON_A_STICK,
		Material.WARPED_FUNGUS_ON_A_STICK,
		Material.NETHER_STAR,
		Material.PUMPKIN_PIE,
		Material.FIREWORK_ROCKET,
		Material.FIREWORK_STAR,
		Material.ENCHANTED_BOOK,
		Material.NETHER_BRICK,
		Material.QUARTZ,
		Material.TNT_MINECART,
		Material.HOPPER_MINECART,
		Material.PRISMARINE_SHARD,
		Material.PRISMARINE_CRYSTALS,
		Material.RABBIT,
		Material.COOKED_RABBIT,
		Material.RABBIT_STEW,
		Material.RABBIT_FOOT,
		Material.RABBIT_HIDE,
		Material.ARMOR_STAND,
		Material.IRON_HORSE_ARMOR,
		Material.GOLDEN_HORSE_ARMOR,
		Material.DIAMOND_HORSE_ARMOR,
		Material.LEATHER_HORSE_ARMOR,
		Material.LEAD,
		Material.NAME_TAG,
		// Material.COMMAND_BLOCK_MINECART,
		Material.MUTTON,
		Material.COOKED_MUTTON,
		Material.WHITE_BANNER,
		Material.ORANGE_BANNER,
		Material.MAGENTA_BANNER,
		Material.LIGHT_BLUE_BANNER,
		Material.YELLOW_BANNER,
		Material.LIME_BANNER,
		Material.PINK_BANNER,
		Material.GRAY_BANNER,
		Material.LIGHT_GRAY_BANNER,
		Material.CYAN_BANNER,
		Material.PURPLE_BANNER,
		Material.BLUE_BANNER,
		Material.BROWN_BANNER,
		Material.GREEN_BANNER,
		Material.RED_BANNER,
		Material.BLACK_BANNER,
		Material.END_CRYSTAL,
		Material.CHORUS_FRUIT,
		Material.POPPED_CHORUS_FRUIT,
		Material.BEETROOT,
		Material.BEETROOT_SEEDS,
		Material.BEETROOT_SOUP,
		Material.DRAGON_BREATH,
		Material.SPLASH_POTION,
		Material.SPECTRAL_ARROW,
		Material.TIPPED_ARROW,
		Material.LINGERING_POTION,
		Material.SHIELD,
		Material.ELYTRA,
		Material.SPRUCE_BOAT,
		Material.BIRCH_BOAT,
		Material.JUNGLE_BOAT,
		Material.ACACIA_BOAT,
		Material.DARK_OAK_BOAT,
		Material.TOTEM_OF_UNDYING,
		Material.SHULKER_SHELL,
		Material.IRON_NUGGET,
		Material.KNOWLEDGE_BOOK,
		// Material.DEBUG_STICK,
		Material.MUSIC_DISC_13,
		Material.MUSIC_DISC_CAT,
		Material.MUSIC_DISC_BLOCKS,
		Material.MUSIC_DISC_CHIRP,
		Material.MUSIC_DISC_FAR,
		Material.MUSIC_DISC_MALL,
		Material.MUSIC_DISC_MELLOHI,
		Material.MUSIC_DISC_STAL,
		Material.MUSIC_DISC_STRAD,
		Material.MUSIC_DISC_WARD,
		Material.MUSIC_DISC_11,
		Material.MUSIC_DISC_WAIT,
		Material.MUSIC_DISC_PIGSTEP,
		Material.TRIDENT,
		Material.PHANTOM_MEMBRANE,
		Material.NAUTILUS_SHELL,
		Material.HEART_OF_THE_SEA,
		Material.CROSSBOW,
		Material.SUSPICIOUS_STEW,
		Material.LOOM,
		Material.FLOWER_BANNER_PATTERN,
		Material.CREEPER_BANNER_PATTERN,
		Material.SKULL_BANNER_PATTERN,
		Material.MOJANG_BANNER_PATTERN,
		Material.GLOBE_BANNER_PATTERN,
		Material.PIGLIN_BANNER_PATTERN,
		Material.COMPOSTER,
		Material.BARREL,
		Material.SMOKER,
		Material.BLAST_FURNACE,
		Material.CARTOGRAPHY_TABLE,
		Material.FLETCHING_TABLE,
		Material.GRINDSTONE,
		Material.LECTERN,
		Material.SMITHING_TABLE,
		Material.STONECUTTER,
		Material.BELL,
		Material.LANTERN,
		Material.SOUL_LANTERN,
		Material.SWEET_BERRIES,
		Material.CAMPFIRE,
		Material.SOUL_CAMPFIRE,
		Material.SHROOMLIGHT,
		Material.HONEYCOMB,
		Material.BEE_NEST,
		Material.BEEHIVE,
		Material.HONEY_BOTTLE,
		Material.HONEY_BLOCK,
		Material.HONEYCOMB_BLOCK,
		Material.LODESTONE,
		Material.NETHERITE_BLOCK,
		Material.ANCIENT_DEBRIS,
		Material.TARGET,
		Material.CRYING_OBSIDIAN,
		Material.BLACKSTONE,
		Material.BLACKSTONE_SLAB,
		Material.BLACKSTONE_STAIRS,
		Material.GILDED_BLACKSTONE,
		Material.POLISHED_BLACKSTONE,
		Material.POLISHED_BLACKSTONE_SLAB,
		Material.POLISHED_BLACKSTONE_STAIRS,
		Material.CHISELED_POLISHED_BLACKSTONE,
		Material.POLISHED_BLACKSTONE_BRICKS,
		Material.POLISHED_BLACKSTONE_BRICK_SLAB,
		Material.POLISHED_BLACKSTONE_BRICK_STAIRS,
		Material.CRACKED_POLISHED_BLACKSTONE_BRICKS,
		Material.RESPAWN_ANCHOR
    };

    public static final Material[] PERSISTENT_TOOLS = {
		Material.WOODEN_PICKAXE,
		Material.WOODEN_AXE,
		Material.WOODEN_SHOVEL,
		Material.WOODEN_HOE,
		Material.WOODEN_SWORD,
		Material.STONE_PICKAXE,
		Material.STONE_AXE,
		Material.STONE_SHOVEL,
		Material.STONE_HOE,
		Material.STONE_SWORD,
		Material.IRON_PICKAXE,
		Material.IRON_AXE,
		Material.IRON_SHOVEL,
		Material.IRON_HOE,
		Material.IRON_SWORD,
		Material.GOLDEN_PICKAXE,
		Material.GOLDEN_AXE,
		Material.GOLDEN_SHOVEL,
		Material.GOLDEN_HOE,
		Material.GOLDEN_SWORD,
		Material.DIAMOND_PICKAXE,
		Material.DIAMOND_AXE,
		Material.DIAMOND_SHOVEL,
		Material.DIAMOND_HOE,
		Material.DIAMOND_SWORD,
		Material.NETHERITE_PICKAXE,
		Material.NETHERITE_AXE,
		Material.NETHERITE_SHOVEL,
		Material.NETHERITE_HOE,
		Material.NETHERITE_SWORD,
		Material.SHIELD,
		Material.BOW,
		Material.CROSSBOW,
		Material.FLINT_AND_STEEL,
		Material.TRIDENT,
		Material.SHEARS,
		Material.FISHING_ROD,
	};

    public static final Material[] EFFICIENT_TOOLS = {
		Material.WOODEN_PICKAXE,
		Material.WOODEN_AXE,
		Material.WOODEN_SHOVEL,
		Material.WOODEN_HOE,
		Material.STONE_PICKAXE,
		Material.STONE_AXE,
		Material.STONE_SHOVEL,
		Material.STONE_HOE,
		Material.IRON_PICKAXE,
		Material.IRON_AXE,
		Material.IRON_SHOVEL,
		Material.IRON_HOE,
		Material.GOLDEN_PICKAXE,
		Material.GOLDEN_AXE,
		Material.GOLDEN_SHOVEL,
		Material.GOLDEN_HOE,
		Material.DIAMOND_PICKAXE,
		Material.DIAMOND_AXE,
		Material.DIAMOND_SHOVEL,
		Material.DIAMOND_HOE,
		Material.NETHERITE_PICKAXE,
		Material.NETHERITE_AXE,
		Material.NETHERITE_SHOVEL,
		Material.NETHERITE_HOE,
	};

	public static final Material[] BEDS = {
		Material.WHITE_BED,
		Material.ORANGE_BED,
		Material.MAGENTA_BED,
		Material.LIGHT_BLUE_BED,
		Material.YELLOW_BED,
		Material.LIME_BED,
		Material.PINK_BED,
		Material.GRAY_BED,
		Material.LIGHT_GRAY_BED,
		Material.CYAN_BED,
		Material.PURPLE_BED,
		Material.BLUE_BED,
		Material.BROWN_BED,
		Material.GREEN_BED,
		Material.RED_BED,
		Material.BLACK_BED
	};

	public static final HashMap<Material, Material> FOOD_RECIPES;
	static {
		FOOD_RECIPES = new HashMap<>();
		FOOD_RECIPES.put(Material.BEEF, Material.COOKED_BEEF);
		FOOD_RECIPES.put(Material.PORKCHOP, Material.COOKED_PORKCHOP);
		FOOD_RECIPES.put(Material.MUTTON, Material.COOKED_MUTTON);
		FOOD_RECIPES.put(Material.CHICKEN, Material.COOKED_CHICKEN);
		FOOD_RECIPES.put(Material.RABBIT, Material.COOKED_RABBIT);
		FOOD_RECIPES.put(Material.COD, Material.COOKED_COD);
		FOOD_RECIPES.put(Material.SALMON, Material.COOKED_SALMON);
	}
}