package blazecraft.mod.util.handlers;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber
public class CommonProxy {

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
	registerRender(MainRegistry.BlazeSword);
	registerRender(MainRegistry.ItemCumball);
	}
	
	private static void registerRender(Item item) 
	{
	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) 
	{
	event.getRegistry().registerAll(MainRegistry.BlazeSword);
	event.getRegistry().registerAll(MainRegistry.ItemCumball);
	}
	
public static void preInitRegistries() {

}
}



