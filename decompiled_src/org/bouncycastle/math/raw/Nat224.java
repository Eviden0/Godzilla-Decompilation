/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Pack;

public abstract class Nat224 {
    private static final long M = 0xFFFFFFFFL;

    public static int add(int[] nArray, int[] nArray2, int[] nArray3) {
        long l = 0L;
        nArray3[0] = (int)(l += ((long)nArray[0] & 0xFFFFFFFFL) + ((long)nArray2[0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[1] = (int)(l += ((long)nArray[1] & 0xFFFFFFFFL) + ((long)nArray2[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[2] = (int)(l += ((long)nArray[2] & 0xFFFFFFFFL) + ((long)nArray2[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[3] = (int)(l += ((long)nArray[3] & 0xFFFFFFFFL) + ((long)nArray2[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[4] = (int)(l += ((long)nArray[4] & 0xFFFFFFFFL) + ((long)nArray2[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[5] = (int)(l += ((long)nArray[5] & 0xFFFFFFFFL) + ((long)nArray2[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[6] = (int)(l += ((long)nArray[6] & 0xFFFFFFFFL) + ((long)nArray2[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int add(int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3) {
        long l = 0L;
        nArray3[n3 + 0] = (int)(l += ((long)nArray[n + 0] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 1] = (int)(l += ((long)nArray[n + 1] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 2] = (int)(l += ((long)nArray[n + 2] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 3] = (int)(l += ((long)nArray[n + 3] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 4] = (int)(l += ((long)nArray[n + 4] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 5] = (int)(l += ((long)nArray[n + 5] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 6] = (int)(l += ((long)nArray[n + 6] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int addBothTo(int[] nArray, int[] nArray2, int[] nArray3) {
        long l = 0L;
        nArray3[0] = (int)(l += ((long)nArray[0] & 0xFFFFFFFFL) + ((long)nArray2[0] & 0xFFFFFFFFL) + ((long)nArray3[0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[1] = (int)(l += ((long)nArray[1] & 0xFFFFFFFFL) + ((long)nArray2[1] & 0xFFFFFFFFL) + ((long)nArray3[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[2] = (int)(l += ((long)nArray[2] & 0xFFFFFFFFL) + ((long)nArray2[2] & 0xFFFFFFFFL) + ((long)nArray3[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[3] = (int)(l += ((long)nArray[3] & 0xFFFFFFFFL) + ((long)nArray2[3] & 0xFFFFFFFFL) + ((long)nArray3[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[4] = (int)(l += ((long)nArray[4] & 0xFFFFFFFFL) + ((long)nArray2[4] & 0xFFFFFFFFL) + ((long)nArray3[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[5] = (int)(l += ((long)nArray[5] & 0xFFFFFFFFL) + ((long)nArray2[5] & 0xFFFFFFFFL) + ((long)nArray3[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[6] = (int)(l += ((long)nArray[6] & 0xFFFFFFFFL) + ((long)nArray2[6] & 0xFFFFFFFFL) + ((long)nArray3[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int addBothTo(int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3) {
        long l = 0L;
        nArray3[n3 + 0] = (int)(l += ((long)nArray[n + 0] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 0] & 0xFFFFFFFFL) + ((long)nArray3[n3 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 1] = (int)(l += ((long)nArray[n + 1] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 1] & 0xFFFFFFFFL) + ((long)nArray3[n3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 2] = (int)(l += ((long)nArray[n + 2] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 2] & 0xFFFFFFFFL) + ((long)nArray3[n3 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 3] = (int)(l += ((long)nArray[n + 3] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 3] & 0xFFFFFFFFL) + ((long)nArray3[n3 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 4] = (int)(l += ((long)nArray[n + 4] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 4] & 0xFFFFFFFFL) + ((long)nArray3[n3 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 5] = (int)(l += ((long)nArray[n + 5] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 5] & 0xFFFFFFFFL) + ((long)nArray3[n3 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray3[n3 + 6] = (int)(l += ((long)nArray[n + 6] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 6] & 0xFFFFFFFFL) + ((long)nArray3[n3 + 6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int addTo(int[] nArray, int[] nArray2) {
        long l = 0L;
        nArray2[0] = (int)(l += ((long)nArray[0] & 0xFFFFFFFFL) + ((long)nArray2[0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[1] = (int)(l += ((long)nArray[1] & 0xFFFFFFFFL) + ((long)nArray2[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[2] = (int)(l += ((long)nArray[2] & 0xFFFFFFFFL) + ((long)nArray2[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[3] = (int)(l += ((long)nArray[3] & 0xFFFFFFFFL) + ((long)nArray2[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[4] = (int)(l += ((long)nArray[4] & 0xFFFFFFFFL) + ((long)nArray2[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[5] = (int)(l += ((long)nArray[5] & 0xFFFFFFFFL) + ((long)nArray2[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[6] = (int)(l += ((long)nArray[6] & 0xFFFFFFFFL) + ((long)nArray2[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int addTo(int[] nArray, int n, int[] nArray2, int n2, int n3) {
        long l = (long)n3 & 0xFFFFFFFFL;
        nArray2[n2 + 0] = (int)(l += ((long)nArray[n + 0] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n2 + 1] = (int)(l += ((long)nArray[n + 1] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n2 + 2] = (int)(l += ((long)nArray[n + 2] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n2 + 3] = (int)(l += ((long)nArray[n + 3] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n2 + 4] = (int)(l += ((long)nArray[n + 4] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n2 + 5] = (int)(l += ((long)nArray[n + 5] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n2 + 6] = (int)(l += ((long)nArray[n + 6] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int addToEachOther(int[] nArray, int n, int[] nArray2, int n2) {
        long l = 0L;
        nArray[n + 0] = (int)(l += ((long)nArray[n + 0] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 0] & 0xFFFFFFFFL));
        nArray2[n2 + 0] = (int)l;
        l >>>= 32;
        nArray[n + 1] = (int)(l += ((long)nArray[n + 1] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 1] & 0xFFFFFFFFL));
        nArray2[n2 + 1] = (int)l;
        l >>>= 32;
        nArray[n + 2] = (int)(l += ((long)nArray[n + 2] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 2] & 0xFFFFFFFFL));
        nArray2[n2 + 2] = (int)l;
        l >>>= 32;
        nArray[n + 3] = (int)(l += ((long)nArray[n + 3] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 3] & 0xFFFFFFFFL));
        nArray2[n2 + 3] = (int)l;
        l >>>= 32;
        nArray[n + 4] = (int)(l += ((long)nArray[n + 4] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 4] & 0xFFFFFFFFL));
        nArray2[n2 + 4] = (int)l;
        l >>>= 32;
        nArray[n + 5] = (int)(l += ((long)nArray[n + 5] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 5] & 0xFFFFFFFFL));
        nArray2[n2 + 5] = (int)l;
        l >>>= 32;
        nArray[n + 6] = (int)(l += ((long)nArray[n + 6] & 0xFFFFFFFFL) + ((long)nArray2[n2 + 6] & 0xFFFFFFFFL));
        nArray2[n2 + 6] = (int)l;
        return (int)(l >>>= 32);
    }

    public static void copy(int[] nArray, int[] nArray2) {
        nArray2[0] = nArray[0];
        nArray2[1] = nArray[1];
        nArray2[2] = nArray[2];
        nArray2[3] = nArray[3];
        nArray2[4] = nArray[4];
        nArray2[5] = nArray[5];
        nArray2[6] = nArray[6];
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
    }

    public static boolean diff(int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3) {
        boolean bl = Nat224.gte(nArray, n, nArray2, n2);
        if (bl) {
            Nat224.sub(nArray, n, nArray2, n2, nArray3, n3);
        } else {
            Nat224.sub(nArray2, n2, nArray, n, nArray3, n3);
        }
        return bl;
    }

    public static boolean eq(int[] nArray, int[] nArray2) {
        for (int i = 6; i >= 0; --i) {
            if (nArray[i] == nArray2[i]) continue;
            return false;
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] nArray = Nat224.create();
        int n = 0;
        while (bigInteger.signum() != 0) {
            nArray[n++] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return nArray;
    }

    public static int getBit(int[] nArray, int n) {
        if (n == 0) {
            return nArray[0] & 1;
        }
        int n2 = n >> 5;
        if (n2 < 0 || n2 >= 7) {
            return 0;
        }
        int n3 = n & 0x1F;
        return nArray[n2] >>> n3 & 1;
    }

    public static boolean gte(int[] nArray, int[] nArray2) {
        for (int i = 6; i >= 0; --i) {
            int n = nArray[i] ^ Integer.MIN_VALUE;
            int n2 = nArray2[i] ^ Integer.MIN_VALUE;
            if (n < n2) {
                return false;
            }
            if (n <= n2) continue;
            return true;
        }
        return true;
    }

    public static boolean gte(int[] nArray, int n, int[] nArray2, int n2) {
        for (int i = 6; i >= 0; --i) {
            int n3 = nArray[n + i] ^ Integer.MIN_VALUE;
            int n4 = nArray2[n2 + i] ^ Integer.MIN_VALUE;
            if (n3 < n4) {
                return false;
            }
            if (n3 <= n4) continue;
            return true;
        }
        return true;
    }

    public static boolean isOne(int[] nArray) {
        if (nArray[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; ++i) {
            if (nArray[i] == 0) continue;
            return false;
        }
        return true;
    }

    public static boolean isZero(int[] nArray) {
        for (int i = 0; i < 7; ++i) {
            if (nArray[i] == 0) continue;
            return false;
        }
        return true;
    }

    public static void mul(int[] nArray, int[] nArray2, int[] nArray3) {
        long l = (long)nArray2[0] & 0xFFFFFFFFL;
        long l2 = (long)nArray2[1] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[2] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[4] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[5] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[6] & 0xFFFFFFFFL;
        long l8 = 0L;
        long l9 = (long)nArray[0] & 0xFFFFFFFFL;
        nArray3[0] = (int)(l8 += l9 * l);
        l8 >>>= 32;
        nArray3[1] = (int)(l8 += l9 * l2);
        l8 >>>= 32;
        nArray3[2] = (int)(l8 += l9 * l3);
        l8 >>>= 32;
        nArray3[3] = (int)(l8 += l9 * l4);
        l8 >>>= 32;
        nArray3[4] = (int)(l8 += l9 * l5);
        l8 >>>= 32;
        nArray3[5] = (int)(l8 += l9 * l6);
        l8 >>>= 32;
        nArray3[6] = (int)(l8 += l9 * l7);
        nArray3[7] = (int)(l8 >>>= 32);
        for (int i = 1; i < 7; ++i) {
            long l10 = 0L;
            long l11 = (long)nArray[i] & 0xFFFFFFFFL;
            nArray3[i + 0] = (int)(l10 += l11 * l + ((long)nArray3[i + 0] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[i + 1] = (int)(l10 += l11 * l2 + ((long)nArray3[i + 1] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[i + 2] = (int)(l10 += l11 * l3 + ((long)nArray3[i + 2] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[i + 3] = (int)(l10 += l11 * l4 + ((long)nArray3[i + 3] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[i + 4] = (int)(l10 += l11 * l5 + ((long)nArray3[i + 4] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[i + 5] = (int)(l10 += l11 * l6 + ((long)nArray3[i + 5] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[i + 6] = (int)(l10 += l11 * l7 + ((long)nArray3[i + 6] & 0xFFFFFFFFL));
            nArray3[i + 7] = (int)(l10 >>>= 32);
        }
    }

    public static void mul(int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3) {
        long l = (long)nArray2[n2 + 0] & 0xFFFFFFFFL;
        long l2 = (long)nArray2[n2 + 1] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[n2 + 2] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[n2 + 3] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[n2 + 4] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[n2 + 5] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[n2 + 6] & 0xFFFFFFFFL;
        long l8 = 0L;
        long l9 = (long)nArray[n + 0] & 0xFFFFFFFFL;
        nArray3[n3 + 0] = (int)(l8 += l9 * l);
        l8 >>>= 32;
        nArray3[n3 + 1] = (int)(l8 += l9 * l2);
        l8 >>>= 32;
        nArray3[n3 + 2] = (int)(l8 += l9 * l3);
        l8 >>>= 32;
        nArray3[n3 + 3] = (int)(l8 += l9 * l4);
        l8 >>>= 32;
        nArray3[n3 + 4] = (int)(l8 += l9 * l5);
        l8 >>>= 32;
        nArray3[n3 + 5] = (int)(l8 += l9 * l6);
        l8 >>>= 32;
        nArray3[n3 + 6] = (int)(l8 += l9 * l7);
        nArray3[n3 + 7] = (int)(l8 >>>= 32);
        for (int i = 1; i < 7; ++i) {
            long l10 = 0L;
            long l11 = (long)nArray[n + i] & 0xFFFFFFFFL;
            nArray3[n3 + 0] = (int)(l10 += l11 * l + ((long)nArray3[++n3 + 0] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[n3 + 1] = (int)(l10 += l11 * l2 + ((long)nArray3[n3 + 1] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[n3 + 2] = (int)(l10 += l11 * l3 + ((long)nArray3[n3 + 2] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[n3 + 3] = (int)(l10 += l11 * l4 + ((long)nArray3[n3 + 3] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[n3 + 4] = (int)(l10 += l11 * l5 + ((long)nArray3[n3 + 4] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[n3 + 5] = (int)(l10 += l11 * l6 + ((long)nArray3[n3 + 5] & 0xFFFFFFFFL));
            l10 >>>= 32;
            nArray3[n3 + 6] = (int)(l10 += l11 * l7 + ((long)nArray3[n3 + 6] & 0xFFFFFFFFL));
            nArray3[n3 + 7] = (int)(l10 >>>= 32);
        }
    }

    public static int mulAddTo(int[] nArray, int[] nArray2, int[] nArray3) {
        long l = (long)nArray2[0] & 0xFFFFFFFFL;
        long l2 = (long)nArray2[1] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[2] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[4] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[5] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[6] & 0xFFFFFFFFL;
        long l8 = 0L;
        for (int i = 0; i < 7; ++i) {
            long l9 = 0L;
            long l10 = (long)nArray[i] & 0xFFFFFFFFL;
            nArray3[i + 0] = (int)(l9 += l10 * l + ((long)nArray3[i + 0] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[i + 1] = (int)(l9 += l10 * l2 + ((long)nArray3[i + 1] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[i + 2] = (int)(l9 += l10 * l3 + ((long)nArray3[i + 2] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[i + 3] = (int)(l9 += l10 * l4 + ((long)nArray3[i + 3] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[i + 4] = (int)(l9 += l10 * l5 + ((long)nArray3[i + 4] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[i + 5] = (int)(l9 += l10 * l6 + ((long)nArray3[i + 5] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[i + 6] = (int)(l9 += l10 * l7 + ((long)nArray3[i + 6] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[i + 7] = (int)(l9 += l8 + ((long)nArray3[i + 7] & 0xFFFFFFFFL));
            l8 = l9 >>> 32;
        }
        return (int)l8;
    }

    public static int mulAddTo(int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3) {
        long l = (long)nArray2[n2 + 0] & 0xFFFFFFFFL;
        long l2 = (long)nArray2[n2 + 1] & 0xFFFFFFFFL;
        long l3 = (long)nArray2[n2 + 2] & 0xFFFFFFFFL;
        long l4 = (long)nArray2[n2 + 3] & 0xFFFFFFFFL;
        long l5 = (long)nArray2[n2 + 4] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[n2 + 5] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[n2 + 6] & 0xFFFFFFFFL;
        long l8 = 0L;
        for (int i = 0; i < 7; ++i) {
            long l9 = 0L;
            long l10 = (long)nArray[n + i] & 0xFFFFFFFFL;
            nArray3[n3 + 0] = (int)(l9 += l10 * l + ((long)nArray3[n3 + 0] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[n3 + 1] = (int)(l9 += l10 * l2 + ((long)nArray3[n3 + 1] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[n3 + 2] = (int)(l9 += l10 * l3 + ((long)nArray3[n3 + 2] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[n3 + 3] = (int)(l9 += l10 * l4 + ((long)nArray3[n3 + 3] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[n3 + 4] = (int)(l9 += l10 * l5 + ((long)nArray3[n3 + 4] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[n3 + 5] = (int)(l9 += l10 * l6 + ((long)nArray3[n3 + 5] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[n3 + 6] = (int)(l9 += l10 * l7 + ((long)nArray3[n3 + 6] & 0xFFFFFFFFL));
            l9 >>>= 32;
            nArray3[n3 + 7] = (int)(l9 += l8 + ((long)nArray3[n3 + 7] & 0xFFFFFFFFL));
            l8 = l9 >>> 32;
            ++n3;
        }
        return (int)l8;
    }

    public static long mul33Add(int n, int[] nArray, int n2, int[] nArray2, int n3, int[] nArray3, int n4) {
        long l = 0L;
        long l2 = (long)n & 0xFFFFFFFFL;
        long l3 = (long)nArray[n2 + 0] & 0xFFFFFFFFL;
        nArray3[n4 + 0] = (int)(l += l2 * l3 + ((long)nArray2[n3 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        long l4 = (long)nArray[n2 + 1] & 0xFFFFFFFFL;
        nArray3[n4 + 1] = (int)(l += l2 * l4 + l3 + ((long)nArray2[n3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        long l5 = (long)nArray[n2 + 2] & 0xFFFFFFFFL;
        nArray3[n4 + 2] = (int)(l += l2 * l5 + l4 + ((long)nArray2[n3 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        long l6 = (long)nArray[n2 + 3] & 0xFFFFFFFFL;
        nArray3[n4 + 3] = (int)(l += l2 * l6 + l5 + ((long)nArray2[n3 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        long l7 = (long)nArray[n2 + 4] & 0xFFFFFFFFL;
        nArray3[n4 + 4] = (int)(l += l2 * l7 + l6 + ((long)nArray2[n3 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        long l8 = (long)nArray[n2 + 5] & 0xFFFFFFFFL;
        nArray3[n4 + 5] = (int)(l += l2 * l8 + l7 + ((long)nArray2[n3 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        long l9 = (long)nArray[n2 + 6] & 0xFFFFFFFFL;
        nArray3[n4 + 6] = (int)(l += l2 * l9 + l8 + ((long)nArray2[n3 + 6] & 0xFFFFFFFFL));
        l >>>= 32;
        return l += l9;
    }

    public static int mulByWord(int n, int[] nArray) {
        long l = 0L;
        long l2 = (long)n & 0xFFFFFFFFL;
        nArray[0] = (int)(l += l2 * ((long)nArray[0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[1] = (int)(l += l2 * ((long)nArray[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[2] = (int)(l += l2 * ((long)nArray[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[3] = (int)(l += l2 * ((long)nArray[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[4] = (int)(l += l2 * ((long)nArray[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[5] = (int)(l += l2 * ((long)nArray[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[6] = (int)(l += l2 * ((long)nArray[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int mulByWordAddTo(int n, int[] nArray, int[] nArray2) {
        long l = 0L;
        long l2 = (long)n & 0xFFFFFFFFL;
        nArray2[0] = (int)(l += l2 * ((long)nArray2[0] & 0xFFFFFFFFL) + ((long)nArray[0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[1] = (int)(l += l2 * ((long)nArray2[1] & 0xFFFFFFFFL) + ((long)nArray[1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[2] = (int)(l += l2 * ((long)nArray2[2] & 0xFFFFFFFFL) + ((long)nArray[2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[3] = (int)(l += l2 * ((long)nArray2[3] & 0xFFFFFFFFL) + ((long)nArray[3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[4] = (int)(l += l2 * ((long)nArray2[4] & 0xFFFFFFFFL) + ((long)nArray[4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[5] = (int)(l += l2 * ((long)nArray2[5] & 0xFFFFFFFFL) + ((long)nArray[5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[6] = (int)(l += l2 * ((long)nArray2[6] & 0xFFFFFFFFL) + ((long)nArray[6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int mulWordAddTo(int n, int[] nArray, int n2, int[] nArray2, int n3) {
        long l = 0L;
        long l2 = (long)n & 0xFFFFFFFFL;
        nArray2[n3 + 0] = (int)(l += l2 * ((long)nArray[n2 + 0] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n3 + 1] = (int)(l += l2 * ((long)nArray[n2 + 1] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n3 + 2] = (int)(l += l2 * ((long)nArray[n2 + 2] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 2] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n3 + 3] = (int)(l += l2 * ((long)nArray[n2 + 3] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 3] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n3 + 4] = (int)(l += l2 * ((long)nArray[n2 + 4] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 4] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n3 + 5] = (int)(l += l2 * ((long)nArray[n2 + 5] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 5] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray2[n3 + 6] = (int)(l += l2 * ((long)nArray[n2 + 6] & 0xFFFFFFFFL) + ((long)nArray2[n3 + 6] & 0xFFFFFFFFL));
        return (int)(l >>>= 32);
    }

    public static int mul33DWordAdd(int n, long l, int[] nArray, int n2) {
        long l2 = 0L;
        long l3 = (long)n & 0xFFFFFFFFL;
        long l4 = l & 0xFFFFFFFFL;
        nArray[n2 + 0] = (int)(l2 += l3 * l4 + ((long)nArray[n2 + 0] & 0xFFFFFFFFL));
        l2 >>>= 32;
        long l5 = l >>> 32;
        nArray[n2 + 1] = (int)(l2 += l3 * l5 + l4 + ((long)nArray[n2 + 1] & 0xFFFFFFFFL));
        l2 >>>= 32;
        nArray[n2 + 2] = (int)(l2 += l5 + ((long)nArray[n2 + 2] & 0xFFFFFFFFL));
        l2 >>>= 32;
        nArray[n2 + 3] = (int)(l2 += (long)nArray[n2 + 3] & 0xFFFFFFFFL);
        return (l2 >>>= 32) == 0L ? 0 : Nat.incAt(7, nArray, n2, 4);
    }

    public static int mul33WordAdd(int n, int n2, int[] nArray, int n3) {
        long l = 0L;
        long l2 = (long)n & 0xFFFFFFFFL;
        long l3 = (long)n2 & 0xFFFFFFFFL;
        nArray[n3 + 0] = (int)(l += l3 * l2 + ((long)nArray[n3 + 0] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[n3 + 1] = (int)(l += l3 + ((long)nArray[n3 + 1] & 0xFFFFFFFFL));
        l >>>= 32;
        nArray[n3 + 2] = (int)(l += (long)nArray[n3 + 2] & 0xFFFFFFFFL);
        return (l >>>= 32) == 0L ? 0 : Nat.incAt(7, nArray, n3, 3);
    }

    public static int mulWordDwordAdd(int n, long l, int[] nArray, int n2) {
        long l2 = 0L;
        long l3 = (long)n & 0xFFFFFFFFL;
        nArray[n2 + 0] = (int)(l2 += l3 * (l & 0xFFFFFFFFL) + ((long)nArray[n2 + 0] & 0xFFFFFFFFL));
        l2 >>>= 32;
        nArray[n2 + 1] = (int)(l2 += l3 * (l >>> 32) + ((long)nArray[n2 + 1] & 0xFFFFFFFFL));
        l2 >>>= 32;
        nArray[n2 + 2] = (int)(l2 += (long)nArray[n2 + 2] & 0xFFFFFFFFL);
        return (l2 >>>= 32) == 0L ? 0 : Nat.incAt(7, nArray, n2, 3);
    }

    public static int mulWord(int n, int[] nArray, int[] nArray2, int n2) {
        long l = 0L;
        long l2 = (long)n & 0xFFFFFFFFL;
        int n3 = 0;
        do {
            nArray2[n2 + n3] = (int)(l += l2 * ((long)nArray[n3] & 0xFFFFFFFFL));
            l >>>= 32;
        } while (++n3 < 7);
        return (int)l;
    }

    public static void square(int[] nArray, int[] nArray2) {
        long l;
        long l2;
        long l3 = (long)nArray[0] & 0xFFFFFFFFL;
        int n = 0;
        int n2 = 6;
        int n3 = 14;
        do {
            l2 = (long)nArray[n2--] & 0xFFFFFFFFL;
            l = l2 * l2;
            nArray2[--n3] = n << 31 | (int)(l >>> 33);
            nArray2[--n3] = (int)(l >>> 1);
            n = (int)l;
        } while (n2 > 0);
        l2 = l3 * l3;
        long l4 = (long)(n << 31) & 0xFFFFFFFFL | l2 >>> 33;
        nArray2[0] = (int)l2;
        n = (int)(l2 >>> 32) & 1;
        long l5 = (long)nArray[1] & 0xFFFFFFFFL;
        l2 = (long)nArray2[2] & 0xFFFFFFFFL;
        int n4 = (int)(l4 += l5 * l3);
        nArray2[1] = n4 << 1 | n;
        n = n4 >>> 31;
        l2 += l4 >>> 32;
        l = (long)nArray[2] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[3] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[4] & 0xFFFFFFFFL;
        n4 = (int)(l2 += l * l3);
        nArray2[2] = n4 << 1 | n;
        n = n4 >>> 31;
        l6 &= 0xFFFFFFFFL;
        long l8 = (long)nArray[3] & 0xFFFFFFFFL;
        long l9 = ((long)nArray2[5] & 0xFFFFFFFFL) + ((l7 += (l6 += (l2 >>> 32) + l * l5) >>> 32) >>> 32);
        l7 &= 0xFFFFFFFFL;
        long l10 = ((long)nArray2[6] & 0xFFFFFFFFL) + (l9 >>> 32);
        l9 &= 0xFFFFFFFFL;
        n4 = (int)(l6 += l8 * l3);
        nArray2[3] = n4 << 1 | n;
        n = n4 >>> 31;
        l7 &= 0xFFFFFFFFL;
        l9 &= 0xFFFFFFFFL;
        long l11 = (long)nArray[4] & 0xFFFFFFFFL;
        long l12 = ((long)nArray2[7] & 0xFFFFFFFFL) + ((l10 += (l9 += ((l7 += (l6 >>> 32) + l8 * l5) >>> 32) + l8 * l) >>> 32) >>> 32);
        l10 &= 0xFFFFFFFFL;
        long l13 = ((long)nArray2[8] & 0xFFFFFFFFL) + (l12 >>> 32);
        l12 &= 0xFFFFFFFFL;
        n4 = (int)(l7 += l11 * l3);
        nArray2[4] = n4 << 1 | n;
        n = n4 >>> 31;
        l9 &= 0xFFFFFFFFL;
        l10 &= 0xFFFFFFFFL;
        l12 &= 0xFFFFFFFFL;
        long l14 = (long)nArray[5] & 0xFFFFFFFFL;
        long l15 = ((long)nArray2[9] & 0xFFFFFFFFL) + ((l13 += (l12 += ((l10 += ((l9 += (l7 >>> 32) + l11 * l5) >>> 32) + l11 * l) >>> 32) + l11 * l8) >>> 32) >>> 32);
        l13 &= 0xFFFFFFFFL;
        long l16 = ((long)nArray2[10] & 0xFFFFFFFFL) + (l15 >>> 32);
        l15 &= 0xFFFFFFFFL;
        n4 = (int)(l9 += l14 * l3);
        nArray2[5] = n4 << 1 | n;
        n = n4 >>> 31;
        l10 &= 0xFFFFFFFFL;
        l12 &= 0xFFFFFFFFL;
        l13 &= 0xFFFFFFFFL;
        l15 &= 0xFFFFFFFFL;
        long l17 = (long)nArray[6] & 0xFFFFFFFFL;
        long l18 = ((long)nArray2[11] & 0xFFFFFFFFL) + ((l16 += (l15 += ((l13 += ((l12 += ((l10 += (l9 >>> 32) + l14 * l5) >>> 32) + l14 * l) >>> 32) + l14 * l8) >>> 32) + l14 * l11) >>> 32) >>> 32);
        l16 &= 0xFFFFFFFFL;
        long l19 = ((long)nArray2[12] & 0xFFFFFFFFL) + (l18 >>> 32);
        l18 &= 0xFFFFFFFFL;
        n4 = (int)(l10 += l17 * l3);
        nArray2[6] = n4 << 1 | n;
        n = n4 >>> 31;
        l19 += (l18 += ((l16 += ((l15 += ((l13 += ((l12 += (l10 >>> 32) + l17 * l5) >>> 32) + l17 * l) >>> 32) + l17 * l8) >>> 32) + l17 * l11) >>> 32) + l17 * l14) >>> 32;
        n4 = (int)l12;
        nArray2[7] = n4 << 1 | n;
        n = n4 >>> 31;
        n4 = (int)l13;
        nArray2[8] = n4 << 1 | n;
        n = n4 >>> 31;
        n4 = (int)l15;
        nArray2[9] = n4 << 1 | n;
        n = n4 >>> 31;
        n4 = (int)l16;
        nArray2[10] = n4 << 1 | n;
        n = n4 >>> 31;
        n4 = (int)l18;
        nArray2[11] = n4 << 1 | n;
        n = n4 >>> 31;
        n4 = (int)l19;
        nArray2[12] = n4 << 1 | n;
        n = n4 >>> 31;
        n4 = nArray2[13] + (int)(l19 >>> 32);
        nArray2[13] = n4 << 1 | n;
    }

    public static void square(int[] nArray, int n, int[] nArray2, int n2) {
        long l;
        long l2;
        long l3 = (long)nArray[n + 0] & 0xFFFFFFFFL;
        int n3 = 0;
        int n4 = 6;
        int n5 = 14;
        do {
            l2 = (long)nArray[n + n4--] & 0xFFFFFFFFL;
            l = l2 * l2;
            nArray2[n2 + --n5] = n3 << 31 | (int)(l >>> 33);
            nArray2[n2 + --n5] = (int)(l >>> 1);
            n3 = (int)l;
        } while (n4 > 0);
        l2 = l3 * l3;
        long l4 = (long)(n3 << 31) & 0xFFFFFFFFL | l2 >>> 33;
        nArray2[n2 + 0] = (int)l2;
        n3 = (int)(l2 >>> 32) & 1;
        long l5 = (long)nArray[n + 1] & 0xFFFFFFFFL;
        l2 = (long)nArray2[n2 + 2] & 0xFFFFFFFFL;
        int n6 = (int)(l4 += l5 * l3);
        nArray2[n2 + 1] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        l2 += l4 >>> 32;
        l = (long)nArray[n + 2] & 0xFFFFFFFFL;
        long l6 = (long)nArray2[n2 + 3] & 0xFFFFFFFFL;
        long l7 = (long)nArray2[n2 + 4] & 0xFFFFFFFFL;
        n6 = (int)(l2 += l * l3);
        nArray2[n2 + 2] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        l6 &= 0xFFFFFFFFL;
        long l8 = (long)nArray[n + 3] & 0xFFFFFFFFL;
        long l9 = ((long)nArray2[n2 + 5] & 0xFFFFFFFFL) + ((l7 += (l6 += (l2 >>> 32) + l * l5) >>> 32) >>> 32);
        l7 &= 0xFFFFFFFFL;
        long l10 = ((long)nArray2[n2 + 6] & 0xFFFFFFFFL) + (l9 >>> 32);
        l9 &= 0xFFFFFFFFL;
        n6 = (int)(l6 += l8 * l3);
        nArray2[n2 + 3] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        l7 &= 0xFFFFFFFFL;
        l9 &= 0xFFFFFFFFL;
        long l11 = (long)nArray[n + 4] & 0xFFFFFFFFL;
        long l12 = ((long)nArray2[n2 + 7] & 0xFFFFFFFFL) + ((l10 += (l9 += ((l7 += (l6 >>> 32) + l8 * l5) >>> 32) + l8 * l) >>> 32) >>> 32);
        l10 &= 0xFFFFFFFFL;
        long l13 = ((long)nArray2[n2 + 8] & 0xFFFFFFFFL) + (l12 >>> 32);
        l12 &= 0xFFFFFFFFL;
        n6 = (int)(l7 += l11 * l3);
        nArray2[n2 + 4] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        l9 &= 0xFFFFFFFFL;
        l10 &= 0xFFFFFFFFL;
        l12 &= 0xFFFFFFFFL;
        long l14 = (long)nArray[n + 5] & 0xFFFFFFFFL;
        long l15 = ((long)nArray2[n2 + 9] & 0xFFFFFFFFL) + ((l13 += (l12 += ((l10 += ((l9 += (l7 >>> 32) + l11 * l5) >>> 32) + l11 * l) >>> 32) + l11 * l8) >>> 32) >>> 32);
        l13 &= 0xFFFFFFFFL;
        long l16 = ((long)nArray2[n2 + 10] & 0xFFFFFFFFL) + (l15 >>> 32);
        l15 &= 0xFFFFFFFFL;
        n6 = (int)(l9 += l14 * l3);
        nArray2[n2 + 5] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        l10 &= 0xFFFFFFFFL;
        l12 &= 0xFFFFFFFFL;
        l13 &= 0xFFFFFFFFL;
        l15 &= 0xFFFFFFFFL;
        long l17 = (long)nArray[n + 6] & 0xFFFFFFFFL;
        long l18 = ((long)nArray2[n2 + 11] & 0xFFFFFFFFL) + ((l16 += (l15 += ((l13 += ((l12 += ((l10 += (l9 >>> 32) + l14 * l5) >>> 32) + l14 * l) >>> 32) + l14 * l8) >>> 32) + l14 * l11) >>> 32) >>> 32);
        l16 &= 0xFFFFFFFFL;
        long l19 = ((long)nArray2[n2 + 12] & 0xFFFFFFFFL) + (l18 >>> 32);
        l18 &= 0xFFFFFFFFL;
        n6 = (int)(l10 += l17 * l3);
        nArray2[n2 + 6] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        l19 += (l18 += ((l16 += ((l15 += ((l13 += ((l12 += (l10 >>> 32) + l17 * l5) >>> 32) + l17 * l) >>> 32) + l17 * l8) >>> 32) + l17 * l11) >>> 32) + l17 * l14) >>> 32;
        n6 = (int)l12;
        nArray2[n2 + 7] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        n6 = (int)l13;
        nArray2[n2 + 8] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        n6 = (int)l15;
        nArray2[n2 + 9] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        n6 = (int)l16;
        nArray2[n2 + 10] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        n6 = (int)l18;
        nArray2[n2 + 11] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        n6 = (int)l19;
        nArray2[n2 + 12] = n6 << 1 | n3;
        n3 = n6 >>> 31;
        n6 = nArray2[n2 + 13] + (int)(l19 >>> 32);
        nArray2[n2 + 13] = n6 << 1 | n3;
    }

    public static int sub(int[] nArray, int[] nArray2, int[] nArray3) {
        long l = 0L;
        nArray3[0] = (int)(l += ((long)nArray[0] & 0xFFFFFFFFL) - ((long)nArray2[0] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[1] = (int)(l += ((long)nArray[1] & 0xFFFFFFFFL) - ((long)nArray2[1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[2] = (int)(l += ((long)nArray[2] & 0xFFFFFFFFL) - ((long)nArray2[2] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[3] = (int)(l += ((long)nArray[3] & 0xFFFFFFFFL) - ((long)nArray2[3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[4] = (int)(l += ((long)nArray[4] & 0xFFFFFFFFL) - ((long)nArray2[4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[5] = (int)(l += ((long)nArray[5] & 0xFFFFFFFFL) - ((long)nArray2[5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[6] = (int)(l += ((long)nArray[6] & 0xFFFFFFFFL) - ((long)nArray2[6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int sub(int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3) {
        long l = 0L;
        nArray3[n3 + 0] = (int)(l += ((long)nArray[n + 0] & 0xFFFFFFFFL) - ((long)nArray2[n2 + 0] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[n3 + 1] = (int)(l += ((long)nArray[n + 1] & 0xFFFFFFFFL) - ((long)nArray2[n2 + 1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[n3 + 2] = (int)(l += ((long)nArray[n + 2] & 0xFFFFFFFFL) - ((long)nArray2[n2 + 2] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[n3 + 3] = (int)(l += ((long)nArray[n + 3] & 0xFFFFFFFFL) - ((long)nArray2[n2 + 3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[n3 + 4] = (int)(l += ((long)nArray[n + 4] & 0xFFFFFFFFL) - ((long)nArray2[n2 + 4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[n3 + 5] = (int)(l += ((long)nArray[n + 5] & 0xFFFFFFFFL) - ((long)nArray2[n2 + 5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[n3 + 6] = (int)(l += ((long)nArray[n + 6] & 0xFFFFFFFFL) - ((long)nArray2[n2 + 6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int subBothFrom(int[] nArray, int[] nArray2, int[] nArray3) {
        long l = 0L;
        nArray3[0] = (int)(l += ((long)nArray3[0] & 0xFFFFFFFFL) - ((long)nArray[0] & 0xFFFFFFFFL) - ((long)nArray2[0] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[1] = (int)(l += ((long)nArray3[1] & 0xFFFFFFFFL) - ((long)nArray[1] & 0xFFFFFFFFL) - ((long)nArray2[1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[2] = (int)(l += ((long)nArray3[2] & 0xFFFFFFFFL) - ((long)nArray[2] & 0xFFFFFFFFL) - ((long)nArray2[2] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[3] = (int)(l += ((long)nArray3[3] & 0xFFFFFFFFL) - ((long)nArray[3] & 0xFFFFFFFFL) - ((long)nArray2[3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[4] = (int)(l += ((long)nArray3[4] & 0xFFFFFFFFL) - ((long)nArray[4] & 0xFFFFFFFFL) - ((long)nArray2[4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[5] = (int)(l += ((long)nArray3[5] & 0xFFFFFFFFL) - ((long)nArray[5] & 0xFFFFFFFFL) - ((long)nArray2[5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray3[6] = (int)(l += ((long)nArray3[6] & 0xFFFFFFFFL) - ((long)nArray[6] & 0xFFFFFFFFL) - ((long)nArray2[6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int subFrom(int[] nArray, int[] nArray2) {
        long l = 0L;
        nArray2[0] = (int)(l += ((long)nArray2[0] & 0xFFFFFFFFL) - ((long)nArray[0] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[1] = (int)(l += ((long)nArray2[1] & 0xFFFFFFFFL) - ((long)nArray[1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[2] = (int)(l += ((long)nArray2[2] & 0xFFFFFFFFL) - ((long)nArray[2] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[3] = (int)(l += ((long)nArray2[3] & 0xFFFFFFFFL) - ((long)nArray[3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[4] = (int)(l += ((long)nArray2[4] & 0xFFFFFFFFL) - ((long)nArray[4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[5] = (int)(l += ((long)nArray2[5] & 0xFFFFFFFFL) - ((long)nArray[5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[6] = (int)(l += ((long)nArray2[6] & 0xFFFFFFFFL) - ((long)nArray[6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static int subFrom(int[] nArray, int n, int[] nArray2, int n2) {
        long l = 0L;
        nArray2[n2 + 0] = (int)(l += ((long)nArray2[n2 + 0] & 0xFFFFFFFFL) - ((long)nArray[n + 0] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[n2 + 1] = (int)(l += ((long)nArray2[n2 + 1] & 0xFFFFFFFFL) - ((long)nArray[n + 1] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[n2 + 2] = (int)(l += ((long)nArray2[n2 + 2] & 0xFFFFFFFFL) - ((long)nArray[n + 2] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[n2 + 3] = (int)(l += ((long)nArray2[n2 + 3] & 0xFFFFFFFFL) - ((long)nArray[n + 3] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[n2 + 4] = (int)(l += ((long)nArray2[n2 + 4] & 0xFFFFFFFFL) - ((long)nArray[n + 4] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[n2 + 5] = (int)(l += ((long)nArray2[n2 + 5] & 0xFFFFFFFFL) - ((long)nArray[n + 5] & 0xFFFFFFFFL));
        l >>= 32;
        nArray2[n2 + 6] = (int)(l += ((long)nArray2[n2 + 6] & 0xFFFFFFFFL) - ((long)nArray[n + 6] & 0xFFFFFFFFL));
        return (int)(l >>= 32);
    }

    public static BigInteger toBigInteger(int[] nArray) {
        byte[] byArray = new byte[28];
        for (int i = 0; i < 7; ++i) {
            int n = nArray[i];
            if (n == 0) continue;
            Pack.intToBigEndian(n, byArray, 6 - i << 2);
        }
        return new BigInteger(1, byArray);
    }

    public static void zero(int[] nArray) {
        nArray[0] = 0;
        nArray[1] = 0;
        nArray[2] = 0;
        nArray[3] = 0;
        nArray[4] = 0;
        nArray[5] = 0;
        nArray[6] = 0;
    }
}

