import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class byO extends Vz
{
  private static final Logger K = Logger.getLogger(byO.class);

  protected boolean h(String paramString, int paramInt) {
    if (paramString == null)
      throw new IllegalArgumentException("!!! ERROR !!! Pas de description sur l'effet id = " + paramInt);
    return true;
  }

  protected String a(dpI paramdpI, String paramString, Object[] paramArrayOfObject, boolean paramBoolean, cFo paramcFo)
  {
    short s = paramcFo.nU();

    if (aBn.dVb.contains(paramdpI.eo())) {
      Matcher localMatcher = cxo.ikI.matcher(paramString);
      aLM localaLM = dap.cMI().zw(paramdpI.yR());
      if (localaLM == null) {
        K.error("Groupe d'effet vide " + paramdpI.yR());
        return null;
      }

      if ((!localMatcher.find()) && (!paramBoolean)) {
        lZ locallZ = cxo.ill.cLY();
        for (Iterator localIterator = localaLM.iterator(); localIterator.hasNext(); ) {
          dpI localdpI = (dpI)localIterator.next();

          aFA localaFA = cxo.xb(localdpI.eo());
          int i = localaFA.a(locallZ, localdpI, paramcFo);

          if (i != -1)
          {
            if (localIterator.hasNext()) {
              locallZ.a("\n");
            }
          }
        }
        return locallZ.tP();
      }
      paramString = a(paramString, localaLM, s, false, paramcFo);
    }

    return bjv.format(paramString, paramArrayOfObject);
  }

  private String a(String paramString, aLM paramaLM, short paramShort, boolean paramBoolean, cFo paramcFo) {
    if (paramaLM == null) {
      return paramString;
    }
    short s = 0;

    Matcher localMatcher1 = cxo.ikI.matcher(paramString);
    lZ locallZ1 = cxo.ill.cLY();
    int i = 0;

    while (localMatcher1.find()) {
      String str1 = localMatcher1.group();

      if (str1.length() != 0)
      {
        Matcher localMatcher2 = cxo.ikJ.matcher(str1);
        aLM localaLM = null;
        Object localObject1 = null;
        while (localMatcher2.find())
        {
          String str2 = localMatcher2.group();
          if (str2.length() > 0) {
            int j = str2.charAt(0);
            int n;
            Object localObject2;
            Object localObject3;
            switch (j) {
            case 36:
              int k = Byte.parseByte(str2.substring(1));
              dpI localdpI = (localaLM != null ? localaLM : paramaLM).nc(k - 1);
              if (localdpI == null) {
                K.error("description d'effet foireuse, on demande l'effet inexistant " + k + " du groupe d'effet " + paramaLM);
              }
              else {
                localaLM = null;

                localObject1 = localdpI;

                if (aBn.dVb.contains(localdpI.eo()))
                  localaLM = dap.cMI().zw(localdpI.yR());  } break;
            case 35:
              int m = Byte.parseByte(str2.substring(1));
              if (localObject1 == null) {
                K.error("description d'effet foireuse, on demande le paramètre " + m + " d'un effet non spécifié !");
              }
              else
              {
                String str3 = "";

                if (((m == 1) && ((localObject1.eo() == cxo.ikW) || (localObject1.eo() == cxo.ikX))) || (localObject1.eo() == cxo.ikY) || (localObject1.eo() == cxo.ila) || (localObject1.eo() == cxo.ikV))
                {
                  bJC localbJC = cNO.cFX().yF(localObject1.a(m - 1, paramShort, dNF.meh));

                  if (localObject1.bep() > m) {
                    s = (short)localObject1.a(m, paramShort, dNF.meh);
                  }
                  if (localbJC != null)
                    str3 = cxo.a(localbJC, s, (short)localObject1.zC(), true);
                }
                else {
                  str3 = String.valueOf(localObject1.a(m - 1, paramShort, dNF.meh));
                }

                locallZ1.a(paramString, i, localMatcher1.start());
                locallZ1.a(str3);
                i = localMatcher1.end();
              }
              break;
            case 112:
              n = str2.charAt(1);
              switch (n)
              {
              case 114:
                if (localObject1 == null) {
                  K.error("description d'effet foireuse, on demande la probabilité d'un effet non spécifié !");
                }
                else
                {
                  locallZ1.a(paramString, i, localMatcher1.start());
                  locallZ1.a(String.valueOf(Math.round(localObject1.bm(paramShort))) + "%");
                  i = localMatcher1.end();
                }break;
              }
              break;
            case 101:
              n = str2.charAt(1);
              switch (n)
              {
              case 108:
                if (localObject1 == null) {
                  K.error("description d'effet foireuse, on demande l'élément d'un effet non spécifié !");
                }
                else
                {
                  locallZ1.a(paramString, i, localMatcher1.start());
                  locallZ1.a(cxo.n(localObject1));
                  i = localMatcher1.end();
                }
                break;
              case 102:
                if (localObject1 == null) {
                  K.error("description d'effet foireuse, on veut décrire un effet non spécifié !");
                }
                else {
                  localObject2 = cxo.ill.cLY();
                  localObject3 = cxo.xb(localObject1.eo());
                  ((aFA)localObject3).a((lZ)localObject2, localObject1, paramcFo);

                  locallZ1.a(paramString, i, localMatcher1.start());
                  locallZ1.a(((lZ)localObject2).tP());
                  i = localMatcher1.end();
                }
                break;
              }

              break;
            case 97:
              n = str2.charAt(1);
              switch (n)
              {
              case 101:
                if (localObject1 == null) {
                  K.error("description d'effet foireuse, on demande l'aoe d'un effet non spécifié !");
                }
                else
                {
                  locallZ1.a(paramString, i, localMatcher1.start());
                  locallZ1.a(b(localObject1));
                  i = localMatcher1.end();
                }
                break;
              }

              break;
            case 115:
              n = str2.charAt(1);
              switch (n)
              {
              case 116:
                if (localObject1 == null) {
                  K.error("description d'effet foireuse, on veut décrire un effet (état) non spécifié !");
                }
                else if ((localObject1.eo() == cxo.ikW) || (localObject1.eo() == cxo.ikX) || (localObject1.eo() == cxo.ila) || (localObject1.eo() == cxo.ikY))
                {
                  localObject2 = cNO.cFX().yF(localObject1.a(0, paramShort, dNF.meh));
                  boolean bool1;
                  boolean bool2;
                  String str4;
                  Object localObject4;
                  int i1;
                  Object[] arrayOfObject;
                  int i2;
                  lZ locallZ2;
                  aFA localaFA;
                  if (localObject2 != null)
                  {
                    s = (short)localObject1.a(1, paramShort, dNF.meh);

                    localObject3 = cxo.a((bJC)localObject2, s, false, paramcFo.cAQ(), false, false);
                    if (localObject3 != null)
                    {
                      locallZ1.a(paramString, i, localMatcher1.start());
                      locallZ1.a((CharSequence)localObject3);
                      i = localMatcher1.end();
                    }
                  }
                }
                break;
              }
              break;
            case 108:
              n = str2.charAt(1);

              if (localObject1 == null) {
                K.error("description d'effet foireuse, on veut décrire un effet (état) non spécifié !");
              }
              else
              {
                bool1 = false;
                switch (n)
                {
                case 105:
                  bool1 = false;
                  break;
                case 112:
                  bool1 = true;
                  break;
                default:
                  return "";
                }

                bool2 = paramcFo.cAR();
                if (localObject1.eo() == cxo.ilf) {
                  paramcFo.hY(true);
                }

                str4 = null;
                if (aBn.dVb.contains(localObject1.eo())) {
                  localObject4 = cxo.a(new apm(localaLM, localObject1.yR(), paramShort, paramcFo.cAQ()));
                  str4 = "" + cxo.c((ArrayList)localObject4, bool1);
                } else {
                  if ((localObject1.eo() == cxo.ikW) || (localObject1.eo() == cxo.ikV) || (localObject1.eo() == cxo.ila) || (localObject1.eo() == cxo.ikX) || (localObject1.eo() == cxo.ikY))
                  {
                    localObject4 = cNO.cFX().yF(localObject1.a(0, paramShort, dNF.meh));

                    if (localObject4 == null) {
                      continue;
                    }
                    s = (short)localObject1.a(1, paramShort, dNF.meh);
                    str4 = cxo.a((bJC)localObject4, s, false, paramcFo.cAQ(), false, bool1);
                    break label1523;
                  }

                  i1 = localObject1.bep();
                  arrayOfObject = new Object[i1];
                  for (i2 = 0; i2 < i1; i2++) {
                    arrayOfObject[i2] = Integer.valueOf(localObject1.a(i2, paramShort, dNF.meh));
                  }
                  locallZ2 = new lZ();
                  localaFA = cxo.xb(localObject1.eo());
                  localaFA.a(locallZ2, localObject1, paramcFo);
                  str4 = locallZ2.tP();
                }

                label1523: if (str4 != null) {
                  locallZ1.a(paramString, i, localMatcher1.start());
                  locallZ1.a(str4);
                  i = localMatcher1.end();
                }
                paramcFo.hY(bool2);
              }
              break;
            }
          }
        }
      }
    }
    locallZ1.a(paramString, i, paramString.length());
    return locallZ1.tP();
  }
}