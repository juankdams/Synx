import java.util.ArrayList;
import java.util.Collections;

class dKs
  implements jo
{
  dKs(bAO parambAO)
  {
  }

  public void c(String paramString, boolean paramBoolean)
  {
    if ("name".equals(paramString)) {
      if (bAO.b(this.lXZ).size() > 0) {
        Collections.sort(bAO.b(this.lXZ), paramBoolean ? IS.Sl() : bMb.bTF());
        bAO.a(this.lXZ, null);
      } else {
        bAO.a(this.lXZ, null);
      }
    } else if ("level".equals(paramString)) {
      if (bAO.b(this.lXZ).size() > 0) {
        Collections.sort(bAO.b(this.lXZ), paramBoolean ? bNf.bUZ() : cie.cjR());
        bAO.a(this.lXZ, null);
      } else {
        bAO.a(this.lXZ, null);
      }
    } else if ("duration".equals(paramString))
    {
      bAO.a(this.lXZ, paramBoolean ? ctB.idB : ctB.idC);
    } else if ("rarity".equals(paramString)) {
      Collections.sort(bAO.b(this.lXZ), paramBoolean ? aWw.bmj() : blZ.bwX());
      bAO.a(this.lXZ, null);
    } else if ("seller".equals(paramString))
    {
      bAO.a(this.lXZ, paramBoolean ? ctB.idt : ctB.idu);
    } else if ("price".equals(paramString))
    {
      bAO.a(this.lXZ, paramBoolean ? ctB.idr : ctB.ids);
    } else if ("quantity".equals(paramString))
    {
      bAO.a(this.lXZ, paramBoolean ? ctB.idv : ctB.idw);
    } else if ("packType".equals(paramString))
    {
      bAO.a(this.lXZ, paramBoolean ? ctB.idx : ctB.idy);
    }
    bfb localbfb = bAO.c(this.lXZ).cSz();
    localbfb.cG(bAO.d(this.lXZ) == null ? -1 : bAO.d(this.lXZ).bUy);

    byv.bFN().aJK().d(localbfb);
  }
}