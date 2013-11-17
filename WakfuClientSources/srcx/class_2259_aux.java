import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.ArrayList;

public class aux
{
  public static final aux dGK = new bck();

  private boolean dGL = true;
  private final ArrayList dGM = new ArrayList(1);
  private final ArrayList dGN = new ArrayList();
  private final ArrayList dGO = new ArrayList();
  private final cSR dGP = new cSR();
  private int cZl;
  private final dGy dGQ = new bco(this);

  protected final boolean aGG()
  {
    return (!this.dGN.isEmpty()) || (!this.dGO.isEmpty()) || (!this.dGP.isEmpty()) || (this.cZl != 0);
  }

  public final boolean aGH()
  {
    return !this.dGP.isEmpty();
  }

  public final boolean aGI() {
    return !this.dGO.isEmpty();
  }

  public final afS kw(int paramInt) {
    return (afS)this.dGP.get(paramInt);
  }

  public ArrayList aGJ() {
    if (this.dGL) {
      this.dGL = false;
      this.dGM.clear();
      this.dGP.s(this.dGQ);
    }
    return this.dGM;
  }

  public void clear() {
    for (int i = this.dGN.size() - 1; i >= 0; i--) {
      e((Anm)this.dGN.get(i));
    }
    this.dGN.clear();
    this.dGO.clear();
    this.dGP.clear();
    this.dGM.clear();
    this.dGL = true;
    this.cZl = 0;
  }

  boolean a(Anm paramAnm, adz paramadz)
  {
    d(paramAnm);
    this.cZl += 1;
    if (paramadz == null) {
      return a(paramAnm, this.cZl);
    }
    boolean bool = false;

    if (paramAnm.gI()) {
      for (int i = 0; i < paramAnm.SD.length; i++) {
        biK localbiK = paramAnm.SD[i];
        int k = localbiK.fzn;
        if ((k != 0) && (paramadz.contains(localbiK.fzo))) {
          a(k, new afS(k, paramAnm, localbiK, this.cZl));
          bool = true;
          bp(localbiK.fzo, this.cZl);
        }
      }
    } else {
      kr localkr = paramadz.apz();
      while (localkr.hasNext()) {
        int j = localkr.next();
        this.dGO.add(new afS(j, paramAnm, null, this.cZl));
      }
    }
    return bool;
  }

  private void bp(int paramInt1, int paramInt2) {
    for (int i = this.dGO.size() - 1; i >= 0; i--) {
      afS localafS = (afS)this.dGO.get(i);
      if ((localafS.bjv == paramInt1) && (localafS.cZl < paramInt2))
        this.dGO.remove(i);
    }
  }

  boolean b(Anm paramAnm, adz paramadz)
  {
    int i = 0;

    dmn localdmn = this.dGP.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      afS localafS1 = (afS)localdmn.value();
      if (paramadz == null) {
        if (localafS1.bXW == paramAnm) {
          localdmn.remove();
          i = 1;
        }
      } else if ((paramadz.contains(localafS1.cZj.fzo)) && (localafS1.bXW == paramAnm)) {
        localdmn.remove();
        i = 1;
      }
    }

    for (int j = 0; j < this.dGO.size(); ) {
      afS localafS2 = (afS)this.dGO.get(j);
      if (paramadz == null) {
        if (localafS2.bXW == paramAnm) {
          this.dGO.remove(j);
          i = 1;
        } else {
          j++;
        }
      } else if ((paramadz.contains(localafS2.bjv)) && (localafS2.bXW == paramAnm)) {
        this.dGO.remove(j);
        i = 1;
      } else {
        j++;
      }
    }
    this.dGL = true;

    return (i != 0) && (aGK());
  }

  boolean aBC()
  {
    boolean bool = false;
    for (int i = 0; i < this.dGO.size(); ) {
      afS localafS = (afS)this.dGO.get(i);
      int j = localafS.bjv;
      Anm localAnm = localafS.bXW;
      if (localAnm.gI()) {
        bool = true;
        int k = 0;
        if (j == 0)
        {
          a(localAnm, localafS.cZl);
        }
        else for (int m = 0; m < localAnm.SD.length; m++) {
            biK localbiK = localAnm.SD[m];
            if (localbiK != null)
            {
              if ((localbiK.fzn != 0) && (localbiK.fzo == j)) {
                k = 1;
                a(localbiK.fzn, new afS(j, localAnm, localbiK, localafS.cZl));
              }
            }
          }
        this.dGO.remove(localafS);
        if (k != 0) {
          bp(j, localafS.cZl);
        }
      }
      else if (localAnm.gF()) {
        this.dGO.remove(i);
      } else {
        i++;
      }
    }

    if (this.dGO.size() == 0) {
      this.cZl = 0;
    }
    return bool;
  }

  private void a(int paramInt, afS paramafS) {
    this.dGP.put(paramInt, paramafS);
    this.dGL = true;
  }

  private void d(Anm paramAnm)
  {
    int i = this.dGN.size();
    for (int j = 0; j < i; j++) {
      if (this.dGN.get(j) == paramAnm) {
        return;
      }
    }

    paramAnm.gQ();
    this.dGN.add(paramAnm);
  }

  private static void e(Anm paramAnm) {
    if ((!bB) && (paramAnm.bpu() <= 0)) throw new AssertionError();
    paramAnm.axl();
  }

  private boolean aGK() {
    boolean bool = false;

    for (int i = 0; i < this.dGN.size(); ) {
      Anm localAnm = (Anm)this.dGN.get(i);
      if (f(localAnm)) {
        i++;
      } else {
        this.dGN.remove(i);
        e(localAnm);
        bool = true;
      }
    }
    return bool;
  }

  private boolean f(Anm paramAnm) {
    dmn localdmn = this.dGP.yF();
    while (localdmn.hasNext()) {
      localdmn.fl();

      if (((afS)localdmn.value()).bXW == paramAnm) {
        return true;
      }
    }
    int i = this.dGO.size();
    for (int j = 0; j < i; j++)
    {
      if (((afS)this.dGO.get(j)).bXW == paramAnm) {
        return true;
      }
    }
    return false;
  }

  boolean a(Anm paramAnm, int paramInt) {
    this.cZl += 1;
    boolean bool = false;
    if (paramAnm.gI())
      for (int i = 0; i < paramAnm.SD.length; i++) {
        biK localbiK = paramAnm.SD[i];
        int j = localbiK.fzn;
        if (localbiK.m_name != null) {
          afS localafS = (afS)this.dGP.get(j);
          if ((localafS == null) || (localafS.cZl < paramInt)) {
            a(j, new afS(j, paramAnm, localbiK, this.cZl));
          }
          bp(localbiK.fzo, this.cZl);
        }
        bool = true;
      }
    else {
      this.dGO.add(new afS(0, paramAnm, null, this.cZl));
    }
    return bool;
  }

  aux aGL() {
    aux localaux = new aux();

    int i = this.dGN.size();
    localaux.dGN.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      Anm localAnm = (Anm)this.dGN.get(j);
      localAnm.gQ();
      localaux.dGN.add(localAnm);
    }

    j = this.dGO.size();
    localaux.dGO.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      localaux.dGO.add(new afS((afS)this.dGO.get(k)));
    }

    dmn localdmn = this.dGP.yF();
    localaux.dGP.ensureCapacity(this.dGP.size());
    while (localdmn.hasNext()) {
      localdmn.fl();
      localaux.dGP.put(localdmn.zY(), localdmn.value());
    }

    localaux.cZl = this.cZl;
    localaux.dGL = true;
    return localaux;
  }
}