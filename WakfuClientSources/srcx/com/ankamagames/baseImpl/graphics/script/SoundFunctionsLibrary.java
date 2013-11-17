package com.ankamagames.baseImpl.graphics.script;

import ZG;
import ZI;
import aRn;
import aVB;
import avP;
import cbI;
import com.ankamagames.baseImpl.graphics.script.function.sound.LoopSound;
import com.ankamagames.baseImpl.graphics.script.function.sound.Play3DSound;
import com.ankamagames.baseImpl.graphics.script.function.sound.PlayApsSound;
import com.ankamagames.baseImpl.graphics.script.function.sound.PlayLocalSound;
import com.ankamagames.baseImpl.graphics.script.function.sound.PlayMusic;
import com.ankamagames.baseImpl.graphics.script.function.sound.PlayRandomApsSound;
import com.ankamagames.baseImpl.graphics.script.function.sound.PlayRandomSound;
import com.ankamagames.baseImpl.graphics.script.function.sound.PlaySound;
import com.ankamagames.baseImpl.graphics.script.function.sound.StopMusic;
import com.ankamagames.baseImpl.graphics.script.function.sound.StopSound;
import cuM;
import dDc;
import dsg;
import hQ;
import lD;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class SoundFunctionsLibrary extends hQ
{
  public static Logger K = Logger.getLogger(SoundFunctionsLibrary.class);

  private static final SoundFunctionsLibrary hIe = new SoundFunctionsLibrary();
  private aRn hIf;
  private cuM hIg;
  private dDc hIh = new lD();

  public final String getName()
  {
    return "Sound";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public boolean atb()
  {
    return this.hIf != null;
  }

  public void a(aRn paramaRn) {
    this.hIf = paramaRn;
  }

  public aRn ckG() {
    return this.hIf;
  }

  public cuM ckH() {
    return this.hIg;
  }

  public void a(cuM paramcuM) {
    this.hIg = paramcuM;
  }

  public dDc ckI() {
    return this.hIh;
  }

  public void a(dDc paramdDc) {
    this.hIh = paramdDc;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new PlaySound(paramLuaState), new SetMusicMix(paramLuaState), new ResetMusicMix(paramLuaState), new LoopSound(paramLuaState), new Play3DSound(paramLuaState), new PlayMusic(paramLuaState), new StopMusic(paramLuaState), new PlayRandomSound(paramLuaState), new PlayApsSound(paramLuaState), new PlayRandomApsSound(paramLuaState), new PlayLocalSound(paramLuaState), new StopSound(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  public static SoundFunctionsLibrary ckJ() {
    return hIe;
  }

  public aVB a(long paramLong1, float paramFloat, int paramInt1, long paramLong2, long paramLong3, int paramInt2)
  {
    if (this.hIf != null) {
      return this.hIf.a(paramLong1, paramFloat, paramInt1, paramLong2, paramLong3, paramInt2);
    }
    K.debug("On essaie de jouer un son alors que le son n'est pas initialisé");
    return null;
  }

  public aVB a(long paramLong1, float paramFloat, int paramInt1, long paramLong2, long paramLong3, int paramInt2, cbI paramcbI, int paramInt3)
  {
    return a(paramLong1, paramFloat, paramInt1, paramLong2, paramLong3, paramInt2, paramcbI, paramInt3, true);
  }

  public aVB a(long paramLong1, float paramFloat, int paramInt1, long paramLong2, long paramLong3, int paramInt2, cbI paramcbI, int paramInt3, boolean paramBoolean) {
    if (this.hIf != null) {
      return this.hIf.a(paramLong1, paramFloat, paramInt1, paramLong2, paramLong3, paramInt2, paramcbI, paramInt3, paramBoolean);
    }
    K.debug("On essaie de jouer un son alors que le son n'est pas initialisé");
    return null;
  }

  public ZI n(byte paramByte1, byte paramByte2)
  {
    if ((this.hIf != null) && (this.hIh != null)) {
      return this.hIh.b(paramByte1, paramByte2);
    }
    return null;
  }

  public avP a(int paramInt1, cbI paramcbI, int paramInt2)
  {
    if ((this.hIf != null) && (this.hIg != null)) {
      return this.hIg.b(paramcbI, paramInt1, paramInt2);
    }
    return null;
  }

  public aVB a(int paramInt1, int paramInt2, float paramFloat, cbI paramcbI, int paramInt3)
  {
    if ((this.hIf != null) && (this.hIg != null)) {
      avP localavP = this.hIg.b(paramcbI, paramInt1, paramInt3);
      if (localavP == null) {
        K.debug("Impossible de trouver de BarkData adéquat");
        return null;
      }
      return this.hIf.a(avP.a(localavP), avP.b(localavP) * paramFloat, 1, -1L, -1L, paramInt2, paramcbI, localavP.alv(), true);
    }
    K.debug("On essaie de jouer un son alors que le son n'est pas initialisé");
    return null;
  }

  public void bbc()
  {
    if (this.hIf != null)
      this.hIf.bbc();
    else
      K.debug("appel à resetLinkerMix alors que le son n'est pas initialisé");
  }

  public void G(float paramFloat1, float paramFloat2)
  {
    if (this.hIf != null)
      this.hIf.G(paramFloat1, paramFloat2);
    else
      K.debug("appel à resetLinkerMix alors que le son n'est pas initialisé");
  }

  public void a(long paramLong, ZG paramZG)
  {
    this.hIf.a(paramLong, paramZG);
  }
}