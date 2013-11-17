import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public final class dES
{
  public static final dES lNR = new dES();

  private boolean bIx = false;
  private JFrame fsi;
  private atR lNS;
  private RenderTreeStencil lNT;

  public void initialize()
  {
    if (this.bIx) {
      return;
    }
    SwingUtilities.invokeLater(new cgD(this));

    this.bIx = true;
  }

  public void c(RenderTreeStencil paramRenderTreeStencil) {
    this.lNT = paramRenderTreeStencil;
  }
}