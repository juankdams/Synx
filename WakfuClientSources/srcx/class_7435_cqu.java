import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cqu
  implements ZW, cvW
{
  private static final Logger K = Logger.getLogger(cqu.class);

  private static final cqu ial = new cqu();
  private static final boolean iam = false;
  private clD ian = null;

  public static cqu cpE() {
    return ial;
  }

  public clD cpF()
  {
    return this.ian;
  }

  public void alK() {
    if (this.ian != null) {
      this.ian.cna();
      this.ian = null;
    }
  }

  public void a(clD paramclD) {
    this.ian = paramclD;
  }

  public boolean a(cWG paramcWG) {
    return true;
  }

  public static void a(clD paramclD, dCb paramdCb)
  {
    Object localObject1;
    Object localObject2;
    if ((paramdCb instanceof cew)) {
      localObject1 = (cew)paramdCb;
      localObject2 = ((cew)localObject1).cbD();
      if (localObject2 != null)
        paramclD.a((cRz)localObject2, paramdCb);
      else
        K.error("Le mobile sélectionné n'a pas de CharacterInfo associé !");
    }
    else if ((paramdCb instanceof djm)) {
      localObject1 = (djm)paramdCb;
      localObject2 = ((djm)localObject1).vK();
      if (((dWu)localObject2).isUsable())
        paramclD.a((cMb)localObject2, paramdCb);
    } else if ((paramdCb instanceof azX))
    {
      paramclD.a(((azX)paramdCb).aLN(), paramdCb);
    } else if ((paramdCb instanceof cRz)) {
      paramclD.a((cRz)paramdCb, paramdCb);
    }
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
      cBQ.cxL().a(this);
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
      this.ian = null;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void b(aTL paramaTL, int paramInt1, int paramInt2) {
    ArrayList localArrayList = paramaTL.bT(paramInt1, paramInt2);
    if (localArrayList.isEmpty())
      return;
    this.ian = new clD();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dCb localdCb = (dCb)localArrayList.get(i);
      a(this.ian, localdCb);
    }
    if (this.ian.isDisplayable()) {
      this.ian.display();
      return;
    }
    this.ian = null;
  }
}