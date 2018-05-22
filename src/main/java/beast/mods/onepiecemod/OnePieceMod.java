package src.main.java.beast.mods.onepiecemod;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import src.main.java.beast.mods.onepiecemod.Items.*;


@Mod(modid = "bopm", name = "Beast's One Piece Mod", version = "1.0.1")
public class OnePieceMod {


    private static Item itemMera;



    private static final Item.ToolMaterial KikokuToolMaterial = EnumHelper.addToolMaterial("KikokuToolMaterial", 5, 1300, 13.0F, 5.0F, 30);


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Item/Block init and registry
        //Config handling
        Item itemYami = new ItemFood(20, 1.0F, false).setUnlocalizedName("ItemYami").setTextureName("bopm:itemyami").setCreativeTab(tabFruits);
        Item itemKikoku = new ItemKikoku(KikokuToolMaterial).setUnlocalizedName("ItemKikoku").setTextureName("bopm:itemkikoku");
        itemMera = new ItemMera().setUnlocalizedName("ItemMera").setTextureName("bopm:itemmera").setCreativeTab(tabFruits);
        Item itemGomu = new ItemFood(20, 1.0F, false).setUnlocalizedName("ItemGomu").setTextureName("bopm:itemgomu").setCreativeTab(tabFruits);
        Item itemDev = new ItemFood(20, 1.0F, false).setUnlocalizedName("ItemDev").setTextureName("bopm:itemyami").setCreativeTab(tabFruits);


        GameRegistry.registerItem(itemYami, itemYami.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemKikoku, itemKikoku.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemMera, itemMera.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemGomu, itemGomu.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(itemDev, itemDev.getUnlocalizedName().substring(5));
    }

    @EventHandler
    public void init(FMLInitializationEvent evemt) {
        //Proxy, TileEntity, enity, GUI, and packet registering

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    private static CreativeTabs tabFruits = new CreativeTabs("tabFruits") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(itemMera).getItem();
        }
    };
}