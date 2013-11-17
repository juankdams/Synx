import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;

class dOB extends cCH
{
  dOB(doA paramdoA, int paramInt)
  {
    super(paramInt);
  }

  public void b(ByteBuffer paramByteBuffer) {
    if (doA.i(this.mge) != null) {
      paramByteBuffer.putInt(((bqk)doA.j(this.mge)).nS());
      paramByteBuffer.putLong(((bqk)doA.k(this.mge)).nT());
    } else {
      paramByteBuffer.putInt(0);
      paramByteBuffer.putLong(0L);
    }
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    int i = paramByteBuffer.getInt();
    long l = paramByteBuffer.getLong();
    Object localObject2;
    Object localObject1;
    switch (i) {
    case 11:
    case 25:
      int j = bfE.fu(l);
      short s = bfE.fv(l);
      localObject2 = czE.cwt().h(j, s);
      this.mge.b((Ce)localObject2);

      break;
    case 1:
      if (this.mge.wa() == null)
      {
        boolean bool = this.mge.a(this.mge.bkf(), l);
        if (!bool)
          bool = this.mge.a(this.mge.bke(), l);
        if (!bool)
          bool = doA.a(this.mge, l);
        if (!bool)
          K.error("Impossible de créer un état en tant que container d'un effet, id unique du container : " + l);
      }
      break;
    case 3:
      if ((doA.l(this.mge) != null) && (doA.m(this.mge).LC() != null)) {
        localObject1 = (aAn)doA.n(this.mge).LC().eb(l);
        if (localObject1 != null)
          this.mge.b((Ce)localObject1);
        else
          K.error("Area inexistante " + l + " sur le contexte de type " + doA.o(this.mge).LA());
      }
      else {
        K.error("contexte non ou mal initialisé");
      }

      break;
    case 12:
      localObject1 = Hh.QM().eO((int)l);
      if (localObject1 != null)
        this.mge.b((Ce)localObject1);
      else {
        K.error("item par défaut inconnu, referenceId = " + l);
      }

      break;
    case 14:
    case 31:
      K.error("On ne devrait pas sérialiser les effets des set ou de sac");

      break;
    case 17:
      if ((doA.p(this.mge) instanceof dhJ)) {
        localObject1 = (dhJ)doA.q(this.mge);
        dSr localdSr = ((dhJ)localObject1).bGQ();
        if (localdSr == null) {
          K.error("[WRE] On reçoit un effet (id=" + this.mge.getId() + ") d'aptitude serialisé mais le caster n'a pas d'inventaire d'aptitude (inutile au serveur d'IA) caster : " + doA.r(this.mge));

          return;
        }
        if (localdSr == djr.lgk)
          return;
        localObject2 = localdSr.nQ((int)l);
        if ((localObject2 == null) || (((List)localObject2).isEmpty())) {
          K.error("[WRE] On ne connait pas l'aptitude qui contient l'effet deserialise");
          return;
        }
        if (((List)localObject2).size() > 1) {
          K.error("[WRE] On recupere plusieurs aptitudes pour un meme id de reference, ce n'est pas logique, on ne peut pas donner de container a notre effet");
          return;
        }
        this.mge.b((Ce)((List)localObject2).get(0));
      }break;
    case 19:
      break;
    case 21:
      this.mge.b(cMB.b(l, (dpI)this.mge.bkc()));
      break;
    case 28:
      this.mge.b(dEt.lNe);
      break;
    case 32:
      this.mge.b(dEt.lNg);
      break;
    case 30:
      this.mge.b(dEt.lNf);
      break;
    case 26:
    case 29:
      localObject1 = new bsS();
      ((bsS)localObject1).qK(i).ga(l);
      this.mge.b(((bsS)localObject1).bAZ());
      break;
    case 2:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 13:
    case 15:
    case 16:
    case 18:
    case 20:
    case 22:
    case 23:
    case 24:
    case 27:
    }
  }
}