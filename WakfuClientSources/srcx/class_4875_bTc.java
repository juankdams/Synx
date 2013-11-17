import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class bTc
{
  private static final int hev = 10;
  private static final int hew = 30;
  private dhh hex;
  private HashMap hey = new HashMap();
  private HashMap hez = new HashMap();

  public bTc(dhh paramdhh)
  {
    this.hex = paramdhh;
  }

  public static int iO(int paramInt)
  {
    return cBQ.cxL().aww().cHC() + paramInt;
  }

  public static int iP(int paramInt)
  {
    return cBQ.cxL().aww().cHD() + paramInt;
  }

  public void clean()
  {
  }

  public void e(dOc paramdOc, String paramString)
  {
    ArrayList localArrayList = (ArrayList)this.hey.get(paramString);
    if (localArrayList != null) {
      if (!localArrayList.contains(paramdOc))
        localArrayList.add(paramdOc);
    }
    else {
      localArrayList = new ArrayList();
      localArrayList.add(paramdOc);
      this.hey.put(paramString, localArrayList);
    }
  }

  public void f(dOc paramdOc, String paramString)
  {
    ArrayList localArrayList = (ArrayList)this.hey.get(paramString);
    if (localArrayList != null) {
      localArrayList.remove(paramdOc);
      if (localArrayList.size() <= 0)
        this.hey.remove(paramString);
    }
  }

  public void g(dOc paramdOc, String paramString)
  {
    Stack localStack = (Stack)this.hez.get(paramString);
    if (localStack != null) {
      if (localStack.contains(paramdOc)) {
        localStack.remove(paramdOc);
      }
      localStack.push(paramdOc);
    } else {
      localStack = new Stack();
      localStack.push(paramdOc);
      this.hez.put(paramString, localStack);
    }
  }

  public void h(dOc paramdOc, String paramString)
  {
    Stack localStack = (Stack)this.hez.get(paramString);
    if (localStack != null) {
      localStack.remove(paramdOc);
      if (localStack.size() <= 0)
        this.hez.remove(paramString);
    }
  }

  public Point a(dOc paramdOc1, dOc paramdOc2)
  {
    int i = paramdOc1.getDisplayX();
    int j = paramdOc1.getDisplayY();

    md localmd = new md(i + paramdOc1.getWidth() + 10, j, paramdOc2.getWidth(), paramdOc2.getHeight(), null);
    boolean bool;
    if (localmd.x + localmd.width <= this.hex.getWidth())
      bool = a(localmd, paramdOc2);
    else {
      bool = false;
    }

    if (!bool) {
      localmd = new md(i, j + paramdOc1.getHeight() + 10, paramdOc2.getWidth(), paramdOc2.getHeight(), null);
      if (localmd.y + localmd.height <= this.hex.getHeight())
        bool = a(localmd, paramdOc2);
      else {
        bool = false;
      }

    }

    if (!bool) {
      localmd = new md(i - paramdOc2.getWidth() - 10, j, paramdOc2.getWidth(), paramdOc2.getHeight(), null);
      if (localmd.x > 0)
        bool = a(localmd, paramdOc2);
      else {
        bool = false;
      }

    }

    if (!bool) {
      localmd = new md(i, j - paramdOc2.getHeight() - 10, paramdOc2.getWidth(), paramdOc2.getHeight(), null);
      if (localmd.y > 0)
        bool = a(localmd, paramdOc2);
      else {
        bool = false;
      }
    }

    if (bool) {
      return new Point(localmd.x, localmd.y);
    }

    return null;
  }

  public Point m(dOc paramdOc)
  {
    dOc localdOc = n(paramdOc);
    if (localdOc != null) {
      int i = localdOc.getDisplayX();
      int j = localdOc.getDisplayY();

      md localmd = new md(i + 30, j - (paramdOc.getHeight() - localdOc.getHeight()) - 30, paramdOc.getWidth(), paramdOc.getHeight(), null);

      if (localmd.y <= 0)
      {
        localmd.y = 0;
      }

      if (localmd.x + localmd.width > this.hex.getWidth())
      {
        localmd.x = (this.hex.getWidth() - paramdOc.getWidth());
      }
      return new Point(localmd.x, localmd.y);
    }
    return paramdOc.getPosition();
  }

  public boolean a(md parammd, dOc paramdOc) {
    dRq localdRq = this.hex.getLayeredContainer().getContainerFromWidget(paramdOc);
    if (localdRq == null) {
      return false;
    }
    ArrayList localArrayList = localdRq.getWidgetChildren();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dOc localdOc = (dOc)localArrayList.get(i);

      if ((localdOc != paramdOc) && (n(localdOc)))
      {
        if (((localdOc.getWidth() <= 1000) || (localdOc.getHeight() <= 700) || (localdOc.getX() != 0) || (localdOc.getY() != 0)) && 
          (d(localdOc.getX(), localdOc.getY(), localdOc.getWidth(), localdOc.getHeight(), (int)parammd.getX(), (int)parammd.getY(), (int)parammd.getWidth(), (int)parammd.getHeight())))
        {
          return false;
        }
      }
    }

    return true;
  }

  private boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if ((paramInt7 <= 0) || (paramInt8 <= 0) || (paramInt3 <= 0) || (paramInt4 <= 0)) {
      return false;
    }

    paramInt7 += paramInt5;
    paramInt8 += paramInt6;
    paramInt3 += paramInt1;
    paramInt4 += paramInt2;

    return ((paramInt7 < paramInt5) || (paramInt7 > paramInt1)) && ((paramInt8 < paramInt6) || (paramInt8 > paramInt2)) && ((paramInt3 < paramInt1) || (paramInt3 > paramInt5)) && ((paramInt4 < paramInt2) || (paramInt4 > paramInt6));
  }

  public boolean n(dOc paramdOc)
  {
    String str1;
    if (paramdOc.getElementMap() != null) {
      str1 = paramdOc.getElementMap().getId();
      for (String str2 : this.hey.keySet()) {
        if (str1.startsWith(str2))
        {
          return ((ArrayList)this.hey.get(str2)).contains(paramdOc);
        }
      }
    }
    return false;
  }

  public dOc n(aNL paramaNL)
  {
    String str1;
    if (paramaNL.getElementMap() != null) {
      str1 = paramaNL.getElementMap().getId();
      for (String str2 : this.hez.keySet())
        if (str1.startsWith(str2))
        {
          if (((Stack)this.hez.get(str2)).size() > 1)
          {
            localStack = (Stack)this.hez.get(str2);

            for (dOc localdOc : localStack)
              if (localdOc == paramaNL) {
                int i = localStack.indexOf(localdOc) - 1;
                return i < 0 ? null : (dOc)localStack.get(i);
              }
          }
        }
    }
    Stack localStack;
    return null;
  }

  public void c(String paramString, dOc paramdOc)
  {
    ArrayList localArrayList = (ArrayList)this.hey.get(paramString);
    if (localArrayList == null) {
      return;
    }
    if (paramdOc != null)
      a(localArrayList, paramdOc);
  }

  private void a(ArrayList paramArrayList, dOc paramdOc)
  {
    int i = paramdOc.getHeight();
    int j = paramdOc.getWidth();
    if (i == 0) {
      i = paramdOc.getPrefSize().height;
    }
    if (j == 0) {
      j = paramdOc.getPrefSize().width;
    }

    md[] arrayOfmd1 = a(paramdOc.getX(), paramdOc.getY(), j, i, this.hex.getWidth(), this.hex.getHeight());
    md[] arrayOfmd2 = 0;
    md[] arrayOfmd3 = paramArrayList.size();
    for (md localmd : arrayOfmd1) {
      if (arrayOfmd2 >= arrayOfmd3) {
        break;
      }
      arrayOfmd2 += a(localmd, paramArrayList, arrayOfmd2);
    }

    if (arrayOfmd2 < arrayOfmd3)
      for (??? = arrayOfmd2; ??? < arrayOfmd3; ???++) {
        dOc localdOc = (dOc)paramArrayList.get(???);
        if (localdOc != paramdOc)
          localdOc.setPosition(m(localdOc));
      }
  }

  private int a(md parammd, ArrayList paramArrayList, int paramInt)
  {
    if ((paramArrayList.size() == 0) || (paramInt < 0) || (paramInt >= paramArrayList.size())) {
      return 0;
    }

    int i = 0;
    Object localObject = null;
    int j = paramInt; for (int k = paramArrayList.size(); j < k; j++) {
      dOc localdOc1 = (dOc)paramArrayList.get(j);
      if ((localdOc1.getWidth() != 0) && (localdOc1.getHeight() != 0) && (localdOc1.getVisible())) {
        localObject = localdOc1;
        break;
      }
      i++;
      paramInt++;
    }

    if (localObject == null) {
      return i;
    }

    j = parammd.bA(localObject.getWidth());
    k = parammd.bB(localObject.getHeight());
    int m = 2147483647;
    int n = 2147483647;

    while (parammd.bC(j)) {
      while (parammd.bD(k))
      {
        int i1;
        int i2;
        if (e((int)parammd.getX(), (int)parammd.getY(), (int)parammd.getWidth(), (int)parammd.getHeight(), j, k, localObject.getWidth(), localObject.getHeight()))
        {
          localObject.setPosition(j, k);
          i++;
          paramInt++;

          k += parammd.bF(localObject.getHeight());

          i1 = paramInt; for (i2 = paramArrayList.size(); i1 < i2; i1++) {
            dOc localdOc2 = (dOc)paramArrayList.get(i1);
            if ((localdOc2.getWidth() != 0) && (localdOc2.getHeight() != 0) && (localdOc2.getVisible())) {
              localObject = localdOc2;
              break;
            }
            i++;
            paramInt++;
          }

          if (paramInt == paramArrayList.size())
            return i;
        }
        else
        {
          i1 = j + localObject.getWidth() > this.hex.getWidth() ? j + localObject.getWidth() - this.hex.getWidth() : j < 0 ? Math.abs(j) : -1;
          i2 = k + localObject.getHeight() > this.hex.getHeight() ? k + localObject.getHeight() - this.hex.getHeight() : k < 0 ? Math.abs(k) : -1;

          if ((i1 != -1) && (i2 != -1) && (i1 < m) && (i2 < n)) {
            i++;
          }

        }

      }

      k = parammd.bB(localObject.getHeight());
      j += parammd.bE(localObject.getWidth());
    }

    return i;
  }

  private boolean e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    return (b(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8)) && (A(paramInt5, paramInt6, paramInt7, paramInt8));
  }

  private boolean b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    return (z(paramInt1, paramInt3, paramInt5, paramInt7)) && (y(paramInt2, paramInt4, paramInt6, paramInt8));
  }

  private boolean y(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (paramInt3 < paramInt1 + paramInt2) && (paramInt3 + paramInt4 > paramInt1);
  }

  private boolean z(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (paramInt3 < paramInt1 + paramInt2) && (paramInt3 + paramInt4 > paramInt1);
  }

  private boolean A(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt1 >= 0) && (paramInt2 >= 0) && (paramInt1 + paramInt3 < this.hex.getWidth()) && (paramInt2 + paramInt4 < this.hex.getHeight());
  }

  private md[] a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    md[] arrayOfmd = new md[4];

    arrayOfmd[0] = new md(paramInt1, paramInt2 + paramInt4, paramInt3, paramInt6 - paramInt2 - paramInt4, aFD.ebW);
    arrayOfmd[1] = new md(paramInt1, 0, paramInt3, paramInt2, aFD.ebV);
    arrayOfmd[2] = new md(0, paramInt2, paramInt1, paramInt4, aFD.ebX);
    arrayOfmd[3] = new md(paramInt1 + paramInt3, paramInt2, paramInt5 - paramInt1 - paramInt3, paramInt4, aFD.ebY);

    Arrays.sort(arrayOfmd, deq.kYo);

    return arrayOfmd;
  }
}