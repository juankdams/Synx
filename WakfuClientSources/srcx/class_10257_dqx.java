import com.ankamagames.wakfu.client.binaryStorage.MonsterBinaryData;
import java.util.EnumMap;
import org.apache.log4j.Logger;

final class dqx
{
  private static final Logger K = Logger.getLogger(dqx.class);

  public bdi b(MonsterBinaryData paramMonsterBinaryData) {
    short s = (short)paramMonsterBinaryData.getId();
    bdi localbdi = a(paramMonsterBinaryData, s);

    a(paramMonsterBinaryData, s, localbdi);
    a(paramMonsterBinaryData, localbdi);
    d(paramMonsterBinaryData);
    e(paramMonsterBinaryData);

    return localbdi;
  }

  private static bdi a(MonsterBinaryData paramMonsterBinaryData, short paramShort)
  {
    int i = paramMonsterBinaryData.afI() != 0 ? paramMonsterBinaryData.afI() : 30000;

    EnumMap localEnumMap = c(paramMonsterBinaryData);
    localEnumMap.put(eu.azY, new Cs(Integer.valueOf(paramMonsterBinaryData.alR()), Float.valueOf(paramMonsterBinaryData.amd())));

    aqh localaqh1 = aqh.jw(paramMonsterBinaryData.anb());
    aqh localaqh2 = aqh.jw(paramMonsterBinaryData.anc());

    bdi localbdi = new bdi(paramShort, paramMonsterBinaryData.nn(), paramMonsterBinaryData.amR(), paramMonsterBinaryData.alM(), paramMonsterBinaryData.alN(), localEnumMap, paramMonsterBinaryData.ajB(), paramMonsterBinaryData.anr(), paramMonsterBinaryData.amX(), paramMonsterBinaryData.amW(), paramMonsterBinaryData.ann(), paramMonsterBinaryData.anm(), paramMonsterBinaryData.amY(), paramMonsterBinaryData.amT(), paramMonsterBinaryData.amU(), (byte)paramMonsterBinaryData.amV(), paramMonsterBinaryData.ana(), i, localaqh1, localaqh2, paramMonsterBinaryData.and(), paramMonsterBinaryData.ane(), bwA.rr(paramMonsterBinaryData.anl()), paramMonsterBinaryData.alP());

    localbdi.oW(paramMonsterBinaryData.anj());

    localbdi.a(f(paramMonsterBinaryData));
    localbdi.CE(paramMonsterBinaryData.afJ());

    for (diU localdiU : paramMonsterBinaryData.amZ()) {
      localbdi.ck(localdiU.getId(), localdiU.getLevel());
    }
    return localbdi;
  }

