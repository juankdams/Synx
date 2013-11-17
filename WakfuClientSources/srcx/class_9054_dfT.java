import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class dfT
{
  public static final dfT laA = new dfT("", new String[0]);

  private static final wh aIk = wh.Fo();

  private static final dtA fKG = dtA.cZN();

  private static final boolean[] laB = { true };

  private static final boolean[] laC = { true, false };
  private final String path;
  private final String[] laD;

  public dfT(String paramString)
  {
    this(paramString, dvA.qu(paramString));
  }

  public dfT(dfT paramdfT, String paramString)
  {
    if ((paramdfT.path.length() > 0) && (paramdfT.path.charAt(paramdfT.path.length() - 1) != File.separatorChar))
    {
      this.path = (paramdfT.path + File.separatorChar + paramString);
    }
    else paramdfT.path += paramString;

    this.laD = new String[paramdfT.laD.length + 1];
    System.arraycopy(paramdfT.laD, 0, this.laD, 0, paramdfT.laD.length);

    this.laD[paramdfT.laD.length] = paramString;
  }

  dfT(String paramString, String[] paramArrayOfString) {
    this.path = paramString;
    this.laD = paramArrayOfString;
  }

  public String toString()
  {
    return this.path;
  }

  public int depth()
  {
    return this.laD.length;
  }

  String[] cPw() {
    return this.laD;
  }

  public File c(File paramFile, boolean paramBoolean)
  {
    String[] arrayOfString = this.laD;
    if (wh.isAbsolutePath(this.path))
    {
      Object localObject;
      if (paramFile == null) {
        localObject = aIk.aT(this.path);
        paramFile = new File(localObject[0]);
        arrayOfString = dvA.qu(localObject[1]);
      } else {
        localObject = aIk.aS(this.path);
        String str = aIk.c(paramFile, (File)localObject);
        if (str.equals(((File)localObject).getAbsolutePath()))
        {
          return null;
        }
        arrayOfString = dvA.qu(str);
      }
    }
    return a(paramFile, arrayOfString, paramBoolean);
  }

  public boolean W(File paramFile)
  {
    for (int i = 0; i < this.laD.length; i++) {
      try {
        if (((paramFile != null) && (fKG.f(paramFile, this.laD[i]))) || ((paramFile == null) && (fKG.qg(this.laD[i]))))
        {
          return true;
        }
        paramFile = new File(paramFile, this.laD[i]);
      } catch (IOException localIOException) {
        String str = "IOException caught while checking for links, couldn't get canonical path!";

        System.err.println(str);
      }
    }
    return false;
  }

  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof dfT)) && (this.path.equals(((dfT)paramObject).path));
  }

  public int hashCode()
  {
    return this.path.hashCode();
  }

  private static File a(File paramFile, String[] paramArrayOfString, boolean paramBoolean)
  {
    for (int i = 0; i < paramArrayOfString.length; i++) {
      if (!paramFile.isDirectory()) {
        return null;
      }
      String[] arrayOfString = paramFile.list();
      if (arrayOfString == null) {
        throw new cJ("IO error scanning directory " + paramFile.getAbsolutePath());
      }

      int j = 0;
      boolean[] arrayOfBoolean = paramBoolean ? laB : laC;
      for (int k = 0; (j == 0) && (k < arrayOfBoolean.length); k++) {
        for (int m = 0; (j == 0) && (m < arrayOfString.length); m++) {
          if (arrayOfBoolean[k] != 0 ? arrayOfString[m].equals(paramArrayOfString[i]) : arrayOfString[m].equalsIgnoreCase(paramArrayOfString[i]))
          {
            paramFile = new File(paramFile, arrayOfString[m]);
            j = 1;
          }
        }
      }
      if (j == 0) {
        return null;
      }
    }
    return (paramArrayOfString.length == 0) && (!paramFile.isDirectory()) ? null : paramFile;
  }

  public dmj cPx()
  {
    return new dmj(this.path, this.laD);
  }
}