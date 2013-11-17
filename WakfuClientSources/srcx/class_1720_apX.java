import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class apX extends bfE
  implements dBv, Comparable
{
  public static final String bHJ = "id";
  public static final String bC = "name";
  public static final String bsP = "level";
  public static final String dwD = "maxLevel";
  public static final String dwE = "levelTextShort";
  public static final String dwF = "xp";
  public static final String dwG = "currentLevelString";
  public static final String dwH = "currentLevelPercentage";
  public static final String dwI = "currentLevelPercentageString";
  public static final String dwJ = "spell";
  public static final String dwK = "ap";
  public static final String dwL = "mp";
  public static final String dwM = "wp";
  public static final String dwN = "chrage";
  public static final String dwO = "range";
  public static final String dwP = "areaOfEffectIconURL";
  public static final String dwQ = "areaOfEffectBigIconURL";
  public static final String dwR = "elementsUsedIconURL";
  public static final String cKD = "smallIconUrl";
  public static final String dwS = "bigIconUrl";
  public static final String bjY = "longDescription";
  public static final String RI = "description";
  public static final String dwT = "shortDescription";
  public static final String dwU = "criticalDescription";
  public static final String dwV = "shortDescriptionElement";
  public static final String dwW = "usable";
  public static final String dwX = "hasCastIntervalRestrictions";
  public static final String dwY = "castIntervalRestrictionsDescription";
  public static final String dwZ = "castMaxPerTarget";
  public static final String dxa = "castMaxPerTurn";
  public static final String dxb = "castInterval";
  public static final String dxc = "testLineOfSight";
  public static final String dxd = "castOnlyInLine";
  public static final String dxe = "testFreeCell";
  public static final String dxf = "testNotBorderCell";
  public static final String dxg = "conditionsDescription";
  public static final String dxh = "weaponSkillsList";
  public static final String dxi = "isMonsterSpell";
  public static final String dxj = "hasCriticalEffect";
  public static final String dxk = "isSupport";
  public static final String dxl = "isPassive";
  public static final String dxm = "modifiableRange";
  public static final String dxn = "isLocked";
  public static final String[] bF = { "id", "name", "levelTextShort", "level", "xp", "currentLevelString", "currentLevelPercentage", "currentLevelPercentageString", "ap", "mp", "wp", "chrage", "range", "elementsUsedIconURL", "spell", "smallIconUrl", "bigIconUrl", "longDescription", "description", "usable", "castMaxPerTarget", "castMaxPerTurn", "castInterval", "testLineOfSight", "castOnlyInLine", "testFreeCell", "testNotBorderCell", "conditionsDescription", "areaOfEffectIconURL", "areaOfEffectBigIconURL", "isMonsterSpell", "shortDescription", "criticalDescription", "hasCriticalEffect", "isSupport", "isPassive", "modifiableRange", "isLocked" };

  private boolean dxo = true;

  public void cH(boolean paramBoolean) {
    this.dxo = paramBoolean;
  }

  public apX() {
  }

  public apX(dSR paramdSR, short paramShort, long paramLong) {
    this.fsZ = paramdSR;

    e(paramShort, 0L);
    this.bkH = paramLong;
  }

  public byte getType()
  {
    return 1;
  }

  public czE aBR()
  {
    return Be.Kj();
  }

  public boolean ayU() {
    return byv.bFN().bFO().bGD().AZ(ok());
  }

  public apX k(boolean paramBoolean1, boolean paramBoolean2) {
    apX localapX = new apX();
    localapX.fsZ = this.fsZ;
    localapX.fta = (paramBoolean2 ? 0 : this.fta);
    localapX.e((short)(nU() - localapX.fta), ayX());
    localapX.bkH = dsE.cYX();
    return localapX;
  }

  public apX cu(boolean paramBoolean) {
    return k(paramBoolean, false);
  }

  public apX aza() {
    apX localapX = new apX();
    localapX.fsZ = this.fsZ;
    localapX.e(nU(), ayX());
    localapX.bkH = this.bkH;
    return localapX;
  }

  public int oc() {
    return ((dSR)this.fsZ).oc();
  }

  public void c(String paramString, Object paramObject) {
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    byz localbyz1 = byv.bFN().bFO();
    if (paramString.equals("id"))
      return Integer.valueOf(((dSR)this.fsZ).getId());
    if (paramString.equals("levelTextShort"))
      return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(nU()) });
    if (paramString.equals("maxLevel"))
      return Integer.valueOf(PY());
    if (paramString.equals("level"))
      return Short.valueOf(nU());
    if (paramString.equals("xp"))
      return Long.valueOf(ayX());
    if (paramString.equals("currentLevelString"))
      return bU.fH().getString("xpRatio", new Object[] { Long.valueOf(ble().cH(ayX())), Long.valueOf(ble().aq(bsN())) });
    if (paramString.equals("currentLevelPercentage"))
      return Float.valueOf(ayY());
    if (paramString.equals("currentLevelPercentageString"))
      return String.format("%.2f%%", new Object[] { Float.valueOf(ayY() * 100.0F) });
    if (paramString.equals("spell"))
      return this.fsZ;
    if (paramString.equals("smallIconUrl"))
      return ay.bd().w(oc());
    if (paramString.equals("bigIconUrl"))
      return ay.bd().x(oc());
    if (paramString.equals("name")) {
      if (this.fsZ != null)
        return ((dSR)this.fsZ).getName();
    }
    else
    {
      byz localbyz2;
      Object localObject5;
      int i;
      if (paramString.equals("ap")) {
        if (this.fsZ != null)
        {
          if (((dSR)this.fsZ).vC()) {
            localbyz2 = byv.bFN().bFO();
            if ((localbyz2.ayJ() != null) && (localbyz2.ayJ() != null) && (localbyz2.ayJ().dB((short)azO.dRM.hV) != null))
            {
              localObject5 = (gA)localbyz2.ayJ().dB((short)azO.dRM.hV);
              i = ((dSR)this.fsZ).c(this, localbyz1, null, localbyz1.bEY()) + ((gA)localObject5).oi().bKg();
            } else {
              i = ((dSR)this.fsZ).c(this, localbyz1, null, localbyz1.bEY());
            }
          } else {
            i = ((dSR)this.fsZ).c(this, localbyz1, null, localbyz1.bEY());
          }
          localbyz2 = byv.bFN().bFO();
          if ((localbyz2 != null) && (i > 0)) {
            if (localbyz2.c(cfY.hBC))
              i += 2;
            else if (localbyz2.c(cfY.hBB)) {
              i++;
            }
          }
          return Integer.valueOf(i);
        }
      } else if (paramString.equals("mp")) {
        if (this.fsZ != null) {
          i = ((dSR)this.fsZ).e(this, localbyz1, null, localbyz1.bEY());
          localbyz2 = byv.bFN().bFO();
          if ((localbyz2 != null) && (i > 0)) {
            if (localbyz2.c(cfY.hBF))
              i = (byte)(i + 2);
            else if (localbyz2.c(cfY.hBE)) {
              i = (byte)(i + 1);
            }
          }
          return Byte.valueOf(i);
        }
      }
      else
      {
        Object localObject1;
        int k;
        if (paramString.equals("wp")) {
          if (this.fsZ != null) {
            localObject1 = byv.bFN().bFO();
            k = ((dSR)this.fsZ).d(this, localbyz1, null, localbyz1.bEY());
            if ((localObject1 != null) && (k > 0)) {
              if (((byz)localObject1).c(cfY.hBw))
                k += 2;
              else if (((byz)localObject1).c(cfY.hBv)) {
                k++;
              }
            }
            return Integer.valueOf(k);
          }
        } else if (paramString.equals("chrage")) {
          if (this.fsZ != null) {
            localObject1 = ((dSR)this.fsZ).b(this, localbyz1, null, localbyz1.bEY());
            return Byte.valueOf(((bPk)localObject1).j(eu.azE));
          }
        } else { if (paramString.equals("range")) {
            if ((this.fsZ == null) || (getType() == 2)) {
              return null;
            }
            int j = ((dSR)this.fsZ).rL(nU());
            k = aBS();
            if (((j > 0) || (k > 0)) && (j != k)) {
              localObject5 = new StringBuilder();
              ((StringBuilder)localObject5).append(j).append("-").append(k);
              return ((StringBuilder)localObject5).toString();
            }
            return Integer.valueOf(k);
          }
          Object localObject2;
          Object localObject3;
          if (paramString.equals("areaOfEffectIconURL")) {
            if (this.fsZ != null) {
              localObject2 = iterator();
              while (((Iterator)localObject2).hasNext()) {
                localObject3 = (dpI)((Iterator)localObject2).next();
                localObject5 = ((dpI)localObject3).aui().eP();
                if ((localObject5 == cgr.hDU) || (localObject5 == cgr.hDT)) {
                  return null;
                }
                String str2 = ((cgr)localObject5).toString();
                try {
                  return String.format(ay.bd().getString("areasIconsPath"), new Object[] { str2 });
                } catch (Exception localException2) {
                  K.error("Impossible de trouver l'url de la zone " + str2);
                }
              }
            }
          } else if (paramString.equals("areaOfEffectBigIconURL")) {
            if (this.fsZ != null) {
              localObject2 = iterator();
              while (((Iterator)localObject2).hasNext()) {
                localObject3 = (dpI)((Iterator)localObject2).next();
                localObject5 = ((dpI)localObject3).aui().eP().toString();
                try {
                  return String.format(ay.bd().getString("areasBigIconsPath"), new Object[] { localObject5 });
                } catch (Exception localException1) {
                  K.error("Impossible de trouver l'url de la zone " + (String)localObject5);
                }
              }
            }
          } else if (paramString.equals("elementsUsedIconURL")) {
            if (this.fsZ != null) {
              localObject2 = bTI.dx(((dSR)this.fsZ).bHU());

              localObject3 = "";
              if (localObject2 != null) {
                try {
                  localObject3 = String.format(ay.bd().getString("elementsIconsPath"), new Object[] { ((bTI)localObject2).name() });
                } catch (bdh localbdh) {
                  K.error("Exception", localbdh);
                }

                return localObject3;
              }
              return null;
            }
          } else if (paramString.equals("longDescription")) {
            if (this.fsZ != null)
              return "\"" + ((dSR)this.fsZ).dte() + "\"";
          } else {
            if (paramString.equals("description"))
              return a(cMx.krP);
            if (paramString.equals("shortDescription"))
              return a(cMx.krQ);
            if (paramString.equals("criticalDescription"))
              return a(cMx.krR);
            if (paramString.equals("shortDescriptionElement")) {
              if (this.fsZ != null) {
                if (getType() == 2) {
                  return bU.fH().getString("passiveSpell.weapons");
                }

                localObject2 = bTI.dx(((dSR)this.fsZ).bHU());
                localObject3 = new StringBuilder();
                ((StringBuilder)localObject3).append(bU.fH().getString("spellDescription.levelShort")).append(" ").append(nU());
                if (((bTI)localObject2).equals(bTI.hfc))
                  ((StringBuilder)localObject3).append(" ").append(bU.fH().getString(((bTI)localObject2).name()));
                else if (!((bTI)localObject2).equals(bTI.heW)) {
                  ((StringBuilder)localObject3).append(" ").append(bU.fH().getString("spellDescription.element")).append(" ").append(bU.fH().getString(((bTI)localObject2).name()));
                }
                return localObject3;
              }
            } else {
              if (paramString.equals("usable")) {
                localObject2 = byv.bFN().bFO();

                localObject3 = ((byz)localObject2).aeQ();
                if (localObject3 == null) {
                  return Boolean.valueOf(true);
                }

                Su localSu = ((arl)localObject3).aDp().Ia();
                apX localapX = null;
                if ((localSu != null) && (localSu.adL() == localObject2)) {
                  localapX = localSu.bV(oj());
                }

                if ((localSu == null) || (localapX == null)) {
                  return Boolean.valueOf(false);
                }

                baf localbaf = ((arl)localObject3).a((dhJ)localObject2, localapX, null, true);
                if (localbaf == baf.fhx) {
                  localapX.cH(true);
                  return Boolean.valueOf(true);
                }
                if (localbaf == baf.fhN) {
                  localapX.cH(false);
                  return Boolean.valueOf(false);
                }
                localapX.cH(true);
                return Boolean.valueOf(false);
              }

              if (paramString.equals("castIntervalRestrictionsDescription")) {
                localObject2 = new StringBuilder();
                int m = 1;
                byte b1 = ((dSR)this.fsZ).bHN();
                byte b2 = bsQ();
                byte b3 = ((dSR)this.fsZ).bHO();
                if (b1 > 0) {
                  m = 0;
                  ((StringBuilder)localObject2).append(bU.fH().getString("spell.cast.maxPerTarget", new Object[] { Byte.valueOf(b1) }));
                }
                if (b2 > 0) {
                  if (m != 0)
                    m = 0;
                  else {
                    ((StringBuilder)localObject2).append("\n");
                  }
                  ((StringBuilder)localObject2).append(bU.fH().getString("spell.cast.maxPerTurn", new Object[] { Byte.valueOf(b2) }));
                }
                if ((b3 == -1) || (b3 > 0)) {
                  if (m != 0)
                    m = 0;
                  else {
                    ((StringBuilder)localObject2).append("\n");
                  }
                  if (b3 == -1)
                    ((StringBuilder)localObject2).append(bU.fH().getString("spell.cast.oncePerFight"));
                  else {
                    ((StringBuilder)localObject2).append(bU.fH().getString("spell.cast.minInterval", new Object[] { Byte.valueOf(b3) }));
                  }
                }
                return ((StringBuilder)localObject2).toString();
              }if (paramString.equals("hasCastIntervalRestrictions"))
                return Boolean.valueOf((((dSR)this.fsZ).bHN() > 0) || (bsQ() > 0) || (((dSR)this.fsZ).bHO() > 0));
              if (paramString.equals("castMaxPerTurn"))
                return bsQ() > 0 ? Byte.valueOf(bsQ()) : "-";
              if (paramString.equals("castMaxPerTarget"))
                return ((dSR)this.fsZ).bHN() > 0 ? Byte.valueOf(((dSR)this.fsZ).bHN()) : "-";
              if (paramString.equals("castInterval"))
                return Byte.valueOf(((dSR)this.fsZ).bHO());
              if (paramString.equals("testLineOfSight"))
                return Boolean.valueOf(((dSR)this.fsZ).a(this, localbyz1, null, localbyz1.bEY()));
              if (paramString.equals("testFreeCell"))
                return Boolean.valueOf(((dSR)this.fsZ).bHR());
              if (paramString.equals("testNotBorderCell"))
                return Boolean.valueOf(((dSR)this.fsZ).bHS());
              if (paramString.equals("castOnlyInLine"))
                return Boolean.valueOf((((dSR)this.fsZ).rM(nU()) > 1) && (((dSR)this.fsZ).bHP()));
              Object localObject4;
              if (paramString.equals("conditionsDescription"))
              {
                localObject2 = ((dSR)this.fsZ).bHT();
                localObject4 = new ArrayList();
                String[] arrayOfString1;
                if (localObject2 != null) {
                  str1 = daj.a((dKY)localObject2);
                  if (str1.length() > 0) {
                    arrayOfString1 = str1.split("\n");
                    for (String str4 : arrayOfString1) {
                      ((ArrayList)localObject4).add(str4);
                    }
                  }
                }
                String str1 = (String)getFieldValue("castIntervalRestrictionsDescription");
                if (str1.length() > 0) {
                  for (String str3 : str1.split("\n")) {
                    ((ArrayList)localObject4).add(str3);
                  }
                }
                return ((ArrayList)localObject4).size() > 0 ? localObject4 : null;
              }if (paramString.equals("weaponSkillsList")) {
                if ((this instanceof amm)) {
                  localObject2 = ((amm)this).ayW();
                  if (((List)localObject2).isEmpty()) {
                    return null;
                  }
                  return ((List)localObject2).toArray();
                }
              } else { if (paramString.equals("isMonsterSpell"))
                  return Boolean.valueOf(aQC.bhe().nx(((dSR)this.fsZ).Os()) == null);
                if (paramString.equals("hasCriticalEffect")) {
                  for (localObject2 = iterator(); ((Iterator)localObject2).hasNext(); ) { localObject4 = (dpI)((Iterator)localObject2).next();
                    if (((dpI)localObject4).cL(1L)) {
                      return Boolean.valueOf(true);
                    }
                  }
                  return Boolean.valueOf(false);
                }if (paramString.equals("isSupport"))
                  return Boolean.valueOf(((dSR)bsL()).bHU() == 9);
                if (paramString.equals("isPassive"))
                  return Boolean.valueOf(((dSR)bsL()).bHY());
                if (paramString.equals("modifiableRange"))
                  return Boolean.valueOf(((dSR)bsL()).bIc());  } 
            }
          } } 
      }
    }
    if (paramString.equals("isLocked")) {
      return Boolean.valueOf(isLocked());
    }

    return null;
  }

  public boolean isLocked() {
    return byv.bFN().bFO().aHq() == ((dSR)bsL()).getId();
  }

  public ArrayList a(cMx paramcMx) {
    if ((this.fsZ != null) && (getType() != 2)) {
      bZA localbZA = ((dSR)this.fsZ).bHT();

      ArrayList localArrayList1 = null;
      ArrayList localArrayList2 = null;
      byz localbyz;
      arl localarl;
      if (localbZA != null) {
        ArrayList localArrayList3 = daj.c(localbZA);
        localbyz = byv.bFN().bFO();
        localarl = localbyz.aeQ();
        for (Cs localCs : localArrayList3) {
          try {
            if ((localarl == null) || (((bZA)localCs.Lp()).i(localbyz, localbyz, this, localarl))) {
              if (localArrayList1 == null) {
                localArrayList1 = new ArrayList();
              }
              localArrayList1.add(localCs.getFirst());
            } else {
              if (localArrayList2 == null) {
                localArrayList2 = new ArrayList();
              }
              localArrayList2.add(localCs.getFirst());
            }
          } catch (aIh localaIh) {
            if (localArrayList1 == null) {
              localArrayList1 = new ArrayList();
            }
            localArrayList1.add(localCs.getFirst());
          }
        }
      }
      return cxo.a(new bds(this, localArrayList1, localArrayList2, paramcMx));
    }
    return null;
  }

  public int aBS()
  {
    byz localbyz = byv.bFN().bFO();
    int i = localbyz.e(eu.ayU);
    int j = ((dSR)this.fsZ).f(this, localbyz, null, localbyz.ayL());
    int k = ((dSR)this.fsZ).bIc() ? j + i : j;
    return Math.max(aBT(), k);
  }

  public int aBT() {
    return ((dSR)this.fsZ).rL(nU());
  }

  public boolean l(String paramString) {
    return false;
  }

  public void b(String paramString, Object paramObject) {
  }

  public void a(String paramString, Object paramObject) {
  }

  public int compareTo(Object paramObject) {
    apX localapX = (apX)paramObject;

    return ((dSR)this.fsZ).getName().compareTo(((dSR)localapX.bsL()).getName());
  }

  private void aBU() {
    dLE.doY().a(this, new String[] { "currentLevelPercentage", "currentLevelPercentageString", "level", "xp", "levelTextShort" });
  }

  public uP e(short paramShort, long paramLong)
  {
    if (paramShort > ble().nV()) {
      paramShort = ble().nV();
    }
    uP localuP = super.e(paramShort, paramLong);
    aBU();
    return localuP;
  }

  public uP d(short paramShort, boolean paramBoolean)
  {
    uP localuP = super.d(paramShort, paramBoolean);
    aBU();
    return localuP;
  }

  public uP da(long paramLong)
  {
    uP localuP = super.da(paramLong);
    aBU();
    return localuP;
  }

  public void jv(int paramInt) {
    super.jv(paramInt);
    aBU();
  }

  public int aBV() {
    return this.fta;
  }
}