  private static EnumMap c(MonsterBinaryData paramMonsterBinaryData) {
    EnumMap localEnumMap = new EnumMap(eu.class);
    localEnumMap.put(eu.ayM, new Cs(Integer.valueOf(paramMonsterBinaryData.Nh()), Float.valueOf(paramMonsterBinaryData.alX())));
    localEnumMap.put(eu.ayN, new Cs(Integer.valueOf(paramMonsterBinaryData.Ni()), Float.valueOf(paramMonsterBinaryData.alZ())));
    localEnumMap.put(eu.ayO, new Cs(Integer.valueOf(paramMonsterBinaryData.Nj()), Float.valueOf(paramMonsterBinaryData.ama())));
    localEnumMap.put(eu.ayP, new Cs(Integer.valueOf(paramMonsterBinaryData.Nk()), Float.valueOf(paramMonsterBinaryData.alY())));
    localEnumMap.put(eu.ayU, new Cs(Integer.valueOf(paramMonsterBinaryData.alQ()), Float.valueOf(paramMonsterBinaryData.amb())));
    localEnumMap.put(eu.azq, new Cs(Integer.valueOf(paramMonsterBinaryData.Nl()), Float.valueOf(paramMonsterBinaryData.amc())));
    localEnumMap.put(eu.ayS, new Cs(Integer.valueOf(paramMonsterBinaryData.alU()), Float.valueOf(paramMonsterBinaryData.amg())));
    localEnumMap.put(eu.ayT, new Cs(Integer.valueOf(paramMonsterBinaryData.alV()), Float.valueOf(paramMonsterBinaryData.amh())));
    localEnumMap.put(eu.ayQ, new Cs(Integer.valueOf(paramMonsterBinaryData.aml()), Float.valueOf(paramMonsterBinaryData.amC())));
    localEnumMap.put(eu.ayR, new Cs(Integer.valueOf(paramMonsterBinaryData.amu()), Float.valueOf(paramMonsterBinaryData.amL())));
    localEnumMap.put(eu.aAe, new Cs(Integer.valueOf(paramMonsterBinaryData.alS()), Float.valueOf(paramMonsterBinaryData.ame())));

    localEnumMap.put(eu.azk, new Cs(Integer.valueOf(paramMonsterBinaryData.amq()), Float.valueOf(paramMonsterBinaryData.amH())));
    localEnumMap.put(eu.azl, new Cs(Integer.valueOf(paramMonsterBinaryData.amr()), Float.valueOf(paramMonsterBinaryData.amI())));
    localEnumMap.put(eu.azm, new Cs(Integer.valueOf(paramMonsterBinaryData.ams()), Float.valueOf(paramMonsterBinaryData.amJ())));
    localEnumMap.put(eu.azn, new Cs(Integer.valueOf(paramMonsterBinaryData.amt()), Float.valueOf(paramMonsterBinaryData.amK())));

    localEnumMap.put(eu.azy, new Cs(Integer.valueOf(paramMonsterBinaryData.amv()), Float.valueOf(paramMonsterBinaryData.amM())));
    localEnumMap.put(eu.azx, new Cs(Integer.valueOf(paramMonsterBinaryData.amw()), Float.valueOf(paramMonsterBinaryData.amN())));

    localEnumMap.put(eu.azA, new Cs(Integer.valueOf(paramMonsterBinaryData.amy()), Float.valueOf(paramMonsterBinaryData.amP())));
    localEnumMap.put(eu.azB, new Cs(Integer.valueOf(paramMonsterBinaryData.amz()), Float.valueOf(paramMonsterBinaryData.amQ())));

    localEnumMap.put(eu.azf, new Cs(Integer.valueOf(paramMonsterBinaryData.amo()), Float.valueOf(paramMonsterBinaryData.amF())));
    localEnumMap.put(eu.azg, new Cs(Integer.valueOf(paramMonsterBinaryData.amp()), Float.valueOf(paramMonsterBinaryData.amG())));
    localEnumMap.put(eu.azd, new Cs(Integer.valueOf(paramMonsterBinaryData.amm()), Float.valueOf(paramMonsterBinaryData.amD())));
    localEnumMap.put(eu.aze, new Cs(Integer.valueOf(paramMonsterBinaryData.amn()), Float.valueOf(paramMonsterBinaryData.amE())));
    localEnumMap.put(eu.ayX, new Cs(Integer.valueOf(paramMonsterBinaryData.alW()), Float.valueOf(0.0F)));
    return localEnumMap;
  }

  private static void a(MonsterBinaryData paramMonsterBinaryData, short paramShort, bdi parambdi) {
    for (bss localbss : paramMonsterBinaryData.ang()) {
      int k = localbss.getId();

      int m = 1;
      int n = 0;
      int i1 = 0;
      bZA localbZA = null;
      try {
        localbZA = aVj.hn(localbss.uL());
      } catch (Exception localException) {
        K.error("Erreur de compilation du critèrre sur l'action de collect " + localbss.Uu() + " du monstre " + parambdi.uO());
      }

      ada localada = new ada(0, 0);

      bKi localbKi = new bKi(k, paramShort, localbss.Uq(), localbss.Us(), 1, localbss.getDuration(), localbss.Ux(), localbss.Uu(), localbZA, -1, (byte)0, localada, localbss.UA(), localbss.bAA());

      parambdi.a(localbKi);
    }
  }

