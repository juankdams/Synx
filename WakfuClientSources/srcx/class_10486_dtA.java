import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dtA
{
  private static final wh aIk = wh.Fo();

  private static final dtA lwB = new dtA();

  public static dtA cZN()
  {
    return lwB;
  }

  public boolean ad(File paramFile)
  {
    return f(paramFile.getParentFile(), paramFile.getName());
  }

  public boolean qg(String paramString)
  {
    return ad(new File(paramString));
  }

  public boolean f(File paramFile, String paramString)
  {
    File localFile = paramFile != null ? new File(paramFile.getCanonicalPath(), paramString) : new File(paramString);

    return !localFile.getAbsolutePath().equals(localFile.getCanonicalPath());
  }

  public boolean qh(String paramString)
  {
    return ae(new File(paramString));
  }

  public boolean ae(File paramFile)
  {
    return h(paramFile.getParentFile(), paramFile.getName());
  }

  public boolean h(File paramFile, String paramString)
  {
    File localFile = new File(paramFile, paramString);
    if (!localFile.exists()) {
      String str = localFile.getName();
      String[] arrayOfString = paramFile.list(new cBq(this, str));

      return (arrayOfString != null) && (arrayOfString.length > 0);
    }
    return false;
  }

  public void a(File paramFile, aGK paramaGK)
  {
    if (ae(paramFile)) {
      if (!paramFile.delete()) {
        throw new IOException("failed to remove dangling symbolic link " + paramFile);
      }

      return;
    }

    if (!ad(paramFile))
    {
      return;
    }

    if (!paramFile.exists()) {
      throw new FileNotFoundException("No such symbolic link: " + paramFile);
    }

    File localFile1 = paramFile.getCanonicalFile();

    if ((paramaGK == null) || (localFile1.getParentFile().canWrite()))
    {
      File localFile2 = aIk.a("symlink", ".tmp", localFile1.getParentFile(), false, false);

      if (aIk.d(localFile1, paramFile))
      {
        paramFile = new File(localFile2, aIk.c(localFile1, paramFile));
      }

      int i = 0;
      try {
        try {
          aIk.g(localFile1, localFile2);
          i = 1;
        } catch (IOException localIOException1) {
          throw new IOException("Couldn't rename resource when attempting to delete '" + paramFile + "'.  Reason: " + localIOException1.getMessage());
        }

        if (!paramFile.delete()) {
          throw new IOException("Couldn't delete symlink: " + paramFile + " (was it a real file? is this " + "not a UNIX system?)");
        }

      }
      finally
      {
        if (i != 0) {
          try
          {
            aIk.g(localFile2, localFile1);
          } catch (IOException localIOException3) {
            throw new IOException("Couldn't return resource " + localFile2 + " to its original name: " + localFile1.getAbsolutePath() + ". Reason: " + localIOException3.getMessage() + "\n THE RESOURCE'S NAME ON DISK" + " HAS BEEN CHANGED BY THIS" + " ERROR!\n");
          }

        }

      }

    }
    else
    {
      cyL.a(paramaGK, new String[] { "rm", paramFile.getAbsolutePath() });
    }
  }
}