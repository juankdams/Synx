import java.util.Calendar;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class bAL
{
  private static final Logger K = Logger.getLogger(bAL.class);

  public static cYq ai(String paramString1, String paramString2)
  {
    if (!li.d(paramString1, paramString2)) {
      throw new aPr(paramString1, paramString2);
    }

    int i = 0; int j = 1; int k = 1; int m = 0; int n = 0; int i1 = 0;

    char[] arrayOfChar = paramString1.toCharArray();
    int i2 = 0; int i3 = 0;

    while (i2 < arrayOfChar.length) {
      char c = arrayOfChar[(i2++)];

      int i4 = i3++;

      if (c == aax.cOH.getChar())
      {
        c = arrayOfChar[(i2++)];
        String str1;
        if (i2 < arrayOfChar.length)
        {
          int i5 = paramString2.indexOf(arrayOfChar[i2], i3);

          str1 = paramString2.substring(i4, i5);
        }
        else {
          str1 = paramString2.substring(i4);
        }

        i3 += str1.length();

        aax localaax = (aax)aax.cOP.get(Character.valueOf(c));
        switch (Lr.bXX[localaax.ordinal()]) {
        case 1:
          String str2 = aKS.getInstance().get(1) / 100 + str1;
          i = Integer.parseInt(str2);
          break;
        case 2:
          i = Integer.parseInt(str1);
          break;
        case 3:
          j = Integer.parseInt(str1);
          break;
        case 4:
          k = Integer.parseInt(str1);
          break;
        case 5:
          m = Integer.parseInt(str1);
          break;
        case 6:
          n = Integer.parseInt(str1);
          break;
        case 7:
          i1 = Integer.parseInt(str1);
        }

        i2++;
      }
    }
    return new cYq(i1, n, m, k, j, i);
  }

  public static String a(String paramString, dxL paramdxL)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    int j = 0;
    while (i < arrayOfChar.length) {
      if (arrayOfChar[i] == '%') {
        if (i != j) {
          localStringBuilder.append(arrayOfChar, j, i - j);
        }

        i++;

        if (i == arrayOfChar.length)
        {
          j = arrayOfChar.length;
          break;
        }

        char c = arrayOfChar[i];

        aax localaax = (aax)aax.cOP.get(Character.valueOf(c));
        int k;
        switch (Lr.bXX[localaax.ordinal()]) {
        case 1:
          localStringBuilder.append(paramdxL.getYear() % 100);
          break;
        case 2:
          localStringBuilder.append(paramdxL.getYear());
          break;
        case 3:
          k = paramdxL.getMonth();
          if (k < 10) {
            localStringBuilder.append('0');
          }
          localStringBuilder.append(k);
          break;
        case 4:
          k = paramdxL.getDay();
          if (k < 10) {
            localStringBuilder.append('0');
          }
          localStringBuilder.append(k);
          break;
        case 5:
          k = paramdxL.getHours();
          if (k < 10) {
            localStringBuilder.append('0');
          }
          localStringBuilder.append(k);
          break;
        case 6:
          k = paramdxL.getMinutes();
          if (k < 10) {
            localStringBuilder.append('0');
          }
          localStringBuilder.append(k);
          break;
        case 7:
          k = paramdxL.getSeconds();
          if (k < 10) {
            localStringBuilder.append('0');
          }
          localStringBuilder.append(k);
          break;
        case 8:
          localStringBuilder.append(aax.cOH.getChar());
          break;
        default:
          K.warn("Caractère de formattage inconnu '" + c + "' dans la chaine " + paramString);
        }

        j = i + 1;
      }
      i++;
    }

    localStringBuilder.append(arrayOfChar, j, arrayOfChar.length - j);

    return localStringBuilder.toString();
  }
}