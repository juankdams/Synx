import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;

public abstract class dPq
  implements LayoutManager2
{
  public static final int mgP = 10;
  public static final int mgQ = 5;
  protected Component[] hVk;
  protected JW[] hVl;
  protected Insets mgR;
  private int mgS;
  private int mgT;

  public dPq()
  {
    this.hVk = new Component[0];
    this.hVl = new JW[0];
    this.mgR = new Insets(0, 0, 0, 0);
    this.mgS = -1;
    this.mgT = -1;
  }

  public final Insets getMargin() {
    return (Insets)this.mgR.clone();
  }

  public final int dqz()
  {
    return this.mgS;
  }

  protected static int d(Container paramContainer)
  {
    if (paramContainer == null) {
      throw new IllegalArgumentException("container cannot be null");
    }
    while (paramContainer != null) {
      if ((paramContainer.getLayout() instanceof dPq)) {
        dPq localdPq = (dPq)paramContainer.getLayout();
        if (localdPq.dqz() != -1) {
          return localdPq.dqz();
        }
      }
      paramContainer = paramContainer.getParent();
    }
    return 10;
  }

  public final void setHGap(int paramInt)
  {
    if (paramInt < -1) {
      throw new IllegalArgumentException("wrong hGap: " + paramInt);
    }
    this.mgS = paramInt;
  }

  public final int dqA()
  {
    return this.mgT;
  }

  protected static int e(Container paramContainer)
  {
    if (paramContainer == null) {
      throw new IllegalArgumentException("container cannot be null");
    }
    while (paramContainer != null) {
      if ((paramContainer.getLayout() instanceof dPq)) {
        dPq localdPq = (dPq)paramContainer.getLayout();
        if (localdPq.dqA() != -1) {
          return localdPq.dqA();
        }
      }
      paramContainer = paramContainer.getParent();
    }
    return 5;
  }

  public final void setVGap(int paramInt)
  {
    if (paramInt < -1) {
      throw new IllegalArgumentException("wrong vGap: " + paramInt);
    }
    this.mgT = paramInt;
  }

  public final void setMargin(Insets paramInsets) {
    if (paramInsets == null) {
      throw new IllegalArgumentException("margin cannot be null");
    }
    this.mgR = ((Insets)paramInsets.clone());
  }

  final int getComponentCount() {
    return this.hVk.length;
  }

  final Component getComponent(int paramInt) {
    return this.hVk[paramInt];
  }

  final JW ae(int paramInt) {
    return this.hVl[paramInt];
  }

  public void addLayoutComponent(Component paramComponent, Object paramObject) {
    if (!(paramObject instanceof JW)) {
      throw new IllegalArgumentException("constraints: " + paramObject);
    }

    Component[] arrayOfComponent = new Component[this.hVk.length + 1];
    System.arraycopy(this.hVk, 0, arrayOfComponent, 0, this.hVk.length);
    arrayOfComponent[this.hVk.length] = paramComponent;
    this.hVk = arrayOfComponent;

    JW[] arrayOfJW = new JW[this.hVl.length + 1];
    System.arraycopy(this.hVl, 0, arrayOfJW, 0, this.hVl.length);
    arrayOfJW[this.hVl.length] = ((JW)paramObject);
    this.hVl = arrayOfJW;
  }

  public final void addLayoutComponent(String paramString, Component paramComponent) {
    throw new UnsupportedOperationException();
  }

  public final void removeLayoutComponent(Component paramComponent) {
    int i = getComponentIndex(paramComponent);
    if (i == -1) {
      throw new IllegalArgumentException("component was not added: " + paramComponent);
    }

    Component[] arrayOfComponent = new Component[this.hVk.length - 1];
    System.arraycopy(this.hVk, 0, arrayOfComponent, 0, i);
    System.arraycopy(this.hVk, i + 1, arrayOfComponent, i, this.hVk.length - i - 1);
    this.hVk = arrayOfComponent;

    JW[] arrayOfJW = new JW[this.hVl.length - 1];
    System.arraycopy(this.hVl, 0, arrayOfJW, 0, i);
    System.arraycopy(this.hVl, i + 1, arrayOfJW, i, this.hVl.length - i - 1);
    this.hVl = arrayOfJW;
  }

  public JW d(Component paramComponent) {
    int i = getComponentIndex(paramComponent);
    if (i == -1) {
      throw new IllegalArgumentException("component was not added: " + paramComponent);
    }

    return this.hVl[i];
  }

  private int getComponentIndex(Component paramComponent) {
    for (int i = 0; i < this.hVk.length; i++) {
      Component localComponent = this.hVk[i];
      if (localComponent == paramComponent) {
        return i;
      }
    }
    return -1;
  }

  public final float getLayoutAlignmentX(Container paramContainer) {
    return 0.5F;
  }

  public final float getLayoutAlignmentY(Container paramContainer) {
    return 0.5F;
  }

  public abstract Dimension maximumLayoutSize(Container paramContainer);

  public abstract void invalidateLayout(Container paramContainer);

  public abstract Dimension preferredLayoutSize(Container paramContainer);

  public abstract Dimension minimumLayoutSize(Container paramContainer);

  public abstract void layoutContainer(Container paramContainer);
}