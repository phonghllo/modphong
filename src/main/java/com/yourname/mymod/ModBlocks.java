package com.example.quywood.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.block.MapColor;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.item.ItemStack;

import java.util.List;

import com.example.quywood.item.ModItems;

public class ModBlocks {
    public static final Block GO_QUY = new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(2.0f, 3.0f));

    public static final Block LA_GO_QUY = new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)) {
        @Override
        public List<ItemStack> getDroppedStacks(net.minecraft.block.BlockState state, LootContextParameterSet context) {
            List<ItemStack> drops = super.getDroppedStacks(state, context);
            if (Math.random() < 0.1) {
                drops.add(new ItemStack(ModItems.QUA_ANH_DAO));
            }
            return drops;
        }
    };

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier("quywood", "go_quy"), GO_QUY);
        Registry.register(Registries.ITEM, new Identifier("quywood", "go_quy"), new BlockItem(GO_QUY, new Item.Settings()));

        Registry.register(Registries.BLOCK, new Identifier("quywood", "la_go_quy"), LA_GO_QUY);
        Registry.register(Registries.ITEM, new Identifier("quywood", "la_go_quy"), new BlockItem(LA_GO_QUY, new Item.Settings()));
    }
}
