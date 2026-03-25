// 
// Decompiled by Procyon v0.6.0
// 

package me.pi3ro.cuy.api;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.io.IOException;
import dbjrsyajbkgezbtp.ogwwobatgayyjyld;
import org.jetbrains.annotations.Nullable;
import me.pi3ro.cuy.api.plugin.EconomyAPI;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata(mv = { 2, 2, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0014
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B	\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007"\u0004\b\b\u0010	¨\u0006
                                                   """ }, d2 = { "Lme/pi3ro/cuy/api/CuyAPI;", "", "<init>", "()V", "economyAPI", "Lme/pi3ro/cuy/api/plugin/EconomyAPI;", "getEconomyAPI", "()Lme/pi3ro/cuy/api/plugin/EconomyAPI;", "setEconomyAPI", "(Lme/pi3ro/cuy/api/plugin/EconomyAPI;)V", "cuy-plugin" })
public final class CuyAPI
{
    @NotNull
    public static final CuyAPI INSTANCE;
    @Nullable
    private static EconomyAPI economyAPI;
    private static int atNA1h3n2d = 0;
    private transient int 9Q6XAcTpir = 881347560;
    private static byte[] mwvspmqoim;
    private static String[] nothing_to_see_here;
    
    private CuyAPI() {
        final int n = 0x4DA71B15 ^ 0x1C38FAD2;
    Label_0067:
        while (true) {
            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n)) {
                case 575287343: {
                    continue;
                }
                case 237343982: {}
                case 636575842: {
                    break Label_0067;
                }
                default: {
                    throw new IOException();
                }
            }
        }
        final int n2 = 0x6D697664 ^ (0x293434F ^ Integer.parseInt("1616451313"));
    Label_0143:
        while (true) {
            switch (ogwwobatgayyjyld.yphcfoidvruxcacx(n2)) {
                case 1558015343: {
                    continue;
                }
                case 239868629: {}
                case 1084973942: {
                    break Label_0143;
                }
                default: {
                    throw new IOException();
                }
            }
        }
    }
    
    @Nullable
    public final EconomyAPI getEconomyAPI() {
        final int n = 0x78772A04 ^ (0x57D15D75 ^ 0x42405098);
        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == 1865498443) {
            return CuyAPI.economyAPI;
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -1537758752 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x6AB915CF ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1865498443 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x57791E1A ^ n)) {}
        throw new RuntimeException();
    }
    
    public final void setEconomyAPI(@Nullable final EconomyAPI economyAPI) {
        final int n = 0x4CC9B0EE ^ (0x31BF3F2B ^ 0x42405098);
        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -105448727) {
            CuyAPI.economyAPI = economyAPI;
            return;
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -690490103 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x4608A833 ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != -105448727 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x5A34B783 ^ n)) {}
        throw new RuntimeException();
    }
    
    static {
        (CuyAPI.nothing_to_see_here = new String[15])[0] = "\u2804\u2804\u2804\u28b0\u28e7\u28fc\u28ef\u2804\u28f8\u28e0\u28f6\u28f6\u28e6\u28fe\u2804\u2804\u2804\u2804\u2840\u2804\u2880\u28ff\u28ff\u2804\u2804\u2804\u28b8\u2847\u2804\u2804";
        CuyAPI.nothing_to_see_here[1] = "\u2804\u2804\u2804\u28fe\u28ff\u283f\u283f\u2836\u283f\u28bf\u28ff\u28ff\u28ff\u28ff\u28e6\u28e4\u28c4\u2880\u2845\u28a0\u28fe\u28db\u2849\u2804\u2804\u2804\u2838\u2880\u28ff\u2804";
        CuyAPI.nothing_to_see_here[2] = "\u2804\u2804\u2880\u284b\u28e1\u28f4\u28f6\u28f6\u2840\u2804\u2804\u2819\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28f4\u28ff\u28ff\u28ff\u2883\u28e4\u28c4\u28c0\u28e5\u28ff\u28ff\u2804";
        CuyAPI.nothing_to_see_here[3] = "\u2804\u2804\u28b8\u28c7\u283b\u28ff\u28ff\u28ff\u28e7\u28c0\u2880\u28e0\u284c\u28bb\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28ff\u28ff\u28ff\u2804";
        CuyAPI.nothing_to_see_here[4] = "\u2804\u2880\u28b8\u28ff\u28f7\u28e4\u28e4\u28e4\u28ec\u28d9\u28db\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u28ff\u28ff\u284d\u2804\u2804\u2880\u28e4\u28c4\u2809\u280b\u28f0";
        CuyAPI.nothing_to_see_here[5] = "\u2804\u28fc\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u2887\u28ff\u28ff\u2877\u2836\u2836\u28bf\u28ff\u28ff\u2807\u2880\u28e4";
        CuyAPI.nothing_to_see_here[6] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u2847\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28f6\u28e5\u28f4\u28ff\u2857";
        CuyAPI.nothing_to_see_here[7] = "\u2880\u2808\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u285f\u2804";
        CuyAPI.nothing_to_see_here[8] = "\u28b8\u28ff\u28e6\u28cc\u28db\u28fb\u28ff\u28ff\u28e7\u2819\u281b\u281b\u286d\u2805\u2812\u2826\u282d\u28ed\u287b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2804";
        CuyAPI.nothing_to_see_here[9] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2846\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2839\u2808\u288b\u28fd\u28ff\u28ff\u28ff\u28ff\u28f5\u28fe\u2803\u2804";
        CuyAPI.nothing_to_see_here[10] = "\u2804\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2804\u28f4\u28ff\u28f6\u28c4\u2804\u28f4\u28f6\u2804\u2880\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2804\u2804";
        CuyAPI.nothing_to_see_here[11] = "\u2804\u2804\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2844\u28bb\u28ff\u28ff\u28ff\u2804\u28ff\u28ff\u2840\u28fe\u28ff\u28ff\u28ff\u28ff\u28db\u281b\u2801\u2804\u2804\u2804";
        CuyAPI.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2808\u281b\u28bf\u28ff\u28ff\u28ff\u2801\u281e\u28bf\u28ff\u28ff\u2844\u28bf\u28ff\u2847\u28f8\u28ff\u28ff\u283f\u281b\u2801\u2804\u2804\u2804\u2804\u2804";
        CuyAPI.nothing_to_see_here[13] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2809\u283b\u28ff\u28ff\u28fe\u28e6\u2859\u283b\u28f7\u28fe\u28ff\u2803\u283f\u280b\u2801\u2804\u2804\u2804\u2804\u2804\u2880\u28e0\u28f4";
        CuyAPI.nothing_to_see_here[14] = "\u28ff\u28ff\u28ff\u28f6\u28f6\u28ee\u28e5\u28d2\u2832\u28ae\u28dd\u287f\u28ff\u28ff\u2846\u28ff\u287f\u2803\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28e0\u28f4\u28ff\u28ff\u28ff";
        final int n = 0x3A5F47B8 ^ (0x6295B742 ^ Integer.parseInt("1616451313"));
        CuyAPI.mwvspmqoim = zzilyuafpbdvscw();
        CuyAPI.atNA1h3n2d = (0xDA6E38D2 ^ new Random(6379901502382398454L).nextInt());
        if (ogwwobatgayyjyld.widdxeioafyswjhq(n) == -996200359) {
            INSTANCE = new CuyAPI();
            return;
        }
        while (ogwwobatgayyjyld.widdxeioafyswjhq(n) != -996200359 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x271C4A2F ^ n) || ogwwobatgayyjyld.widdxeioafyswjhq(n) != 1558411099 || ogwwobatgayyjyld.widdxeioafyswjhq(n) != (0x2ADFE2E9 ^ n)) {}
        throw new RuntimeException();
    }
    
    public static String aonjrdhphz(final byte[] bytes, final int i) {
        final byte[] bytes2 = Integer.toString(i).getBytes();
        for (int j = 0; j < bytes.length; ++j) {
            final int n = j;
            bytes[n] ^= bytes2[j % bytes2.length];
            final int n2 = j;
            bytes[n2] ^= CuyAPI.mwvspmqoim[j % CuyAPI.mwvspmqoim.length];
        }
        return new String(bytes, StandardCharsets.UTF_16);
    }
    
    private static byte[] zzilyuafpbdvscw() {
        return new byte[] { 62, 3, 11, 28, 39, 82, 25, 31, 54, 1, 10, 83, 65, 5, 18, 58, 125, 5, 10, 64, 7, 71, 42, 49, 42, 90, 102, 60, 32, 54, 11, 97, 36, 61, 112, 126, 1, 88, 56, 121, 68, 2, 100, 71, 17, 123, 125, 45, 106, 44, 84, 111, 122, 61, 113, 109, 61 };
    }
}
