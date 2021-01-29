package blazecraft.mod;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "blazecraft";
    public static final String NAME = "Blazecraft";
    public static final String VERSION = "0.1";


    public static ToolMaterial BlazeSwordMat;
    public static Item BlazeSword;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        BlazeSwordMat = EnumHelper.addToolMaterial("MATERIAL NAME", 4, 500, 3F, 10.0F, 30);
        BlazeSword = new CustomSword(BlazeSwordMat);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
    }
}