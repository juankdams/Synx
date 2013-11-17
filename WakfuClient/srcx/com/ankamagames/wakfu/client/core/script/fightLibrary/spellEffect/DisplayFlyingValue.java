package com.ankamagames.wakfu.client.core.script.fightLibrary.spellEffect;

import CG;
import F;
import Su;
import aCF;
import aQq;
import aZI;
import adF;
import arl;
import ary;
import awH;
import b;
import bCO;
import bU;
import bWF;
import bXU;
import bYE;
import bZG;
import bbR;
import bqk;
import bvk;
import bxT;
import byv;
import byz;
import cBQ;
import cDA;
import cNO;
import cWS;
import cYk;
import cew;
import cfY;
import cjS;
import ckT;
import cof;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import cpa;
import cqz;
import dOc;
import dUw;
import dVG;
import dbI;
import dbK;
import dfj;
import dhJ;
import dmM;
import doA;
import doc;
import mu;
import org.keplerproject.luajava.LuaState;
import vJ;
import vk;
import zu;

final class DisplayFlyingValue extends SpellEffectActionFunction
{
  private static final String NAME = "displayFlyingValue";
  private static final String Vu = "Affiche un visuel correspondant a l'effet (valeur au dessus de la cible, gfx de l'etat correspondant...)";
  private static final bYE[] Rf = { new bYE("R", null, bxT.gjb, false), new bYE("G", null, bxT.gjb, false), new bYE("B", null, bxT.gjb, false), new bYE("font", null, bxT.giZ, false), new bYE("suffix", null, bxT.giZ, false), new bYE("negatesValue", null, bxT.gjc, true), new bYE("size", null, bxT.gjb, true), new bYE("isHpLoss", null, bxT.gjc, true), new bYE("caster", null, bxT.gjc, true), new bYE("value", null, bxT.gjb, true) };

  private final int hHT = 3500;
  private final int hHU = 5000;
  private int hHV = 1000;
  private static final int gvW = 500;
  private static final int hHW = 10;
  private static final float gvX = 0.65F;
  private static final float gvY = 1.3F;

  DisplayFlyingValue(LuaState paramLuaState, aZI paramaZI)
  {
    super(paramLuaState, paramaZI);
  }

  public String getName()
  {
    return "displayFlyingValue";
  }

  public bYE[] ce()
  {
    return Rf;
  }

  public bYE[] cf()
  {
    return null;
  }

