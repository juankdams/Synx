import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;

public class czf
  implements cMc
{
  private static final Logger K = Logger.getLogger(czf.class);

  public void A(K paramK) {
  }

  public cMc caj() {
    return new czf();
  }

  public void a(cZy paramcZy) {
    S(new File(duB.dai().dat()));
  }

  private static void S(File paramFile) {
    try {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramFile.getCanonicalPath());
      localStringBuilder.append(File.separatorChar).append("chat.xml");
      String str = localStringBuilder.toString();
      File localFile = new File(str);
      if (localFile.exists()) {
        boolean bool = localFile.delete();
        if (!bool)
          K.warn("Impossible de supprimer " + str);
      }
    } catch (IOException localIOException) {
      K.warn("Problème à la suppression d'un fichier de chat", localIOException);
    }
  }
}