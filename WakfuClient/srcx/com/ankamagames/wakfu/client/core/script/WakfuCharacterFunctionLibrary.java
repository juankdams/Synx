package com.ankamagames.wakfu.client.core.script;

import bYE;
import bxT;
import dsg;
import hQ;
import org.keplerproject.luajava.LuaState;

public class WakfuCharacterFunctionLibrary extends hQ
{
  private static final bYE[] egs = { new bYE("mobileId", null, bxT.giY, false), new bYE("fromMobileId", null, bxT.giY, false) };

  private static final bYE[] egt = { new bYE("mobileId", "Id du personage", bxT.giY, false), new bYE("spriteName", "Nom de Gfx", bxT.giZ, false), new bYE("worldX", "Position x", bxT.gja, false), new bYE("worldY", "Position y", bxT.gja, false), new bYE("altitude", "Position z", bxT.gja, false), new bYE("availableDirection", "nb de directions autorisés pour les déplacements", bxT.gja, true), new bYE("setId", "Id de panoplie équipé", bxT.gja, true) };

  private static final bYE[] egu = { new bYE("mobileId", null, bxT.giY, false), new bYE("height", null, bxT.gja, false) };

  private static final bYE[] egv = { new bYE("mobileId", "Id du personnage", bxT.giY, false) };

  private static final bYE[] egw = { new bYE("characterId", "Id du personnage", bxT.giY, false), new bYE("numero du layer", "Nouveau plan", bxT.gja, false) };

  private static final bYE[] egx = { new bYE("characterId", "Id du personnage", bxT.giY, false) };

  private static final bYE[] egy = { new bYE("mobileId", "Id du personnage", bxT.giY, false) };

  private static final bYE[] egz = { new bYE("sex", "Genre du personnage (0 = MALE, 1 = FEMALE)", bxT.gja, false) };

  private static final bYE[] egA = { new bYE("mobileId", null, bxT.giY, false), new bYE("source", null, bxT.giZ, false), new bYE("partNames", null, bxT.gje, true) };

  private static final bYE[] egB = { new bYE("mobileId", null, bxT.giY, false), new bYE("skinId", null, bxT.giZ, false), new bYE("callback", null, bxT.giZ, true), new bYE("args", null, bxT.gje, true) };

  private static final bYE[] egC = { new bYE("mobileId", null, bxT.giY, false), new bYE("source", null, bxT.giZ, false), new bYE("partNames", null, bxT.gje, true) };

  private static final bYE[] egD = { new bYE("characterId", null, bxT.giY, false) };

  private static final bYE[] egE = { new bYE("weaponTypeId", null, bxT.gja, false) };

  private static final bYE[] egF = { new bYE("characterId", null, bxT.giY, false) };

  private static final bYE[] egG = { new bYE("handsOccuped", null, bxT.gja, false) };

  private static final bYE[] egH = { new bYE("srcId", null, bxT.giY, false), new bYE("destId", null, bxT.giY, false) };

  private static final WakfuCharacterFunctionLibrary egI = new WakfuCharacterFunctionLibrary();

  public final String getName()
  {
    return "Actor";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public static WakfuCharacterFunctionLibrary aUc()
  {
    return egI;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new WakfuCharacterFunctionLibrary.ApplyColorFrom(paramLuaState), new WakfuCharacterFunctionLibrary.CreateActor(paramLuaState), new WakfuCharacterFunctionLibrary.DeleteActor(paramLuaState), new WakfuCharacterFunctionLibrary.SetActorHeight(paramLuaState), new WakfuCharacterFunctionLibrary.StopMovingActor(paramLuaState), new WakfuCharacterFunctionLibrary.GetSex(paramLuaState), new WakfuCharacterFunctionLibrary.ChangeActorDefaultDeltaZ(paramLuaState), new WakfuCharacterFunctionLibrary.ApplyParts(paramLuaState), new WakfuCharacterFunctionLibrary.ChangeSkin(paramLuaState), new WakfuCharacterFunctionLibrary.Equip(paramLuaState), new WakfuCharacterFunctionLibrary.GetEquippedWeaponType(paramLuaState), new WakfuCharacterFunctionLibrary.GetHandsOccupedByWeapon(paramLuaState), new WakfuCharacterFunctionLibrary.CopyActorFrom(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }
}