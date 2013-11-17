import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.prefs.Preferences;
import javax.swing.JFileChooser;
import org.apache.log4j.Logger;

public class bxU
  implements cvW, Runnable
{
  private static bxU gjh = new bxU();
  private static final String gji = "ankamagames.wakfu.mixDebuggerDirectory";
  private static final Logger K = Logger.getLogger(bxU.class);
  private static final long gjj = 5000L;
  private ahd gjk;
  private bnm N;

  public static bxU bFg()
  {
    return gjh;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 17720:
      byv.bFN().b(this);
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void alb()
  {
    this.gjk.alb();
  }

  public void alc() {
    this.gjk.alc();
  }

  public void bFh() {
    String str = Preferences.userRoot().get("ankamagames.wakfu.mixDebuggerDirectory", null);

    JFileChooser localJFileChooser = new JFileChooser();
    localJFileChooser.setDialogTitle("Choisissez le répertoire de sauvegarde des logs.");
    localJFileChooser.setFileSelectionMode(1);
    localJFileChooser.setFileFilter(new beI(null));
    if (str != null) {
      localJFileChooser.setSelectedFile(new File(str));
    }
    int i = localJFileChooser.showOpenDialog(null);
    if (i == 0) {
      File localFile = localJFileChooser.getSelectedFile();
      try {
        Preferences.userRoot().put("ankamagames.wakfu.mixDebuggerDirectory", localFile.getCanonicalPath());
      } catch (IOException localIOException) {
        K.warn("Problème à la sélection du répertoire : " + localFile.getAbsolutePath());
      }
    }
  }

  public void bFi() {
    String str1 = Preferences.userRoot().get("ankamagames.wakfu.mixDebuggerDirectory", null);

    dxL localdxL = dDE.dft().VN();
    StringBuilder localStringBuilder = new StringBuilder();
    int i = localdxL.getMonth();
    int j = localdxL.getDay();
    int k = localdxL.getHours();
    int m = localdxL.getMinutes();
    int n = localdxL.getSeconds();
    if (str1 != null)
      localStringBuilder.append(str1).append("\\");
    else {
      localStringBuilder.append(".\\"); } localStringBuilder.append("mixDebugger-");
    localStringBuilder.append(localdxL.getYear()).append(i < 10 ? "0" : "").append(i).append(j < 10 ? "0" : "").append(j);
    localStringBuilder.append("-").append(k < 10 ? "0" : "").append(k).append(m < 10 ? "0" : "").append(m).append(n < 10 ? "0" : "").append(n);
    localStringBuilder.append(".txt");
    String str2 = localStringBuilder.toString();
    PrintWriter localPrintWriter;
    try { localPrintWriter = new PrintWriter(dtb.qd(str2));
    } catch (IOException localIOException) {
      K.warn("Problème à la sauvegarde des logs");
      return;
    }

    localPrintWriter.println("---=== Critères ===---");
    localPrintWriter.println();
    localPrintWriter.println(this.gjk.bY(false));
    localPrintWriter.println();

    localPrintWriter.println("---=== Evènements ===---");
    localPrintWriter.println();
    localPrintWriter.println(this.gjk.bZ(false));

    localPrintWriter.println("---=== Logs ===---");
    localPrintWriter.println();
    localPrintWriter.println(this.gjk.bX(false));

    localPrintWriter.flush();
    localPrintWriter.close();
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new bgF(this);

      cBQ.cxL().a(this.N);

      this.gjk = new ahd(this);
      dLE.doY().t("mixDebugger", this.gjk);

      cBQ.cxL().a("mixDebuggerDialog", VV.dJ("mixDebuggerDialog"), 1L, (short)10000);

      dka.cSF().a(this, 5000L, -1);

      cBQ.cxL().j("wakfu.mixDebugger", cOX.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      baT.L(ahd.class);

      this.gjk.cleanUp();
      this.gjk = null;

      dka.cSF().j(this);

      dLE.doY().removeProperty("mixDebugger");
      cBQ.cxL().mW("mixDebuggerDialog");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.mixDebugger");
    }
  }

  public void run()
  {
    refresh(false);
  }

  public void refresh(boolean paramBoolean) {
    if ((paramBoolean) || (this.gjk.asJ()))
      dLE.doY().a(this.gjk, new String[] { "cache", "memoryCache", "sourcesTotalSize" });
  }

  public ahd bFj() {
    return this.gjk;
  }
}