import java.util.Arrays;

public class dwr
{
  private final String lBH;
  private final int width;
  private final int height;
  private final int[] lBI;
  private final int[] lBJ;

  public dwr(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    a(paramString, paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
    this.lBH = paramString;
    this.width = paramInt1;
    this.height = paramInt2;
    this.lBI = Arrays.copyOf(paramArrayOfInt1, paramArrayOfInt1.length);
    this.lBJ = Arrays.copyOf(paramArrayOfInt2, paramArrayOfInt2.length);
  }

  public final String dbI()
  {
    return this.lBH;
  }

  public final int getWidth()
  {
    return this.width;
  }

  public final int getHeight()
  {
    return this.height;
  }

  public final int[] dbJ()
  {
    return this.lBI;
  }

  public final int[] dbK()
  {
    return this.lBJ;
  }

  public final int dbL()
  {
    return this.lBI.length;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("chroma=").append(this.lBH).append(',');
    localStringBuilder.append("width=").append(this.width).append(',');
    localStringBuilder.append("height=").append(this.height).append(',');
    localStringBuilder.append("pitches=").append(Arrays.toString(this.lBI)).append(',');
    localStringBuilder.append("lines=").append(Arrays.toString(this.lBJ)).append(']');
    return localStringBuilder.toString();
  }

  private void a(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if ((paramString == null) || (paramString.length() != 4)) {
      throw new IllegalArgumentException("chroma must be exactly 4 characters");
    }
    if (paramInt1 <= 0) {
      throw new IllegalArgumentException("width must be greater than zero");
    }
    if (paramInt2 <= 0) {
      throw new IllegalArgumentException("height must be greater than zero");
    }
    if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length == 0)) {
      throw new IllegalArgumentException("pitches length must be greater than zero");
    }
    if ((paramArrayOfInt2 == null) || (paramArrayOfInt2.length == 0)) {
      throw new IllegalArgumentException("lines length must be greater than zero");
    }
    if (paramArrayOfInt1.length != paramArrayOfInt2.length) {
      throw new IllegalArgumentException("pitches and lines must have equal length");
    }
    for (int i = 0; i < paramArrayOfInt1.length; i++) {
      if (paramArrayOfInt1[i] <= 0) {
        throw new IllegalArgumentException("pitch must be greater than zero");
      }
      if (paramArrayOfInt2[i] <= 0)
        throw new IllegalArgumentException("line must be greater than zero");
    }
  }
}