  public void S(int paramInt)
  {
    float f1 = (float)Bs(0);
    float f2 = (float)Bs(1);
    float f3 = (float)Bs(2);

    float f4 = 1.0F; float f5 = 1.0F; float f6 = 1.0F;

    String str1 = Bv(3);
    int i = 0;

    String str2 = Bv(4);

    boolean bool1 = false;
    boolean bool2 = false;
    int j = this.kZA.are();
    int k = 1;
    int m = 0;
    int n = 0;
    String str3 = "";
    String str4 = null;
    boolean bool3 = false;

    bXU localbXU = null;
    doA localdoA = this.kZA.bov();
    Object localObject1;
    if ((localdoA != null) && 
      ((localdoA instanceof bZG))) {
      localObject1 = (bZG)localdoA;
      localbXU = (bXU)cNO.cFX().yF(((bZG)localObject1).pl());
    }
    Object localObject3;
    int i3;
    switch (this.kZA.bou()) {
    case 4:
      str3 = bU.fH().getString("exec.absorb");
      f4 = 0.0F;
      f5 = 0.0F;
      f6 = 1.0F;
      m = 1;
      k = 1;
      break;
    case 1:
      str3 = bU.fH().getString("exec.failed");
      f4 = 1.0F;
      f5 = 0.0F;
      f6 = 0.0F;
      m = 1;
      k = 0;
      break;
    case 2:
      str3 = bU.fH().getString("exec.immune");
      f4 = 1.0F;
      f5 = 1.0F;
      f6 = 1.0F;
      m = 1;
      k = 0;
      break;
    case 13:
      str3 = bU.fH().getString("exec.seduction.immunity");
      f4 = 1.0F;
      f5 = 1.0F;
      f6 = 1.0F;
      m = 1;
      k = 0;
      break;
    case 6:
      m = 0;
      k = 0;
      break;
    case 3:
      str3 = bU.fH().getString("exec.resist");
      f4 = 1.0F;
      f5 = 1.0F;
      f6 = 1.0F;
      m = 1;
      k = 0;
      break;
    case 11:
      str3 = bU.fH().getString("exec.seduction.resist");
      f4 = 1.0F;
      f5 = 1.0F;
      f6 = 1.0F;
      m = 1;
      k = 0;
      break;
    case 12:
      str3 = bU.fH().getString("exec.level.too.high");
      f4 = 1.0F;
      f5 = 1.0F;
      f6 = 1.0F;
      m = 1;
      k = 0;
      break;
    case 0:
      str3 = bU.fH().getString("exec.success");
      m = 1;
      k = 0;
      break;
    case 14:
      str3 = bU.fH().getString("exec.seduction.success");
      m = 1;
      k = 0;
      break;
    case 5:
      k = 0;
      if ((localbXU != null) && (localbXU.cdl())) {
        if (localdoA.wa() != null) {
          bool3 = ((bqk)localdoA.wa()).nS() == 21;
        }

        if (!(localdoA.bkf() instanceof dhJ)) {
          return;
        }
        localObject1 = (dhJ)localdoA.bkf();

        if ((((dhJ)localObject1).i(cfY.hCh)) && (localdoA.bkf() == localdoA.bke())) {
          n = 0;
        }
        else {
          n = 1;
          str4 = localbXU.fJ();
        }
      }
      break;
    case 10:
      localObject1 = this.kZA.bov();
      if ((localObject1 != null) && (((doA)localObject1).bkK() != null) && (byv.bFN().bFO() != null) && (byv.bFN().bFO().aeQ() != null) && (byv.bFN().bFO().aeQ().aDp() != null))
      {
        int i2 = ((doA)localObject1).bkK().bCU() - byv.bFN().bFO().aeQ().aDp().AU();

        str3 = bU.fH().getString("exec.regen", new Object[] { Integer.valueOf(i2) });
        f4 = 0.6F;
        f5 = 0.0F;
        f6 = 0.0F;
        m = 1;
        k = 0;
      } else {
        m = 0;
        k = 0;
      }
      break;
    case 7:
      ckT localckT = cjS.clP().vz(this.kZA.a());
      localObject2 = byv.bFN().bFO();
      if ((localckT != null) && (localObject2 != null) && (this.kZA.a() == ((byz)localObject2).aeR()) && ((this.kZA instanceof bWF)))
      {
        localObject3 = localckT.dg(this.kZA.gA());
        localObject4 = localckT.dg(this.kZA.Iw());
        if (localObject3 != null)
        {
          if ((localObject4 != null) && (((Su)localObject3).getId() != ((Su)localObject4).getId()))
            localObject5 = ((Su)localObject3).ML().aa(((Su)localObject4).ML());
          else {
            localObject5 = ((Su)localObject3).E();
          }
          int i4 = ((CG)localObject5).getIndex();
          switch (i4) {
          case 1:
            i3 = clP.hPx[0];
            break;
          case 3:
            i3 = clP.hPx[1];
            break;
          case 5:
            i3 = clP.hPx[2];
            break;
          case 7:
            i3 = clP.hPx[3];
            break;
          case 2:
          case 4:
          case 6:
          default:
            return;
          }
          FreeParticleSystem localFreeParticleSystem = cof.cop().vY(i3);
          localFreeParticleSystem.b(((Su)localObject3).aeL());
          localFreeParticleSystem.cS(((Su)localObject3).aeR());
          cWS.cKD().b(localFreeParticleSystem); } 
      }break;
    case 8:
    case 9:
    }
    int i1 = 20;
    boolean bool4 = false;

    if (paramInt > 5) {
      bool1 = By(5);
    }

    if (paramInt > 6) {
      i1 = Math.max(1, Br(6));
    }

    if (paramInt > 7) {
      bool4 = By(7);
    }

    if (paramInt > 8) {
      bool2 = By(8);
    }

    if (paramInt > 9) {
      j = Br(9);
    }

    if (str1.equals("")) {
      i = 5;
      str1 = "wci";
      i1 = 23;
    }

    Object localObject2 = null;

    if (bool2)
      localObject3 = ary.aDT().dh(this.kZA.Iw());
    else {
      localObject3 = ary.aDT().dh(this.kZA.gA());
    }

    if (localObject3 != null) {
      if (((awH)localObject3).isVisible()) {
        localObject2 = localObject3;
      }
    }
    else if (bool2)
      localObject2 = this.kZA.bov().bke();
    else {
      localObject2 = this.kZA.bov().bkf();
    }

    if (localObject2 == null) {
      return;
    }

    Object localObject4 = (bool1 ? "-" : "+") + j + str2;

    Object localObject5 = this.kZA.bov().aIq();
    if ((localObject5 instanceof b)) {
      i3 = ((b)localObject5).a();
      if (!dmM.cUe().AO(i3)) {
        return;
      }
    }

    if ((m != 0) && (str3 != null) && (str3.length() > 0)) {
      a(f4, f5, f6, "wci", 5, 30, false, 0, (cqz)localObject2, str3);
    }

    if ((k != 0) && (localObject4 != null) && (((String)localObject4).length() > 0)) {
      a(f1, f2, f3, str1, i, i1, bool4, j, (cqz)localObject2, (String)localObject4);
    }

    if ((n != 0) && (str4 != null))
      a(str4, (cqz)localObject2, bool3);
  }

