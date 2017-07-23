package rustic.common.crafting;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionUtils;
import rustic.common.items.ModItems;
import rustic.common.util.ElixirUtils;

public class BasicCondenserRecipe extends CondenserRecipe {

	public BasicCondenserRecipe(ItemStack output, ItemStack input1, ItemStack input2) {
		this.output = output;
		this.inputs = new ArrayList<ItemStack>();
		this.inputs.add(input1);
		this.inputs.add(input2);
	}
	
	public BasicCondenserRecipe(PotionEffect effect, ItemStack input1, ItemStack input2) {
		this.output = new ItemStack(ModItems.ELIXIR);
		ElixirUtils.addEffect(effect, this.output);
		this.inputs = new ArrayList<ItemStack>();
		this.inputs.add(input1);
		this.inputs.add(input2);
	}
	
	@Override
	public boolean matches(ItemStack mod, ItemStack[] stacks) {
		if ((!mod.isEmpty())) {
			return false;
		}
		return super.matches(mod, stacks);
	}
	
}
