package com.example.myquywoodmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.MapColor;
import net.minecraft.block.AbstractBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GO_QUY = new Block(
        AbstractBlock.Settings.create()
            .mapColor(MapColor.OAK_TAN)
            .strength(2.0f, 3.0f)
    );

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier("quywood", "go_quy"), GO_QUY);
    }
}
