package com.dreammaster.gthandler;

import gregtech.api.interfaces.IItemContainer;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static gregtech.api.enums.GT_Values.W;

public enum CustomItemList implements IItemContainer
{
	//TODO: Cross reference @ItemList.java and remove enums below so the mod can actually register items again.
	Casing_Pyrolyse,
	WetTransformer_LV_ULV, WetTransformer_MV_LV, WetTransformer_HV_MV, WetTransformer_EV_HV, WetTransformer_IV_EV, WetTransformer_LuV_IV,
	BatteryHull_EV, BatteryHull_IV,
	BatteryHull_EV_Full, BatteryHull_IV_Full,

	//CoreModItems
	SteelBars, AluminiumBars, StainlessSteelBars, TungstenBars, TungstenSteelBars, IridiumBars, OsmiumBars, ChromeBars, TitaniumBars, NeutroniumBars,
	RedstoneAlloyBars, ElectricalSteelBars, ConductiveIronBars, EnergeticAlloyBars, VibrantAlloyBars, PulsatingIronBars, SoulariumBars, EnderiumBaseBars, EnderiumBars,
	PistonBlock, PistonPlate,ReinforcedGlassLense, ReinforcedGlassPLate,
    IridiumAlloyItemCasing,
	NagaScaleChip, NagaScaleFragment, LichBoneChip, LichBoneFragment, LichBone, FieryBloodDrop, CarminiteChip, CarminiteFragment, SnowQueenBloodDrop, SnowQueenBlood, NetherStarFragment,
	MarshmallowForm, MarshmallowFormMold, UncookedSlush, MalformedSlush, GlowingMarshmallow, Marshmallow,
	IchoriumCap,
	WetTofu,
	WeakOrb, ApprenticeOrb, MasterOrb, MagicianOrb, ArchmageOrb, TranscendentOrb, RawOrbTier1, RawOrbTier2, RawOrbTier3, RawOrbTier4, RawOrbTier5, RawOrbTier6,
	ArcaneSlate,
	TeleposerFrame,
	WoodenCasing,
	IndustryFrame,
	VoidSeed,MicaBasedPulp,MicaBasedSheet,MicaInsulatorSheet,MicaInsulatorFoil,AluminoSilicateWool,
	HotNetherrackBrick, InfernalBrick, AdvancedCokeOvenBrick, AdvancedCokeOvenBrickDust, CokeOvenBrick, CokeOvenBrickDust,
	MedalDerp,MedalGTExplosion,MedalBuilder,MedalEngineer,MedalWarp,
	MaceratedPlantmass, BedrockiumPlate, EngineCore, AlumiteDust,
	nameRemover, TwilightCrystal, UnfiredClayBrick, UnfiredSearedBrick, UnfiredCokeOvenBrick, UnfiredSlimeSoulBrick, RawLapotronCrystal, LapotronDust, SandDust,
	AluminiumIronPlate, ReinforcedAluminiumIronPlate, IrradiantReinforcedAluminiumPlate, IrradiantReinforcedTitaniumPlate, IrradiantReinforcedTungstenPlate, IrradiantReinforcedTungstenSteelPlate, IrradiantReinforcedChromePlate, IrradiantReinforcedNaquadriaPlate, IrradiantReinforcedNeutroniumPlate, IrradiantReinforcedBedrockiumPlate,
	PrimordialPearlFragment, SandStoneRod,
	TheBigEgg, MutatedEgg, DraconiumEgg, EnderEgg,
	ChargedCertusQuartzDust,
//	RawNeutronium,
	NeutronReflectorSmallParts, NeutronReflectorParts, Empty180SpCell, Empty360SpCell, Empty540SpCell, Empty1080SpCell,
	ArtificialLeather,
	EctoplasmaChip, EctoplasmaFragment, ArcaneShardChip, ArcaneShardFragment,
	RuneOfPowerFragment, RuneOfAgilityFragment, RuneOfVigorFragment, RuneOfDefenseFragment, RuneOfMagicFragment, RuneOfVoidFragment,
	Display;


	private ItemStack mStack;
	private boolean mHasNotBeenSet = true;

	//public static Fluid sOilExtraHeavy, sOilHeavy, sOilMedium, sOilLight, sNaturalGas;

	@Override
	public IItemContainer set(Item aItem) {
		mHasNotBeenSet = false;
		if (aItem == null) {
            return this;
        }
		ItemStack aStack = new ItemStack(aItem, 1, 0);
		mStack = GT_Utility.copyAmount(1, aStack);
		return this;
	}

	@Override
	public IItemContainer set(ItemStack aStack) {
		mHasNotBeenSet = false;
		mStack = GT_Utility.copyAmount(1, aStack);
		return this;
	}

	@Override
	public Item getItem() {
		if (mHasNotBeenSet) {
            throw new IllegalAccessError("The Enum '" + name() + "' has not been set to an Item at this time!");
        }
		if (GT_Utility.isStackInvalid(mStack)) {
            return null;
        }
		return mStack.getItem();
	}

