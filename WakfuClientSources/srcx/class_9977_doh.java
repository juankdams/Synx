import java.util.ArrayList;
import org.apache.log4j.Logger;

public class doh
{
  protected static final Logger K = Logger.getLogger(doh.class);
  private final int m_index;
  private final String m_name;
  private final TD lou;
  private final ArrayList lov;
  private final ArrayList low;
  public static aOI lox = new aOI();

  public doh(int paramInt, String paramString, TD paramTD)
  {
    this.m_index = paramInt;
    this.m_name = paramString;
    this.lou = paramTD;
    this.lov = new ArrayList();
    this.low = new ArrayList();
  }

  public int getIndex()
  {
    return this.m_index;
  }

  public String getName()
  {
    return this.m_name;
  }

  public TD fE() {
    return this.lou;
  }

  public ArrayList cVv()
  {
    return this.lov;
  }

  public void a(acz paramacz)
  {
    this.lov.add(paramacz);
    this.low.add(paramacz);
  }

  public acz cVw() {
    if (!this.low.isEmpty())
    {
      return (acz)this.low.remove(0);
    }
    return null;
  }

  public boolean cVx() {
    return this.low.size() != 0;
  }

  public void cVy()
  {
    this.low.clear();
    for (acz localacz : this.lov)
      this.low.add(localacz);
  }

  public static ArrayList a(cOH paramcOH, String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList1 = new ArrayList();
    try
    {
      ArrayList localArrayList2 = paramcOH.op(paramString1);

      ArrayList localArrayList3 = paramcOH.oq(paramString2);

      ArrayList localArrayList4 = paramcOH.op(paramString3);

      for (int i = 0; i < localArrayList2.size(); i++)
      {
        doh localdoh = lox.a(i + 1, (String)localArrayList2.get(i), TD.dE((String)localArrayList4.get(i)));

        if (i < localArrayList3.size()) {
          String[] arrayOfString1 = (String[])localArrayList3.get(i);
          for (int j = 0; j < arrayOfString1.length; j++)
          {
            String str1 = arrayOfString1[j];
            String[] arrayOfString2 = str1.split(":");

            if (arrayOfString2.length == 2) {
              String str2 = arrayOfString2[0];

              String[] arrayOfString3 = arrayOfString2[1].split(";");
              for (int k = 0; k < arrayOfString3.length; k++) {
                localdoh.a(new acz(str2, Integer.parseInt(arrayOfString3[k])));
              }
            }
          }
        }

        localArrayList1.add(localdoh);
      }
    } catch (bdh localbdh) {
      K.error("Exception", localbdh);
    }

    return localArrayList1;
  }

  public String toString()
  {
    return this.m_name;
  }
}