  private static void a(MonsterBinaryData paramMonsterBinaryData, bdi parambdi) {
    for (bvh localbvh : paramMonsterBinaryData.anf()) {
      int k = localbvh.getId();
      byte b = localbvh.getType();

      rn localrn = rn.cy(b);
      if (localrn == null) {
        K.error("Impossible de trouver l'action de monstre " + b);
      }
      else
      {
        bZA localbZA = null;
        try {
          localbZA = aVj.hn(localbvh.uL());
        } catch (Exception localException) {
          K.error("Problème de compilation d'un critère sur l'action " + k + " du monstre " + parambdi);
        }

        aCH localaCH = clR.cni().vL(localbvh.gC());

        VI localVI = bjz.a(k, b, localbZA, localbvh.bCN(), localaCH, localbvh.uN(), localbvh.getDuration(), localbvh.bCP(), localbvh.bCO());

        parambdi.a(localVI);
      }
    }
  }

  private static void d(MonsterBinaryData paramMonsterBinaryData) { for (bfg localbfg : paramMonsterBinaryData.anh()) {
      int k = localbfg.getId();
      int m = localbfg.getType();
      int n = localbfg.uN();
      boolean bool = localbfg.bsE();

      dRx.dsw().a(paramMonsterBinaryData.getId(), new Js(k, m, n, bool));
    } }

  private static void e(MonsterBinaryData paramMonsterBinaryData)
  {
    for (buV localbuV : paramMonsterBinaryData.ani()) {
      int k = localbuV.getId();
      int m = localbuV.uN();
      short s = (short)localbuV.Os();

      dxi localdxi = new dxi(k, s, m);

      aqT.aDc().a(localdxi);
    }
  }

  public static aMl f(MonsterBinaryData paramMonsterBinaryData)
  {
    amu[] arrayOfamu = a(paramMonsterBinaryData.anq());
    bas[] arrayOfbas = a(paramMonsterBinaryData.anp());
    cCt[] arrayOfcCt = a(paramMonsterBinaryData.ano());

    if ((arrayOfcCt != null) || (arrayOfbas != null) || (arrayOfamu != null)) {
      aMl localaMl = new aMl();
      localaMl.a(arrayOfamu);
      localaMl.a(arrayOfbas);
      localaMl.a(arrayOfcCt);
      return localaMl;
    }
    return null;
  }

  private static amu[] a(aaL[] paramArrayOfaaL)
  {
    if ((paramArrayOfaaL == null) || (paramArrayOfaaL.length == 0))
      return null;
    amu[] arrayOfamu = new amu[paramArrayOfaaL.length];
    for (int i = 0; i < paramArrayOfaaL.length; i++) {
      arrayOfamu[i] = new amu(paramArrayOfaaL[i].any(), paramArrayOfaaL[i].getAnimName());
    }
    return arrayOfamu;
  }

  private static bas[] a(byr[] paramArrayOfbyr)
  {
    if ((paramArrayOfbyr == null) || (paramArrayOfbyr.length == 0))
      return null;
    bas[] arrayOfbas = new bas[paramArrayOfbyr.length];
    for (int i = 0; i < paramArrayOfbyr.length; i++) {
      arrayOfbas[i] = new bas(paramArrayOfbyr[i].bFI(), new bNa(paramArrayOfbyr[i].aBc()));
    }
    return arrayOfbas;
  }

  private static cCt[] a(bOx[] paramArrayOfbOx)
  {
    if ((paramArrayOfbOx == null) || (paramArrayOfbOx.length == 0))
      return null;
    cCt[] arrayOfcCt = new cCt[paramArrayOfbOx.length];
    for (int i = 0; i < paramArrayOfbOx.length; i++) {
      arrayOfcCt[i] = new cCt(paramArrayOfbOx[i].als(), paramArrayOfbOx[i].bEZ());
    }
    return arrayOfcCt;
  }
}