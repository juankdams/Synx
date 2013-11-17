public class bwp
  implements auW
{
  private static boolean I(char paramChar)
  {
    int i = (paramChar >= '一') && (paramChar <= 40869) ? 1 : 0;
    int j = (paramChar >= 'ぁ') && (paramChar <= 'ゖ') ? 1 : 0;
    return (i != 0) || (j != 0) || (paramChar == '\'') || (paramChar == '-');
  }

  public bzE fL(String paramString) {
    char[] arrayOfChar = paramString.toCharArray();

    for (int i = 0; i < arrayOfChar.length; i++) {
      if (!I(arrayOfChar[i]))
        return bzE.gnR;
    }
    if (paramString.length() < 2) {
      return bzE.gnP;
    }
    if (paramString.length() > 10) {
      return bzE.gnQ;
    }
    return bzE.gnO;
  }
}