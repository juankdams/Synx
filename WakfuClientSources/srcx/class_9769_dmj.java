import java.io.File;

public class dmj
{
  public static final dmj ljY = new dmj("", new String[0]);
  private final String pattern;
  private final String[] ljZ;

  public dmj(String paramString)
  {
    this(paramString, dvA.qu(paramString));
  }

  dmj(String paramString, String[] paramArrayOfString) {
    this.pattern = paramString;
    this.ljZ = paramArrayOfString;
  }

  public boolean a(dfT paramdfT, boolean paramBoolean)
  {
    return dvA.b(this.ljZ, paramdfT.cPw(), paramBoolean);
  }

  public boolean b(dfT paramdfT, boolean paramBoolean)
  {
    return dvA.a(this.ljZ, paramdfT.cPw(), paramBoolean);
  }

  public String toString()
  {
    return this.pattern;
  }

  public String getPattern() {
    return this.pattern;
  }

  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof dmj)) && (this.pattern.equals(((dmj)paramObject).pattern));
  }

  public int hashCode()
  {
    return this.pattern.hashCode();
  }

  public int depth()
  {
    return this.ljZ.length;
  }

  public boolean pw(String paramString)
  {
    for (int i = 0; i < this.ljZ.length; i++) {
      if (this.ljZ[i].equals(paramString)) {
        return true;
      }
    }
    return false;
  }

  public dfT cTZ()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; 
      (i < this.ljZ.length) && 
      (!dvA.qw(this.ljZ[i])); i++)
    {
      if ((i > 0) && (localStringBuilder.charAt(localStringBuilder.length() - 1) != File.separatorChar))
      {
        localStringBuilder.append(File.separator);
      }
      localStringBuilder.append(this.ljZ[i]);
    }
    if (i == 0) {
      return dfT.laA;
    }
    String[] arrayOfString = new String[i];
    System.arraycopy(this.ljZ, 0, arrayOfString, 0, i);
    return new dfT(localStringBuilder.toString(), arrayOfString);
  }

  public boolean endsWith(String paramString)
  {
    return (this.ljZ.length > 0) && (this.ljZ[(this.ljZ.length - 1)].equals(paramString));
  }

  public dmj cUa()
  {
    if (this.ljZ.length == 0)
      throw new IllegalStateException("cant strip a token from nothing");
    if (this.ljZ.length == 1) {
      return ljY;
    }
    String str = this.ljZ[(this.ljZ.length - 1)];
    int i = this.pattern.lastIndexOf(str);
    String[] arrayOfString = new String[this.ljZ.length - 1];
    System.arraycopy(this.ljZ, 0, arrayOfString, 0, this.ljZ.length - 1);

    return new dmj(this.pattern.substring(0, i), arrayOfString);
  }
}