import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aWN
{
  private static final Logger K = Logger.getLogger(aWN.class);

  private static boolean bmt() {
    byz localbyz = byv.bFN().bFO();
    return (localbyz == null) || (!localbyz.i(dKm.lXL));
  }

  public static void a(lZ paramlZ, ayn paramayn) {
    bva localbva = (bva)paramayn.avb();
    if (localbva == null) {
      return;
    }

    boolean bool1 = bmt();

    if (bU.fH().ed(66, localbva.getId())) {
      bkQ localbkQ = paramayn.ava().aMO().b(paramayn.getId());
      if (localbkQ != null) {
        boolean bool2 = localbkQ.CC();
        String str = bU.fH().b(66, localbva.getId(), new Object[0]);
        if (str.length() > 0) {
          if ((bool1) && (bool2)) {
            paramlZ.tI().am(auI.dHG.bUV());
          }
          paramlZ.tz().a(str);

          if ((bool2) && (bool1)) {
            paramlZ.a(' ' + bU.fH().getString("chaos.label"));
          }

          paramlZ.tA().tH();

          if ((bool2) && (bool1)) {
            paramlZ.tJ();
          }
          if (bool1) {
            short s1 = localbva.Qb();
            short s2 = localbva.nV();
            if ((s1 != -1) && (s2 != -1)) {
              paramlZ.a(bjv.format(bU.fH().getString("recommended.level", new Object[] { Short.valueOf(s1), Short.valueOf(s2) }), new Object[0])).tH();
            }
          }
        }
      }
    }
    a(paramlZ, paramayn, bool1);
  }

  public static void b(lZ paramlZ, ayn paramayn) {
    a(paramlZ, paramayn, bmt());
  }

  private static void a(lZ paramlZ, ayn paramayn, boolean paramBoolean) {
    bU localbU = bU.fH();
    if (paramayn == null) {
      paramlZ.a(localbU.getString("map.territories.noProtector"));
    } else {
      paramlZ.a(localbU.getString("map.territories.protectorName", new Object[] { paramayn.getName() }));
      if (paramBoolean) {
        if (paramayn.avc() != -1)
          paramlZ.a(" - ").a(localbU.b(39, paramayn.avc(), new Object[0]));
        else {
          paramlZ.a(" - ").a(localbU.getString("map.territories.noNation"));
        }
      }

      b(paramlZ, paramayn, true);

      if (paramBoolean) {
        EnumMap localEnumMap = paramayn.aKr();
        if ((localEnumMap != null) && (!localEnumMap.isEmpty())) {
          paramlZ.tH().tH().tz().a(localbU.getString("protector.tax.desc")).tA();

          localObject = (baR)localEnumMap.get(cVE.kHZ);
          paramlZ.tH().a(aBu.b((baR)localObject));
          paramlZ.tH().a(aBu.a((baR)localObject));
        }

        Object localObject = paramayn.aKc();
        if ((localObject != null) && (localObject.length != 0)) {
          paramlZ.tH().tH().tz().a(localbU.getString("protector.craft")).tA();
          int i = 0; for (int j = localObject.length; i < j; i++)
            paramlZ.tH().a(localbU.b(43, localObject[i], new Object[0]));
        }
      }
    }
  }

  public static void b(lZ paramlZ, ayn paramayn, boolean paramBoolean) {
    cBV[] arrayOfcBV1 = paramayn.aKd();
    if (arrayOfcBV1 != null) {
      Arrays.sort(arrayOfcBV1, cvn.ctf());
      if (paramBoolean)
        paramlZ.a("\n\n").tz().a(bU.fH().getString("protector.buff.desc")).tA();
      if (paramayn.aKq().size() == 0) {
        paramlZ.a("\n").tI().am(auI.dHG.bUV()).a(bU.fH().getString("protector.noWill")).tJ();
      } else if (arrayOfcBV1.length == 0) {
        paramlZ.a("\n").tI().am(auI.dHG.bUV()).a(bU.fH().getString("protector.noBuff")).tJ();
      } else {
        ArrayList localArrayList1 = new ArrayList();
        ArrayList localArrayList2 = new ArrayList();
        Object localObject = null;
        for (cBV localcBV : arrayOfcBV1) {
          if (localcBV == null) {
            K.warn("buff null dans la liste du protecteur ?");
          }
          else {
            int k = 0;
            if ((localObject == null) || (localcBV.getId() != ((cBV)localObject).getId()))
            {
              a(paramlZ, localArrayList1, localArrayList2, (cBV)localObject);
              k = 1;
              localObject = localcBV;
            }

            Iterator localIterator = localcBV.iterator();

            int m = 0;
            while (localIterator.hasNext()) {
              dpI localdpI = (dpI)localIterator.next();
              int n = localdpI.bep();
              cSi localcSi;
              if (k != 0) {
                localcSi = new cSi(n);
                for (i1 = 0; i1 < n; i1++) {
                  localcSi.add(0);
                }
                localArrayList2.add(localcSi);
                localArrayList1.add(localdpI);
              } else {
                localcSi = (cSi)localArrayList2.get(m);
              }

              for (int i1 = 0; i1 < n; i1++) {
                localcSi.set(i1, localcSi.get(i1) + localdpI.a(i1, (short)0, dNF.meh));
              }

              m++;
            }
          }
        }
        if (localObject != null)
          a(paramlZ, localArrayList1, localArrayList2, (cBV)localObject);
      }
    }
  }

  private static void a(lZ paramlZ, ArrayList paramArrayList1, ArrayList paramArrayList2, cBV paramcBV)
  {
    if ((paramcBV != null) && (paramArrayList1.size() != 0)) {
      int i = 0; for (int j = paramArrayList1.size(); i < j; i++) {
        dpI localdpI = (dpI)paramArrayList1.get(i);
        cSi localcSi = (cSi)paramArrayList2.get(i);
        Object[] arrayOfObject = new Object[localcSi.size()];
        int k = 0; for (int m = localcSi.size(); k < m; k++) {
          arrayOfObject[k] = Integer.valueOf(localcSi.wm(k));
        }
        paramlZ.a("\n");
        paramlZ.a(ay.bd().a("protectorBuffsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(paramcBV.oc()) }), 16, 16, null);
        paramlZ.a(bjv.format(bU.fH().ec(10, localdpI.eo()), arrayOfObject));
        bTI localbTI = ((doA)bsj.bAv().kD(localdpI.eo())).Cz();
        if (localbTI != null) {
          try {
            String str = String.format(ay.bd().getString("elementsSmallIconsPath"), new Object[] { localbTI.name() });
            paramlZ.a(" ").a(str, -1, -1, null);
          } catch (bdh localbdh) {
            K.error(localbdh.toString());
          }
        }
      }
      paramArrayList1.clear();
      paramArrayList2.clear();
    }
  }
}