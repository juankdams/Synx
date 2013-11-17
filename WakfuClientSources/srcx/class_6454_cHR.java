import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;

public final class cHR
{
  private static final Dimension iDn = new Dimension(2147483647, 2147483647);
  public static final int iDo = 10;

  public static Dimension a(Component paramComponent, JW paramJW, boolean paramBoolean)
  {
    Dimension localDimension = a(paramJW.bVZ, paramComponent.getMinimumSize());
    if (paramBoolean) {
      localDimension.width += 10 * paramJW.getIndent();
    }
    return localDimension;
  }

  public static Dimension b(Component paramComponent, JW paramJW, boolean paramBoolean)
  {
    Dimension localDimension = a(paramJW.bWb, iDn);
    if ((paramBoolean) && (localDimension.width < iDn.width)) {
      localDimension.width += 10 * paramJW.getIndent();
    }
    return localDimension;
  }

  public static Dimension c(Component paramComponent, JW paramJW, boolean paramBoolean) {
    Dimension localDimension = a(paramJW.bWa, paramComponent.getPreferredSize());
    if (paramBoolean) {
      localDimension.width += 10 * paramJW.getIndent();
    }
    return localDimension;
  }

  private static Dimension a(Dimension paramDimension1, Dimension paramDimension2) {
    int i = paramDimension1.width >= 0 ? paramDimension1.width : paramDimension2.width;
    int j = paramDimension1.height >= 0 ? paramDimension1.height : paramDimension2.height;
    return new Dimension(i, j);
  }

  public static void a(Component paramComponent, JW paramJW, Dimension paramDimension) {
    Dimension localDimension1 = a(paramComponent, paramJW, false);
    Dimension localDimension2 = b(paramComponent, paramJW, false);

    paramDimension.width = Math.max(paramDimension.width, localDimension1.width);
    paramDimension.height = Math.max(paramDimension.height, localDimension1.height);

    paramDimension.width = Math.min(paramDimension.width, localDimension2.width);
    paramDimension.height = Math.min(paramDimension.height, localDimension2.height);
  }

  public static int a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, ArrayList paramArrayList)
  {
    int i = paramArrayOfInt1.length;
    if (i != paramArrayOfInt2.length) {
      throw new IllegalArgumentException("size mismatch: " + i + ", " + paramArrayOfInt2.length);
    }
    if ((paramArrayList != null) && (paramArrayList.size() != 0)) {
      throw new IllegalArgumentException("eliminated must be empty");
    }

    int j = 0;
    for (int k = 0; k < i; k++) {
      j = Math.max(j, paramArrayOfInt1[k] + paramArrayOfInt2[k]);
    }

    for (int m = j - 1; m >= 0; m--)
    {
      int n = 0;
      int i1 = 0;

      for (int i2 = 0; i2 < i; i2++) {
        if (paramArrayOfInt1[i2] == m) {
          n = 1;
        }
        if (paramArrayOfInt1[i2] + paramArrayOfInt2[i2] - 1 == m) {
          i1 = 1;
        }
      }

      if ((n == 0) || (i1 == 0))
      {
        if (paramArrayList != null) {
          paramArrayList.add(new Integer(m));
        }

        for (int i3 = 0; i3 < i; i3++) {
          int i4 = (paramArrayOfInt1[i3] <= m) && (m < paramArrayOfInt1[i3] + paramArrayOfInt2[i3]) ? 1 : 0;
          int i5 = paramArrayOfInt1[i3] > m ? 1 : 0;

          if (i4 != 0) {
            paramArrayOfInt2[i3] -= 1;
          }

          if (i5 != 0) {
            paramArrayOfInt1[i3] -= 1;
          }
        }

        j--;
      }
    }
    return j;
  }
}