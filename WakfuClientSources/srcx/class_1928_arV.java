import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class arV
{
  private static final Logger K = Logger.getLogger(arV.class);
  protected static final String bKg = "chat";
  protected static final String dBl = "selectedChat";
  protected static final String dBm = "window";
  protected static final String dBn = "view";
  protected static final String dBo = "selectedView";
  protected static final String bJR = "name";
  protected static final String dBp = "isDefault";
  protected static final String bJS = "id";
  protected static final String dBq = "channel";
  protected static final String dBr = "opennedPipes";
  protected static final String dBs = "value";
  protected static final String dBt = "isPrivate";
  protected static final String dBu = "isNameDirty";
  protected static final String dBv = ",";
  protected static final String dBw = ":";
  public static final String dBx = "chat.xml";
  private static boolean dBy = false;
  private static final ArrayList dBz = new ArrayList();

  public static boolean aEw() {
    return dBy;
  }

  public static void d(aEe paramaEe) {
    if (!dBz.contains(paramaEe))
      dBz.add(paramaEe);
  }

  public static void cP(boolean paramBoolean)
  {
    dBy = paramBoolean;
    if ((dBy) && (dBz.size() > 0)) {
      for (aEe localaEe : dBz) {
        CM.LV().a(localaEe);
      }
      dBz.clear();
    }
  }

  public static void g(String paramString, boolean paramBoolean)
  {
    bpA localbpA = bpA.byM();
    bJs localbJs = localbpA.byO();

    localbpA.iy(paramString);
    localbpA.a(localbJs, new cdJ[0]);
    localbpA.close();

    if (paramBoolean)
      c(localbJs);
    else
      b(localbJs);
  }

  public static void b(bJs parambJs)
  {
    ArrayList localArrayList1 = parambJs.ji("window");
    int i = 1;
    aAx localaAx = aAx.aMd();
    for (K localK1 : localArrayList1)
      if (localK1.e("id") == null) {
        K.error("Id null sur au chargement d'une fenêtre de chat");
      }
      else {
        int j = localK1.e("id").getIntValue();
        int k = localK1.e("selectedView").getIntValue();

        ahB localahB = localaAx.lu(j);
        if (localahB == null) {
          localahB = localaAx.ls(j);
        }
        localahB.io(k);

        ArrayList localArrayList2 = localK1.c("view");
        if (localArrayList2 != null)
        {
          int m = 1;

          for (K localK2 : localArrayList2)
          {
            if (localK2.e("id") != null)
            {
              int n = localK2.e("id").getIntValue();
              String str1 = localK2.e("name").getStringValue();
              String str2 = localK2.e("opennedPipes").getStringValue();

              String str3 = localK2.e("channel").getStringValue();

              abi localabi = abi.dW(str3);
              if (localabi == null) {
                K.error("Commande inconnue enregistrée sur la vue " + str1);
              }
              else
              {
                dju localdju = new dju(n, str1, localabi, cPU.kzO, true);
                localdju.aa(fs(str2));
                localahB.b(localdju);
                if (m != 0) {
                  localahB.a(localdju);
                }
                m = 0;
              }
            }
          }
          if (i != 0) {
            localaAx.a(localahB);
          }
          i = 0;
        }
      }
  }

  private static void fr(String paramString) { String[] arrayOfString1 = paramString.split(",");
    for (String str : arrayOfString1) {
      String[] arrayOfString3 = str.split(":");
      int k = Integer.parseInt(arrayOfString3[0]);
      bNa localbNa = new bNa(Integer.parseInt(arrayOfString3[1]));
      CM.LV().ez(k).l(localbNa.QC(), localbNa.QD(), localbNa.QE());
    }
  }

  public static void c(bJs parambJs)
  {
    ArrayList localArrayList1 = parambJs.ji("window");
    boolean bool1 = false;
    for (Object localObject1 = localArrayList1.iterator(); ((Iterator)localObject1).hasNext(); ) { localK1 = (K)((Iterator)localObject1).next();
      if (localK1.e("id") == null) {
        K.error("Id null sur au chargement d'une fenêtre de chat");
      }
      else {
        i = localK1.e("id").getIntValue();
        int j = localK1.e("selectedView").getIntValue();

        localahB = aAx.aMd().lu(i);
        if (localahB == null) {
          localahB = aAx.aMd().ls(i);
        }
        localahB.io(j);

        ArrayList localArrayList2 = localK1.c("view");
        if (localArrayList2 != null)
        {
          for (K localK2 : localArrayList2)
          {
            if (localK2.e("id") != null)
            {
              int k = localK2.e("id").getIntValue();
              boolean bool2 = localK2.e("isDefault").getBooleanValue();
              boolean bool3 = localK2.e("isNameDirty").getBooleanValue();

              bool1 |= bool2;
              String str;
              if ((!bool3) && (!bool2)) {
                str = localK2.e("name").getStringValue();
                localObject2 = Pattern.compile("[0-9]+");
                localObject3 = ((Pattern)localObject2).matcher(str);
                if (((Matcher)localObject3).find()) {
                  localObject4 = ((Matcher)localObject3).group();
                  Integer localInteger = Integer.valueOf((String)localObject4);
                  str = bU.fH().getString("chat.pipeName.personnal", new Object[] { localInteger });
                }
              } else {
                str = localK2.e("name").getStringValue();
              }
              Object localObject2 = localK2.e("opennedPipes").getStringValue();

              Object localObject3 = localK2.e("channel").getStringValue();

              Object localObject4 = abi.dW((String)localObject3);
              if (localObject4 == null) {
                K.error("Commande inconnue enregistrée sur la vue " + str);
              }
              else
              {
                boolean bool4 = localK2.e("isPrivate") == null ? false : localK2.e("isPrivate").getBooleanValue();

                int[] arrayOfInt = fs((String)localObject2);

                dju localdju = localahB.in(k);
                if (localdju == null) {
                  if (bool4) {
                    aQL.a(k, localahB, str);
                  }
                  else {
                    localdju = new dju(k, str, (coM)localObject4, cPU.kzO, bool2);
                    localdju.aa(arrayOfInt);
                    localdju.ju(bool3);
                  }
                } else {
                  localdju.setName(str);
                  localdju.ju(bool3);
                  localdju.a((coM)localObject4);
                  localdju.aa(arrayOfInt);
                  localdju.jv(bool2);

                  localahB.b(localdju);
                }
              }
            }
          }
        }
      }
    }
    K localK1;
    int i;
    ahB localahB;
    if (!bool1) {
      throw new Exception("Acucune vue par défaut dans la configuration du chat ! On reset la config en attendant de savoir ce qui s'est passé");
    }

    localObject1 = parambJs.ji("selectedChat");
    if (localObject1 != null) {
      if (((ArrayList)localObject1).size() > 1) {
        K.warn("La sauvegarde possède plusieurs références à un chat par défaut, étrange...");
      }
      localK1 = (K)((ArrayList)localObject1).get(0);
      i = localK1.e("value").getIntValue();
      aAx.aMd().lv(i);
    }
  }

  private static int[] fs(String paramString) {
    String[] arrayOfString = dzp.c(paramString, ',');
    int[] arrayOfInt = new int[arrayOfString.length];
    for (int i = 0; i < arrayOfInt.length; i++) {
      try {
        arrayOfInt[i] = Integer.parseInt(arrayOfString[i]);
      } catch (ClassCastException localClassCastException) {
        K.error("Exception", localClassCastException);
      }
    }
    return arrayOfInt;
  }

  public static void save() {
    K.error("save");

    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();

    String str = aEy();
    localbpA.iz(str);
    localbwZ.b(new CC("chat", null));
    localbpA.a(localbwZ, "");
    localbpA.close();

    localbpA.iy(str);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();

    aAx localaAx = aAx.aMd();
    for (Object localObject1 = localaAx.aMk(); ((dmn)localObject1).hasNext(); ) {
      ((dmn)localObject1).fl();
      localObject2 = (ahB)((dmn)localObject1).value();
      int i = ((ahB)localObject2).auq();

      if (!localaAx.lw(i))
      {
        CC localCC = new CC("window", null);
        localCC.c(new dvw("id", String.valueOf(i)));
        localCC.c(new dvw("selectedView", String.valueOf(((ahB)localObject2).auz())));
        int j = 0;
        for (dmn localdmn = ((ahB)localObject2).aut(); localdmn.hasNext(); ) {
          localdmn.fl();
          dju localdju = (dju)localdmn.value();
          try {
            a(localdju, localCC);
          } catch (Exception localException) {
            K.error("Impossible de sauvegarder une vue");

            K.error("Exception", localException);
          } finally {
            j++;
          }
        }
        if (j != 0)
          localbwZ.bEx().a(localCC);
      }
    }
    Object localObject2;
    localObject1 = aAx.aMd().aMi();
    if (localObject1 == null) {
      K.error("Impossible de récupérer le chat par défaut, il y a un problème.");
    } else {
      localObject2 = new CC("selectedChat", null);
      ((CC)localObject2).c(new dvw("value", String.valueOf(((ahB)localObject1).auq())));
      localbwZ.bEx().a((K)localObject2);
    }

    localbpA.iz(str);
    localbpA.b(localbwZ);
    localbpA.close();
  }

  private static void a(dju paramdju, CC paramCC) {
    CC localCC = new CC("view", null);
    localCC.c(new dvw("id", String.valueOf(paramdju.cUQ())));
    localCC.c(new dvw("name", paramdju.getName()));
    localCC.c(new dvw("isDefault", String.valueOf(paramdju.cSo())));
    localCC.c(new dvw("isNameDirty", String.valueOf(paramdju.cSp())));
    localCC.c(new dvw("channel", paramdju.cSq().anI()));
    localCC.c(new dvw("isPrivate", String.valueOf(paramdju.cSr())));
    String str = "";
    int[] arrayOfInt = paramdju.cUU();
    for (int i = 0; i < arrayOfInt.length; i++) {
      str = str + arrayOfInt[i];
      if (i < arrayOfInt.length - 1) {
        str = str + ",";
      }
    }
    localCC.c(new dvw("opennedPipes", str));
    paramCC.a(localCC);
  }

  public static final String aEx() {
    return "file:" + duB.dai().dat() + '/' + "chat.xml";
  }

  public static final String aEy() {
    return new URL(aEx()).getFile();
  }

  private static final String aEz()
  {
    return new URL(ay.bd().getString("defaultChatFile")).getFile();
  }

  public static void aEA() {
    dtb.dg(aEy());
  }
}