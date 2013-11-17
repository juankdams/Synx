import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class cmA extends aGK
  implements aFO, aSL
{
  private dnE fiC;
  private Map map;
  private Map hRp;
  private Map hRq;
  private Hashtable hRr;
  private String text;
  private String hRs;
  private List hRt;
  private static final int STATE_NORMAL = 0;
  private static final int hRu = 1;
  private static final int hRv = 2;

  public cmA()
  {
    this.map = new HashMap();
    this.hRp = null;

    this.text = null;
    this.hRs = null;
    this.hRt = new ArrayList();
  }

  public void a(dnE paramdnE)
  {
    this.fiC = paramdnE;
  }

  public dnE cnr()
  {
    return this.fiC;
  }

  public void O(String paramString1, String paramString2)
  {
    this.map.put(paramString1, paramString2);
  }

  public Object at(String paramString)
  {
    throw new cJ("Not implemented any more");
  }

  private Map cns() {
    if (this.hRp == null) {
      this.hRp = new HashMap();
      for (Map.Entry localEntry : this.fiC.cVm().entrySet()) {
        this.hRp.put((String)localEntry.getKey(), localEntry.getValue());

        cVq localcVq = (cVq)localEntry.getValue();

        if (localcVq.cKd()) {
          this.hRs = localcVq.getName();
        }
      }
    }
    return this.hRp;
  }

  public void a(aGK paramaGK)
  {
    this.hRt.add(paramaGK);
  }

  private void cnt() {
    if (this.hRs != null) {
      return;
    }
    for (Iterator localIterator = this.hRt.iterator(); localIterator.hasNext(); ) {
      aQS localaQS = (aQS)localIterator.next();
      String str = dhB.pe(localaQS.getTag()).toLowerCase(Locale.ENGLISH);

      if (cns().get(str) == null) {
        throw new cJ("unsupported element " + str);
      }
      if (this.hRq.get(str) != null) {
        throw new cJ("Element " + str + " already present");
      }
      this.hRq.put(str, localaQS);
    }
  }

  private String d(String paramString, Map paramMap)
  {
    if (paramString == null) {
      return null;
    }
    StringBuffer localStringBuffer1 = new StringBuffer();
    StringBuffer localStringBuffer2 = null;

    int i = 0;
    for (int j = 0; j < paramString.length(); j++) {
      char c = paramString.charAt(j);
      switch (i) {
      case 0:
        if (c == '@')
          i = 1;
        else {
          localStringBuffer1.append(c);
        }
        break;
      case 1:
        if (c == '{') {
          i = 2;
          localStringBuffer2 = new StringBuffer();
        } else if (c == '@') {
          i = 0;
          localStringBuffer1.append('@');
        } else {
          i = 0;
          localStringBuffer1.append('@');
          localStringBuffer1.append(c);
        }
        break;
      case 2:
        if (c == '}') {
          i = 0;
          String str1 = localStringBuffer2.toString().toLowerCase(Locale.ENGLISH);
          String str2 = (String)paramMap.get(str1);
          if (str2 == null) {
            localStringBuffer1.append("@{");
            localStringBuffer1.append(str1);
            localStringBuffer1.append("}");
          } else {
            localStringBuffer1.append(str2);
          }
          localStringBuffer2 = null;
        } else {
          localStringBuffer2.append(c);
        }
        break;
      }

    }

    switch (i) {
    case 0:
      break;
    case 1:
      localStringBuffer1.append('@');
      break;
    case 2:
      localStringBuffer1.append("@{");
      localStringBuffer1.append(localStringBuffer2.toString());
      break;
    }

    return localStringBuffer1.toString();
  }

  public void addText(String paramString)
  {
    this.text = paramString;
  }

  private aQS a(aQS paramaQS, boolean paramBoolean) {
    aQS localaQS1 = new aQS(paramaQS.getTag());
    localaQS1.setNamespace(paramaQS.getNamespace());
    localaQS1.b(Ga());
    localaQS1.hc(paramaQS.getQName());
    localaQS1.gu(paramaQS.aSP());
    localaQS1.dt(paramaQS.aSI());
    localaQS1.a(this.fiC.cVj() ? paramaQS.gu() : gu());

    if (aSH() == null) {
      localObject1 = new wZ();
      ((wZ)localObject1).b(Ga());
      localaQS1.d((wZ)localObject1);
    } else {
      localaQS1.d(aSH());
    }
    Object localObject1 = new bTW(localaQS1, paramaQS.aSI());

    ((bTW)localObject1).ga(paramaQS.aSQ().cab());
    Hashtable localHashtable = paramaQS.aSQ().cac();
    for (Object localObject2 = localHashtable.entrySet().iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ((bTW)localObject1).setAttribute((String)((Map.Entry)localObject3).getKey(), d((String)((Map.Entry)localObject3).getValue(), this.hRr));
    }
    Object localObject3;
    ((bTW)localObject1).addText(d(paramaQS.aSQ().caf().toString(), this.hRr));

    localObject2 = paramaQS.aSQ().cae();
    while (((Enumeration)localObject2).hasMoreElements()) {
      localObject3 = (bTW)((Enumeration)localObject2).nextElement();
      aQS localaQS2 = (aQS)((bTW)localObject3).bsm();
      String str = localaQS2.aSP();
      if (str != null) {
        str = str.toLowerCase(Locale.ENGLISH);
      }
      cVq localcVq = (cVq)cns().get(str);
      Object localObject4;
      if ((localcVq == null) || (paramBoolean)) {
        localObject4 = a(localaQS2, paramBoolean);
        ((bTW)localObject1).c(((aQS)localObject4).aSQ());
        localaQS1.a((aQS)localObject4);
      }
      else
      {
        Object localObject5;
        if (localcVq.cKd()) {
          if ((this.hRt.size() == 0) && (!localcVq.cdt())) {
            throw new cJ("Missing nested elements for implicit element " + localcVq.getName());
          }

          localObject4 = this.hRt.iterator();
          while (((Iterator)localObject4).hasNext()) {
            localObject5 = a((aQS)((Iterator)localObject4).next(), true);

            ((bTW)localObject1).c(((aQS)localObject5).aSQ());
            localaQS1.a((aQS)localObject5);
          }
        } else {
          localObject4 = (aQS)this.hRq.get(str);

          if (localObject4 == null) {
            if (!localcVq.cdt()) {
              throw new cJ("Required nested element " + localcVq.getName() + " missing");
            }

          }
          else
          {
            localObject5 = ((aQS)localObject4).aSQ().caf().toString();

            if (!"".equals(localObject5)) {
              ((bTW)localObject1).addText(d((String)localObject5, this.hRr));
            }
            List localList = ((aQS)localObject4).getChildren();
            if (localList != null) {
              Iterator localIterator = localList.iterator();
              while (localIterator.hasNext()) {
                aQS localaQS3 = a((aQS)localIterator.next(), true);

                ((bTW)localObject1).c(localaQS3.aSQ());
                localaQS1.a(localaQS3);
              }
            }
          }
        }
      }
    }
    return localaQS1;
  }

  public void execute()
  {
    this.hRq = new HashMap();
    cns();
    cnt();
    this.hRr = new Hashtable();
    HashSet localHashSet = new HashSet(this.map.keySet());
    for (Object localObject1 = this.fiC.getAttributes().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (bxN)((Iterator)localObject1).next();
      String str = (String)this.map.get(((bxN)localObject2).getName());
      if ((str == null) && ("description".equals(((bxN)localObject2).getName()))) {
        str = getDescription();
      }
      if (str == null) {
        str = ((bxN)localObject2).bFa();
        str = d(str, this.hRr);
      }
      if (str == null) {
        throw new cJ("required attribute " + ((bxN)localObject2).getName() + " not set");
      }

      this.hRr.put(((bxN)localObject2).getName(), str);
      localHashSet.remove(((bxN)localObject2).getName());
    }
    if (localHashSet.contains("id")) {
      localHashSet.remove("id");
    }
    if (this.fiC.cVi() != null) {
      if (this.text == null) {
        localObject1 = this.fiC.cVi().bFa();
        if ((!this.fiC.cVi().dpF()) && (localObject1 == null)) {
          throw new cJ("required text missing");
        }

        this.text = (localObject1 == null ? "" : (String)localObject1);
      }
      if (this.fiC.cVi().dpG()) {
        this.text = this.text.trim();
      }
      this.hRr.put(this.fiC.cVi().getName(), this.text);
    }
    else if ((this.text != null) && (!this.text.trim().equals(""))) {
      throw new cJ("The \"" + aSI() + "\" macro does not support" + " nested text data.");
    }

    if (localHashSet.size() != 0) {
      throw new cJ("Unknown attribute" + (localHashSet.size() > 1 ? "s " : " ") + localHashSet);
    }

    localObject1 = a(this.fiC.cVl(), false);
    ((aQS)localObject1).init();
    Object localObject2 = cWU.Z(Ga());

    ((cWU)localObject2).cDP();
    try {
      ((aQS)localObject1).perform();
    } catch (cJ localcJ) {
      if (this.fiC.cVj()) {
        throw dhB.a(localcJ, gu());
      }

      localcJ.a(gu());
      throw localcJ;
    }
    finally {
      this.hRq = null;
      this.hRr = null;
      ((cWU)localObject2).cDQ();
    }
  }
}