import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

class blk
{
  private int size = -1;
  private int alignment = 1;
  private final Map fCd = Collections.synchronizedMap(new LinkedHashMap());
  private int fyt = 0;
  private bXj fyy;
  private boolean fCe;

  private blk()
  {
  }

  static boolean a(blk paramblk)
  {
    return paramblk.fCe; } 
  static int b(blk paramblk) { return paramblk.size; } 
  static int c(blk paramblk) { return paramblk.fyt; } 
  static bXj d(blk paramblk) { return paramblk.fyy; } 
  static int e(blk paramblk) { return paramblk.alignment; } 
  static Map f(blk paramblk) { return paramblk.fCd; } 
  blk(aDj paramaDj) { this(); } 
  static int a(blk paramblk, int paramInt) { return paramblk.fyt = paramInt; } 
  static bXj a(blk paramblk, bXj parambXj) { return paramblk.fyy = parambXj; } 
  static boolean a(blk paramblk, boolean paramBoolean) { return paramblk.fCe = paramBoolean; } 
  static int b(blk paramblk, int paramInt) { return paramblk.alignment = paramInt; } 
  static int c(blk paramblk, int paramInt) { return paramblk.size = paramInt; }

}