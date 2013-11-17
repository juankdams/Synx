import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public enum dqA
{
  private static final Pattern lst;
  private static dqA[] lsu;

  private static boolean pH(String paramString)
  {
    int i = adF.ec(paramString);
    return (i & 0x4) != 0;
  }

  private hf j(String paramString1, String paramString2, boolean paramBoolean) {
    switch (bau.fiB[ordinal()]) {
    case 1:
      try {
        cdM localcdM = new cdM();
        localcdM.load(paramString1, paramString2);
        return localcdM;
      }
      catch (IOException localIOException1)
      {
      }

    case 2:
      try
      {
        aEj localaEj = new aEj();
        localaEj.load(paramString1, paramString2);
        return localaEj;
      }
      catch (IOException localIOException2)
      {
      }

    case 3:
      if (paramBoolean) {
        try {
          String[] arrayOfString = dzp.c(paramString1, '-');
          URL localURL = new URL(paramString2 + arrayOfString[0] + ".ttf");
          if (bAy.d(localURL)) {
            BufferedInputStream localBufferedInputStream = new BufferedInputStream(localURL.openStream());
            Font localFont1 = Font.createFont(0, localBufferedInputStream);
            localBufferedInputStream.close();

            Font localFont2 = Font.decode(paramString1);
            localFont1 = localFont1.deriveFont(localFont2.getStyle(), localFont2.getSize());
            return new aYE(localFont1, true, pH(paramString1));
          }
        }
        catch (Exception localException)
        {
        }
      }
      break;
    case 4:
      if (paramBoolean) {
        return new aYE(Font.decode(paramString1), true, pH(paramString1));
      }
      break;
    }

    return null;
  }

  public static hf g(String paramString1, String paramString2, boolean paramBoolean) {
    int i = 0; for (int j = lsu.length; i < j; i++) {
      hf localhf = lsu[i].j(paramString1, paramString2, paramBoolean);
      if (localhf != null) {
        return localhf;
      }
    }

    return null;
  }

  public static void c(Comparator paramComparator) {
    Arrays.sort(lsu, paramComparator);
  }

  static
  {
    lst = Pattern.compile("-");

    lsu = new dqA[values().length];

    dqA[] arrayOfdqA = values();
    int i = 0; for (int j = arrayOfdqA.length; i < j; i++)
      lsu[i] = arrayOfdqA[i];
  }
}