  private void a(String paramString, cqz paramcqz, boolean paramBoolean)
  {
    if (((paramcqz instanceof cew)) && (F.a(((cew)paramcqz).cbD())))
      return;
    Object localObject1;
    if (paramBoolean) {
      localObject2 = cBQ.cxL().coO().nf("timePointBarDialog");
      dOc localdOc = (dOc)((cpa)localObject2).fi("numBonusLabel");
      localObject1 = new bbR(WakfuClientInstance.awy().Dg(), new vJ(localdOc));
    } else {
      localObject1 = new dVG();
    }

    Object localObject2 = new doc(paramString, 32, 32, (dbK)localObject1, 5000);
    ((doc)localObject2).a(paramcqz);

    int i = dbI.cNt().b(paramcqz, 4);
    ((doc)localObject2).pu(i * 1000);
    dbI.cNt().a((aCF)localObject2);
  }

  private void a(float paramFloat1, float paramFloat2, float paramFloat3, String paramString1, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, cqz paramcqz, String paramString2) {
    mu localmu = new mu(paramcqz);
    int i = dbI.cNt().b(localmu, 3);
    int j;
    int k;
    switch (i) {
    case 0:
      j = 0;
      k = 0;
      break;
    case 1:
      j = bCO.cL(-20, -10);
      k = bCO.cL(-20, -10);
      break;
    case 2:
      j = bCO.cL(10, 20);
      k = bCO.cL(-20, -10);
      break;
    default:
      j = bCO.cL(-20, 20);
      k = bCO.cL(-20, -1);
    }
    Object localObject;
    int m;
    if (paramBoolean) {
      localObject = new dUw(0, 400, j, 80 + k, sd(paramInt3), 50);
      m = 1000;
    } else {
      localObject = new vk(j, k);
      m = 3500;
    }

    dfj localdfj = new dfj(adF.c(paramString1, paramInt1, paramInt2), paramString2, (aQq)localObject, m);
    localdfj.setColor(paramFloat1, paramFloat2, paramFloat3, 1.0F);

    localdfj.a(localmu);

    if (paramBoolean)
      localdfj.pu(i * 100);
    else {
      localdfj.pu(i * 100);
    }
    dbI.cNt().a(localdfj);
  }

  private static float sd(int paramInt)
  {
    int i = bCO.J(paramInt, 0, 500);

    int j = i * 10 / 500;
    float f = j / 10.0F;

    return bCO.s(0.65F, 1.3F, f);
  }

  public String getDescription()
  {
    return "Affiche un visuel correspondant a l'effet (valeur au dessus de la cible, gfx de l'etat correspondant...)";
  }
}