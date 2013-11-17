import com.ankamagames.wakfu.client.WakfuClientInstance;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

class fh
  implements Runnable
{
  fh(aPJ paramaPJ)
  {
  }

  public void run()
  {
    try
    {
      this.aCf.eMO.awF();
    } catch (Exception localException) {
      WakfuClientInstance.ch().fatal("Erreur au lancement", localException);
      JOptionPane.showMessageDialog(null, localException, "Error", 0);
      System.exit(0);
    }
  }
}