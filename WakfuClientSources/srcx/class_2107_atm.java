import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;
import java.util.HashMap;

public class atm
  implements LayoutManager2
{
  private final HashMap cIN = new HashMap();

  public void addLayoutComponent(Component paramComponent, Object paramObject) {
    this.cIN.put(paramComponent, (cLS)paramObject);
  }

  public Dimension maximumLayoutSize(Container paramContainer) {
    return new Dimension(2147483647, 2147483647);
  }

  public float getLayoutAlignmentX(Container paramContainer) {
    return 0.5F;
  }

  public float getLayoutAlignmentY(Container paramContainer) {
    return 0.5F;
  }

  public void invalidateLayout(Container paramContainer) {
  }

  public void addLayoutComponent(String paramString, Component paramComponent) {
  }

  public void removeLayoutComponent(Component paramComponent) {
    this.cIN.remove(paramComponent);
  }

  public Dimension preferredLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      int i = -2147483648;
      int j = -2147483648;

      int k = 0; for (int m = paramContainer.getComponentCount(); k < m; k++) {
        Component localComponent = paramContainer.getComponent(k);
        if (localComponent.isVisible()) {
          Dimension localDimension = localComponent.getPreferredSize();

          i = Math.max((int)localDimension.getWidth(), i);
          j = Math.max((int)localDimension.getHeight(), j);
        }
      }

      Insets localInsets = paramContainer.getInsets();
      i += localInsets.left + localInsets.right;
      j += localInsets.top + localInsets.bottom;

      return new Dimension(i, j);
    }
  }

  public Dimension minimumLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      int i = -2147483648;
      int j = -2147483648;

      int k = 0; for (int m = paramContainer.getComponentCount(); k < m; k++) {
        Component localComponent = paramContainer.getComponent(k);
        if (localComponent.isVisible()) {
          Dimension localDimension = localComponent.getMinimumSize();

          i = Math.max((int)localDimension.getWidth(), i);
          j = Math.max((int)localDimension.getHeight(), j);
        }
      }

      Insets localInsets = paramContainer.getInsets();
      i += localInsets.left + localInsets.right;
      j += localInsets.top + localInsets.bottom;

      return new Dimension(i, j);
    }
  }

  public void layoutContainer(Container paramContainer) {
    Insets localInsets = paramContainer.getInsets();
    int i = paramContainer.getWidth() - localInsets.left - localInsets.right;
    int j = paramContainer.getHeight() - localInsets.top - localInsets.bottom;

    int k = 0; for (int m = paramContainer.getComponentCount(); k < m; k++) {
      Component localComponent = paramContainer.getComponent(k);
      if (localComponent.isVisible()) {
        cLS localcLS = (cLS)this.cIN.get(localComponent);
        if (localcLS == null) {
          localComponent.setBounds(localInsets.left, localInsets.top, i, j);
        } else {
          Dimension localDimension = localComponent.getPreferredSize();
          int n = localcLS.t(i, localDimension.width);
          int i1 = localcLS.q(j, localDimension.height);
          if (localcLS.cEQ()) {
            n += n % 2;
            i1 += i1 % 2;
          }
          int i2 = localcLS.r(n, i) + localInsets.top;
          int i3 = localcLS.s(i1, j) + localInsets.left;
          localComponent.setBounds(i2, i3, n, i1);
        }
      }
    }
  }
}