	@Override
	public Block getBlock() {
		if (mHasNotBeenSet) {
            throw new IllegalAccessError("The Enum '" + name() + "' has not been set to an Item at this time!");
        }
		return GT_Utility.getBlockFromItem(getItem());
	}

	@Override
	public final boolean hasBeenSet() {
		return !mHasNotBeenSet;
	}

	@Override
	public boolean isStackEqual(Object aStack) {
		return isStackEqual(aStack, false, false);
	}

	@Override
	public boolean isStackEqual(Object aStack, boolean aWildcard, boolean aIgnoreNBT) {
		return !GT_Utility.isStackInvalid(aStack) && GT_Utility.areUnificationsEqual((ItemStack) aStack, aWildcard ? getWildcard(1) : get(1), aIgnoreNBT);
	}

	@Override
	public ItemStack get(long aAmount, Object... aReplacements) {
		if (mHasNotBeenSet) {
            throw new IllegalAccessError("The Enum '" + name() + "' has not been set to an Item at this time!");
        }
		if (GT_Utility.isStackInvalid(mStack)) {
            return GT_Utility.copyAmount(aAmount, aReplacements);
        }
		return GT_Utility.copyAmount(aAmount, GT_OreDictUnificator.get(mStack));
	}

	@Override
	public ItemStack getWildcard(long aAmount, Object... aReplacements) {
		if (mHasNotBeenSet) {
            throw new IllegalAccessError("The Enum '" + name() + "' has not been set to an Item at this time!");
        }
		if (GT_Utility.isStackInvalid(mStack)) {
            return GT_Utility.copyAmount(aAmount, aReplacements);
        }
		return GT_Utility.copyAmountAndMetaData(aAmount, W, GT_OreDictUnificator.get(mStack));
	}

	@Override
	public ItemStack getUndamaged(long aAmount, Object... aReplacements) {
		if (mHasNotBeenSet) {
            throw new IllegalAccessError("The Enum '" + name() + "' has not been set to an Item at this time!");
        }
		if (GT_Utility.isStackInvalid(mStack)) {
            return GT_Utility.copyAmount(aAmount, aReplacements);
        }
		return GT_Utility.copyAmountAndMetaData(aAmount, 0, GT_OreDictUnificator.get(mStack));
	}

	@Override
	public ItemStack getAlmostBroken(long aAmount, Object... aReplacements) {
		if (mHasNotBeenSet) {
            throw new IllegalAccessError("The Enum '" + name() + "' has not been set to an Item at this time!");
        }
		if (GT_Utility.isStackInvalid(mStack)) {
            return GT_Utility.copyAmount(aAmount, aReplacements);
        }
		return GT_Utility.copyAmountAndMetaData(aAmount, mStack.getMaxDamage() - 1, GT_OreDictUnificator.get(mStack));
	}

	@Override
	public ItemStack getWithName(long aAmount, String aDisplayName, Object... aReplacements) {
		ItemStack rStack = get(1, aReplacements);
		if (GT_Utility.isStackInvalid(rStack)) {
            return null;
        }
		rStack.setStackDisplayName(aDisplayName);
		return GT_Utility.copyAmount(aAmount, rStack);
	}

	@Override
	public ItemStack getWithCharge(long aAmount, int aEnergy, Object... aReplacements) {
		ItemStack rStack = get(1, aReplacements);
		if (GT_Utility.isStackInvalid(rStack)) {
            return null;
        }
		GT_ModHandler.chargeElectricItem(rStack, aEnergy, Integer.MAX_VALUE, true, false);
		return GT_Utility.copyAmount(aAmount, rStack);
	}

	@Override
	public ItemStack getWithDamage(long aAmount, long aMetaValue, Object... aReplacements) {
		if (mHasNotBeenSet) {
            throw new IllegalAccessError("The Enum '" + name() + "' has not been set to an Item at this time!");
        }
		if (GT_Utility.isStackInvalid(mStack)) {
            return GT_Utility.copyAmount(aAmount, aReplacements);
        }
		return GT_Utility.copyAmountAndMetaData(aAmount, aMetaValue, GT_OreDictUnificator.get(mStack));
	}

	@Override
	public IItemContainer registerOre(Object... aOreNames) {
		if (mHasNotBeenSet) {
            throw new IllegalAccessError("The Enum '" + name() + "' has not been set to an Item at this time!");
        }
		for (Object tOreName : aOreNames) {
            GT_OreDictUnificator.registerOre(tOreName, get(1));
        }
		return this;
	}

	@Override
	public IItemContainer registerWildcardAsOre(Object... aOreNames) {
		if (mHasNotBeenSet) {
            throw new IllegalAccessError("The Enum '" + name() + "' has not been set to an Item at this time!");
        }
		for (Object tOreName : aOreNames) {
            GT_OreDictUnificator.registerOre(tOreName, getWildcard(1));
        }
		return this;
	}


}
