public abstract class bvg
{
  public boolean h(String paramString, long paramLong)
  {
    if (paramString == null) {
      return false;
    }

    String str = paramString.trim();
    if (str.length() == 0) {
      return false;
    }

    for (aYU localaYU : aYU.values()) {
      if (localaYU.hE(str)) {
        return h(localaYU.ordinal(), paramLong);
      }
    }
    return false;
  }

  protected abstract boolean h(int paramInt, long paramLong);
}