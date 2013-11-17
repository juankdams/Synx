import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class dFz
  implements cFo
{
  private static final Logger K = Logger.getLogger(dFz.class);
  protected Ce lba;
  protected int aw;
  protected short cZu;
  protected boolean aSM;
  protected ArrayList lPA;
  protected ArrayList lPB;
  protected cMx lPC;
  protected int lPD;
  protected boolean lPE;
  protected boolean lPF;

  public dFz(Ce paramCe, int paramInt, short paramShort)
  {
    this.lba = paramCe;
    this.aw = paramInt;
    this.cZu = paramShort;
    this.aSM = true;
    this.lPA = (this.lPB = null);
    this.lPC = cMx.krQ;
    this.lPD = 0;
    this.lPE = false;
    this.lPF = false;
  }

  public dFz(Ce paramCe, int paramInt1, short paramShort, boolean paramBoolean, ArrayList paramArrayList1, ArrayList paramArrayList2, cMx paramcMx, int paramInt2) {
    this.lba = paramCe;
    this.aw = paramInt1;
    this.cZu = paramShort;
    this.aSM = paramBoolean;
    this.lPA = paramArrayList1;
    this.lPB = paramArrayList2;
    this.lPC = paramcMx;
    this.lPD = paramInt2;
    this.lPE = false;
    this.lPF = false;
  }

  public ArrayList cAK() {
    ArrayList localArrayList = new ArrayList();
    int i = nU();
    cMx localcMx = cAP();
    int j = cAQ();
    int k = getId();

    f(localArrayList);
    Object localObject1;
    if (vs()) {
      localObject1 = cAL();
      if (localObject1 != null) {
        int m = 1;
        int n = 1;

        for (Object localObject2 = ((Ce)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { dpI localdpI = (dpI)((Iterator)localObject2).next();
          if (localdpI == null) {
            K.error("Effet null", new Exception());
          }
          else
          {
            float f = localdpI.bm(i);

            if ((f >= 0.0F) && 
              (i <= localdpI.zC()) && (i >= localdpI.zB()) && 
              ((!localdpI.cL(1L)) || (!localcMx.equals(cMx.krQ))) && (
              (localdpI.cL(1L)) || (!localcMx.equals(cMx.krR))))
            {
              if ((localdpI.cL(1L)) && (n != 0)) {
                n = 0;
                if (localcMx.equals(cMx.krP)) {
                  localArrayList.add(cxo.ill.cLY().tz().a(cxo.feH.getString(cxo.AA)).tA().tP());
                }

              }

              lZ locallZ = cxo.ill.cLY();
              aFA localaFA = cxo.xb(localdpI.eo());

              int i1 = localaFA.a(locallZ, localdpI, this);
              if (i1 != -1)
              {
                m = 0;

                String str2 = a(locallZ.tP(), localdpI);
                str2 = qX(str2);

                if (str2.length() > 0) {
                  String[] arrayOfString = str2.split("\n");
                  Collections.addAll(localArrayList, arrayOfString);
                }
              }
            }
          } }
        if (m != 0) {
          return localArrayList;
        }

        if (cxo.feH.ed(j, k)) {
          localObject2 = cxo.feH.b(j, k, new Object[0]);
          if (((String)localObject2).length() > 0) {
            localArrayList.add(localObject2);
          }
        }

      }

    }
    else if (cxo.feH.ed(j, k)) {
      localArrayList.add(cxo.feH.b(j, k, new Object[0]));
    }

    if (((this.lPA != null) || (this.lPB != null)) && (localArrayList.size() != 0) && (localcMx.equals(cMx.krP)))
    {
      localArrayList.add(cxo.ill.cLY().tz().a(cxo.feH.getString(cxo.EN)).tA().tP());
      if (this.lPA != null) {
        localArrayList.addAll(this.lPA);
      }

      if (this.lPB != null) {
        for (localObject1 = this.lPB.iterator(); ((Iterator)localObject1).hasNext(); ) { String str1 = (String)((Iterator)localObject1).next();
          localArrayList.add(cxo.ilm.a(cxo.ill.cLY(), str1).tP());
        }
      }
    }

    J(localArrayList);

    return localArrayList;
  }

  public static String qX(String paramString)
  {
    lZ locallZ = cxo.ill.cLY();
    int i = 0;
    Matcher localMatcher1 = cxo.ikQ.matcher(paramString);
    try {
      while (localMatcher1.find()) {
        int j = 0;
        String str1 = localMatcher1.group(1);
        if ((localMatcher1.groupCount() == 4) && (str1 != null)) {
          j = bUD.aR(Character.valueOf(str1.charAt(0)));
        }
        Number localNumber = NumberFormat.getInstance(cxo.feH.ajJ().getLocale()).parse(localMatcher1.group(2));
        float f1 = localNumber.floatValue();
        String str2 = localMatcher1.group(4);
        Matcher localMatcher2 = cxo.ikP.matcher(str2);
        while (localMatcher2.find()) {
          int k = localMatcher2.group(1).charAt(0);
          float f2 = Float.parseFloat(localMatcher2.group(2));

          switch (k) {
          case 43:
            f1 += f2;
            break;
          case 45:
            f1 -= f2;
            break;
          case 42:
            f1 *= f2;
            break;
          case 47:
            f1 /= f2;
          case 44:
          case 46:
          }
        }
        locallZ.a(paramString, i, localMatcher1.start());
        if (j == 0)
          locallZ.bw(bCO.bC(f1));
        else if (j > 0) {
          locallZ.x(bCO.h(f1, j));
        }
        i = localMatcher1.end();
      }
    }
    catch (Exception localException) {
      return "Error";
    }

    locallZ.a(paramString, i, paramString.length());
    return locallZ.toString();
  }

  public void f(ArrayList paramArrayList) {
  }

  public void J(ArrayList paramArrayList) {
  }

  public String a(String paramString, dpI paramdpI) {
    return paramString;
  }

  public int getId() {
    return this.aw;
  }

  public Ce cAL() {
    return this.lba;
  }

  public short nU() {
    return this.cZu;
  }

  public boolean vs() {
    return this.aSM;
  }

  public boolean g(dpI paramdpI) {
    return ((paramdpI.zP()) || (cxo.ilm.bmM())) && (paramdpI.zB() <= this.cZu) && (paramdpI.zC() >= this.cZu);
  }

  public ArrayList cAN()
  {
    return this.lPA;
  }

  public ArrayList cAO() {
    return this.lPB;
  }

  public cMx cAP() {
    return this.lPC;
  }

  public int cAQ() {
    return this.lPD;
  }

  public void hX(boolean paramBoolean) {
    this.lPE = paramBoolean;
  }

  public boolean cAM() {
    return this.lPE;
  }

  public boolean cAR() {
    return this.lPF;
  }

  public void hY(boolean paramBoolean) {
    this.lPF = paramBoolean;
  }
}