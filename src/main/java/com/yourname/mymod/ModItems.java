package com.example.quywood.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item QUA_ANH_DAO = new Item(new Item.Settings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("quywood", "qua_anh_dao"), QUA_ANH_DAO);
    }
}
