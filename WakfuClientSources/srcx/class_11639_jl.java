import com.ankamagames.wakfu.client.WakfuClientInstance;
import javax.swing.JMenuItem;

class jl extends JMenuItem
{
  private final daw aKG;

  public jl(ib paramib, daw paramdaw)
  {
    super(paramdaw.getTitle());
    this.aKG = paramdaw;

    addMouseListener(new apO(this, paramib));
  }

  private void ba(int paramInt)
  {
    aIG localaIG = new aIG();
    localaIG.bM((byte)1);
    localaIG.bf((short)113);
    localaIG.dU(ib.b(this.aKH).Ea());
    localaIG.dU(ib.b(this.aKH).eW());
    localaIG.mH(paramInt);
    byv.bFN().aJK().d(localaIG);

    WakfuClientInstance.awy().awZ().log("player " + ib.b(this.aKH).eW() + " (" + ib.b(this.aKH).Eb() + ") ban request id=" + paramInt);
  }
}