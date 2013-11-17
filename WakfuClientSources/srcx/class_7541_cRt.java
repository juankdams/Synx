import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public class cRt
{
  public static final Logger K = Logger.getLogger(cRt.class);

  public static lZ ow(String paramString) { lZ locallZ = new lZ();

    bRO localbRO = new bRO(new bIk(new StringBuilder(paramString)));
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Iterator localIterator;
    while (true) { bhj localbhj = localbRO.acQ();
      if (localbhj == null)
        break;
      Object localObject1;
      String str1;
      if ((localbhj instanceof clT)) {
        localObject1 = ((clT)localbhj).DF();
        str1 = cKc.nG((String)localObject1);
        str1 = cOg.a(str1, '’', '\'');
        locallZ.a(str1);
      }
      else if ((localbhj instanceof cfr)) {
        localObject1 = (cfr)localbhj;
        str1 = ((cfr)localObject1).getTagName();
        if (("b".equalsIgnoreCase(str1)) || ("strong".equalsIgnoreCase(str1)))
        {
          if (((cfr)localObject1).cin())
            locallZ.tA();
          else
            locallZ.tz();
        } else if ("i".equalsIgnoreCase(str1)) {
          if (((cfr)localObject1).cin())
            locallZ.tE();
          else
            locallZ.tD();
        } else if ("u".equalsIgnoreCase(str1)) {
          if (((cfr)localObject1).cin())
            locallZ.tG();
          else
            locallZ.tF();
        } else if ("s".equalsIgnoreCase(str1)) {
          if (((cfr)localObject1).cin())
            locallZ.tC();
          else
            locallZ.tB();
        } else if ("font".equalsIgnoreCase(str1)) {
          if (((cfr)localObject1).cin()) {
            locallZ.tJ();
          } else {
            int i = 0;
            for (localObject2 = ((cfr)localObject1).cio().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (bYz)((Iterator)localObject2).next();
              localObject4 = ((bYz)localObject3).getAttrName();
              if ("size".equalsIgnoreCase((String)localObject4)) {
                locallZ.bx(Integer.parseInt(((bYz)localObject3).cds()));
                i = 1;
              } else if ("color".equalsIgnoreCase((String)localObject4)) {
                localObject5 = ox(((bYz)localObject3).cds());
                if (localObject5 != null) {
                  locallZ.am((String)localObject5);
                  i = 1;
                }
              } else if ("face".equalsIgnoreCase((String)localObject4)) {
                locallZ.an(((bYz)localObject3).cds());
                i = 1;
              }
            }
            if (i == 0)
              locallZ.tI();
          }
        } else if ("br".equalsIgnoreCase(str1))
          locallZ.e('\n');
        else if ("p".equalsIgnoreCase(str1))
          locallZ.e('\n');
        else if ("span".equalsIgnoreCase(str1)) {
          if (((cfr)localObject1).cin()) {
            locallZ.tJ();
          } else {
            locallZ.tI();
            for (localIterator = ((cfr)localObject1).cio().iterator(); localIterator.hasNext(); ) { localObject2 = (bYz)localIterator.next();
              localObject3 = ((bYz)localObject2).getAttrName();
              if ("style".equalsIgnoreCase((String)localObject3)) {
                localObject4 = oy(((bYz)localObject2).cds());
                for (localObject5 = ((HashMap)localObject4).keySet().iterator(); ((Iterator)localObject5).hasNext(); ) { String str2 = (String)((Iterator)localObject5).next();
                  String str3;
                  if ("color".equalsIgnoreCase(str2)) {
                    str3 = ox((String)((HashMap)localObject4).get(str2));
                    if (str3 != null)
                      locallZ.am(str3);
                  } else if ("font-family".equalsIgnoreCase(str2)) {
                    str3 = (String)((HashMap)localObject4).get(str2);
                    String str4;
                    if (str3.contains(","))
                      str4 = cOg.c(str3, ',')[0].trim();
                    else
                      str4 = str3;
                    locallZ.an(str4);
                  } else if ("font-size".equalsIgnoreCase(str2)) {
                    str3 = (String)((HashMap)localObject4).get(str2);
                    if (str3.endsWith("px")) {
                      try {
                        int j = Integer.parseInt(str3.substring(0, str3.length() - 2));
                        locallZ.bx(j);
                      } catch (NumberFormatException localNumberFormatException) {
                        K.error("Error while reading font size : invalid size " + str3);
                      }
                    }
                  }
                  else if ("text-align".equalsIgnoreCase(str2)) {
                    str3 = (String)((HashMap)localObject4).get(str2);
                    if ("center".equalsIgnoreCase(str3))
                      locallZ.tM();
                    else if ("right".equalsIgnoreCase(str3))
                      locallZ.tN();
                    else if ("left".equalsIgnoreCase(str3)) {
                      locallZ.tO();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    return locallZ; }

  private static String ox(String paramString)
  {
    if (paramString == null)
      return null;
    if (paramString.startsWith("#"))
      paramString = paramString.substring(1);
    if (paramString.length() < 6)
      return null;
    return paramString.substring(0, 6);
  }

  private static HashMap oy(String paramString) {
    HashMap localHashMap = new HashMap();
    String[] arrayOfString1 = cOg.c(paramString, ';');
    for (String str1 : arrayOfString1) {
      String[] arrayOfString3 = cOg.c(str1, ':');
      if (arrayOfString3.length < 2) {
        K.error("Invalid css property : '" + str1 + "' in css string : '" + paramString + "'");
      }
      else {
        String str2 = arrayOfString3[0].trim();
        String str3 = arrayOfString3[1].trim();
        localHashMap.put(str2, str3);
      }
    }
    return localHashMap;
  }

  public static void main(String[] paramArrayOfString)
  {
    int i = 8217;
    int j = 8217;
    int k = 326;
    System.out.println(true);
    System.out.println(false);
  }
}