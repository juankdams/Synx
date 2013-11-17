import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class aFj extends dRB
{
  public Process a(FF paramFF, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    File localFile = a(paramArrayOfString1, paramArrayOfString2);
    Process localProcess = super.a(paramFF, new String[] { localFile.getPath() }, paramArrayOfString2);
    a(localFile, localProcess);
    return localProcess;
  }

  public Process a(FF paramFF, String[] paramArrayOfString1, String[] paramArrayOfString2, File paramFile)
  {
    File localFile = a(paramArrayOfString1, paramArrayOfString2);
    Process localProcess = super.a(paramFF, new String[] { localFile.getPath() }, paramArrayOfString2, paramFile);

    a(localFile, localProcess);
    return localProcess;
  }

  private File a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    File localFile = aIk.a("ANT", ".COM", null, true, true);
    BufferedWriter localBufferedWriter = null;
    try {
      localBufferedWriter = new BufferedWriter(new FileWriter(localFile));

      if (paramArrayOfString2 != null)
      {
        for (int j = 0; j < paramArrayOfString2.length; j++) {
          i = paramArrayOfString2[j].indexOf('=');
          if (i != -1) {
            localBufferedWriter.write("$ DEFINE/NOLOG ");
            localBufferedWriter.write(paramArrayOfString2[j].substring(0, i));
            localBufferedWriter.write(" \"");
            localBufferedWriter.write(paramArrayOfString2[j].substring(i + 1));
            localBufferedWriter.write(34);
            localBufferedWriter.newLine();
          }
        }
      }
      localBufferedWriter.write("$ " + paramArrayOfString1[0]);
      for (int i = 1; i < paramArrayOfString1.length; i++) {
        localBufferedWriter.write(" -");
        localBufferedWriter.newLine();
        localBufferedWriter.write(paramArrayOfString1[i]);
      }
    } finally {
      wh.a(localBufferedWriter);
    }
    return localFile;
  }

  private void a(File paramFile, Process paramProcess) {
    new amM(this, paramProcess, paramFile).start();
  }
}