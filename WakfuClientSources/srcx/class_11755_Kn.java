import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kn
{
  private static final int bWE = 16;
  private static final ArrayList bWF = new ArrayList(64);
  private boolean bim;
  private gn bWG;
  private DisplayedScreenElement[] bWH;
  private final ArrayList bWI = new ArrayList();

  private static final Comparator bWJ = new dqp();

  public Kn()
  {
    this.bim = false;
  }

  public void a(gn paramgn, HA paramHA, boolean paramBoolean)
  {
    a(paramHA);
    this.bWG = paramgn;

    if (this.bWG == null) {
      return;
    }
    int i = this.bWG.f(btb.bBm());
    this.bWH = new DisplayedScreenElement[i];
    int j = 0;
    int k = 0; for (int m = this.bWG.aDd.size(); k < m; k++) {
      ScreenElement localScreenElement = (ScreenElement)this.bWG.aDd.get(k);

      int n = localScreenElement.ddL().bBm();
      if ((n & btb.bBm()) == n)
      {
        DisplayedScreenElement localDisplayedScreenElement = paramHA.bC(localScreenElement.lGL);
        if ((paramBoolean) || (localDisplayedScreenElement.fis == null))
          localDisplayedScreenElement.c(localScreenElement);
        this.bWH[j] = localDisplayedScreenElement;
        j++;

        if (localScreenElement.cjQ())
          this.bWI.add(localDisplayedScreenElement);
      }
    }
  }

  final boolean a(cuA paramcuA)
  {
    if (this.bWG == null)
      return false;
    return paramcuA.B(this.bWG.aEi, this.bWG.aEf, this.bWG.aEg, this.bWG.aEh);
  }

  ArrayList UR() {
    return this.bWI;
  }

  public void update() {
    if (this.bim)
      return;
    if (this.bWH == null) {
      this.bim = true;
      return;
    }

    for (int i = 0; i < this.bWH.length; i++) {
      DisplayedScreenElement localDisplayedScreenElement = this.bWH[i];
      if ((localDisplayedScreenElement.fiu != null) && (localDisplayedScreenElement.fiu.hN() != null))
      {
        if (!localDisplayedScreenElement.fiu.hN().gI())
          return; 
      }
    }
    this.bim = true;
  }

  public void a(adG paramadG, ArrayList paramArrayList, cuA paramcuA) {
    if (!a(paramcuA)) {
      return;
    }
    int i = 0; for (int j = this.bWH.length; i < j; i++)
      this.bWH[i].a(paramadG, paramArrayList, paramcuA);
  }

  public final gn US()
  {
    return this.bWG;
  }

  public final DisplayedScreenElement[] UT() {
    return this.bWH;
  }

  public boolean gI() {
    return this.bim;
  }

  final void a(int paramInt1, int paramInt2, ArrayList paramArrayList, cWj paramcWj)
  {
    if (this.bWH == null)
      return;
    if (!ac(paramInt1, paramInt2)) {
      return;
    }
    int i = this.bWH.length;
    if (i <= 16) {
      for (j = 0; j < i; j++) {
        DisplayedScreenElement localDisplayedScreenElement1 = this.bWH[j];
        ScreenElement localScreenElement1 = localDisplayedScreenElement1.fis;
        if ((localScreenElement1.lHo == paramInt1) && (localScreenElement1.lHp == paramInt2) && 
          (paramcWj.f(localDisplayedScreenElement1)) && (!paramArrayList.contains(localDisplayedScreenElement1))) {
          paramArrayList.add(localDisplayedScreenElement1);
        }
      }
      return;
    }

    int j = 0;
    int k = i - 1;

    int n = -1;
    do {
      int m = k + j >>> 1;

      if (j + 1 == k) {
        localScreenElement2 = this.bWH[j].fis;
        if ((localScreenElement2.lHo == paramInt1) && (localScreenElement2.lHp == paramInt2)) {
          n = j;
          break;
        }

        localScreenElement2 = this.bWH[k].fis;
        if ((localScreenElement2.lHo == paramInt1) && (localScreenElement2.lHp == paramInt2)) {
          n = k;
          break;
        }
        return;
      }

      ScreenElement localScreenElement2 = this.bWH[m].fis;
      if (localScreenElement2.lHp > paramInt2)
        k = m;
      else if (localScreenElement2.lHp < paramInt2) {
        j = m;
      }
      else if (localScreenElement2.lHo > paramInt1)
        k = m;
      else if (localScreenElement2.lHo < paramInt1) {
        j = m;
      }
      else {
        n = m;
      }
    }
    while (n == -1);

    j = n;
    int i1 = 1;
    ScreenElement localScreenElement3;
    while (j - i1 >= 0) {
      localScreenElement3 = this.bWH[(j - i1)].fis;
      if ((localScreenElement3.lHo != paramInt1) || (localScreenElement3.lHp != paramInt2))
        break;
      i1++;
    }

    j = j + 1 - i1;

    while (n + 1 < i) {
      localScreenElement3 = this.bWH[(++n)].fis;
      if ((localScreenElement3.lHo != paramInt1) || (localScreenElement3.lHp != paramInt2))
        break;
      i1++;
    }

    for (int i2 = 0; i2 < i1; i2++) {
      DisplayedScreenElement localDisplayedScreenElement2 = this.bWH[(j + i2)];
      if ((paramcWj.f(localDisplayedScreenElement2)) && (!paramArrayList.contains(localDisplayedScreenElement2)))
        paramArrayList.add(localDisplayedScreenElement2);
    }
  }

  final DisplayedScreenElement a(int paramInt1, int paramInt2, cWj paramcWj)
  {
    if (!ac(paramInt1, paramInt2)) {
      return null;
    }
    bWF.clear();
    a(paramInt1, paramInt2, bWF, paramcWj);

    Object localObject = null;
    int i = bWF.size();
    for (int j = 0; j < i; j++) {
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)bWF.get(j);
      if (localDisplayedScreenElement.fis.lHo == paramInt1)
      {
        if (localDisplayedScreenElement.fis.lHp == paramInt2)
        {
          if ((localObject == null) || (localObject.fis.lHr <= localDisplayedScreenElement.fis.lHr))
          {
            localObject = localDisplayedScreenElement;
          }
        }
      }
    }
    return localObject;
  }

  final DisplayedScreenElement a(int paramInt1, int paramInt2, int paramInt3, cWj paramcWj)
  {
    if (!ac(paramInt2, paramInt3)) {
      return null;
    }

    bWF.clear();
    a(paramInt2, paramInt3, bWF, paramcWj);

    for (int i = bWF.size() - 1; i >= 0; i--) {
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)bWF.get(i);
      if ((localDisplayedScreenElement.fis.lHo != paramInt2) || (localDisplayedScreenElement.fis.lHp != paramInt3))
      {
        bWF.remove(i);
      }

    }

    if (bWF.size() <= paramInt1) {
      return null;
    }

    Collections.sort(bWF, bWJ);

    return (DisplayedScreenElement)bWF.get(bWF.size() - 1 - paramInt1);
  }

  DisplayedScreenElement b(int paramInt1, int paramInt2, int paramInt3, cWj paramcWj) {
    if (!l(paramInt1, paramInt2, (short)paramInt3)) {
      return null;
    }
    bWF.clear();
    a(paramInt1, paramInt2, bWF, paramcWj);

    Object localObject = null;
    int i = bWF.size();
    for (int j = 0; j < i; j++) {
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)bWF.get(j);
      ScreenElement localScreenElement = localDisplayedScreenElement.fis;
      if (localScreenElement.lHo == paramInt1)
      {
        if (localScreenElement.lHp == paramInt2)
        {
          if ((localScreenElement.fdo == paramInt3) || ((localScreenElement.lHq.cjK()) && (localScreenElement.fdo - localScreenElement.io == paramInt3)))
          {
            if ((localObject == null) || (localObject.fis.lHr <= localScreenElement.lHr))
            {
              localObject = localDisplayedScreenElement;
            }
          }
        }
      }
    }
    return localObject;
  }

  final DisplayedScreenElement c(int paramInt1, int paramInt2, int paramInt3, cWj paramcWj)
  {
    if (!l(paramInt1, paramInt2, (short)paramInt3)) {
      return null;
    }
    bWF.clear();
    a(paramInt1, paramInt2, bWF, paramcWj);

    Object localObject = null;
    int i = bWF.size();
    for (int j = 0; j < i; j++) {
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)bWF.get(j);
      if ((!bB) && (localDisplayedScreenElement.fis.lHo != paramInt1)) throw new AssertionError();
      if ((!bB) && (localDisplayedScreenElement.fis.lHp != paramInt2)) throw new AssertionError();

      if (localDisplayedScreenElement.fis.fdo == paramInt3)
      {
        if ((localObject == null) || (localObject.fis.lHr <= localDisplayedScreenElement.fis.lHr))
        {
          if (localDisplayedScreenElement.fis.lHq.cjN())
          {
            localObject = localDisplayedScreenElement;
          }
        }
      }
    }
    return localObject;
  }

  void a(int paramInt1, int paramInt2, ArrayList paramArrayList)
  {
    if (!contains(paramInt1, paramInt2))
      return;
    for (int i = 0; i < this.bWH.length; i++) {
      DisplayedScreenElement localDisplayedScreenElement = this.bWH[i];
      EntitySprite localEntitySprite = localDisplayedScreenElement.fiu;
      if ((paramInt2 >= localEntitySprite.aEg) && (paramInt2 < localEntitySprite.aEi))
      {
        if ((paramInt1 >= localEntitySprite.aEf) && (paramInt1 < localEntitySprite.aEh))
        {
          if (!localDisplayedScreenElement.fis.lHq.cjK())
          {
            if (localDisplayedScreenElement.isVisible())
            {
              if (localDisplayedScreenElement.M(paramInt1, paramInt2))
              {
                if (!paramArrayList.contains(localDisplayedScreenElement))
                  paramArrayList.add(localDisplayedScreenElement);  }  }  } 
        }
      }
    }
  }

  private boolean ac(int paramInt1, int paramInt2) { return (this.bWG == null) || (this.bWG.p(paramInt1, paramInt2)); }

  private boolean l(int paramInt1, int paramInt2, short paramShort)
  {
    return (this.bWG == null) || (this.bWG.e(paramInt1, paramInt2, paramShort));
  }

  private boolean contains(int paramInt1, int paramInt2) {
    if (this.bWG == null) {
      return false;
    }
    if (paramInt1 > this.bWG.aEh)
      return false;
    if (paramInt1 < this.bWG.aEf)
      return false;
    if (paramInt2 > this.bWG.aEi) {
      return false;
    }
    if (paramInt2 < this.bWG.aEg)
      return false;
    return true;
  }

  public void a(HA paramHA) {
    if (this.bWG == null) {
      return;
    }
    for (int i = 0; i < this.bWH.length; i++) {
      DisplayedScreenElement localDisplayedScreenElement = this.bWH[i];
      localDisplayedScreenElement.a(paramHA);
    }
    this.bWI.clear();
    this.bWH = null;
    this.bWG = null;
    this.bim = false;
  }

  public final String toString()
  {
    return "DisplayedScreenMap {" + this.bWG + "}";
  }
}