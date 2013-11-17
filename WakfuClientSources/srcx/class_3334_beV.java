import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public final class beV
{
  public static final beV fsh = new beV();

  private boolean bIx = false;
  private JFrame fsi;
  private de fsj;
  final ArrayList dYL = new ArrayList();
  final ArrayList aUq = new ArrayList();
  int fsk = 0;
  int fsl = 0;

  public void initialize()
  {
    if (this.bIx) {
      return;
    }
    SwingUtilities.invokeLater(new tr(this));

    this.bIx = true;
  }

  public void c(ParticleSystem paramParticleSystem)
  {
    if (!this.bIx) {
      return;
    }
    this.dYL.add(paramParticleSystem);

    if (this.dYL.size() > this.fsk) {
      this.fsk = this.dYL.size();
    }
    if (this.fsj != null) {
      this.fsj.b(this.dYL, this.aUq);
      this.fsj.gY().updateUI();
    }
  }

  public void d(ParticleSystem paramParticleSystem) {
    if (!this.bIx)
      return;
    this.dYL.remove(paramParticleSystem);
    if (this.fsj != null) {
      this.fsj.b(this.dYL, this.aUq);
      this.fsj.gY().updateUI();
    }
  }

  public void c(bxu parambxu) {
    if (!this.bIx) {
      return;
    }
    this.aUq.add(parambxu);

    if (this.aUq.size() > this.fsl) {
      this.fsl = this.aUq.size();
    }
    if (this.fsj != null) {
      this.fsj.b(this.dYL, this.aUq);
      this.fsj.gY().updateUI();
    }
  }

  public void d(bxu parambxu) {
    if (!this.bIx)
      return;
    this.aUq.remove(parambxu);
    if (this.fsj != null) {
      this.fsj.b(this.dYL, this.aUq);
      this.fsj.gY().updateUI();
    }
  }
}