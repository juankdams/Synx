import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;

public abstract class do
{
  private final int[] Tu;
  private final int[] Tv;
  protected final cnU Tw;
  private final int[] Tx;
  private final int[] Ty;
  private final int[] Tz;
  private final int TA;

  public do(cnU paramcnU, int paramInt)
  {
    if (paramcnU == null) {
      throw new IllegalArgumentException("layoutState cannot be null");
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("invalid gap: " + paramInt);
    }
    this.Tw = paramcnU;
    this.TA = paramInt;

    this.Tu = new int[paramcnU.getComponentCount()];
    this.Tv = new int[paramcnU.getComponentCount()];

    for (int i = 0; i < paramcnU.getComponentCount(); i++) {
      JW localJW = paramcnU.ae(i);
      this.Tu[i] = a(localJW);
      this.Tv[i] = b(localJW);
    }

    this.Tx = new int[hl()];
    for (int j = 0; j < this.Tx.length; j++) {
      this.Tx[j] = 1;
    }

    ArrayList localArrayList = new ArrayList();
    this.Ty = ((int[])this.Tv.clone());
    cHR.a((int[])this.Tu.clone(), this.Ty, localArrayList);

    this.Tz = new int[hl()];
    for (int k = 0; k < this.Tz.length; k++)
      this.Tz[k] = a(k, localArrayList);
  }

  public final int getComponentCount()
  {
    return this.Tw.getComponentCount();
  }

  public final Component getComponent(int paramInt) {
    return this.Tw.getComponent(paramInt);
  }

  public final JW ae(int paramInt) {
    return this.Tw.ae(paramInt);
  }
  public abstract int hl();

  public abstract int af(int paramInt);

  public abstract int ag(int paramInt);

  public abstract do a(btg parambtg);

  public final int ah(int paramInt) { return this.Tu[paramInt]; }

  public final int ai(int paramInt)
  {
    return this.Tv[paramInt];
  }

  public final int aj(int paramInt) {
    return this.Tx[paramInt];
  }
  protected abstract int a(JW paramJW);

  protected abstract int b(JW paramJW);

  abstract int ak(int paramInt);

  abstract int b(btg parambtg);

  public final int getGap() {
    return this.TA;
  }

  public boolean i(int paramInt1, int paramInt2) {
    int i = ah(paramInt1);
    int j = ai(paramInt1);
    return (i <= paramInt2) && (paramInt2 < i + j);
  }

  public final int al(int paramInt) {
    return this.Tz[paramInt];
  }

  private int a(int paramInt, ArrayList paramArrayList) {
    int i = an(paramInt);
    if (i != -1) {
      return i;
    }
    for (int j = paramArrayList.size() - 1; j >= 0; j--) {
      if (paramInt == ((Integer)paramArrayList.get(j)).intValue()) {
        return 1;
      }
    }

    return am(paramInt);
  }

  private int am(int paramInt) {
    int i = 1;
    int j = 0;
    int k = 0;

    int m = 1;
    int n = 1;

    int i1 = 0;

    for (int i2 = 0; i2 < getComponentCount(); i2++) {
      if (i(i2, paramInt))
      {
        i1++;

        int i3 = ak(i2);

        int i4 = (i3 & 0x1) != 0 ? 1 : 0;
        int i5 = (i3 & 0x2) != 0 ? 1 : 0;
        int i6 = (i3 & 0x4) != 0 ? 1 : 0;

        if ((ah(i2) == paramInt) && (this.Ty[i2] == 1)) {
          i &= i4;
          j |= i5;
          k |= i6;
        }

        if (i5 == 0) {
          m = 0;
        }
        if (i6 == 0) {
          n = 0;
        }
      }
    }
    return (i != 0 ? 1 : 0) | ((j != 0) || ((i1 > 0) && (m != 0)) ? 2 : 0) | ((k != 0) || ((i1 > 0) && (n != 0)) ? 4 : 0);
  }

  private int an(int paramInt)
  {
    int i = 0;
    int j = -1;
    for (int k = getComponentCount() - 1; k >= 0; k--)
      if (i(k, paramInt))
      {
        Component localComponent = getComponent(k);
        JW localJW = ae(k);
        Container localContainer = a(localComponent, localJW);
        if (localContainer != null) {
          btg localbtg = (btg)localContainer.getLayout();
          localbtg.c(localContainer);
          do localdo = a(localbtg);
          int m = localdo.am(paramInt - a(localJW));
          if (j == -1) {
            j = m;
          }
          else {
            j |= m;
          }
        }
        else if ((a(localJW) == paramInt) && (b(localJW) == 1) && (!(localComponent instanceof Mw))) {
          i++;
        }
      }
    if (i > 0) {
      return -1;
    }
    return j;
  }

  public static Container a(Component paramComponent, JW paramJW) {
    if ((paramJW.UG()) && ((paramComponent instanceof Container))) {
      Container localContainer1 = (Container)paramComponent;
      if ((localContainer1.getLayout() instanceof btg)) {
        return localContainer1;
      }
      if ((localContainer1.getComponentCount() == 1) && ((localContainer1.getComponent(0) instanceof Container)))
      {
        Container localContainer2 = (Container)localContainer1.getComponent(0);
        if ((localContainer2.getLayout() instanceof btg)) {
          return localContainer2;
        }
      }
    }
    return null;
  }

  protected final Dimension getPreferredSize(int paramInt) {
    Dimension localDimension = this.Tw.hVo[paramInt];
    if (localDimension == null) {
      localDimension = cHR.c(this.Tw.getComponent(paramInt), this.Tw.ae(paramInt), true);
      this.Tw.hVo[paramInt] = localDimension;
    }
    return localDimension;
  }

  protected final Dimension getMinimumSize(int paramInt) {
    Dimension localDimension = this.Tw.hVp[paramInt];
    if (localDimension == null) {
      localDimension = cHR.a(this.Tw.getComponent(paramInt), this.Tw.ae(paramInt), true);
      this.Tw.hVp[paramInt] = localDimension;
    }
    return localDimension;
  }
}